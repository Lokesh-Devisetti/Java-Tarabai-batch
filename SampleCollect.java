import java.util.ArrayList;
class SampleCollect{
  public static void main(String argss[]){
 
    ArrayList a=new ArrayList();
    a.add(45);
    a.add(536);
    a.add("lokesh");
    a.add(145.45f);
    a.add(34.56);
    a.add(34.56);
    a.add(null);
    System.out.println(a.size());
    a.remove(34.56);
    
    System.out.println(a.indexOf(34.56));
    
    
    
    
    
  }
}