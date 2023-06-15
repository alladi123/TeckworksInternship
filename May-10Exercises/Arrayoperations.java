import java.util.*;
class Arrayoperations
  {
    public static void removeduplicates(int arr[],int size)
    {
       for(int i=0;i<=size-1;i++)
        {
          for(int j=i+1;j<=size-1;j++)
            {
              if(arr[i]==arr[j])
              {
                arr[i]=-1;
              }
            }
        }
      for(int k=0;k<=arr.length-1;k++)
        {
          if(arr[k]!=-1)
          {
            System.out.println(arr[k]);
          }
        }
    }
    public static void countduplicates(int arr[],int size)
    {
      int count=0;
       for(int i=0;i<=size-1;i++)
        {
          for(int j=i+1;j<=size-1;j++)
            {
              if(arr[i]==arr[j])
              {
                arr[i]=-1;
                count++;
              }
            }
        }
      for(int i=0;i<=arr.length-1;i++)
        {
          if(arr[i]!=-1)
          {
     System.out.println("duplicate elemnts are:"+count);
            return;
          }
        }
    }
    public static void uniqueelements(int arr[],int size)
    {
      for(int i=0;i<=size-1;i++)
        {
          int x=arr[i],c=0;
          for(int j=0;j<=size-1;j++)
            {
              if(arr[j]==x)
              {
                c++;
                arr[j]=-1;
              }
            }
          if(x!=-1)
          {
            if(c==1)
            {
              System.out.println(x);
            }
          }
        }
    }
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("1.remove duplicates");
      System.out.println("2.count duplicates");
      System.out.println("3.unique elements");
      int size=s.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<=size-1;i++)
        {
          arr[i]=s.nextInt();
        }
      int option=s.nextInt();
      switch(option)
        {
          case 1:removeduplicates(arr,size);
            break;
          case 2:countduplicates(arr,size);
            break;
          case 3:uniqueelements(arr,size);
           break;
        }
    }
  }