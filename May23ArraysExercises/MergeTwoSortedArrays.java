import java.util.*;
class MergeTwoSortedArrays
  {
    public static void mergeArray(int arr1[],int arr2[], int n1,int n2,int arr3[])
    {
     int i = 0, j = 0, k = 0;
      while (i<n1 && j <n2)
        {
           
            if(arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < n1)
          {
            arr3[k++] = arr1[i++];
          }
        while (j < n2)
          {
            arr3[k++] = arr2[j++];
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
  int arr3[]=new int[size1+size2];
      mergeArray(arr1,arr2,size1,size2,arr3);
       for(int d=0;d<=arr3.length-1;d++)
        {
          System.out.print(arr3[d]+" ");
        }
    }
  }