import java.util.*;
class Lexicographically
  {
    public static void check(String str1,String str2)
    {
      if(str1.length()==str2.length())
      {
        int c=0;
        for(int i=0;i<str1.length();i++)
          {
            for(int j=0;j<str2.length();j++)
              {
                if(str1.charAt(i)!=str2.charAt(i))
                {
                  c=1;
                  break;
                }
              }
          }
            if(c!=0)
            {
              System.out.println("two strings are not lexicographically");
            }
            else{
       System.out.println("two strings are  lexicographically");
            }
          }
          else
            {
               System.out.println("two strings are not lexicographically");
            }
          
      }
  

    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      String str1=s.nextLine();
      String str2=s.nextLine();
      check(str1,str2);
    }
  }