//Restaurant: Create a class called "Dish" that represents a dish. The class should have properties such as name, ingredients, and price, and methods such as getName, getIngredients, and getPrice. Create another class called "Restaurant" that represents a restaurant. The class should have a list of dishes, and methods such as addDish, removeDish, and getTotalCost
import java.util.*;
class Dish
  {
    String dish_name;
    int price;
    void getName()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the dish name:");
      dish_name=s.next();
      System.out.println("dish name is:"+dish_name);
    }
    void getIngredients()
    {
       Scanner s=new Scanner(System.in);
      System.out.println("enter the number of ingredients:");
      int ing=s.nextInt();
      String ingredients[]=new String[ing];
      System.out.println("enter the ingredients:");
      for(int i=0;i<ingredients.length-1;i++)
        {
          ingredients[i]=s.next();
          
        }
    
    }
    void getPrice()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the price:");
      price=s.nextInt();
      System.out.println("price is:"+price);
    }
  }
class Restaurant
  {
    public static void main(String[] args)
    {
    Dish d=new Dish();
    d.getName();
    d.getIngredients();
    d.getPrice();
  }
  }