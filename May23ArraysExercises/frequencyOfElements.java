import java.util.*;
class frequencyOfElements
  {
    public static void frequency(int arr[],int size)
    {
      for(int i=0;i<=arr.length-1;i++)
        {
          int a=arr[i],c=0;
          for(int j=0;j<=arr.length-1;j++)
            {
              if(arr[j]==a)
              {
                c++;
                arr[j]=-1;
              }
            }
          if(a!=-1)
          {
            System.out.println(a+":"+c);
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
      frequency(arr,size);
    }
  }