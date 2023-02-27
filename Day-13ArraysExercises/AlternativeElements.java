import java.util.*;
class  AlternativeElements
  {
    public static void alternate(int arr[],int size)
    {

      for(int i=0;i<=size-1;i++)
        {
          if(i%2==0)
          {
            System.out.println(arr[i]);
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
    alternate(array,arraysize);
    }
}