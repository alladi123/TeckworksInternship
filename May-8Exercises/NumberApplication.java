import java.util.*;
class NumberApplication
  {
    public static void checkeven(int number)
    {
      if(number%2==0)
      {
        System.out.println(number+"is a even number");
        
      }
      else{
         System.out.println(number+"is not a even number");
      }
    }
    public static void checkodd(int number)
    {
      if(number%2!=0)
      {
        System.out.println(number+"is a odd number");
        
      }
      else{
         System.out.println(number+"is not a odd number");
    }
    }
    public static void checkpositive(int number)
    {
      if(number>0)
      {
        System.out.println(number+"is a positive number");
        
      }
      else{
         System.out.println(number+"is not a positive number");
    }
    }
    public static void checknegative(int number)
    {
      if(number<0)
      {
        System.out.println(number+"is a negative number");
        
      }
      else{
         System.out.println(number+"is not a negative number");
    }
    }
   public static boolean checkprime(int number) 
     {
    for(int i=2;i<number;i++) 
      {
       if (number%i==0) {
        return false;
       }
    }
    return true;
    }
    public static void main(String r[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Options are:");
      System.out.println("1.check Even number");
      System.out.println("2.check odd number ");
      System.out.println("3.check positive number");
      System.out.println("4.check negative number");
      System.out.println("5.check prime number");
       char option;
      do{
      System.out.println("enter the number:");
      int number=s.nextInt();
      System.out.println("enter your choice:");
      int choice=s.nextInt();
      switch(choice)
        {
          case 1:checkeven(number);
            break;
          case 2: checkodd(number);
            break;
          case 3:checkpositive(number);
            break;
          case 4:checknegative(number);
            break;
          case 5:if(number==0)
          {
            System.out.println(number+"is not a prime number");
          }
           else if(checkprime(number))
          {
            System.out.println(number+"is a prime number");
          }
            else
          {
            System.out.println(number+"is not a prime number");
          }
            break;
       }
        System.out.println("do you want to repeat the process");
        option=s.next().charAt(0);
      }
        while(option!='n');
        
   }
  }
  