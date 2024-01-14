# `cd`
1. An example of using this command with no arguments is:
```
{
  [user@sahara ~]$ cd
  [user@sahara ~]$ pwd
  /home
}
```
The working directory was `/home` when the command was run. 
When there are no arguments, we have not specified which directory we want to change to. Because the command line has no arguments, just the `cd` command, the default is to change the directory to the home directory. There is also no output because we merely changed the directory. The output was not an error.

2. An example of using this command with a path to a directory as an argument is:
```
{
  [user@sahara ~]$ cd lecture1
  [user@sahara ~/lecture1]$ pwd
  /home/lecture1
}
```
The working directory was `/home/lecture1` when the command was run. 
Since we specified an argument this time, the directory was changed to the `lecture1` directory. Once again, there was no output when the command was run because we were just changing the directory. The output is not an error.

3. An example of using this command with a path to a file as an argument is:
```
{
  [user@sahara ~]$ cd Hello.java
  bash: cd: Hello.java: No such file or directory
  [user@sahara ~]$ pwd
  /home
}
```
The working directory was `/home` when the command was run.
We got this output because `cd` only changes to directories, so it cannot change to files. As such, there was an error when we ran the `cd` command with a path to a file as an argument because it is not a directory. 

# `ls`
1. An example of using this command with no arguments is:
```
{
  [user@sahara ~]$ ls
  lecture1
  [user@sahara ~]$ pwd
  /home
}
```
The working directory was `/home` when the command was run. The output is `lecture1`. This was the output because, in the home directory, this is the only folder that can be found. This output was not an error.

2. An example of using this command with a path to a directory as an argument is:
```
{
  [user@sahara ~]$ ls lecture1
  Hello.class  Hello.java  messages  README
  [user@sahara ~]$ pwd
  /home
}
```
The working directory was `/home` when the command was run. The output is `Hello.class Hello.java messages README` because these are the names of the files and folders located in the `lecture1` directory, which was the directory passed in as an argument to the `ls` command. This output is not an error.

3. An example of using this command with a path to a file as an argument is:
```
{
  [user@sahara ~]$ ls Hello.java
  ls: cannot access 'Hello.java': No such file or directory
  [user@sahara ~]$ pwd
  /home
  [user@sahara ~]$ 
}
```
The working directory was `/home` when the command was run. The file `Hello.java` passed in as an argument is not a directory, so there were no files or folders to list. The output is an error because `ls` only works with directories. The argument passed into the `ls` command was a file, so the command could not access it. 

# `cat`
1. An example of using this command with no arguments is:
2. An example of using this command with a path to a directory as an argument is:
3. An example of using this command with a path to a file as an argument is:

```
{
  [user@sahara ~]$ cat
   
}
```
The working directory was `/home` when the command was run. The output is a blank line because there were no arguments, so there were no files to concatenate and print out. This output is not an error. 

2. An example of using this command with a path to a directory as an argument is:

```
{
  [user@sahara ~]$ cat lecture1
  cat: lecture1: Is a directory
  [user@sahara ~]$ pwd
  /home
}
```
The working directory is `/home` when the command is run. The output is `cat: lecture: Is a directory` because we passed in a directory as the argument, but the `cat` command takes in files as arguments. This output is an error because only files can get concatenated by the `cat` command.

3. An example of using this command with a path to a file as an argument is:

```
{

  [user@sahara ~/lecture1]$ cat Hello.java
  import java.io.IOException;
  import java.nio.charset.StandardCharsets;
  import java.nio.file.Files;
  import java.nio.file.Path;
  
  public class Hello {
    public static void main(String[] args) throws IOException {
      String content = Files.readString(Path.of(args[0]), StandardCharsets.UTF_8);    
      System.out.println(content);
    }
  }[user@sahara ~/lecture1]$ pwd
  /home/lecture1

}
```
The working directory when the command is run is `/home/lecture1`. The output is the contents of the file we passed as an argument for `cat`, which was `Hello.java`. The output is all the lines of code contained in the `Hello.java` file. This output is not an error. 
