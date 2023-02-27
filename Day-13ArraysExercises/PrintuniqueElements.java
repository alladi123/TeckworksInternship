import java.util.*;
class  PrintuniqueElements
  {
    public static void unique(int arr[],int size)
    {
         int count = 0;
      System.out.println("uniue  elements are:");
      for (int i = 0; i < arr.length; i++) {
            
        for (int j = i + 1; j < arr.length; j++) 
        {
                if (arr[i] == arr[j]) {
                    count++;
                }
          
          }
        if(count==1){
                System.out.println(arr[i]);
             }      
      }
              
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
    unique(array,arraysize);
    }
}