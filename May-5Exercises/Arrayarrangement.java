import java.util.*;
class Arrayarrangement
  {
    
    public static void Arrangement(int arr[],int element)
    {
      
     for(int i=0;i<=arr.length-1;i++)
       {
         if(arr[i]%element==0)
         {
           System.out.println(arr[i]+"");
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
     Arrangement(array,2);
    Arrangement(array,3);
    Arrangement(array,7);
    }
}