import java.util.*;
class Section1Program2
  {
    public static void displayarray(int arr[],int m,int size)
    {
      int array1[]=new int[m];
      for(int i=0;i<m;i++)
        {
          array1[i]=arr[i];
        }
      for(int i=m;i<size;i++)
        {
          arr[i-m]=arr[i];
        }
      for(int i=0;i<m;i++)
        {
          arr[i+size-m]=array1[i];
        }
      for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
    }
       public static void main(String[] args)
     {
         Scanner s=new Scanner(System.in);
         int size=s.nextInt();
         int array[]=new int[size];
         for(int i=0;i<=size-1;i++)
           {
             array[i]=s.nextInt();
           }
       int m=s.nextInt();
         displayarray(array,m,size);
       }
    }