import java.util.*;
class DataValidator
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("which data u want to check?");
      System.out.println("1.username");
      System.out.println("2.password");
      System.out.println("3.mobilenumber");
      int i=sc.nextInt();
      System.out.println("enter the option:");
      switch (i)
        {
          case 1:
            usernamecheck();
            break;
          case 2:
            passwordcheck(); 
            break;
          case 3:
          int r=mobilenocheck();
             if(r==1)
      {
        System.out.println("It's valid mobilenumber");
      }
      else{
        System.out.println("It's invalid mobilenumber");
      }
      
            break;
        }
    }
    static void usernamecheck()
    {
      Scanner sc=new Scanner(System.in);
      String s1=new String();
      System.out.print("enter username:");
      s1=sc.nextLine();
      if(s1.length()>7)
      {
        System.out.println("invalid username");
      }
      else
      {
        int count=0;
        for(int l=0;l<s1.length();l++)
          {
            if(s1.charAt(l)>='A'&&s1.charAt(l)<='Z')
            {
              count++;
              break;
            }
          }
         for(int l=0;l<s1.length();l++)
          {
            if(s1.charAt(l)>='a'&&s1.charAt(l)<='z')
            {
              count++;
              break;
            }
          }
         for(int l=0;l<s1.length();l++)
          {
            if(s1.charAt(l)>='0'&&s1.charAt(l)<='9')
            {
              count++;
              break;
            }
          }
         for(int l=0;l<s1.length();l++)
          {
            
      if(s1.charAt(l)=='_'||s1.charAt(l)=='@'||s1.charAt(l)=='$')
            {
              count++;
              break;
            }
          }
      
       if(count==4)
            {
              System.out.println("Ur Username is valid");
            }
            else{
              System.out.println("invalid usename");
            }
      }
     
    }
    static void passwordcheck()
    {
       Scanner sc=new Scanner(System.in);
      String s1=new String();
      System.out.println("enter password");
      s1=sc.nextLine();
      if(s1.length()>8)
      {
        System.out.println("invalid password");
      }
      else{
        int count=0;
        for(int l=0;l<s1.length();l++)
          {
            if(s1.charAt(l)>='A'&&s1.charAt(l)<='Z')
            {
              count++;
              break;
            }
          }
         for(int l=0;l<s1.length();l++)
          {
            if(s1.charAt(l)>='a'&&s1.charAt(l)<='z')
            {
              count++;
              break;
            }
          }
         for(int l=0;l<s1.length();l++)
          {
            if(s1.charAt(l)>='0'&&s1.charAt(l)<='9')
            {
              count++;
              break;
            }
          }
         for(int l=0;l<s1.length();l++)
          {
            if(s1.charAt(l)=='#'||s1.charAt(l)=='@'||s1.charAt(l)=='&')
            {
              count++;
              break;
            }
          }
      }
      if(count==4)
            {
              System.out.println("Ur password is valid");
            }
            else{
              System.out.println("invalid password");
            }
    }
    static int mobilenocheck()
    {
       Scanner sc=new Scanner(System.in);
      System.out.println("enter mobilenumber");
      String L=sc.nextLine();
      int count=0;
      for(int i=0;i<=L.length()-1;i++)
        {
          if(L.charAt(i)>='0' && L.charAt(i)<='9')
          {
            count=count+1;
          }
          else{
            System.out.println("invalid mobilenumber");
          }
        }
      if(count==10)
      {
        return 1;
      }
      else{
        return 0;
      }
    }
  }