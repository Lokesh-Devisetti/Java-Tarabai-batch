import java.util.*;
class SampleCollect1{
  public static void main(String args[]){
 ArrayList<String> al=new ArrayList<String>();
    al.add("12");
    al.add("34");
    al.add("45");
    al.add("56");
    for(String i:al){
          System.out.println(i);
    }
    for(int i=0;i<al.size();i++){
      System.out.println(al.get(i));
    }
 Iterator itr=al.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
}
}