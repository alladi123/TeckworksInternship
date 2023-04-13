//Restaurant: Create a class called "Dish" that represents a dish. The class should have properties such as name, ingredients, and price, and methods such as getName, getIngredients, and getPrice. Create another class called "Restaurant" that represents a restaurant. The class should have a list of dishes, and methods such as addDish, removeDish, and getTotalCost
import java.util.*;
class dishException extends Exception
  {
    public dishException(String message)
    {
      super(message);
    }
  }
class Dish
    {
       Scanner s=new Scanner(System.in);
    String dish_name;
    int price;
      int num;
      String[] d;
    void getName()
    {
     
      System.out.println("enter the dish name:");
    try{
      dish_name=s.next();
      }
      catch(InputMismatchException im)
      {
        System.out.println("dish name must be in alphabets ");
      }
    }
    void getIngredients()
    {
      System.out.println("enter the number of ingredients:");
      int ing=s.nextInt();
      String ingredients[]=new String[ing];
      System.out.println("enter the ingredients:");
      for(int i=0;i<=ingredients.length-1;i++)
        {
          ingredients[i]=s.next();
          
        }
    
    }
void addDish()
  {
 
  System.out.println("enter the number of dishes:");
  num=s.nextInt();
  d=new String[num];
  for(int i=0;i<num;i++)
    {
      d[i]=s.nextLine();
    }
  for(int i=0;i<num;i++)
    {
    if(d[i]==dish_name){
  try{
    throw new dishException("dish is already exists");
  }
      catch(dishException de)
    {
      System.out.println(de);
    }
    }
      else
    {
      System.out.println("dish is added");
    }
    }
  }
  void removeDish()
   {
    System.out.println("enter the  dish to be removed:");
    String dish_name=s.next();
    for(int i=0;i<=d.length-1;i++)
      {
      if(d[i]!=dish_name)
        {
        try{
        throw new dishException("dish is already removed");
              }
            catch(dishException df)
              {
              System.out.println(df);
              }
            }
            else{
              System.out.println("dish is removed");
            }

              }
          }
      
    void getPrice()
    {
      
      System.out.println("enter the price:");
    
      try{
      price=s.nextInt();
      }
      catch(InputMismatchException id)
        {
        System.out.println("enter the valid price:");
        }
    
    }
      
      
  }
  
class Restaurant
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
    System.out.println("enter the number of dishes:");
      int num_dishes=s.nextInt();
    Dish dh[]=new Dish[num_dishes];
      for(int i=0;i<=num_dishes-1;i++)
        {
          dh[i]=new Dish();
         dh[i].getName();
        dh[i].getIngredients();
        dh[i].addDish();
          dh[i].removeDish();
        dh[i].getPrice();
        }
  }
  }
