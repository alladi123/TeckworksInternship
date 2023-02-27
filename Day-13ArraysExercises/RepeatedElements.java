import java.util.*;

class RepeatedElements
{
  public static void repeated(int arr[], int s) 
  {
    for(int i=0;i<=s-1;i++)
      {
        for(int j=i+1;j<=s-1;j++)
          {
            if(arr[i]==arr[j])
            {
              
             System.out.println(arr[i]);
            }
             
          }
        
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
    repeated(array, size);
  }
}