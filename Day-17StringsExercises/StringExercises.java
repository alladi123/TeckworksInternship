import java.util.*;
import java.util.Arrays;
class StringExercises
  {
    public static void concatenate(String str)
    {
      Scanner s=new Scanner(System.in);
       System.out.println("enter the string to concatenate:");
      String string1=s.nextLine();
      System.out.println(str.concat(string1));
    }
 public static void IgnoreCase(String str)  
    {
      System.out.println("Ignore case in string:");
       Scanner s=new Scanner(System.in);
       System.out.println("enter the string2:");
      String string2=s.nextLine();
      System.out.println(str.equalsIgnoreCase(string2));
    }
    public static void Palindrome(String str)  
    {
    System.out.println("String is a Palindrome or not:");
    int count = 0;
    String r ="";
    for (int i = str.length() - 1; i >= 0; i--) {

     r = r + str.charAt(i);
    }
    for (int i = 0; i <= str.length() - 1; i++) {
      if (str.charAt(i) == r.charAt(i)) {
        count++;
      }
    }
    if (count == str.length()) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }
 public static void StringReverse(String str)     
    {
      System.out.println("Reverse of a string:");
       String r = "";
    for (int i = str.length()-1; i >= 0; i--) {
     r = r + str.charAt(i);
    }
      System.out.println("Reverse of a string is"+r);
    }
  public static void StringtoUppercase(String str) 
    {
      System.out.println(str.toUpperCase());
    }
   public static void Lexicographically(String str)  
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the string2:");
  String str2 =s.nextLine();
    int r = str.compareTo(str2);

        if (r < 0) {
  System.out.println("String 1 is lexicographically less than String 2");
        } 
        else if (r> 0) {
  System.out.println("String 1 is lexicographically greater than String 2");
        } 
        else {
  System.out.println("String 1 is lexicographically equal to String 2");
        }
  }
    public static void PrintDuplicatecharacters(String str) 
    {
      System.out.println("Show duplicate characters");
       int[] freq = new int[256];
        for (int i = 0; i <=str.length()-1; i++) {
            char c = str.charAt(i);
            freq[c]=freq[c]+1;
          }
        for (int i = 0; i <freq.length-1; i++) 
        {
            if (freq[i]>1) 
            {
System.out.println("duplicate characters are:"+(char)i);
            }
       }
    }   
    public static void CountnumberOfwords(String str)
    {
      int count=0;
      for(int i=0;i<=str.length()-1;i++)
        {
          if(str.charAt(i)!=' ')
          {
            count++;
          }
        }
      System.out.println("number of words is:"+count);
    }
   public static void AnagramorNot(String str1)
    {
      
      Scanner s=new Scanner(System.in);
      String str2=new String(s.nextLine());
      char c1[]=str1.toCharArray();
      char c2[]=str2.toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
      boolean result=Arrays.equals(c1,c2);
      if(result)
      {
        System.out.println("Two strings are Anagram");
      }
      else{
        System.out.println("two strings are not Anagram");
      }
    }
    public static void GetindexCharacter(String str)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the index");
      int index=s.nextInt();
      for(int i=0;i<=str.length()-1;i++)
        {
          if(i==index)
          {
            System.out.println(str.charAt(i));
          }
        }
    }

public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String string=s.nextLine();
      AnagramorNot(string);
      CountnumberOfwords(string);
    PrintDuplicatecharacters(string); 
      GetindexCharacter(string);
      Lexicographically(string);
      StringtoUppercase(string);
      StringReverse(string);
      concatenate(string);
     IgnoreCase(string);
     Palindrome(string); 
  
   }
} 
    