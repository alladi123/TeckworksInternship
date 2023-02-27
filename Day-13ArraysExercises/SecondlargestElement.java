import java.util.*;
class  SecondlargestElement
  {
    public static void secondlargest(int arr[],int size)
    {
      
      for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
      }
System.out.println("Second largest element is:"+arr[size-2]);
    }
    
public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
      System.out.print("enter the size:");
    int arraysize=s.nextInt();
      int ar[]=new int[arraysize];
    int array[]=new int[arraysize];
      System.out.print("enter the array elemnts:");
    for(int i=0;i<array.length;i++)
      {
        array[i]=s.nextInt();
      }
    secondlargest(array,arraysize);
    }
}