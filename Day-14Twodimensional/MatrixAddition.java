import java.util.*;
class MatrixAddition
  {
    public static void finalarray(int a1[][],int a2[][],int a3[][],r1,c1)
    {
      for(int i=0;i<r1;i++)
      {
        for(int j=0;j<c1;j++)
          {
            a3[i][j]=a1[i][j]+a2[i][j];
          }
      }
      for(int i=0;i<r1;i++)
      {
        for(int j=0;j<c1;j++)
          {
            System.out.print(a3[i][j]+" ");
          }
        System.out.println();
  }
    }
public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
     
        System.out.print("enter the row1 size:");
      int row1=s.nextInt();
      System.out.print("enter the coloumn1 size:");
      int column1=s.nextInt();
   System.out.print("enter the row2 size:");
      int row2=s.nextInt();
      System.out.print("enter the coloumn2 size:");
      int column2=s.nextInt();
   int array1[][]=new int[row1][column1];
  int array2[][]=new int[row2][column2];
       int array3[][]=new int[row1][column1];
      System.out.print("enter the array1 elemnts:");
    for(int i=0;i<row1;i++)
      {
        for(int j=0;j<column1;j++)
          {
            array1[i][j]=s.nextInt();
      }
      }
  System.out.print("enter the array2 elemnts:");
  for(int i=0;i<row2;i++)
      {
        for(int j=0;j<column2;j++)
          {
            array2[i][j]=s.nextInt();
      }
      }
   for(int i=0;i<row1;i++)
      {
        for(int j=0;j<column1;j++)
          {
            System.out.print(array1[i][j]+" ");
          }
        System.out.println();
      }
       for(int i=0;i<row2;i++)
      {
        for(int j=0;j<column2;j++)
          {
            System.out.print(array2[i][j]+"  ");
          }
        System.out.println();
      }
      System.out.println("final array is:");
    
      finalarray(array1,array2,array3,row1,column1);
  }
  }
      
    