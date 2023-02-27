import java.util.*;
class CommonElementsinArrays
  {
    public static void common(int a1[],int s1,int a2[],int s2)
    {
      System.out.println("common elemnts are:");
      for(int i=0;i<=s1-1;i++)
        {
          for(int j=0;j<s2-1;j++)
            {
              if(a1[i]==a2[j])
              {
                System.out.println(a1[i]);
              }
            }
        }
      
    }


public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
        System.out.print("enter the size1:");
    int arraysize1=s.nextInt();
    int array1[]=new int[arraysize1];
     System.out.print("enter the size2:");
       int arraysize2=s.nextInt();
         int array2[]=new int[arraysize2];
      System.out.print("enter the array1 elemnts:");
    for(int i=0;i<array1.length;i++)
      {
        array1[i]=s.nextInt();
      }
       System.out.print("enter the array2 elemnts:");
      for(int i=0;i<array2.length;i++)
      {
        array2[i]=s.nextInt();
      }
    common(array1,arraysize1,array2,arraysize2);
    }
}