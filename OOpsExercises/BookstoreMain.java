import java.util.*;
interface Bookstore
  {
    abstract String bookname();
  abstract  String getisbn();
    int price();
    void  publisheryear();
  }
class book1 implements Bookstore
{
  public String bookname()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the name:");
    String name=s.next();
    return name;
  }
 public  String getisbn()
  {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the isbn number:");
   String number=s.next();
    return number;
  }
 public  int  price()
  {
    Scanner s=new Scanner(System.in);
     System.out.println("enter the price:");
    int p=s.nextInt();
    return p;
  }
  public void publisheryear()
  {
    Scanner s=new Scanner(System.in);
     System.out.println("enter the year:");
    int year =s.nextInt();
    System.out.println(year);
  }
}
public class BookstoreMain
{
  public static void main(String[] args)
  {
    book1 b=new book1();
    b.bookname();
    System.out.println(b.bookname());
    b.getisbn();
    b.price();
    b.publisheryear();
  }
}