import java.util.*;
class SampleCollect3{
  public static void main(String argss[]){

  ArrayList<String> al=new ArrayList<String>();
    al.add("12");
    al.add("34");
    al.add("45");
    al.add("56");
    al.add("12");

    ArrayList<String> al1=new ArrayList<String>();
    al1.addAll(al);

    System.out.println(al.get(3));
    System.out.println(al.isEmpty());
    Object a[]=al.toArray();
    for(int i=0;i<a.length;i++){

      System.out.println(a[i]);
    }
    System.out.println(al.contains("34"));
   
    al.set(1,"134");
     System.out.println(al);
  System.out.println(al.subList(2,4));

  }
}