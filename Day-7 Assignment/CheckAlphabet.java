import java.util.Scanner;
//check whether given character is Alphabet or not
class CheckAlphabet {
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       char ch=s.next().charAt(0);
      if((ch>=97 && ch<=122)||(ch>=65 && ch<=90)) {
        System.out.println(ch+"is an Alphabet");
      }
      else{
        System.out.println(ch+"is not an Alphabet");
      }
    }
}