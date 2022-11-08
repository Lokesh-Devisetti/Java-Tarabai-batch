import java.util.*;
class Lessthan{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter rows size");
    int row=s.nextInt();
    System.out.println("enter columns size");
    int col=s.nextInt();
    int a[][]=new int[row][col];
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        a[i][j]=s.nextInt();
      }
    }
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        if(a[i][j]<=5){
       System.out.print(a[i][j]+" ");
      }
      }
      System.out.println();
    }
    }
    }