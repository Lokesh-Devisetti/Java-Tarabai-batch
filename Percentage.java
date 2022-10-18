//wap to print percentage of subjects
class Percentage {
  public static void main(String args[]) {
    int tel,eng,math,sci,soc,hindi;
    tel=85;
    eng = 90;
    math = 80;
    sci=75;
    soc=95;
    hindi = 90;
    double total = tel+eng+math+sci+soc+hindi;
    double percantage = (total / 600) * 100;
    System.out.println("percentage of subjects:"+percantage + "%");
  }
}