import java.util.*;
class  Array
  {
    public static void frequency(int arr[],int size)
    {
      
      for (int i = 0; i <arr.length; i++) {
            int count = 1;
        for (int j = i + 1; j <=arr.length-1; j++) 
        {
          if (arr[i] == arr[j]) {
                    count++;

            }
          if(count==1){
              System.out.println(arr[i]);
          }
                   
        
        }
        }
    }

public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
      System.out.print("enter the size:");
    int arraysize=s.nextInt();
      
    int array[]=new int[arraysize];
      System.out.println("enter the array elemnts:");
    for(int i=0;i<array.length;i++)
      {
        array[i]=s.nextInt();
      }
  //int ar[] = new int[arraysize];
    frequency(array,arraysize);
    }
}