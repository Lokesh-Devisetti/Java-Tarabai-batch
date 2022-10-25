import java.util.Scanner;
class Frequency
{
public static void main(String arr[])
{
int number, count, digit, temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Number : ");
number=sc.nextInt();
System.out.println("Digit \t Frequency");
for(int i = 0; i <= 9; i++)
{
count = 0;
temp = number;
while(temp > 0)
{
digit = temp % 10;
if(digit == i)
{
count++;
}
temp = temp/10;
}
if(count > 0)
{
System.out.println(i+ "\t" +count);
}
}
}
}