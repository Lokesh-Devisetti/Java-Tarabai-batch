/* Shape
color
    area(){
"area of shape"
    }
 
//   rectangle extends from shape
       l,b
         area()
         
 
//   Circle 
         area
//   Square
         area
//   Triangle
         area*/
class Shape{
  private String color;
  
  void setColor(String color){
    this.color=color;
  }
  String getColor(){
    return color;
  }
  void area(){
    System.out.println("area of shape");
  }
}
class Rectangle extends Shape{
  private int length;
  private int breadth;
  Rectangle(int length,int breadth){
    this.length=length;
    this.breadth=breadth;
  }
  void setLength(int length){
    this.length=length;
  }
  void setBreadth(int breadth){
    this.breadth=breadth;
  }
  int getLength(){
    return length;
  }
  int getBreadth(){
    return breadth;
  }
  void area(){
    System.out.println(length*breadth);
  }
}
class Circle extends Shape{
  private float radius;
  Circle(float radius){
    this.radius=radius;
  }
  void setRadius(float radius){
    this.radius=radius;
  }
  float getRadius(){
    return radius;
  }
  void area(){
    System.out.println((3.14*radius*radius));
  }
}
class Square extends Shape{
  private int side;
  Square(int side){
    this.side=side;
  }
  void setSide(int side){
    this.side=side;
  }
  int getSide(){
    return side;
  }
  void area(){
    System.out.println(side*side);
  }
}
class Triangle extends Shape{
  private int height;
  private int base;
  Triangle(int height,int base){
    this.height=height;
    this.base=base;
  }
  void setHeight(int height){
    this.height=height;
  }
  void setBase(int base){
    this.base=base;
  }
  int getHeight(){
    return height;
  }
  int getBase(){
    return base;
  }
  void area(){
    System.out.println((height*base)/2);
  }
}
class Shape1{
  public static void main(String args[]){
    Shape s=new Shape();
    s.area();
    Rectangle r=new Rectangle(5,4);
    r.area();
    Circle c=new Circle(4.0f);
    c.area();
    Square sq=new Square(5);
    sq.area();
    Triangle t=new Triangle(8,6);
    t.area();
    
  }
}