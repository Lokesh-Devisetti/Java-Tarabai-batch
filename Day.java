import java.util.Scanner;
class Day {
  public static void main(String args[]) {
    int da;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter day number");
    da=sc.nextInt();
    switch(da) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wendsday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Monday");
        break;
      default:
        System.out.println("invalid input");
        
    }
   
  }
}