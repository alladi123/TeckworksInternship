import java.util.*;
class ReversingArray
  {
    public static void Reversing(int arr[],int size)
    {
       int start = 0;
        int end = array.length - 1;

        while (start < end) {
            
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

         
            start++;
            end--;
    }
public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<=size-1;i++)
        {
          arr[i]=s.nextInt();
        }
      Reversing(arr,size);
    }
  }