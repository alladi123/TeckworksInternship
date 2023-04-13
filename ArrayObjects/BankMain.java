
/*Bank Account: Create a class called BankAccount that has properties such as account number, balance, and account holder name. Create subclasses such as CheckingAccount, SavingAccount and CreditAccount that inherit from BankAccount and add additional properties such as interest rate or credit limit. Create methods to deposit and withdraw money, check the balance and return the account details in the parent class, and override them in the subclasses to implement specific behavior for each account type.*/
import java.util.*;
class invalidamountException extends Exception
  {
    invalidamountException(String message)
    {
      super(message);
    }
  }
class BankAccount {
  long account_num;
  long balance;
  String holder_name;
   Scanner s=new Scanner(System.in);
}

class CheckingAccount extends BankAccount
  {
   
    void check()
    {
    System.out.println("enter the balance");
     try
       {
         balance=s.nextLong();
       }
    catch(InputMismatchException i)
       {
         System.out.println("balance should be numbers");
       }
    }
  }
class SavingAccount extends BankAccount
{
  void interest()
  {
    System.out.println("enter the balance");
    balance=s.nextLong();
    if(balance>10000)
    {
    try
       {
         throw new invalidamountException("balance must be below 10000");
       }
    catch(invalidamountException ie)
      {
        System.out.println(ie);
      }
  }
    else{
      System.out.println("no intersest");
    }
  
}
  class CreditAccount extends BankAccount{
    void creditlimit()
    {
       System.out.println("enter the creditlimit:");
      long credit_limit=s.nextLong();
      if(credit_limit>10000)
      {
        try
       {
         throw new invalidamountException("creditlimit must be below 10000");
       }
    catch(invalidamountException iE)
      {
        System.out.println(iE);
      }
    }
      else
      {
        System.out.println("your creditlimit is valid ");
      }
    }
    }
}
  class BankMain
    {
      public static void main(String[] args)
      {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of accounts:");
        int account=s.nextInt();
         BankAccount[] c=new BankAccount[account];
        for(int i=0;i<account;i++)
          {
            c[i]=new BankAccount();
            
            c[i].check();
         }
      }
    }
    