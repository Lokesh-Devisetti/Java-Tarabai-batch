interface ATM{
  public void getbalance();
  public void deposit();
  public void withdraw();
  public void displaymenu();
  
}
class SBIATM implements ATM{
  int balance;
  public void getbalance(){
    balance=5000;
    System.out.println("balance is:"+balance);
  }
  public void deposit(){
    int deposit=1000;
    balance=balance+deposit;
    System.out.println("after deposit amount total:"+balance);
  }
  public void withdraw(){
    int withdraw=2000;
    balance=balance-withdraw;
    System.out.println("after withdraw balnce is:"+balance);
  }
  public void displaymenu(){
    System.out.println("Welcome to sbi atm");
  }
}
class AtmProblem {
  public static void main(String args[]){
    ATM at=new SBIATM();
    at.getbalance();
    at.deposit();
    at.withdraw();
    at.displaymenu();
  }
}