import java.util.Scanner;
public class Bank {
        Scanner s=new Scanner(System.in);
        double bal=10000;
        int wcount=0;
     public void noOfNotes(int amt) {
         
       int one=0,two=0,five=0;
       if(amt>=500) {
           five=amt/500;
           amt=amt-(five*500);
           System.out.println("500 ruppes notes are: "+five);
         }
       if(amt>=200) {
           two=amt/200;
           amt=amt-(two*200);
           System.out.println("200 ruppes notes are: "+two);
       }
       if(amt>=100) {
           one=amt/100;
           System.out.println("100 ruppes notes are: "+one);
       }
     }
       
    public void deposite() {
       System.out.println("Enter deposite amount");
       int amt=s.nextInt();
       if(amt%100==0) {
           if(amt<=20000) {
            bal=bal+amt;
            
            
            System.out.println("Avaible bal is: "+bal);
            }
           else if{
               System.out.println("deposite limit is 20000 only");
               }
       }
       else {
           System.out.println("Please enter multiples of 100");
       }
       
    }
    public void withdraw() {
        System.out.println("Enter withdraw amount");
        int amt=s.nextInt();
    
    
        if(amt%500==0) {
          if(amt%100==0){
            if(amt<=20000) {
                 if(amt<=(bal-500)) {
                 bal=bal-amt;
                 noOfNotes(amt);
                 wcount++;
               System.out.println("Avaible bal is: "+bal);
              }
              else {
               System.out.println("insuffufient fund");          
              }
            }
            else {
                System.out.println("Withdraw amount limit is 20000 only");
            }
        }
          else{
            System.out.println("please enter multiples of 100 only");
          }
        }
        else {
         int rem=amt%500;
          if(rem>200){
          int x=500-rem;
         amt=amt+x;
          }
          else{
           amt=amt-rem;
            
          }
          System.out.println("Please enter multiples of 500 only");
          System.out.println("u can draw" +amt+ "amount");
        }
        }
    
    public void balEnquiry(){
        System.out.println("bal enquiry");
    }

        
    public void viewOptions() {
        int option=0;
        do {
        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. BalEnquiry");
        System.out.println("0. EXIT");
        System.out.println("Choose your option");
        option=s.nextInt();
        if(option==1) {
            deposite();
        }
        else if(option==2) {
            if(wcount<3) {
            withdraw();
            }
            else {
                System.out.println("withdraw limit is over");
            }
        }
        else if(option==3) {
            balEnquiry();
        }
        else if(option==0) {
            System.out.println("Thank you, visit again");
        }
        }
        while(option!=0);
    }
    
    public static void main(String[] args) {
    
        Bank obj=new Bank();
        obj.viewOptions();
    }
