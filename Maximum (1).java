
class Maximum{
  public static void main(String args[])
  { 
    int a[]={52,24,85,75,36,95,48,125,63};
    int max=a[0],index=0;
    
    for(int i=0;i<a.length;i++){
      if(a[i]>max){
        max=a[i];
        index=i;
      }
    }
      
      System.out.println("Max element is "+max+" found at "+ (index)+"th index");
    }
  }