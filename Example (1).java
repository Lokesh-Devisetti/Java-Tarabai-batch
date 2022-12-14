/*Using contains() and trim() method
 
Having finished most of our application for the fair, it's time to focus on minor details that went wrong
 during a test run of our application in this module. Accidentally some gibberish text with leading and 
trailing got copied to the clipboard and got pasted in the some of your text documents. Don't worry, 
still, we have the gibberish text with us, you can manually load each document, and find the text and 
delete it. Think it will take ages, no we can think of a time saver. Using your programming skills, load 
each document in a program and find in which files the text got copied. Assume text of the document is 
given as the input to the program. write a program to find whether the gibberish text is present in the 
string.
Create a driver class called Main. In the Main method, obtain the inputs from the console (Refer I/O) and
 prompt whether the gibberish text is present in the main text.
[All text in bold corresponds to the input and rest corresponds to the output]
Sample Input/output 1:
Enter the text from the document
One fine morning, a minister from Emperor Akbar's court had gathered in the assembly hall.He informed the
 Emperor that all his valuables had been stolen by a thief the previous night.
Enter the string to be found in the data
    stolen   
String is found in the document.*/
import java.util.*;
 class Example{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string");
     String str=sc.nextLine();
    if(str.contains("bitlabs".trim())){
       System.out.println("String is found in the document");
     }
     else{
       System.out.println("String is not found in the document");
     }
   }
 }