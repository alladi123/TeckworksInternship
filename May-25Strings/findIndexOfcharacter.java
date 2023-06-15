import java.util.*;
class findIndexOfcharacter
  {
    public static void main(String[] t)
    {
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      char c=s.next().charAt(0);
      int c=0;
      for(int i=0;i<=s1.length()-1;i++)
        {
          if(c==s1.charAt(i))
          {
            System.out.println(i);
            c=1;
            break;
          }
        }
      if(c==0)
      {
        System.out.println("index not found or invalid character");
      }
    }
  }