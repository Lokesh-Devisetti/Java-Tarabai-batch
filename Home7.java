class Bank{
  void rateOfInterest(){
    System.out.println("Interest is 80ps");
  }
}
class SBI extends Bank{
   void rateOfInterest(){
    System.out.println("Interest is 60ps");
  }
}
class HDFC extends Bank{
   void rateOfInterest(){
    System.out.println("Interest is 70ps");
  }
}
class Home7{
  public static void main(String args[]){
    HDFC hdfc=new HDFC();
    hdfc.rateOfInterest();
  }
}