/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.*;
public class ArraySum 
{
  public static void sumdisplay(int arr[])
  {
    int sum=0;
    for(int i=0;i<=arr.length-1;i++)
      {
        sum+=arr[i];
      }
    System.out.println("sum of array elements is:"+sum);
  }
public static void main(String[] ar)
  {
    Scanner s=new Scanner(System.in);
    int size=s.nextInt();
    int array[]=new int[size];
    System.out.println("enter the elements:");
    for(int i=0;i<=size-1;i++)
      {
         array[i]=s.nextInt();
        }
    sumdisplay(array);
      }
}
