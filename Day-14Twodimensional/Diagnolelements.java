import java.util.*;
class Diagnolelements
  {
    public static void diagnol(int arr[][],int r,int c)
    {
      System.out.println("diagnol elements are:");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              if(i==j)
              {
                System.out.print(arr[i][j]+" ");
              }
            }
         }
    }
public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
        System.out.print("enter the row size:");
      int row=s.nextInt();
      System.out.print("enter the coloumn size:");
      int column=s.nextInt();
      int array[][]=new int[row][column];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              array[i][j]=s.nextInt();
            }
        }
      diagnol(array,row,column);
    }
  }