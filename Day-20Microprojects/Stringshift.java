import java.util.*;
class Stringshift
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      String str=new String();
      System.out.println("enter string data");
      str=sc.nextLine();
      System.out.println("enter length u want to shift");
      int n=sc.nextInt();
      System.out.println("Choose shift operation u want to perform?");
      System.out.println("1.Right Shift operation");
      System.out.println("2.Left shift operation");
      int i=sc.nextInt();
      switch(i)
        {
          case 1:
           String s1= rightoperation(str,n);
            System.out.println(s1);
            break;
          case 2:
           String u1= leftoperation(str,n);
            System.out.println(u1);
            break;
        }
    }
    static String rightoperation(String str1,int n1)
    {
      char arr1[]=str1.toCharArray();
      for(int k=1;k<=n1;k++)
      {
    char temp=arr1[arr1.length-1];
    for(int l=0;l<arr1.length-1;l++)
      {
    arr1[l+1]=arr1[l];
      }
         arr1[0]=temp;
     }
      String s=new String(arr1);
      return s;
          }
    static String leftoperation(String str2,int n2)
    {
      char arr2[]=str2.toCharArray();
      for(int k=1;k<=n2;k++)
       {
        char temp=arr2[0];
      for(int j=arr2.length-1;j>0;j--)
       {
             arr2[j-1]=arr2[j];
            
       }
          arr2[arr2.length-1]=temp;
        }
      String u=new String(arr2);
      return u;
    }
  }
