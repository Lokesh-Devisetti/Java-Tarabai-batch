import java.util.*;
class Insertion{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int n=sc.nextInt();
int a[]=new int[n+1];
System.out.println("Enter array elements");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("enter index position");
int index_pos=sc.nextInt();
System.out.println("enter new element");
int ele=sc.nextInt();
for(int i=n-1;i>=index_pos;i--){
a[i+1]=a[i];
}
a[index_pos]=ele;
System.out.println("after insertion");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
}
}