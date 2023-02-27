import java.util.*;
class MaxandMinarray
  {
    public static void maxmin(int arr[],int size)
    {
      int maximum=arr[0];
      int minimum=arr[0];
      for(int i=1;i<size;i++)
        {
          if(maximum<arr[i])
          {
            maximum=arr[i];
          }
          else if(min>arr[i]){
            minimum=arr[i];
          }
        }
      System.out.println("maximum number is:"+max);
      System.out.println("minimum number is:"+min);
    }
  
  public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
       System.out.print("enter the size:");
    int arraysize=s.nextInt();
    int array[]=new int[arraysize];
      System.out.print("enter the array elemnts:");
      for(int i=0;i<array.length;i++)
      {
        array[i]=s.nextInt();
      }
    maxmin(array,arraysize);
    }
}