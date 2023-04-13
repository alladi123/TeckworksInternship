import java.util.*;

class BinarySearch 
{
 public static void binarysearch(int array[], int size,int low,int high, int key) 
  {
    int location = -1;
    int mid = (low + high) / 2;
    while (low <= high) 
    {
      if (array[mid] == key) 
      {
        System.out.println(array[mid] + " found at: " + mid);
        location = mid;
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
   if(location==-1)
   {
     System.out.println("element not found");
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
    System.out.println("enter the element to be search:");
    int key=s.nextInt();
    binarysearch(array, size,low,high, key);
  }
}