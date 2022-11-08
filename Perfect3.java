class Perfect3{
  public static void main(String args[])
  { 
    int a[]={324,121,454,456,678,153,371,6,28};
    int temp,rem,sum=0;
      System.out.println("perfect numbers");
    for(int i=0;i<a.length;i++){
      sum=0;
      for(int j=1;j<=a[i]/2;j++){
        if(a[i]%j==0){
          sum=sum+j;
        }
      }
      if(sum==a[i]){
        System.out.println(a[i]);
      }
       
      
    }
    
    }
  }