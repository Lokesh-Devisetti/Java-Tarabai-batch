/* 2. Write a program to perform ATM operations such as deposit, withdraw and balance enquiry. Display list of options for user selection. 
   Accept option from the user and execute specified method. throw Exception when user trying to withdraw amount more than 3 times.
*/
import java.io.*;
import java.util.*;
public class ATMOperations {
  int balance=25000;
  int wcount=0;
      int deposit=0,withdraw=0,balance_enquiry=0;
  public void deposit(int deposit){
          balance = balance+deposit;
          System.out.println("amount deposited");
  }
  public void withdrawn(int withdraw) throws IOException{
    if(wcount<3){
      balance = balance-withdraw;
      wcount++;  
      System.out.println("amount withdrawn  "+wcount+" time");
    }else{
      throw new IOException("Withdrawn limit Exceeded");
    }
  }
  public void balanceEnquiry(){
    System.out.println("The remaining balance will be"+" "+balance);
  }
    public static void main(String args[]) {   
      char ch=0;
      ATMOperations ao=new ATMOperations();
      Scanner s = new Scanner(System.in);
     do{
      System.out.println("1.Deposit");
      System.out.println("2.Withdraw");
      System.out.println("3.Balance Enqiury");
      System.out.println("Enter your option");
       
      int option = s.nextInt();
        switch(option){
        case 1:
          System.out.println("Enter the amount to be deposited");
          int deposit_amount =s.nextInt();
          ao.deposit(deposit_amount);
          break;
        case 2:
          System.out.println("Enter the amount to be withdrawn");
          int withdraw_amount = s.nextInt();
            try{
              ao.withdrawn(withdraw_amount);
            }
            catch(IOException e){
              System.out.println(e.getMessage());
            }
          break;
        case 3:
          ao.balanceEnquiry();
          break;
      } 
        System.out.println("Do you want to go options(y/n)");
         ch = s.next().charAt(0);
      }while (ch=='y');
      System.out.println("Thank you visit again");
    }
}