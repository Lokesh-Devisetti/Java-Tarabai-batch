import java.util.*;
class Prime3{
  public static void main(String args[])
  { 
    int count=0;
    int a[]={15};
    
for(int i=0;i<a.length;i++)
        {
            if(a[a.length]%i==0)
            {
               count++;
            }
        }
        if(count==1){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime nmuber");
        }

    }
}