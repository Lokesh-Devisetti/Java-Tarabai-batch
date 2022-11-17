/*Create a class to print an integer and a character with two methods having the same name but different sequence of 
the integer and the character parameters.
For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).*/
class Para{
  void form(int n,char c){
    System.out.println(n+" "+c);
  }
  void form(char c,int n){
    System.out.println(c+" "+n);
  }
}
class Home2{
  public static void main(String args[]){
    Para pa=new Para();
    pa.form(5,'d');
    pa.form('b',8);
  }
}