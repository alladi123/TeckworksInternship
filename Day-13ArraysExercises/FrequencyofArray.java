import java.util.*;
class FrequencyofArray
  {
    public static void  elements(int arr[],int s)
    {
      for(int i=0;i<=s-1;i++)
        {
          int x=arr[i];
          int c=0;
          for(int j=0;j<=s-1;j++)
            {
              if(arr[j]==x)
              {
                c++;
                arr[j]=-1;
              }
            }
          if(x!=-1){
        System.out.println(x+":"+c);
          }
          }
    }
    
    
    public static void main(String[] args)
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
      elements(array,arraysize);
    }
  }
