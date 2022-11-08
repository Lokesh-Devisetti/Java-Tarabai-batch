
class Minimum{
  public static void main(String args[])
  { 
    int a[]={324,121,454,456,678,153,371,6,28};
    int min=a[0],index=0;
    
    for(int i=0;i<a.length;i++){
      if(a[i]<min){
        min=a[i];
        index=i;
      }
    }
      
      System.out.println("Min element is "+min+" found at "+ (index)+"th index");
    }
  }