class Variable{
  void print(int a, String b, double c){
    System.out.println(a+" "+b+" "+c);
  }
  void print(String b,double c,int a){
    System.out.println(a+" "+b+" "+c);
  }
  void print(double c, int a, String b){
    System.out.println(a+" "+b+" "+c);
  }
}
class Sample{
  public static void main(String args[]){
    Variable var=new Variable();
    var.print(15,"Lokesh",15.20);
    var.print("Lokesh",15.20,15);
    var.print(15.20,15,"Lokesh");
  }
}