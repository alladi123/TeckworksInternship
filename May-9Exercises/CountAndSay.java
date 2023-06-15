import java.util.*;

class CountAndSay {
  public static void count(String num) 
  {
    int counter = 1;
    String result = "";
    char[] c = num.toCharArray();
    for (int i = 0; i <= c.length - 1; i++) 
    {
      for (int j = i + 1; j <= c.length - 1; j++) 
      {
        if (c[i] == c[j]) 
        {
          char t = c[j];
          c[j] = c[i + 1];
          c[i + 1] = t;
          counter++;
          result += counter + c[i];
        }
      }
    }
    System.out.println(result);
  }
  /*
   * String s=count(num);
   * int count=0;
   * String s1="";
   * for(int i=0;i<s.length()-1;i++)
   * {
   * count++;
   * if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1))
   * {
   * s1=s1+count+s.charAt(i);
   * count=0;
   * }
   * }
   * return s1;
   * }
   */
  public static void main(String[] r) {
    Scanner s = new Scanner(System.in);
    String number = s.nextLine();
    count(number);
  }
}