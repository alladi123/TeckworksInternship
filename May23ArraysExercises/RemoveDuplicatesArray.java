import java.util.*;
class RemoveDuplicatesArray
  {
    public static void removeduplicates(int arr[],int size)
    {
      for(int i=0;i<=arr.length-1;i++)
        {
          for(int j=i+1;j<=arr.length-1;j++)
            {
              if(arr[i]==arr[j])
              {
              arr[i]=-1;
              }
            }
        }
      int c=0;
      for(int i=0;i<=arr.length-1;i++)
        {
          if(arr[i]==-1)
          {
            c++;
            //System.out.println(arr[i]);
          }
        }
      System.out.println()
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
      removeduplicates(arr,size);
    }
  }