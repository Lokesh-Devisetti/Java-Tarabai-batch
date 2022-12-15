import java.util.*;
class SampleCollect2{
  public static void main(String args[]){
 ArrayList<Integer> al=new ArrayList<Integer>();
    al.add(12);
    al.add(34);
    al.add(45);
    al.add(57);
    for(int i:al){
      if(i%2==0)
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