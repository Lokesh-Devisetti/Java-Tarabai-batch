class Frequency1{
  public static void main(String args[])
  { 
    int a[]={1,2,1,3,2,1,4};
    int fr[]=new int[a.length];
    int visited=-1;
  int count=0;
    System.out.println("frequency elements");
    for(int i=0;i<a.length;i++){
      count=1;
      for(int j=i+1;j<a.length;j++){
        if(a[i]==a[j]){
          count++;
          fr[j]=visited;
        }
       }
      if(fr[i]!=visited){
        fr[i]=count;
      }
    }
  System.out.println(" elements |frequency ");
    for(int i=0;i<a.length;i++){
      if(fr[i]!=visited){
      System.out.println(a[i]+"       "+fr[i]);
      }
    }
   
    }
    }