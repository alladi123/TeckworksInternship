import java.util.*;
class WithDrawException extends Exception
  {
    WithDrawException(String message)
    {
      super(message);
    }
  }
class bankexception
  {
    String customername;
    int balance;
    int withdrawamount;
    Scanner s=new Scanner(System.in);
    void readname()
    {
      System.out.println("enter customer name");
      try
        {
          customername=s.nextLine();
        }
      catch(InputMismatchException i)
     {
        System.out.println("customer name should have only alphabets");
        readname();
      }      
    }
    void readbalance()
    {
      System.out.println("enter balance");
      try
        {
          balance=s.nextInt();
        }
      catch(InputMismatchException i)
     {
        System.out.println("balance should be in integers");
        readbalance();
      }      
    }
    void readwithdraw()
    {
      System.out.println("enter amount to be withdraw");
      try
        {
          withdrawamount=s.nextInt();
        }
      catch(InputMismatchException i)
     {
        System.out.println("withdraw amount should be in integres");
        readwithdraw();
      }      
    }
    void withdraw()
    {
      if((withdrawamount>balance)||(withdrawamount<0))
        try{
throw new WithDrawException("withdraw amount should be less than the balance");        
           }
    catch(WithDrawException e)
  {
  System.out.println(e);
  }
else
{
  balance=balance-withdrawamount;
}
    }
    void display()
    {
      System.out.println("customer details");
      System.out.println("customer name"+customername);
      System.out.println("balance"+balance);
    }
  }
class ATM
  {
    public static void main(String args[])
    {
      System.out.println("enter number of bank customers");
      Scanner s=new Scanner(System.in);
      int numberofcustomers=s.nextInt();
      bankexception b[]=new bankexception[numberofcustomers];//array of bank class objects
      for(int i=0;i<numberofcustomers;i++)
        {
          b[i]=new bankexception();
        
        b[i]. readname();
        b[i].readbalance();
         b[i]. readwithdraw();
          b[i].withdraw();
          b[i].display();
        } 
    }
  }