class Circle{
  float r=10.5f;
  void area(){
  System.out.println(3.14*r*r);
  }
  void perimeter(){
    System.out.println(2*3.14*r);
  }
}
class Sample2{
  public static void main(String args[]){
    Circle ci=new Circle();
    ci.area();
    ci.perimeter();
  }
}