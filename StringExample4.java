class StringExample4{
  public static void main(String args[]){
    String s1="hi learners this is lokesh";
    int index1=s1.indexOf("this");
    int index2=s1.indexOf("is");
    System.out.println(index1+" "+index2);
    int index3=s1.indexOf("lokesh",2);
    System.out.println(index3);
  }
}