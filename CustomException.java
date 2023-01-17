/* 2. Write a program to create custom exception to perform deposit and withdraw options. 
      Create InvalidAmountException and throw this exception whenever user trying to deposit or withdraw invalid amount. 
      Deposit and withdraw amount should be multiples of 100 and it should be positive value.
*/

import java.util.*;
class InvalidAmountException extends Exception {
  public InvalidAmountException(String str) {
    super(str);
  }
}
public class CustomException {
  private int balance;

  public CustomException(int balance) {
    this.balance = balance;
  }

  public void deposit(int amount) throws InvalidAmountException {
    if (amount % 100 != 0 || amount < 0) {
      throw new InvalidAmountException("Invalid deposit amount: " + amount);
    }
    balance += amount;
  }

  public void withdraw(int amount) throws InvalidAmountException {
    if (amount % 100 != 0 || amount < 0 || amount > balance) {
      throw new InvalidAmountException("Invalid withdraw amount: " + amount);
    }
    balance -= amount;
  }

  public int getBalance() {
    return balance;
  }

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter initial balance: ");
    int balance = sc.nextInt();
    CustomException ce= new CustomException(balance);

    while (true) {
      System.out.println("1. Deposit");
      System.out.println("2. Withdraw");
      System.out.println("3. Check balance");
      System.out.println("4. Exit");
      System.out.print("Enter choice: ");
      int choice = sc.nextInt();
      if (choice == 4) {
        break;
      }

      try {
        switch (choice) {
          case 1:
            System.out.print("Enter amount to deposit: ");
            int depositAmount = sc.nextInt();
            ce.deposit(depositAmount);
            System.out.println("Deposit successful. New balance: " + ce.getBalance());
            break;
          case 2:
            System.out.print("Enter amount to withdraw: ");
            int withdrawAmount = sc.nextInt();
            ce.withdraw(withdrawAmount);
            System.out.println("Withdrawal successful. New balance: " + ce.getBalance());
            break;
          case 3:
            System.out.println("Current balance: " + ce.getBalance());
            break;
          default:
            System.out.println("Invalid choice.");
            break;
        }
      } catch (InvalidAmountException e) {
        e.printStackTrace();
        System.out.println(e.getMessage());
      }
    }
  }
}



