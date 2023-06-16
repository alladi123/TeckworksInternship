/*Challenge-3
You are working for a publishing company that sells books and magazines. The company is interested in tracking the orders and sales of their publications. 
As a software developer, your task is to create a program that can calculate the total number of copies of a given book that have been ordered and the total sale of the publication.
Task: Write a program in Java that takes input for a book's title, price, number of copies sold, and number of copies ordered. 
The program should then calculate the total number of copies of the book that have been ordered and the total sale of the publication. The program should also display the results to the user.

A. Create a class called Publication with the following instance variables:
1. title (String)
2. price (double)
3. copies (int)
B. Create a class called Book that extends Publication and adds the following instance variable:
1. author (String)
C. Create a class called Magazine that extends Publication and adds the following instance variables:
1. orderQty (int)
2. currentIssue (String)
  
Example Output:
Enter title: Introduction to Java Programming
Enter price: 59.99
Enter copies sold: 1000
Enter copies ordered: 500
Total copies of book ordered: 1500
Total sale of publication: 59990.0*/

import java.util.*;
class Publications
  {
    String title;
    double price;
    double copies_sold;
    Scanner s=new Scanner(System.in);
  }
class Books extends Publications
  {
    String author;
    int copies;
    void book_details()
    {
      System.out.println("enter the title of a book:");
      title=s.nextLine();
      System.out.println("enter the auther  of a book:");
      author=s.nextLine();
      System.out.println("enter the price of a book:");
      price=s.nextDouble();
      System.out.println("enter the copies sold  of a book:");
      copies_sold=s.nextDouble();
      System.out.println("enter the copies ordered of a book:");
      copies=s.nextInt();
    }
    void salesofPublications()
    {
      double totalbill=price*copies_sold;
      System.out.println("The sales of a publication is:"+totalbill);
    }
  }
class Magazine extends Publications
  {
    int orderQuantity;
    String currentIssue;
    void magazineDetails()
    {
    System.out.println("enter the orderquantity:");
     orderQuantity =s.nextInt();
     System.out.println("orderquantity is:"+orderQuantity); 
     System.out.println("enter the currentIssue:"); 
      currentIssue=s.nextLine();
      System.out.println("currentIssueis:"+currentIssue); 
    }
  }
class Challenge3
  {
    public static void main(String[] args)
    {
      Books b=new Books();
      b.book_details();
      b.salesofPublications();
      Magazine m=new Magazine();
      m.magazineDetails();

    }
  }
