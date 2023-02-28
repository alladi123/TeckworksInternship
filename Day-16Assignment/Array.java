import java.util.*;
class Array
  {
    public static void displayArray(int arr[],int s)
    {
      for(int i=0;i<=s-1;i++)
        {
          if(arr[i]!=0 && arr[i]==2)
          {
            for(int j=i+1;j<=s-1;j++)
              {
                if(arr[j]==0)
                {
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }
              }
          }
          System.out.println(arr[i]+" ");
       }
      
        }
        

    
public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
    System.out.print("enter the array size:");
    int arraysize=s.nextInt();
    int array[]=new int[arraysize];
      System.out.print("enter the array elemnts:");
      for(int i=0;i<array.length;i++)
      {
        array[i]=s.nextInt();
      }
    displayArray(array,arraysize);
    }
}
  