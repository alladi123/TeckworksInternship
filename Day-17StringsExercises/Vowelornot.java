import java.util.*;
class Vowelornot
  {
    public static void display(String t)
    {
      int count=0;
      String st=t.toLowerCase();
      for(int i=0;i<st.length();i++)
        {
  if(st.charAt(i)=='a'|| st.charAt(i)=='e'|| st.charAt(i)=='i'||st.charAt(i)=='o' || st.charAt(i)=='u')
  {
    count++;
  
  }
            
        }
      System.out.println(count);
    }
    public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      display(s1);
    }
  } 