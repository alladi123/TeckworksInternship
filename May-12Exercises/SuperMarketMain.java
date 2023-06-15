class SuperMarket
  {
    String productname;
    double product_price;
    double total_bill;
   
    SuperMarket()
    {
      System.out.println("products");
    }
     SuperMarket(String productname,double product_price,double total_bill)
    {
      this.productname=productname;
     this.product_price=product_price;
      this.total_bill=total_bill;
    }
    SuperMarket(String product)
    {
      productname=product;
    }
    SuperMarket(String product,double price)
    {
      productname=product;
      product_price=price;
    }
    public void show()
    {
      System.out.println(productname+""+product_price+""+total_bill);
    }
  }
class SuperMarketMain
  {
public static void main(String[] r)
  {
  SuperMarket p1=new SuperMarket("soap",67,100);
    SuperMarket p2=new SuperMarket("milk");
    SuperMarket p3=new SuperMarket();
    SuperMarket p4=new SuperMarket("butter",25.0);
    p1.show();
    p2.show();
    p3.show();
    p4.show();
  
  }
  }