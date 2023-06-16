import java.util.*;
class Section1Program3
  {
    public static void displayarray(int arr[],int m)
    {
      for(int i=0;i<=arr.length-1;i++)
        {
          for(int j=i+1;j<arr.length-1;j++)
            {
              if((arr[i]+arr[j])==m)
              {
                System.out.println(arr[i]);
                System.out.println(j);
              }
              else{
                System.out.println("no pair found");
              }
            }
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
         displayarray(array,m);
       }
   }
  