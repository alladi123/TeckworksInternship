import java.util.*;
class PeakElement
  {
    public static void peak(int arr[],int size)
    {
      int j=0;
       for(int i=1;i<=arr.length-1;i+=1)
         {
           if(arr[size-1]>arr[size-2])
           {
             System.out.println(arr[size-1]);
           }
           else if(arr[j]<arr[i] && arr[i]>arr[j+2])
           {
             
             System.out.println(arr[i]);
             j+=2;
           }
           else{
             j+=1;
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
      peak(arr,size);
    }
  }