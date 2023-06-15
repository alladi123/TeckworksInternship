import java.util.*;
class MinMax 
{
  public static void display(long arr[],int size)
  {
    Arrays.sort(arr);
    long sum=0;
    long min=arr[0],max=arr[arr.length-1];
    for(int i=0;i<=arr.length-1;i++)
      {
        sum+=arr[i];
      }
  
    System.out.println((sum-max)+" "+(sum-min));
  }

  public static void main(String[] r) 
  {
    Scanner s = new Scanner(System.in);
    int size=5;
    long arr[] = new long[size];
    for (int i=0;i<=size-1;i++) 
    {
      arr[i] = s.nextLong();
    }
   display(arr,size);
}
}

      

  