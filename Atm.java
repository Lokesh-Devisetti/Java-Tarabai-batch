/*ATM operation

  amount=10000

1.withdraw
2.deposit
3.check balance
4.exit

  select option
  1
//  enter amount to withdraw
//  500
//  amount=amount-500;
// withdraw successfully

  2
   Enter amount to deposit
   depsoit=1000
  amount=amount+deposit

  3.
  the amount is 11000

  4
  System.out.print("thank you for visiting");*/
import java.util.*;
class Atm {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int amount=10000;
    System.out.println("select the number\n 1.withdraw\n 2.deposit\n 3.check balance\n 4.exit ");
    int num=sc.nextInt();
    switch(num) {
      case 1:
        System.out.println("enter amount to withdraw");
        int a=sc.nextInt();
        amount=amount-a;
        System.out.println("withdraw successfully");
        break;
        case 2:
        System.out.println("enter amount to deposit");
        int b=sc.nextInt();
        amount=amount+b;
        System.out.println("deposit successfully");
        break;
        case 3:
        System.out.println("total amount"+amount);
         break;
      case 4:
        System.out.println("Thank you for visiting");
        break;
      default:
        System.out.println("Please enter between 1 to 4 only");
    }
  }
}