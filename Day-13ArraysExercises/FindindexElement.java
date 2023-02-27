import java.util.*;
class  FindindexElement
  {
    public static void findindex(int arr[],int size)
    {
System.out.println("enter the number you want to find index:");
    Scanner s=new Scanner(System.in);
    int element=s.nextInt();
    for(int i=0;i<=size-1;i++)
      {
        if(arr[i]==element)
        {
          System.out.println("Element index number is:"+i);
        }
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
    findindex(array,arraysize);
    }
}