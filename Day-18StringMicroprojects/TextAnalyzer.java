/*Create an application that takes a text as input and performs different analysis like counting the number of characters, words, and lines, or finding the most common word.*/
import java.util.*;
class TextAnalyzer
  {
public static int Countchar(String str)
    {
     int char_count=0;
       
      for(int i=0;i<=str.length()-1;i++)
        {
        if(str.charAt(i)>='a'&& str.charAt(i)<='z' ||
          str.charAt(i)>='A' && str.charAt(i)<='Z')
         {
        char_count++;
         }
      }
      return char_count;
    }
  public static int Countwords(String str)
    {
       String[] words=str.split(" ");
      int a=words.length;
    return a;
  }
    public static string mostcommonwords(String str)
    {
       String[] words=str.split(" ");
      int c=1;
      for(int i=0;i<=words.length-1;i++)
        {
          String count=words[i];
          for(int j=i+1;j<=words.length-1;j++)
            {
              if(count==words[j])
              {
                c++;
              }
            }
          if(c>1)
          {
          return words[i];
          }
        }
      }
public static int numberoflines(String str) 
    {
      String[] words=str.split(" ");
      return words.length;
    }
public static void main(String[] args)
  {
  Scanner s=new Scanner(System.in);
     System.out.println("enter the string:");
    String string=s.nextLine();
    Countchar(string);
    mostcommonwords(string);
    Countwords(string);
    numberoflines(string); 
  }
  }