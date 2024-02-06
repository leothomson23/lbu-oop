# 1 Getting Started
## Writing A Simple Java Program


You commit all work to repos on yout GitHub account. You should use the standard assignment template in the Assessment directory. You will be able to use this when you attempt the online tests (for marks).


You should include an associated README.md file which contains the output of the code when run.


This week you are going to undertake some simple development work which should allow you to become familiar with your IDE. There are many different IDEs and people can prefer different ones for different reasons. You may have used PyCharm for Python and so find IntelliJ more to your liking (both are made by JetBrains and are very similar). Your module leader prefers Eclipse, as it is more industry standard and highly configurable. The video material uses Eclipse. The choice is yours.


Start the your IDE.


## Programming Projects:


**1. Create a new project called “HelloWorld” and write a simple Java program that displays the message “Hello World” to the console.**


**2. “Test”. Create a project, enter, compile and run the following application.**


```
public class Test
{
   //----------------------------------------------------
   //  Prints a statement.
   //----------------------------------------------------
   public static void main (String[] args)
   {
      System.out.println ("An Emergency Broadcast");
   }
}
```


Introduce the following errors, one at a time. Note any messages that the compiler produces. Fix the previous error each time. If no error messages are produced, be prepared to explain why.


a. Change Test to test.  
 - **Error Message -** Error: Could not find or load main class Test
 - This is because the class is case-sensitive and doesn't recognize 'test' and 'Test' as the same thing.

b. Change Emergency to emergency.  
 - **Output -** An emergency Broadcast
 - Only the message being output is altered as the string is modified, rather than the commands or syntax.
 
c. Remove the first quotation mark in the string.
 - **Error Message -** Exception in thread "main" java.lang.Error: Unresolved compilation problems
 - The program doesn't realize that the quote that the user wants to print is there due to the omission of the first quotation mark. 

d. Change main to man.  
 - **Error Message -** Error: Main method not found in class Test
 - The program cannot find the method it wants to use as main has been altered to man.
 
e. Change println to bogus.  
- **Error Message -** The method bogus(String) is undefined for the type PrintStream
 - The method bogus isn't recognised and therefore the message isn't printed, as it would have if the println method was used.
 
f. Remove the semicolon at the end of the println statement.  
- **Error Message -** Syntax error, insert ";" to complete BlockStatements
 - The line isn't complete without a semi-colon, therefore the program cannot compile it correctly.

g. Remove the last brace in the program
- **Error Message -** Syntax error, insert "}" to complete ClassBody
 - The ClassBody isn't complete and the program doesn't think it is closed, therefore will not compile correctly.


**3. Create a second project called “PersonalDetails” and write a program that outputs some personal details to the screen, e.g. Name, Address, Age, Phone number etc.**


**4. Write and application that prints the following diamond shape. Don’t print any unneeded characters**

```
       *
      ***
     *****
    *******
     *****
      ***
       *

```


If you complete the exercises above, answer the following questions.
 
a. What is the latest version of the Java SDK that is available?  
 - JDK 21

b. What is the difference between Java SE and Java ME?  
 - Java SE (Standard Edition) is used for general desktop applications, where Java ME (Micro Edition) is used for creating applications for phones and embedded systems.

c. Which operating system is Java available for?  
 - Java is designed to Be used on most operating systems, including Windows, Mac and Linux.

d. What is the most popular IDE available for Java apart from Eclipse? 
 - IntelliJ

e. What is the main() function for in a Java program?
 - It serves as the entry point of the program and it can be used to define the logic.

