import java.util.Scanner;
//check whether given character is Alphabet or not
class Checkalphabet {
  public static void alphabet(char ch)
  {
    if((ch>=97 && ch<=122)||(ch>=65 && ch<=90)) {
        System.out.println(ch+"is an Alphabet");
      }
      else{
        System.out.println(ch+"is not an Alphabet");
      }
  }
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      char ch=s.next().charAt(0);
      Checkalphabet c=new Checkalphabet();
      c.alphabet(ch);
       
      
    }
}