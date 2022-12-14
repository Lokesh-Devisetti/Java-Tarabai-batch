/*read one string from user for example the string is admin@124 from this alphabets 5, special-1,digits-3*/
import java.util.*;
class Alphabet{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string");
    String str=sc.next();
    int alph=0;
    int digi=0;
    int spl=0;
   char str1;
   for(int i=0;i<str.length();i++){
      str1=str.charAt(i);
      if((str1>='a' && str1<='z')||(str1>='A' && str1<='Z')){
        alph++;
         } 
       if(str1>='0' && str1<='9'){
    
      digi++;
    
      }
      else{
      
        spl++;
        
      }
    }
    System.out.println("alphabet"+alph);
    System.out.println("digit"+digi);
    System.out.println("special"+spl);
  }
}
 