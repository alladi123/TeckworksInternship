import java.util.*;
public class Multiplicationgenerator
  {
  public static void multiplication(int n,int c)
    {
      System.out.println("multiplication table is:");
    int f,i=0;
      while(i<=10)
        {
          f=n*i;
          System.out.println(n+"*"+i+"="+f);
          i++;
        }
      if(c%n==0)
      {
        System.out.println(c+"is a multiple of "+n);
      }
      else
        System.out.println(c+"is  not a multiple of "+n);
  }


public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.print("enter the number:");
      int number =s.nextInt();
      System.out.print("enter your number:");
      int choice =s.nextInt();
      multiplication(number,choice);
    }
  }