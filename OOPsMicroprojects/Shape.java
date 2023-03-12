/*Shapes: Create a class called Shape that has properties such as color and a method to calculate the area. Create subclasses such as Rectangle, Triangle, and Circle that inherit from Shape and override the area calculation method. Create a class called ShapeTester that creates objects of the different shape classes and calls the area calculation method on them.*/
import java.util.*;
class Shape
   {
     double radius;
     double length;
     double breadth;
     double area;
     }
class Circle extends Shape
{
  Circle(double radius)
  {
    this.radius=radius;
  }
  void displayAreacircle()
  {
    area=3.14*radius*radius;
    System.out.println("Area of a circle is:"+area);
  }
  
}
class Rectangle extends Shape
{
  Rectangle(double length,double breadth)
  {
    this.length=this.length;
    this.breadth=breadth;
  }
  void displayArearectangle()
  {
     area=length*breadth;
    System.out.println("Area of a Rectangle is:"+area);
  }

}
class Triangle extends Shape
  {
    Triangle(double length,double breadth)
    {
      this.length=length;
      this.breadth=breadth;
    }
     void displayAreatriangle()
  {
    double area=0.5*(length*breadth);
    System.out.println("Area of a Triangle is:"+area);
  }
    
    
  }
class ShapeTester
  {
    public static void main(String args[])
    {
      Scanner s1=new Scanner(System.in);
      System.out.println("enter radius:");
      double r1=s1.nextDouble();  
        System.out.println("enter  length:");
      double l=s1.nextDouble();
        System.out.println("enter breadth:");
      double b=s1.nextDouble();
      Shape s=new Shape();
      Circle c=new Circle(r1);
      Rectangle rec=new Rectangle(l,b);
      Triangle tri=new Triangle(l,b);
      c.displayAreacircle();
      rec.displayArearectangle();
      tri.displayAreatriangle();
    }
  }