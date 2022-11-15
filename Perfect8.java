class Perfect8{
static int perfectNumber(int n){
    int sum=0,count=0;
    for(int i=1;i<=n/2;i++){
      if(n%i==0){
           sum=sum+i;
      }
    }
      if(sum==n){
      return 1;
      }
      else{
        return 0;
      }
  }
  
  public static void main(String args[]){
    //call the method
     int result=perfectNumber(6);
    if(result==1){
      System.out.println("perfect number");
    }
    else{
      System.out.println("not perfect");
    }
    }
    }
 