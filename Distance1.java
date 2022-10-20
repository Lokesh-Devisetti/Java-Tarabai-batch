//wap to slove the distance between two points
//scanner class
import java.util.Scanner;
//main class
class Distance1 {
  //main method
	public static void main(String arg[])	{
      int x1,x2,y1,y2;
	    double dis;
    //creating an object
	    Scanner s=new Scanner(System.in);
    //print the user data
    System.out.println("enter x1 value:");
    x1=s.nextInt();
    System.out.println("enter x2 value:");
    x2=s.nextInt();
    System.out.println("enter y1 value:");
    y1=s.nextInt();
    System.out.println("enter y2 value:");
    y2=s.nextInt();
	    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	
    //print result
            System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
	}
}