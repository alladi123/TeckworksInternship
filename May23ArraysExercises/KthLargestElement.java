import java.util.*;
class KthLargestElement
  {
    public static void kthelement(int arr[],int size,int k)
    {
       Arrays.sort(arr);
   System.out.println(arr[(arr.length)-k]);
    }
   public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int k=s.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<=size-1;i++)
        {
          arr[i]=s.nextInt();
        }
      kthelement(arr,size,k);
    }
  }