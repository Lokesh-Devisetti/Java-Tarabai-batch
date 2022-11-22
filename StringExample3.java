class StringExample3 {
  public static void main(String args[]) {
   String str="hi mam you are wow";
    String rev=" ";
    String words[]=str.split(" ");
    
    
    for(int i=0;i<words.length;i++){
     
    
    for(int j=words[i].length()-1;j>=0;j--){
      rev=rev+words[i].charAt(j);
    rev=" ";
    }
    if(words[i].equals(rev)){
      System.out.println(rev);
    }
    }
  }
}

/*String:string is a sequence of character.string is an object that represents a sequnece of character.

  literal//scp memory
  new keyword//heap memory
  String s="Welocme";
String str=new String("welcome");*/

//1.compareTo:
//ifs1>s2=positive number  s1=Aello
 // s1=s2 zero
 // s1<s2 negative
/*class StringExample3{return integers
  public static void main(String args[]){
    String s1="Hello";//
    String s2="Hello";//H to h=28 a to e=4
    String s3="hallo";
    System.out.println(s1.compareTo(s2));
    System.out.println(s2.compareTo(s3));
  }
}*/
//2.contains:hii this is lokesh return boolean
 /* class StringExample3{
  public static void main(String args[]){
    String str="hii learners this is lokesh";
    System.out.println(str.endsWith("w"));
    System.out.println(str.contains("learn"));
    System.out.println(str.contains("this is"));//this==thid
  }
  }*/
//3.equals method:return boolean value
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



