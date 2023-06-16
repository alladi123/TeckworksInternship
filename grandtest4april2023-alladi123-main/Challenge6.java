/*Challenge- 6: 

You are given a sorted array of integers, and you are asked to find the closest element to a given target value. Write a modified version of the binary search algorithm that returns the closest element to the target value.If the element is not found or the array is empty, it should return -1. 

Here's a sample input and output for the above question: 

--------------------------------------------------------------- 

Test Case 1:  

Input: 

Sorted array: [1, 3, 6, 7, 9] 

Target value: 4 

Output: 

Closest element: 3 

Test Case 2: 

Input: 

Sorted array: [2, 4, 6, 8, 10] 

Target value: 9 

Output: 

Closest element: 8 

Test Case 3: 

Input: 

Sorted array: [4, 6, 8] 

Target value: 10 

Output: 

Closest element: -1 
*/
import java.util.*;
class Challenge6
  {
  public static void binarysearch(int array[], int size,int low,int high,int target)
    {
      int loc= -1;
    int mid = (low + high) / 2;
    while (low <= high) 
    {
      if (array[mid] == target-1 || array[mid]==target+1) 
      {
        System.out.println(array[mid] + " closest element found at: " + mid);
        loc= mid;
        break;
      } 
      else 
      {
        if (array[mid] < target-1) 
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
     System.out.println("element not found -1");
   }
  }
    public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
      System.out.println("enter number of testcases:");
      int testcase=s.nextInt();
      while(testcase-->0)
        {
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
    int target=s.nextInt();
    binarysearch(array, size,low,high,target);
        }
  }
  }
  