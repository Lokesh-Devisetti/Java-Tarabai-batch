class PrimeNumber2 {
  public static void main(String args[])
  {
    int a[]={2,5,9,11,13,15};
    int count;
    System.out.println("prime numbers are");
    for(int i=0;i<a.length;i++){
      count=0;
      for(int j=1;j<=a[i];j++){
      if(a[i]%j==0){
        count++;
      }
    }
    if(count==2){
      System.out.println(a[i]);
    }
  }
}
}