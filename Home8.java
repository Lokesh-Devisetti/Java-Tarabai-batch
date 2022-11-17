class Bank{
  int IFSCcode=123444;
  void rateOfInterest(){
    System.out.println("Interest is 80ps");
  }
}
class SBI extends Bank{
  int IFSCcode=567890;
   void rateOfInterest(){
    System.out.println("Interest is 60ps");
  }
}
class HDFC extends Bank{
  int IFSCcode=9876;
   void rateOfInterest(){
    System.out.println("Interest is 70ps");
     super.rateOfInterest();
  }
   void printIFSC(){
       System.out.println("Parent IFSC:"+super.IFSCcode);
       System.out.println("childclass IFSC:"+IFSCcode);
     }
}
class Home8{
  public static void main(String args[]){
    HDFC hdfc=new HDFC();
    System.out.println(hdfc.IFSCcode);
    hdfc.rateOfInterest();
    hdfc.printIFSC();
  }
}