import java.util.*;
/*ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.*/
class  Account
  {
    long account_number;
    long balance;
    String accountholder_name;
    void getdata()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the account number:");
      account_number=s.nextLong();
     System.out.println("enter the balance:");
      balance=s.nextLong();
      System.out.println("enter the account holder name:");
      accountholder_name=s.next();
    }
    void amountDeposit()
    {
      int amount;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the amount to be deposited:");
      amount=s.nextInt();
      System.out.println("your total amount is:"+(amount+balance));
      }
    void withdraw()
    {
      Scanner s=new Scanner(System.in);
       System.out.println("enter the withdraw amount:");
     long  withdraw_amount=s.nextLong();
  System.out.println("your total amount is:"+(balance-withdraw_amount));
    }
    void checkBalance()
    {
      System.out.println("Your account balance is:"+balance);
    }
  }
class Atm
  {
    public static void main(String[] ar)
    {
    Account a=new Account();
    a.getdata();
    a.amountDeposit();
    a.withdraw();
    a.checkBalance();
    }
  }