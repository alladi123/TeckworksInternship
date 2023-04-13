/*Shopping Cart: Create a class called ShoppingCart that stores a collection of items in a ArrayList. The class should have methods to add, remove, and display items in the cart, as well as to calculate the total cost of the items in the cart.*/
import java.util.*;
class ShoppingMain
  {
    public static void main(String[] args)
    {
         char ch;
      int option;
      Scanner s=new Scanner(System.in);
    ShoppingImp si=new ShoppingImp();
  System.out.println("1.ADD ITEMS TO LIST");
  System.out.println("2.DELETE ITEMS");
  System.out.println("4.DISPLAY ITEMS");
      do{
        System.out.println("enter your choice");
        option=s.nextInt();
        switch(option)
          {
            case 1: si.additem();
              break;
            case 2:  si.removeitem();
              break;
            case 3: si.displayitem();
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
  