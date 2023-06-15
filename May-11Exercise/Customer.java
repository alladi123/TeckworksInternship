class Customer {
  String customer_name;
  long customer_number;
  double quantity;
  double discount;
  double price;
  double total_price;
  double net_price;
  double gst;
  double netprice;

  public void init(String customer_name, long customer_number, double quantity,
      double total_price) {
    this.customer_name = customer_name;
    this.customer_number = customer_number;
    this.quantity = quantity;
    this.price = price;
  }
  public void discount() {
    total_price = price*quantity;
    if (total_price>=5000) {
      discount = (total_price * 25) / 100;
      gst = discount + 500;
    } else if (total_price<=2500) {
      discount = (total_price * 50) / 100;
      gst = discount + 200;
    } else {
      discount = (total_price * 10) / 100;
      gst = discount + 250;
    }
    netprice=total_price-discount;
    System.out.println("dicount is:"+discount);
     System.out.println("gst is:"+gst);
     System.out.println("netprice is:"+netprice);
  }
  public void getdetails()
  {
    System.out.println("customer name is:"+customer_name);
     System.out.println("customer number is:"+customer_number);
  }
}
class customerMain {
  public static void main(String[] r) {
    Customer c = new Customer();
    c.getdetails();
    c.init("ravi", 76526583, 5,1000);
    c.discount();
  }
}