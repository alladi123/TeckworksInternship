import java.util.*;
class CurrentBill
  {
   public static void currentbill(int units){
    double bill;
    if(units<=50)
      {
       bill=units*0.50;
      }
      else if(units<=150)
      {
      bill=25+(units-50)*0.75;
      }
      else if(units<=250)
        {
        bill=100+(units-150)*1.20;
        }
      else{
        bill=220+(units-250)*1.50;
        }
   double surcharge=bill+20%100;
   System.out.println("Your current bill is:"+surcharge);
   }
public static void main(String[] args)
  {
  Scanner s=new Scanner(System.in);
  System.out.println("enter the units:");
  int units=s.nextInt();
  CurrentBill c=new CurrentBill();
  c.currentbill(units);
  }
}