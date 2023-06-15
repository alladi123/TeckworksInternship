import java.util.*;
class  SecondLargest
  {
    public static void secondlargest(int arr[],int size)
    {
      
      Arrays.sort(arr);
      int a=arr[0],b=arr[size-1];
      for(int i=1;i<=arr.length-1;i++)
        {
          if(a<arr[i] && arr[i]!=b)
          {
            a=arr[i];
          }
        }
      System.out.println(a);
    }
    public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
      System.out.print("enter the size:");
    int arraysize=s.nextInt();
      int ar[]=new int[arraysize];
    int array[]=new int[arraysize];
      System.out.print("enter the array elemnts:");
    for(int i=0;i<array.length;i++)
      {
        array[i]=s.nextInt();
      }
    secondlargest(array,arraysize);
    }
}