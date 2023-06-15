import java.util.*;
class ArrayzerosAtEnd
  {
    public static void shiftzeros(int a[],int s)
    {
      int c=0;
      for(int i=0;i<s;i++)
        {
          if(a[i]!=0)
          {
            a[c++]=a[i];
          }
        }
      for(int j=c;j<s;j++)
        {
          a[c++]=0;
        }
      for(int t:a)
        {
          System.out.println(t);
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
    shiftzeros(array,arraysize);
    }
}
  