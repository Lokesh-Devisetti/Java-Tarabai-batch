import java.util.Scanner;

class Greater {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter  number1");
int a=sc.nextInt();
System.out.println("enter  number2");
int b=sc.nextInt();
System.out.println("enter  number3");
int c=sc.nextInt();
if(a>b){
if(a>c){
System.out.println("a is big");
}
else
{
System.out.println("c is big");
}
}
else if(b>c){
System.out.println("b is greater");
}
}
}