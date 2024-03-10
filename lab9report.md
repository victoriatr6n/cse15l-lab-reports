# Lab Report 5
## Part 1
## 1. Student EdStem Post

# Error in testing for filter method 
`
Hello,
I am working on the Filter assignment. Professor Politz assigned me to create a filter method using a String Checker that checks for the letter "a" in a given list. 
I fixed the errors in the filter implementation that Professor Politz covered in class, but for some reason my tests are not running properly. I'm not sure if it has something to do
with my bash script or the testing file itself. I think it may be the bash script so I will include a screenshot below.
`

## 2. Response from TA
There are a couple of things that can be causing your issue. Revisit your notes to make sure you are using `*` correctly when trying to expand Java files. Also, recall the difference between 
the commands for compiling and running Java files. When running files, do you need the full file name or just the name of the class?

## 3. Response from Student
Thank you, I was able to fix the bug. I was using `.*java` instead of `*.java`, and I forgot that I do not need the `.java` extension when running Java files. I believe that is why my tests
were not running properly and why it was giving me that `java.lang.IllegalArgumentException: Could not find class [TestListExamples.java]` exception. All my tests are passing now.

## 4. Set Up
This is the `ListExamples.java` file with the `filter` method implementation. 
This is the `TestListExamples.java` file with the tests for the `filter` method.
This is the bash script to run the tests that has bugs in it.
The command line that triggered the bug is `bash test.sh`
To fix the bug, you need to change the `.*java` on line 2 to `*.java` and remove the `.java` at the end of `TestExamples.java` on line 3.

## Part 2
I learned a lot from lab in the second half of this quarter. An experience that stood out to me is learning vim. During week 7 lab when we did the `vim` tutorial, I found myself a little
overwhelmed with all the different commands and short cuts you can use in `vim`. However, I remember talking to my lab partners about the different ways you can edit a file with `vim`, and they 
shared with me the commands they recommend. For instance, I was using `x` and `i` to delete and insert, but my partner advised me to use `r` instead so I can remove and edit with only one command.
I recalled learning that, but because I was trying to process so much information, I forgot about it. This was a good learning experience as I ended up using it a lot later in lab and during my skill demo. Another learning experience I had was with my lab tutor. 
I was working on the lab with the autograder, and for some reason, the names of my classes and interfaces showed up as errors. I spent some time consulting with my lab partners as to what they thought the error could have been, but none of us could figure it out so I asked my tutor.
He told me to use `command + shift + P` and to type `Reload Window` to refresh my VSCode, which resolved all the errors I was seeing. I thought this was a cool trick to know because the error was not something in my code but rather with VSCode, 
so now I know in the future to use this command if I run into a similar problem.


