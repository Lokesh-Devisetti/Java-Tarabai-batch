import java.util.*;
class MatrixEven{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter row size");
    int row=sc.nextInt();
    System.out.println("enter col size");
    int col=sc.nextInt();
    int a[][]=new int[row][col];
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        if(a[i][j]%2==0){
       System.out.print(a[i][j]+" ");
        }
      }
      System.out.println();
    }
    }
    }