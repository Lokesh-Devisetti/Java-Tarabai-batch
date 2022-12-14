/*problem statement
event
brandingexpenses--20000
food expenses----50000
travel expenses---12000
logistic expenses-----5000
I want your help
find total amount i spent?
percentage on each expense*/
//package
import java.util.Scanner;
class Expense {
  public static void main(String[] args){
    int brand,food,travel,logistic;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter brand expense");
    brand=sc.nextInt();
    System.out.println("enter food expense");
    food=sc.nextInt();
    System.out.println("enter travel expense");
    travel=sc.nextInt();
    System.out.println("enter logistic expense");
    logistic=sc.nextInt();
    
    int total=brand+food+travel+logistic;

    double perbr= (brand*100)/total;
    double perfo=(food*100)/total;
    double pertr=(travel*100)/total;
    double perlog=(logistic*100)/total;
    System.out.println("total amount spent is:"+total);
    System.out.println("percentage of brand:"+perbr);
    System.out.println("percentage of food:"+perfo);
    System.out.println("percentage of travel:"+pertr);
    System.out.println("percentage of logistic:"+perlog);
   
        
    
  }
}
