class Test
  {
    static int x=10;
    int y=90;
    long  num=354646466;
    
    static void increment()
    {
      x+=1;
      System.out.println(x);
    }
    void decrement()
    {
      x-=1;
      y-=1;
      System.out.println(x+" "+y);
      System.out.println(num);
    }
  }
class Test1
  {
    public static void main(String[] ar)
    {
      Test t=new Test();
      t.increment();
      t.decrement();
      System.out.println(t.x+" "+t.y);
    }
  }