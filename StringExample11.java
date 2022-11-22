
//4.getBytes:ascii values
class StringExample11{
  public static void main(String args[]){
    String s1="@lokesh";
    String s2="bitlabs&";
    byte[] arr=s2.getBytes();
   
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
