interface ipl {
  int numof_matches = 10;

  void players();

  void show();
}

interface sponsers {
  void brands();

  void profit();
}

class csk implements ipl, sponsers {

  public void players() {
    System.out.println("csk team");
  }

  public void brands() {
    System.out.println("vivo mi brands");
  }

  public void show() {
    System.out.println("number of matches are:" + numof_matches);
  }

  public void profit() {
    System.out.println("50% profit");
  }
}

class gujarat implements ipl, sponsers {
  public void players() {
    System.out.println("gujarat team");
  }

  public void brands() {
    System.out.println("vivo mi brands");
  }

  public void show() {
    System.out.println("number of matches are:" + numof_matches);
  }

  public void profit() {
    System.out.println("60% profit");
  }

}

class mumbai implements ipl, sponsers {
  public void players() {
    System.out.println("mumbai team");
  }

  public void brands() {
    System.out.println("vivo mi brands");
  }

  public void show() {
    System.out.println("number of matches are:" + numof_matches);
  }

  public void profit() {
    System.out.println("40% profit");
  }

}

class Test {
  public static void main(String[] r) {
    csk obj1 = new csk();

    obj1.players();
    obj1.brands();
    obj1.show();
    gujarat obj2 = new gujarat();

    obj2.brands();
    obj2.players();
    obj1.show();
    mumbai obj3 = new mumbai();

    obj3.players();
    obj3.brands();
    obj3.show();

  }
}
