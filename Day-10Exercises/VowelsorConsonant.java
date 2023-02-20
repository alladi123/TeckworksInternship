import java.util.Scanner;
//check whether the given character is vowel or consonant
class VowelsorConsonant {
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       char c=s.next().charAt(0);
      VowelsorConsonant v=new VowelsorConsonant();
      v.m(c);
    }
  public static void m(char c)
  {
       switch(c)
         {
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
           case 'A':
           case 'E':
           case 'I':
           case 'O':
           case 'U':
             System.out.println(c+"is a Vowel");
            break;
           default:
             System.out.println(c+"is a consonant");
         }
    }
}
