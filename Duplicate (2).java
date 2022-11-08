class Duplicate{
  public static void main(String args[])
  { 
    int a[]={10,5,20,7,10,5};
  int count=0;
    System.out.println("Duplicates elements");
    for(int i=0;i<a.length;i++){
      count=0;
      for(int j=i+1;j<a.length;j++){
        if(a[i]==a[j]){
          count++;
        }
        
      }
      if(count>0){
        System.out.println(a[i]);
      }
    }
   
    }
    }