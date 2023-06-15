import java.util.*;
class CommonElementsinArrays
  {
    public static void equalArray(int arr1[],int arr2[],int size1,int size2)
    {
      for(int i=0;i<=arr1.length-1;i++)
        {
          for(int j=0;j<=arr2.length-1;j++)
            {
          if(arr1[i]==arr2[j])
          {
            System.out.println(arr1[i]);
          }
        }
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