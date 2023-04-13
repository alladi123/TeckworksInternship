class ShoppingData
  {
    String item_name;
    String item_type;
    int quantity;
    double price;
ShoppingData(String item_name, String item_type,int quantity,double price)  
  {
   this.item_name=item_name;
   this.item_type=item_type;
   this.quantity=quantity;
   this.price=price;
  }
public String getItem_name() {
	return item_name;
}

public String getItem_type() {
	return item_type;
}

public int getQuantity() {
	return quantity;
}

public double getPrice() {
	return price;
}
public String toString()
    {
      return "product name:"+" "+getItem_name()+" "+"item type:"+" "+getItem_type()+" "+"quantity:"+" "+getQuantity()+" "+
        "price:"+getPrice();
    }
}
