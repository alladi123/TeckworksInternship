/*Point of Sale System: Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system*/
import java.util.*;
class PriceException extends Exception
  {
    PriceException(String message)
    {
      super(message);
    }
  }
class Product
  {
    String product_name;
    int price;
    int quantity;
    void getName()
    {
      Scanner s=new Scanner(System.in);
    System.out.println("enter the product name:");
      try{
      product_name=s.next();
      }
      catch(InputMismatchException e)
        {
          System.out.println("product name should be in alphabets");
          getName();
        }
    }
    void getPrice()
    {
       Scanner s=new Scanner(System.in);
    System.out.println("enter the product price:");
      price=s.nextInt();
      if(price<0)
      {
      try{
      throw new PriceException("price must be greater than zero");
         }
      catch(PriceException i)
        {
         System.out.println(i);
        }
      }
      else{
        System.out.println("product price is :"+price);
      }
     }
    void getQuantity()
    {
       Scanner s=new Scanner(System.in);
     System.out.println("enter the Quantity:"); 
      try{
      quantity=s.nextInt();
      }
      catch(InputMismatchException f)
        {
         System.out.println("quantity must be in integers");
          getQuantity();
        }
    }
    void display()
    {
      System.out.println("product name is:"+product_name);
      System.out.println("product price is:"+price);
      System.out.println("product price is:"+quantity);

    }
  }
class PointofSaleSystem
  {
    public static void main(String[] ar)
    {
      System.out.println("enter the number of products:");
      Scanner s=new Scanner(System.in);
      int numberofProducts=s.nextInt();
  Product prod[]=new Product[numberofProducts];
    for(int i=0;i<numberofProducts;i++)
      {
        prod[i]=new Product();
        prod[i].getName();
        prod[i].getPrice();
        prod[i].getQuantity();
        prod[i].display();
    }
  }
  }