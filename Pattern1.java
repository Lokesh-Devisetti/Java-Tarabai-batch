/*write a java program to print given pattern
                 * * * * *
                 * * * *
                 * * *
                 * *
                 * */
class Pattern1{
  public static void main(String args[])
  { 
     for(int i=0;i<5;i++)//1<=5//rows
       {
         for(int j=i;j<5;j++){//0<=5
           System.out.print("*" +" ");    
         }
         System.out.println();
       }
    
    }
  }