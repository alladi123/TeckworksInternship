import java.util.*;
class  Evenoddarray
  {
    public static void evenodd(int arr[],int size)
    {
      int even=0,odd=0;
      for(int i=0;i<=size-1;i++)
        {
          if(arr[i]%2==0)
          {
            even++;
          
          }
          else{
            odd++;
        
          }
        }
      System.out.println("even numbers are:"+even);
      System.out.println("odd numbers are:"+odd);
    }


public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
       System.out.print("enter the size:");
    int arraysize=s.nextInt();
    int array[]=new int[arraysize];
      System.out.print("enter the array elemnts:");
      for(int i=0;i<array.length;i++)
      {
        array[i]=s.nextInt();
      }
    evenodd(array,arraysize);
    }
}