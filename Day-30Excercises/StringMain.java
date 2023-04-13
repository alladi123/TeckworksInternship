import java.util.*;
class digitException extends Exception
  {
    digitException(String message)
    {
      super(message);
    }
  }
class String1
  {
    String str;
    void read()
    {
      System.out.println("enter the string:");
      Scanner s=new Scanner(System.in);
     try
       {
        str=s.nextLine();
  if(str.charAt(0)=='0'|| str.charAt(0)=='1'||str.charAt(0)=='2'||str.charAt(0)=='3'||str.charAt(0)=='4'|| str.charAt(0)=='5'||str.charAt(0)=='6'||
        str.charAt(0)=='7'||str.charAt(0)=='8'|| str.charAt(0)=='9')
      {
throw new digitException("enter only string as a input");
      }
      
        else{
        System.out.println("your input is string");
      }
      }
      catch(digitException de)
        {
          System.out.println(de);
          read();
        }
      }
    void check()
    {
       String[] s1=str.split(" ");
      for(int i=0;i<=s1.length-1;i++)
        {
          String s2=s1[i];
          int a=s2.length()-1;
          int b=(a-3)+1;
          if(s2.substring(b,a+1).equals("ing"))
          {
            System.out.println("Yes it is ends with ing pattern");
          }
          else
          {
            System.out.println("it is not ends with ing pattern");
          }
        }
    }
  }
class StringMain
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number of test cases:");
      int testcases=s.nextInt();
      String1[] st=new String1[testcases];
      for(int i=0;i<testcases;i++)
        {
          st[i]=new String1();
          st[i].read();
          st[i].check();
        }
    }
  }