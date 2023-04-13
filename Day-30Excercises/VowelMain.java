/*create class WordTest having add()& testWord() to take input and verify whether every word has at least 3 vowels if the word is not having at least 3 vowels then generate a custom exception. Test your code for any 6 different scenarios.*/
import java.util.*;
class invalidVowel extends Exception
  {
    invalidVowel(String message)
    {
      super(message);
    }
  }
class vowel
  {
    Scanner s=new Scanner(System.in);
    String word;
    void add()
    {
    System.out.println("enter the word");
    try
      {
        word=s.nextLine();
      }
    catch(InputMismatchException im)
      {
        System.out.println("error:enter only alphabets");
      }
    }
    void testword()
    {
      String[] s2=word.split(" ");
      int count=0;
      for(int i=0;i<=s2.length-1;i++)
        {
          String s1=s2[i];
          for(int j=0;j<=s1.length()-1;j++)
            {
if(s1.charAt(j)=='a' || s1.charAt(j)=='e'|| s1.charAt(j)=='i'|| s1.charAt(j)=='o'|| s1.charAt(j)=='u')
          {
            count++;
          }
            }
        }
      try
        {
          if(count<3)
          {
            throw new invalidVowel("invalid vowel count");
          }
          else{
            System.out.println("these word has at least 3 vowels");
          }
        }
      catch(invalidVowel iv)
        {
          System.out.println(iv);
        }
        
      }
    }
class VowelMain
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      int testcases=s.nextInt();
      vowel v[]=new vowel[testcases];
      for(int i=0;i<testcases;i++)
        {
          v[i]=new vowel();
          v[i].add();
          v[i].testword();
        }
    }
  }