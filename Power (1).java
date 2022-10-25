import java.util.Scanner;
public class Power{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		int number, i, exponent;
		long power = 1;
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		System.out.print(" Please Enter the Exponent Value : ");
		exponent = sc.nextInt();	
		for(i = 1; i <= exponent; i++)
		{
			power = power * number;
		}
		System.out.println("\n The Final result of " + number + " power " + exponent + " = " + power);
	}
}