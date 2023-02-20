import java.util.Scanner;

class  Checkcharacter{
  public static void display(char ch)
  {
    if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
        System.out.println(ch +" " +"is an Alphabet");
      }
      else if(ch>='0' && ch<='9')
      {
        System.out.println(ch+" " +"is a digit");
      }
      else{
        System.out.println(ch+" " +"is a special symbol");
      }
  }
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.print("enter the character:");
       char ch=s.next().charAt(0);
      Checkcharacter c=new Checkcharacter();
      c.display(ch);
      
    }
}