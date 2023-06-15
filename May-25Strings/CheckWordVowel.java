import java.util.*;
class CheckWordVowel
  {
  public static void checkVowels(String s1)
    {
      String s2[]=s1.split(" ");
      for(int i=0;i<=s2.length-1;i++)
      {
      if(s2[i].charAt(0)=='a' || s2[i].charAt(0)=='e' ||s2[i].charAt(0)=='i'
        || s2[i].charAt(0)=='o' || s2[i].charAt(0)=='u')
      {
        System.out.println(s2[i]);
      }
      }
    }
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      checkVowels(str);
    }
  }