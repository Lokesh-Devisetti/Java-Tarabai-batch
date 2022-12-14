/*read String 'Hi mam You are wow'.we have to find the String palindrome words.*/
class Palindrome{
  public static void main(String args[]){
  String s="hi mam you are wow";
    String str[]=new String[5];
    str=s.split(" ");
    String revs="";
    for(int i=0;i<str.length;i++){//str[0]=hii,[1]=mam,....[n]wow
    revs="";
    for(int j=str[i].length()-1;j>=0;j--){
      revs=revs+str[i].charAt(j);
    }
    if(str[i].equals(revs)){
      System.out.println(str[i]+" ");
    }
    }

 

  }
}