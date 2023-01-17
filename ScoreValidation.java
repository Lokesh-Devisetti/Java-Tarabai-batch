/* 4. Write a program to create custom exception to validate eligibility score to join in bitLabs. 
      Create InvalidScoreException and throw this exception if user entered score is less than 70.

  Sample input:
  Enter your score to check eligibility:  65

  Sample output: 
  Java.lang.InvalidScoreException: "Sorry, you are not eligible to join in bitLabs."


  Sample input:
  Enter your score to check eligibility:  89

  Sample output: 
  "Great, you are eligible to join in bitLabs."
*/

import java.util.*;

class InvalidScoreException extends Exception {
    public InvalidScoreException(String str) {
        super(str);
    }
}

public class ScoreValidation {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
System.out.print("Enter your score to check eligibility: ");
      int score = sc.nextInt();
       try {
            if (score < 70) {
                throw new InvalidScoreException("Sorry, you are not eligible to join in bitLabs.");
            }
         else{
            System.out.println("Great, you are eligible to join in bitLabs.");
         }
        } catch (InvalidScoreException e) {
         e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

