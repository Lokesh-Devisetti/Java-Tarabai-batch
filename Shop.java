/*problem statement
Total cost of product
I went to shop I have purchased one AC  5 ton
what is the cost?
50000+28% GST
totalcost?*/
//creating package
import java.util.Scanner;
//main class
class Shop {
  //main method
  public static void main(String args[]) {
    //creating an object
    Scanner sc=new Scanner(System.in);
    System.out.println("cost of ac:");
    int cost=sc.nextInt();
    System.out.println("gst is:");
    int gst=sc.nextInt();
    //formual for total cost
    int totalcost=cost+(cost*gst/100); //50000+(50000*28/100)
    //print result
    System.out.println("total cost is:"+totalcost);
  }
}