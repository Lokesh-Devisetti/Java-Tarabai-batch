/*write a java program to print given pattern
                a
               b c
              d e f
             g h i j
            k l m n o */
class Pattern5{
  public static void main(String args[])
  { 
   char ch='a';
     
     for(int i=0;i<5;i++)
       {
         for(int j=5-i;j>1;j--){
           System.out.print(" ");
         }
         for(int j=0;j<=i;j++){
           System.out.print(ch++ +" ");
         }

         
        System.out.println();
       }
    
    }
  }
    
