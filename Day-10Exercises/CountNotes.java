import java.util.*;
class CountNotes
  {
    public static void notes(int amount)
    {
System.out.println("10 notes are:"+(amount/10)); 
System.out.println("20 notes are:"+(amount/20)); 
System.out.println("50 notes are:"+(amount/50));
System.out.println("100 notes are:"+(amount/100));
System.out.println("200 notes are:"+(amount/200)); 
System.out.println("500 notes are:"+(amount/500)); 
System.out.println("2000 notes are:"+(amount/2000)); 
  }
    public static void main(String[] v)
    {
      Scanner s=new Scanner(System.in);
      System.out.print("enter the amount:");
      int amount =s.nextInt();
      CountNotes cn=new CountNotes();
      cn.notes(amount);
    }
  }