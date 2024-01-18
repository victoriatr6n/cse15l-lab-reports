import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> output = new ArrayList<>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("The strings are: %s", output);
        } 
        else if (url.getPath().contains("/add")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                output.add(parameters[1]);
            
                return String.format("You added the string: %s!", parameters[1]);
            }
            else{
                return "Something went wrong. Try again. ";
            }
        } 
        else if(url.getPath().contains("/search")){
            String filtered = "";
            String[] parameters = url.getQuery().split("=");
            if(parameters[0].equals("s")){
            
            for(int i = 0; i < output.size(); i++){
                if(output.get(i).contains(parameters[1])){
                    filtered = filtered + output.get(i) + " ";
                }
            }
            }
            return filtered;


        }
        else {
            return "404 Not Found!";
        }
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
