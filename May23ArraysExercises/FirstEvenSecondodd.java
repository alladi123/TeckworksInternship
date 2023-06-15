import java.util.*;
class FirstEvenSecondodd
  {
    public static void evenodd(int arr[],int size)
    {
       int j=-1;
      for(int i=0;i<=arr.length-1;i++)
        {
          if(arr[i]%2==0)
          {
            j++;
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
          }
        }
      for(int k=0;k<=arr.length-1;k++)
        {
          System.out.print(arr[k]+" ");
        }
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
      evenodd(arr,size);
    }
  }