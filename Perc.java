//wap to print percentage of subjects
import java.util.Scanner;
class Perc {
  public static void main(String args[]) {
    int tel,eng,math,sci,soc,hindi;
    Scanner s=new Scanner(System.in);
    System.out.println("enter telugu marks");
    tel=s.nextInt();
    System.out.println("enter english marks");
    eng=s.nextInt();
    System.out.println("enter math marks");
    math=s.nextInt();
    System.out.println("enter science marks");
    sci=s.nextInt();
    System.out.println("enter social marks");
    soc=s.nextInt();
    System.out.println("enter hindi marks");
    hindi=s.nextInt();
    double total = tel+eng+math+sci+soc+hindi;
    double percantage = (total / 600) * 100;
    System.out.println("percentage of subjects:"+percantage + "%");
  }
}