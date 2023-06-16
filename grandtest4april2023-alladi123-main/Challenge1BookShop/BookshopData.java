/*Challenge- 1: 

As a manager of a book shop, you are responsible for managing all the operations related to books in the shop. You have a system that stores all the book details(book_id, title, author, price) in an ArrayList of Book objects. 

Your task is to create a Java program that helps you manage the book shop efficiently.  

Create a console-based menu-driven program that allows the user to perform the following operations: 

1. Add books 

2. Calculate total price of all books 

3. Remove a book by book_id 

4. Update book price by book_id 

5. Search books by author 

6. Quit the program 

If no books are found for the given author name, the method should throw a custom exception called BookNotFoundException with an appropriate error message. 

Each menu option should call the corresponding method and display the results or appropriate error messages. 
*/
import java.util.*;
class BookshopData
  {
    int book_id;
    String book_title;
    String author_name;
    double book_price;
   public  BookshopData(int book_id,String book_title,String author_name,double book_price)
    {
      this.book_id=book_id;
      this.book_title=book_title;
      this.author_name=author_name;
      this.book_price=book_price;
    }
	public int getBook_id() {
		return book_id;
	}
	
	public String getBook_title() {
		return book_title;
	}
	
	public String getAuthor_name() {
		return author_name;
	}
	
	public double getBook_price() {
		return book_price;
	}
	public String toString()
    {
      return "bookid:"+" "+getBook_id()+" "+"booktitle"+getBook_title()+" "+"authorname:"+getAuthor_name()+" "+"price:"+getBook_price();
    }
    
  }