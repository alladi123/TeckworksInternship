import java.util.*;
class LinearSearch
  {
    public static void linearsearch(int arr[],int size)
    {
      for(int i=0;i<=arr.length-1;i++)
        {
          if(prime(arr[i]))
          {
  System.out.println("first prime number at position:"+i);
            return;
          }
          else
          {
            System.out.println("element not found");
          }
        }
    }
    public static boolean prime(int n)
    {
      for(int i=2;i<n;i++)
        {
          if(n%i==0)
          {
           return  false;
          }
        }
      return true;
    }
    public static void main(String r[])
    {
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<=size-1;i++)
        {
          arr[i]=s.nextInt();
        }
      linearsearch(arr,size);
    }
  }