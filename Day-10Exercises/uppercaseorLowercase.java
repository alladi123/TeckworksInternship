import java.util.Scanner;
//check whether given character is uppercase or lowercase alphabet
class uppercaseorLowercase {
  public static void check(char ch)
  {
    if((ch>=97 && ch<=122)) {
        System.out.println(ch+"is an Lowercase Alphabet");
      }
      else{
        System.out.println(ch+"is  an  Uppercase Alphabet");
      }
  }
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       char ch=s.next().charAt(0);
      uppercaseorLowercase u=new uppercaseorLowercase();
      u.check(ch);
    }
}