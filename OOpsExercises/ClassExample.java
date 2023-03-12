class ClassExample
  {
    int var1=10;//instance variables
     static int var2=30;//static variables
   void display()
    {
//local variables never created as static
     int var3=90;  
      System.out.println(var1+" "+var2+" "+var3);
    }
  static void show()
    //inside non static method we can acess non static and static variables.
    {
      var2+=1;//static variable.
     // var1+=1;
    }
   
  }
class Mainclass
  {
    public static void main(String[] ar)
    {
  ClassExample e=new ClassExample();
      ClassExample ce=new ClassExample();
   // e.display();
      ce.show();
      e.show();
System.out.println(e.var1+" "+e.var2+" "+ClassExample.var2);
    }
  }