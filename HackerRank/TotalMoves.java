import java.util.*;
class TotalMoves
  {
    public static void count(int arr1[],int arr2[],int size)
    {
      int c=0;
      for(int i=0;i<=size-1;i++)
        {
          
          while(arr1[i]>0 && arr2[i]>0)
            {
              int rem1=arr1[i]%10;
              int rem2=arr2[i]%10;
              if(rem1!=rem2)
              {
                c+=Math.abs(rem1-rem2);
              }
              arr1[i]=arr1[i]/10;
              arr2[i]=arr2[i]/10;
            }
        }
      System.out.println(c);
    }
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int arr1[]=new int[size];
      int arr2[]=new int[size];
      for(int i=0;i<=size-1;i++)
        {
          arr1[i]=s.nextInt();
        }
      for(int i=0;i<=size-1;i++)
        {
          arr2[i]=s.nextInt();
        }
      count(arr1,arr2,size);
    }
  }