import java.util.*;
class EqualArrays
  {
    public static void equalArray(int arr1[],int arr2[],int size1,int size2)
    {
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      int c=0;
      if(size1==size2)
      {
        
        for(int i=0;i<=size1-1;i++)
          {
            if(arr1[i]==arr2[i])
            {
              c++;
            }
          }
      }
      if(size1==c)
      {
        System.out.println("two arrays are equal");
      }
      else{
        System.out.println("two arrays are not equal");
      }
    }
       public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      int size1=s.nextInt();
      int size2=s.nextInt();
      int arr1[]=new int[size1];
      int arr2[]=new int[size2];
      for(int i=0;i<=size1-1;i++)
        {
          arr1[i]=s.nextInt();
        }
      for(int i=0;i<=size2-1;i++)
        {
          arr2[i]=s.nextInt();
        }
      equalArray(arr1,arr2,size1,size2);
    }
  }