import java.util.*;
class UpperCase
  {
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String str1="";
      char c1=' ';
      for (int i = 0; i < str.length();i++)
        {
       if (str.charAt(i) >='A' && str.charAt(i) <='Z') 
       {
          c1=(char)(str.charAt(i) + 32);
          }
        else 
       {
          c1=(char)(str.charAt(i));
            }
         str1+= c1; 
        }
        System.out.println(str1);
    }

    }
  