class Variables
  {
    int a;
    static int c;
    static void display()
    {
      c=90;
      int x=13;
      System.out.println(c+" "+x);
    }
    void show()
    {
      int d=10;
      a=10;
      c=100;
      System.out.println(a+""+d);
      System.out.println(c);
    }
  }
class VariableMain
  {
    public static void main(String[] r)
    {
      Variables v=new Variables();
      v.display();
      Variables.display();
      v.show();
      
      
  }
  }