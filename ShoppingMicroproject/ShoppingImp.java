import java.util.*;

class ShoppingImp implements InterfaceShopping {
  ArrayList<ShoppingData> sh = new ArrayList<>();
  Scanner s = new Scanner(System.in);

  public void additem() {
    System.out.println("enter the items:");
    String item = s.next();
    String type = s.next();
    int quan = s.nextInt();
    double price = s.nextDouble();
    sh.add(new ShoppingData(item, type, quan, price));

  }

  public void removeitem() {

    if (sh.size() == 0) {
      System.out.println("no items are available");
    } else {
      String check = null;
      System.out.println("enter the item to be removed:");
      String item2 = s.next();
      for (ShoppingData s : sh) {
        if (s.getItem_name() == item2) {
          sh.remove(s);
          check = "found";
          break;
        }
      }
      if (check == null) {
        System.out.println("no item is available with this item name");
      }
    }
  }

  public void displayitem() {
    if (sh.size() == 0) {
      System.out.println("no items are available");
    } else {
      Iterator itr = sh.iterator();
      while (itr.hasNext()) {
        System.out.println(itr.next());
      }
    }
  }
}