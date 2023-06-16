import java.util.*;
class BookshopMain
  {
    public static void main(String[] args)
    {
      char ch;
      int option;
      Scanner s=new Scanner(System.in);
      BookshopImplementation obj=new BookshopImplementation();
  System.out.println("1.Add books");
  System.out.println("2.remove books");
  System.out.println("3.update books");
  System.out.println("4.search books by author name");
      System.out.println("price calculation");
      
      do
      {
        System.out.println("enter your choice");
        option=s.nextInt();
        switch(option)
          {
            case 1:obj.add_books();
              break;
            case 2: obj.remove_books();
              break;
            case 3:obj.update_books();
              break;
            case 4: obj.search_books();
              break;
            case 5:obj.price_calculation();
              break;
            default: 
              System.out.println("invalid option");
          }
        System.out.println("do you want to continue one more operation");
        ch=s.next().charAt(0);
      }
        while(ch!='n');
        
    }
  
    }
  