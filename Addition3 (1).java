import java.util.*;
class Addition3 {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of rows");
    int row=sc.nextInt();
    System.out.println("enter the number of columns");
    int col=sc.nextInt();
    int mat1[][]=new int[row][col];
    int mat2[][]=new int[row][col];
    int res[][]=new int[row][col];
    System.out.println("enter elements of matrix1");
    for(int i=0;i<row;i++) {
      for(int j=0;j<col;j++) {
        mat1[i][j]=sc.nextInt();
        //System.out.println();
      }
    }
    System.out.println("enter elements of matrix2");
    for(int i=0;i<row;i++) {
      for(int j=0;j<col;j++) {
        mat2[i][j]=sc.nextInt();
        //System.out.println();
      }
    }
    for(int i=0;i<row;i++) {
      for(int j=0;j<col;j++) {
res[i][j] = mat1[i][j] + mat2[i][j] ;
        
      }
    }
    System.out.print("sum of matrices:");
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++) {
        System.out.print(res[i][j]+" ");
        //System.out.print();
      }
    }
  }
}