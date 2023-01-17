/* 3.Write a program to create custom exception to validate mobile number. Create InvalidMobileNumber and throw this exception 
   whenever user enters the mobile number by not following the below conditions.

  ==> mobile number should contain only digits.
  ==> mobile number should contain only 10 digits.
  ==> mobile number should start with 9 or 8 or 7 or 6.

  Sample input: 
  Enter your mobile number: 4565333953
  Sample output: java.lang.InvalidMobileNumber: "Invalid mobile number"

  Sample input: 
  Enter your mobile number: 9884533953
  Sample output: Valid Mobile number
*/
import java.util.*;

class InvalidMobileNumber extends Exception {
  public InvalidMobileNumber(String str) {
    super(str);
  }
}

public class MobileNumberValidation {
   public static void validateMobileNumber(String mobileNumber) throws InvalidMobileNumber {
    if (!mobileNumber.matches("[0-9]+"))
    {
      throw new InvalidMobileNumber("Invalid mobile number: contains non-digit characters");
    }
    if (mobileNumber.length() != 10) {
      throw new InvalidMobileNumber("Invalid mobile number: wrong number of digits");
    }
    if (!mobileNumber.startsWith("9") && !mobileNumber.startsWith("8") && !mobileNumber.startsWith("7") && !mobileNumber.startsWith("6")) {
      throw new InvalidMobileNumber("Invalid mobile number: does not start with 9, 8, 7, or 6");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your mobile number: ");
    String mobileNumber = sc.next();

    try {
      validateMobileNumber(mobileNumber);
      System.out.println("Valid Mobile number");
    } catch (InvalidMobileNumber e) {
      e.printStackTrace();
      System.out.println(e.getMessage());
    }
  }
}

 