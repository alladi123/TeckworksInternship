import java.util.*;
class  Removeduplicates
  {
    public static void removeduplicates(int arr[],int size)
    {
      int i,j;
      for(i=0;i<=size-1;i++)
        {
          for(j=i+1;j<=size-1;j++)
            {
              if(arr[i]>arr[j])
              {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
        }
        for(i=0;i<=size-1;i++)
        {
          for(j=i+1;j<=size-1;j++)
            {
               if(arr[i]==arr[j])
               {
                 arr[i]=-1;
               }
            }
        }
              for(i=0;i<=size-1;i++)
                if(arr[i]!=-1)
                {
                  System.out.println(arr[i]+" ");
                }
            
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
    removeduplicates(array,arraysize);
    }
}