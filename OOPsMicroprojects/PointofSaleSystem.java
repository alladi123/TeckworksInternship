/*Point of Sale System: Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system*/
import java.util.*;
class Product
  {
    String product_name;
    int price;
    String quantity;
    void getName()
    {
      Scanner s=new Scanner(System.in);
    System.out.println("enter the product name:");
      product_name=s.next();
      System.out.println("product name is:"+product_name);
    }
    void getPrice()
    {
       Scanner s=new Scanner(System.in);
    System.out.println("enter the product price:");
      price=s.nextInt();
      System.out.println("product price is:"+price);
    }
    void getQuantity()
    {
       Scanner s=new Scanner(System.in);
     System.out.println("enter the getQuantity:"); 
      quantity=s.next();
     System.out.println("product price is:"+quantity);
    }
  }
class PointofSaleSystem
  {
    public static void main(String[] ar)
    {
    Product p=new Product();
    p.getName();
    p.getPrice();
    p.getQuantity();
    }
  }