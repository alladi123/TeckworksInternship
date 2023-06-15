import java.util.*;
class Firstandlastposition
  {
    public static void firstlast(int arr[],int target,int size)
    {
       int first=-1,last=-1;
      
      for(int i=0;i<=arr.length-1;i++)
        {
          if(arr[i]==target)
          {
            first=i;
            break;
          }
        }
      for(int i=arr.length-1;i>=0;i--)
        {
          if(arr[i]==target)
          {
            last=i;
            break;
          }
        }
      System.out.println(first+","+last);
   }
    public static void main(String[] ar)
    {
      
     Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int target=s.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<=size-1;i++)
        {
          arr[i]=s.nextInt();
        }
      firstlast(arr,target,size);
  }
  }