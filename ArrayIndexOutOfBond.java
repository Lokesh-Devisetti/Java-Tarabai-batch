class ArrayIndexOutOfBond{
  public static void main(String args[]){
    int arr[]={20,78,35,12};
    try{
      System.out.println(arr[4]);
    }
    catch(Exception e){
      System.out.println(e);
    }
    System.out.println("exception handled");
  }
}