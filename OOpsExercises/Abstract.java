import java.util.*;
abstract class Bank
  {
    abstract double interestRate();
    abstract void AnnualProfit();
  }
class UNION extends Bank
{
  double interestRate()
  {
    return 34.89;
  }
  void AnnualProfit()
  {
  System.out.println("this year got 30% profit"); 
  }
}
class ICICI extends Bank
{
  double interestRate()
  {
    return 74.89;
  }
  void AnnualProfit()
  {
  System.out.println("this year got 30% profit"); 
  }
}
class Abstract
  {
  public static void main(String[] args)
    {
    UNION u=new UNION();
    ICICI ic=new ICICI();
      u.interestRate();
      System.out.println(u.interestRate());
      u.AnnualProfit();
      ic.interestRate();
      System.out.println(ic.interestRate());
      ic.AnnualProfit();
    }
  }