import java.util.*;
class InsertionSort
  {
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<=size-1;i++)
        {
          arr[i]=s.nextInt();
        }
      insertion(arr,size);
    }
    public static void insertion(int arr[],int size)
    {
      for(int i=1;i<=size-1;i++)
        {
          int temp=arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>temp)
            {
              arr[j+1]=arr[j];
              j=j-1;
            }
          arr[j+1]=temp;
          
        }
      for(int k=0;k<=arr.length-1;k++)
        {
          System.out.println(arr[k]+" ");
        }
    }
  }

