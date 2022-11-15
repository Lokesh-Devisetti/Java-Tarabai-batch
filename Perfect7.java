 class Perfect7
{
 static void sum1(int n){  
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println(n+" is a perfect number");
        }
        else{
            System.out.println(n+" not a perfect number");
        }
    }
  public static void main(String args[]){
    sum1(6);
  }
}