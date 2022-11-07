import java.util.*;
class Sample5{
  public static void main(String args[])
  { 
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array elements");
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
         System.out.println("even number"+a[i]);
      }
     
    }
    
    }
  }