import java.util.Scanner;
//product details
class products
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      while(t-->0)
        {
          String name=s.next();
          int price=s.nextInt();
          double sel_price=(price*10/100);
          System.out.println("product name is"+name);
          System.out.println("product price is"+price);
          System.out.println("product selling price is"+sel_price);
          
        }
    }
  }