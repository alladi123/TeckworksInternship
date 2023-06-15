import java.util.*;
class Zeroposnegvalues
  {
  public static void Arrayelements(int arr[],int s)
    {
      int j=0,i=0;
      for(i=0;i<s;i++)
        {
          if(arr[i]<0)
          {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
          j++;
          }
        }
      j=s-1;
      for(i=s-1;i>=0;i--)
        {
          if(arr[i]>0)
          {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            j--;
          }
        }
      for(int h:arr)
        {
          System.out.println(h);
        }
    }
  public static void main(String[] args)
  {
  Scanner s=new Scanner(System.in);
  int size=s.nextInt();
  int array[]=new int[size];
    System.out.println("enter the array elements:");
  for(int i=0;i<=size-1;i++)
    {
      int n=s.nextInt();
    }
    Arrayelements(array,size);
  }
  }
  