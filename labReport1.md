#cd
1. An example of using this command with no arguments is:
```
{
  [user@sahara ~]$ cd
  [user@sahara ~]$ pwd
  /home
}
```

The working directory was /home when the command was run. 
Because the command line had no arguments, just cd command, the default was to change the directory to the home directory, so there was also no output because we were just changing the directory. 
When there are no arguments, we have not specified which directory we want to change to. The output was not an error.

2. An example of using this command with a path to a directory as an argument is:
```
{
  [user@sahara ~]$ cd lecture1
  [user@sahara ~/lecture1]$ pwd
  /home/lecture1
}
```
The working directory was /home/lecture1 when the command was run. 
Once again, there was no output when the command was run because we were just changing the directory. Since we specified an argument this time, the directory was changed to the lecture1 directory. The output is not an error.

3. An example of using this command with a path to a file as an argument is:
```
{
  [user@sahara ~]$ cd Hello.java
  bash: cd: Hello.java: No such file or directory
  [user@sahara ~]$ pwd
  /home
}
```
The working directory was/home when the command was run.
We got this output because cd only changes to directories, it cannot change to files. As such, there was an error when we ran the cd command with a path to a file as an argument because it is not a directory. 



