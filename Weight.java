import java.util.Scanner;
class Weight {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter age");
int age=sc.nextInt();
System.out.println("enter weight");
int weight=sc.nextInt();  
if(age>18){
if(weight>50){
System.out.println("Eligible for blood donation");
}
else{
System.out.println("under weight");
}
}
else{
System.out.println("under age");
}
}
}