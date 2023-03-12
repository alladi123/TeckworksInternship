import java.util.*;
class Tax
  {
    double GST;
    double amount;
    Tax(double GST,double amount)
    {
      this.GST=GST;
      this.amount=amount;
    }
    void getdetails()
    {
System.out.println(GST+" "+amount);
      
    }
  }
class State extends Tax
{
  double stategst;
  State(double am,double gst,double sgst)
  {
    super();
    this.amount=am;
    this.GST=gst;
    this.stategst=sgst;
    
  }
  void calculateTax()
  {
    double totalnationtax;
    double toatastatetax;
    totalnationtax=amount+(amount*13/100);
totalstatetax=amount+(amount*20/100);
  }
}
class Main
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter amount,gst and stategst");
      double am=s.nextDouble();
      double gst=s.nextDouble();
      double sgst=s.nextDouble();
      Tax t=new Tax(am,gst);
      State st=new State(am,gst,sgst);
      t.getdetails();
      st.getdetails();
      st.calculateTax();
     // t.calculateTax();
    }
  }
