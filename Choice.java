/*enter num1
  10
enter num2
20
***********calculator*************
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.exit
select option
1
Addition is 30
2
Subtraction is -10*/
import java.util.*;
class Choice {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num1");
    int num1=sc.nextInt();
    System.out.println("enter num2");
    int num2=sc.nextInt();
    int num3;
    System.out.println("***********calculator*************");
    System.out.println("1.Addition");
    System.out.println("2.substraction"); 
    System.out.println("3.multiplication");
    System.out.println("4.division");
    System.out.println("5.exit");
    System.out.println("select option");
    int cal=sc.nextInt();
    

    switch(cal) {
      case 1: 
        num3=num1+num2;
            System.out.println("addition is:"+num3);
        break;
        case 2: 
        num3=num1-num2;
            System.out.println("substraction is:"+num3);
        break;
        case 3: 
        num3=num1*num2;
            System.out.println("multiplication is:"+num3);
        break;
        case 4: 
        num3=num1+num2;
            System.out.println("division is:"+num3);
        break;
        case 5: 
            System.out.println("exit");
        break;
      default:
           System.out.println("please enter between 1 to 5 only");

        
    }
  }
}