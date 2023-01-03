class NumberFormatException{
  public static void main(String args[]){
    String str="admin*25";
    try{
      System.out.println(Integer.parseInt(str));
    }
    catch(Exception e){
      System.out.println(e);
    }
    System.out.println("exception handeld");
  }
}