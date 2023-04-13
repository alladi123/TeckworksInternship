/*Shapes: Create a class called Shape that has properties such as color and a method to calculate the area. Create subclasses such as Rectangle, Triangle, and Circle that inherit from Shape and override the area calculation method. Create a class called ShapeTester that creates objects of the different shape classes and calls the area calculation method on them.*/
import java.util.*;
class InvalidDimensions extends Exception
  {
    public InvalidDimensions(String message)
    {
      super(message);
    }
  }
class Shape
   {
     double radius;
     double length;
     double breadth;
     double area;
     
   void Areaofcircle()
     {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the radius");
        radius=s.nextDouble();
       if(radius<=0){
     try
       {
      throw new   InvalidDimensions("radius must be greater than zero"); 
       }
     catch(InvalidDimensions id)
       {
         System.out.println(id);
       }
       }
       else{
          area=3.14*radius*radius;
         System.out.println("Area of a circle is:"+area);
       }
     }
  void Areaofrectangle()
  {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the length and breadth");
       double length=s.nextDouble();
    double breadth=s.nextDouble();
       if(length<=0 && length<=0){
     try
       {
      throw new   InvalidDimensions("length and breadth must be greater than zero"); 
       }
     catch(InvalidDimensions id)
       {
         System.out.println(id);
       }
       }
       else{
        area=length*breadth;
    System.out.println("Area of a Rectangle is:"+area);
  }

}
void AreaofTriangle()
  {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the length and breadth");
       double length=s.nextDouble();
       double breadth=s.nextDouble();
       if(length<=0 && length<=0){
     try
       {
      throw new InvalidDimensions("length and breadth must be greater than zero"); 
       }
     catch(InvalidDimensions id)
       {
         System.out.println(id);
       }
       }
       else{
        area=0.5*(length*breadth);
    System.out.println("Area of a Triangle is:"+area);
  }
    
}
}
class Shapes
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the dimension calculation:");
      int t=s.nextInt();
      Shape[] sh=new Shape[t];
      for(int i=0;i<=t;i++)
        {
          sh[i]=new Shape();
          sh[i].Areaofcircle();
          sh[i].Areaofrectangle();
          sh[i].AreaofTriangle();
  
        }
    }
  }