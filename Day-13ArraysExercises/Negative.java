import java.util.*;

class  Negative {
  public static void show(int arr[], int s) 
  {
    
    for(int i=0;i<=s-1;i++)
      {
        int t;
        if(arr[i]<0)
        {
          continue;
        }
        else{
          for(int j=i+1;j<=s-1;j++)
            {
              t=arr[j];
              arr[i]=arr[j];
              arr[j]=t;
            }
        }
       for(int i=0;i<size-1;i++)
         {
           System.out.println(arr[i]);
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
    show(array, size);
  }
}