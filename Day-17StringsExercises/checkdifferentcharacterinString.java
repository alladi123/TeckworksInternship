import java.util.*;
class checkdifferentcharacterinString
  {
    public static void display(String str)
    {
int digit_count=0,vowel_count=0,consonant_count=0,space_count=0,
  specialsymbol_count=0;
      for(int i=0;i<=str.length()-1;i++)
        {
    if(str.charAt(i)>='0' && str.charAt(i)<='9')
      {
        digit_count++;
      }
        else if(str.charAt(i)==' ') 
            {
            space_count++;
            }
else if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o' || str.charAt(i)=='u')
  {
    vowel_count++;
    }
  else if(str.charAt(i)!='a'|| str.charAt(i)!='e'|| str.charAt(i)!='i'||str.charAt(i)!='o' || str.charAt(i)!='u')
  {
    consonant_count++;
    }
  else{
    specialsymbol_count++;
  }
  }
  System.out.println("vowels count is:"+vowel_count);
  System.out.println("consonants count is:"+consonant_count);
  System.out.println("digits count is:"+digit_count);
  System.out.println("special symbols count is:"+specialsymbol_count);
  System.out.println("spaces count is:"+space_count);
    }
public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=s.nextLine();
      display(s1);
    }
  }  