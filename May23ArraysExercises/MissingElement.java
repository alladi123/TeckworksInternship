import java.util.*;
class MissingElement
  {
    public static void missing(int arr[],int size)
    {
      Arrays.sort(arr);
      
       for(int i=0;i<size-1;i++)
         {
           int j=i+1;
        if(Math.abs(arr[i]-arr[j])!=1)
               {
                System.out.println(arr[i]+1);
                }
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
      missing(arr,size);
    }
  }