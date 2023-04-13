import java.util.*;
class RemoveVowels
  {
    public static void display(String t)
    {
      for(int i=0;i<t.length();i++)
        {
          if(t.charAt(i)=='a'|| t.charAt(i)=='e'|| t.charAt(i)=='i'||t.charAt(i)=='o' || t.charAt(i)=='u')
          {
            continue;
          }
          System.out.print(t.charAt(i)+" ");
        }
    }
    public static void main(String[] ar)
    {
      
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      display(s1);
    }
  } 
    