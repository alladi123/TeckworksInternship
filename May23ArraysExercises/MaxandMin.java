import java.util.*;
class MaxandMin
  {
    public static void maxandmin(int arr[],int size)
    {
      int x=arr[0],y=arr[0];
      for(int i=0;i<=size-1;i++)
        {
          if(x<arr[i])
          {
            x=arr[i];
          }
         if(y>arr[i])
         {
           y=arr[i];
         }
            
        }
      System.out.println(x+" "+y);
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
      maxandmin(arr,size);
    }
  }