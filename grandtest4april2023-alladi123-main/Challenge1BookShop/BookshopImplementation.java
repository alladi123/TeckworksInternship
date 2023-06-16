import java.util.*;
class BookNotFoundException extends Exception {
    String message;
    public BookNotFoundException(String message) {
       this.message=message;
    
    }
   String get()
   {
     return message;
   }
}
class BookshopImplementation implements Bookshopinterface
  {
    Scanner s=new Scanner(System.in);
    ArrayList<BookshopData> list=new ArrayList<>();
  public   void add_books()
    {
      System.out.println("enter the book details:");
      int book_id=s.nextInt();
     String book_title=s.next();
     String author_name=s.next();
     double book_price=s.nextDouble();
list.add(new BookshopData(book_id,book_title,author_name,book_price));
    }
 public  void remove_books()
    {
      System.out.println("enter the book id to be removed:");
      int id=s.nextInt();
      String check=null;
      for(BookshopData b:list)
        {
          if(b.getBook_id()==id)
          {
            list.remove(b);
            check="found";
            break;
          }
          if(check==null)
          {
            System.out.println("book is already removed");
          }
        }
    }
 public  void update_books()
    {
      System.out.println("enter the book to update by using book price:");
      double price=s.nextDouble();
      String check=null;
      for(BookshopData b:list)
        {
          if(b.getBook_price()==price)
          {
           list.add(price);
            check="found";
            break;
          }
        }
      if(check==null)
      {
        System.out.println("no book is available for that price");
      }
    }
 public  void search_books()
    {
      System.out.println("enter the book by author name:");
      String name=s.next();
      for(BookshopData b:list)
        {
          if(b.getAuthor_name()==name)
          {
            System.out.println("bookid:"+" "+b.getBook_id()+" "+"booktitle"+b.getBook_title()+" "+"authorname:"+b.getAuthor_name()+" "+"price:"+b.getBook_price());
          }
          else{
            throw new BookNotFoundException("enter valid book");
          }
    }
    }
  public void price_calculation()
    {
      System.out.println("calculate all book prices");
      for(BookshopData b:list)
        {
          System.out.println(b.getBook_price());
        }
    }
  }