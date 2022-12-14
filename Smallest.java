/*Interface find smallest element
 
  1.method to find smllest number among 2 numbers
  2.method to find smallest number among 3 memebers
  3.method to find smallest number among array of elements*/
interface SmallestElement{
  public void smallTwo();
  public void smallThree();
  public void small();
}
class Eleme implements SmallestElement{
  public void smallTwo(){
    int a=10,b=15;
    if(a<b){
      System.out.println("a is small");
      
    }
    else{
      System.out.println("b is small");
    }
  }
  public void smallThree(){
    int p=20,q=29,r=25;
    if(p<q){
      if(r<p){
      System.out.println("r is small");
    }
        else{
          System.out.println("p is small");
        }
    }
    else {
      if(q<r){
        System.out.println("q is small");
      }
      else{
        System.out.println("r is small");
      }
     
  }
}
  public void small(){
    int arr[]={10,15,20,87,8};
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]<min)
        min=arr[i];
    }
    System.out.println("smallest element is"+min);
  }
}
class Smallest{
  public static void main(String args[]){
    SmallestElement sm=new Eleme();
    sm.smallTwo();
    sm.smallThree();
    sm.small();
  }
}