/*Challenge-7: 

Write a program to find a target element in a given array using the binary search technique. The program should then check if the target element is a prime number or not and print an appropriate message. 

Here's a sample input and output for the above question: 

------------------------------------------------------------- 

Sample Input: 

A = [23,45,67,78,86,90] 

Target element is: 67 

Expected Output: 

67 is present in 2nd index position and it is a prime number 

Sample Input: 

A = [23,45,67,78,86,90] 

Target element is: 86 

Expected Output: 

86 is present in 4th index position and it is not a prime number 
*/
import java.util.*;
class Challenge7
  {
    public static void binarysearch(int array[], int size,int low,int high,int key)
    {
      int loc= -1;
    int mid = (low + high) / 2;
    while (low <= high) 
    {
      if (array[mid] == key) 
      {
        System.out.println(array[mid] + " found at: " + mid);
        loc= mid;
        break;
      } 
      else 
      {
        if (array[mid] < key) 
        {
        low = mid + 1;
        }
        else
        {
          high=mid-1;
        }
      }
      mid=(low+high)/2;
    }
   if(loc==-1)
   {
     System.out.println("element not found");
   }
  }
  public static boolean primenumber(int key)
    {
      for(int i=2;i<key;i++)
        {
          if(key%i==0)
          {
            return false;
          }
        }
      return true;
    }
    public static void check(int key)
    {
      if(primenumber(key))
      {
        System.out.println(key+"is a prime number");
      }
      else
      {
         System.out.println(key+"is not a prime number");
      }
    }
 public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
      int low = 0, high;
    System.out.println("enter the array size:");
    int size = s.nextInt();
      
    int array[] = new int[size];
    System.out.println("enter the array elements:");
    for (int i = 0; i <= size - 1; i++) 
    {
      array[i] = s.nextInt();
    }
      high=array.length-1;
      Arrays.sort(array);
    System.out.println("enter the target element:");
    int key=s.nextInt();
    binarysearch(array, size,low,high, key);
    primenumber(key);
      check(key);
  }
  }