class Game{
  int players;
  String name;
  Game(int pla,String na){
    players=pla;
    name=na;
  }
     void display(){
    System.out.println("number of players"+players);
    System.out.println("name of the game"+name);
  }
  }
class Kabaddi extends Game{
  Kabaddi(int pla1,String na1){
    super(pla1,na1);
  }
 }
  class Cricket extends Game{
    Cricket(int pla2,String na2){
      super(pla2,na2);
    }
}
class Operation{
  public static void main(String args[]){
    Kabaddi ka=new Kabaddi(9,"Kabaddi");
    ka.display();
    Cricket ci=new Cricket(13,"Cricket");
    ci.display();
  }
}