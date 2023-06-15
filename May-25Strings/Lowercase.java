import java.util.*;
class Lowercase
  {
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String str1="";
      char c1=' ';
      for (int i = 0; i < str.length();i++)
        {
       if (str.charAt(i) >='a' && str.charAt(i) <='z') 
       {
          c1=(char)(str.charAt(i)-32);
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
  