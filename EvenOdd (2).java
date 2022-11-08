//Write a JAVA program to count total number of even and odd elements in an array.

class EvenOdd
{  
public static void main(String args[])
{  
int a[]={1,2,5,6,3,8,9};  
  int evencount=0,oddcount=0;
for(int i=0;i<a.length;i++){
  if(a[i]%2==0){
    evencount++;
  }
  else{
    oddcount++;
  }
}
  System.out.println("total number of even number count"+evencount);
   System.out.println("total number of odd number count "+oddcount);
}
}