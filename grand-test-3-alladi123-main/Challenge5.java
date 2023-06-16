/*Create a Bank class that contains an Object Array of Account objects, which will be used to store the account information.
Add a method called createAccount() to the Bank class that takes the account holder name and initial balance as parameters and creates a new Account object with a unique account number.
Add a method called deposit() to the Account class that takes an amount parameter and adds it to the account balance.
Add a method called withdraw() to the Account class that takes an amount parameter and subtracts it from the account balance. The method should also check if the withdrawal amount exceeds the daily withdrawal limit, 
which should be set to a default value of $500.

Add a method called checkBalance() to the Account class that returns the current balance of the account.
Add a method called displayInfo() to the Account class that displays the account number, account holder name, and current balance of the account.
In the main method of the program, prompt the user to select an operation:
1 to create a new account
2 to deposit money
3 to withdraw money
4 to check the balance
5 to display account information
6 to exit the program
Based on the user's selection, call the appropriate method in the Bank or Account class.

Repeat steps 6 until the user chooses to exit the program.
Example Output:

Welcome to the Bank Management System!
Please select an operation:
Create an account
Deposit money
Withdraw money
Check the balance
Display account information
Exit the program
Enter your choice: 1
Enter account holder name: John Doe
Enter initial balance: 1000
Account created successfully!
Account number: 1001
Account holder name: John Doe
Current balance: 1000.0
Please select an operation:
*/
import java.util.*;
class Bank
  {
    String Accountholder_name;
    long balance;
    Scanner s=new Scanner(System.in);
    void createAccount()
    {
      System.out.println("eneter the account holder name:");
      Accountholder_name=s.nextLine();
      System.out.println("eneter the initial balance:");
      balance=s.nextLong();
    }
  }
class Account extends Bank
  {
    long deposit;
    long withdraw;
    long total_balance;
    void depositAmount()
    {
    System.out.println("enter the amount to be deposited:");
    deposit=s.nextLong();
    }
    void totalbalance()
    {
       total_balance=balance+deposit;
      System.out.println("your total balance is:"+total_balance);
    }
    void withdraw()
    {
      System.out.println("enter the amount to be withdrawl:");
      withdraw=s.nextLong();
      
    }
    void checkBalance()
    {
System.out.println("your total balance is:"+(total_balance-withdraw));
    }
    void displayAccount()
    {
      System.out.println("Account name is:"+Accountholder_name);
      System.out.println("Balance is:"+balance);
      System.out.println("deposit amount is:"+deposit);
      System.out.println("withdraw amount is:"+withdraw);
      System.out.println("total balance is:"+balance);
    }
    
  }
class Challenge5
  {
    public static void main(String[] args)
    {
      System.out.println("Welcome to the Bank Management System!");
      System.out.println("Please select the operations:");
      Scanner s=new Scanner(System.in);
      System.out.println("enter the option:");
      System.out.println("Create an account");
      System.out.println("Deposit money");
      System.out.println("Withdraw money");
      System.out.println("Check the balance");
      System.out.println("Display account information");
      System.out.println("Exit the program");
      Account ac=new Account();
      int testcases=s.nextInt();
      Account a[]=new Account[testcases];
      for(int i=0;i<testcases;i++)
        {
          a[i]=new Account();
          a[i].createAccount();
          a[i].depositAmount();
          a[i].totalbalance();
          a[i].withdraw();
        }
      System.out.println("enter your option:");
      int option=s.nextInt();
      switch(option)
        {
          case 1: ac.createAccount();
            break;
          case 2:ac.depositAmount();
            break;
          case 3:ac.withdraw();
            break;
          case 4:ac.checkBalance();
            break;
          case 5:ac.displayAccount();
            break;
          default:System.out.println("exit the program");
        }
      
    }
  }
