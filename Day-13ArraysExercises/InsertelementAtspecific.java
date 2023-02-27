import java.util.*;

class  InsertelementAtspecific{
  public static void insert(int arr[], int s,int e,int ind) 
  {
    for(int i=0;i<=s-1;i++)
      {
        if(ind==i)
        {
          arr[i]=e;
        }
       
      }
    for(int i=0;i<=s-1;i++)
      {
        System.out.println(arr[i]);
      }
  }

public static void main(String[] r) {
    Scanner s = new Scanner(System.in);
    System.out.print("enter the array size:");
    int size = s.nextInt();
    System.out.print("enter the array elements:");
    int array[] = new int[size];
    for (int i = 0; i <= size - 1; i++) {
      array[i] = s.nextInt();
    }
  System.out.println("enter the element to insert:");
    int element=s.nextInt();
  System.out.println("enter the index to insert:");
    int index=s.nextInt();
    insert(array, size,element,index);
  }
}