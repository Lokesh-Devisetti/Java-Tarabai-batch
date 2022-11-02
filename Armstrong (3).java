  import java.util.*;
class Armstrong{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();
int count=0,rem;
int sum=0;
int temp=n;
while(temp>0){
temp=temp/10;
count++;
}
temp=n;
while(temp>0){
rem=temp%10;
sum=sum+(int)(Math.pow(rem,count));
temp=temp/10;
}
if(n==sum){
System.out.println("Amstrong number");
}
else{
System.out.println("Not Amstrong number");
}

}
}