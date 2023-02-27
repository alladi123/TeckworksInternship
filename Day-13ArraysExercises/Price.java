import java.util.*;
class  Price
  {
    public static void productprices(int a[],int n)
    {
      for(int x=0;x<a.length;x++)
        {
          System.out.println(a[x]);
        }
  
    }
    public static void main(String[] a)
    {
      System.out.println("enter how many product prices:");
      Scanner s=new Scanner(System.in);
      int number=s.nextInt();
      int productPrices[]=new int[number];
     
      for(int i=0;i<=number-1;i++)
        {
          productPrices[i]=s.nextInt();
        }
       productprices(productPrices,number);
    }
  }
   