/*Book

name
price
author

author

name
age
place*/

class Author{
  String name;
  int age;
  String place;
  
  Author(String name,int age,String place){
    this.name=name;
    this.age=age;
    this.place=place;
  }
}

class Book{
  String name;
  int price;
  Author author;
  Book(String name,int price,Author author){
    this.name=name;
    this.price=price;
    this.author=author;
  }
}
class Book1{
  public static void main(String args[]){
    Author author1=new Author("Ravindranath tagore",95,"Nellore");
  
    Book book=new Book("Getaanjali",250,author1);
     
    System.out.println(book.name+" "+book.price);
    System.out.println("========book Information==========");
    System.out.println(author1.name+" "+author1.age+" "+author1.place);
    
    
    
    
  }
}