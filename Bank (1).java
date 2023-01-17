/* 3. Write a program to create 2 threads by extending from Thread class and create synchronized method called 
      withdraw(int amt) and access withdraw( ) from Thread1 and Thread 2.   */
class WithdrawAmount{
  synchronized void withdraw(int amt){
    System.out.println("Withdraw done");
      try {
                      
     Thread.sleep(1000);
         }
         catch(Exception e){
           System.out.println(e);
        }
  }
  }

class Thread1 extends Thread {
    WithdrawAmount wa1;
        
        Thread1( WithdrawAmount wa1){
            this.wa1=wa1;
          }
   
       public void run() {
                wa1.withdraw(10000);
       }
}
class Thread2 extends Thread {
  WithdrawAmount wa2;
        
        Thread2( WithdrawAmount wa2){
            this.wa2=wa2;
          }
   
       public void run() {
                wa2.withdraw(5000);
       }
}
    
public class Bank {
        public static void main(String args[]) {
              
                WithdrawAmount wamt=new WithdrawAmount();
                Thread1 t1=new Thread1(wamt);
               Thread2 t2=new Thread2(wamt);
               
                t1.start();
                t2.start();
      }
}


