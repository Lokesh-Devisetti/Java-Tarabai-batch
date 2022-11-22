class StringExample9{
  public static void main(String args[]){
    String str="hii learners this is lokesh";
    System.out.println(str.endsWith("h"));
    System.out.println(str.contains("learn"));
    System.out.println(str.contains("this is"));//this==thid
  }
  }
//3.equal method:return boolean value
/*class StringExample3{
  public static void main(String args[]){
    String s1="lokesh";
    String s2="Lokesh";
    String s3=new String("lokesh");
    System.out.println(s1.equals(s2));
    System.out.println(s2.equals(s3));
  }
}*/
//4.getBytes:
/*class StringExample3{
  public static void main(String args[]){
    String s1="@lokesh";
    String s2="bitlabs&";
    byte[] arr=s2.getBytes();
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}*/
