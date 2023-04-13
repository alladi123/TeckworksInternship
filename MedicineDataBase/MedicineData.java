class MedicineData
  {
    String Medicine_name;
    String Medicine_type;
    String company;
    int quantity;
  double price;
MedicineData(String Medicine_name,String Medicine_type,String company,
           int quantity,double price)
    {
    this. Medicine_name= Medicine_name;
      this.Medicine_type=Medicine_type;
      this.company=company;
      this.quantity=quantity;
      this.price=price;
    }
    public String getMedicine_name()
    {
      return Medicine_name;
    }
public String getMedicine_type() {
	return Medicine_type;
}
public String getCompany() {
	return company;
}
public int getQuantity() {
	return quantity;
}
public double getPrice() {
	return price;
}

public String toString()
    {

      return "medicine name:"+ " "+ 
	getMedicine_name()+ "medicine type:"+ getMedicine_type()+" "+"company name:"+ " "+ getCompany()+"price:"+ " quantity:" +" " +getQuantity()+" "+"price"+ getPrice();
        
    }
  }

