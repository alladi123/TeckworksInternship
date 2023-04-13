import java.util.*;

class TodolistMain {
  public static void main(String[] args) {
    char op;
    int option1;
    Scanner s = new Scanner(System.in);
    TodoListImp t = new TodoListImp();
    System.out.println("options are:");
    System.out.println("1.ADD TASKS");
    System.out.println("2.EDIT TASKS");
    System.out.println("3.REMOVE TASKS");
    do {
      System.out.println("enter your choice");
      option1 = s.nextInt();
      switch (option1) {
        case 1:
          t.additems();
          break;
        case 2:
          t.edittask();
          break;
        case 3:
          t.deletetask();
          break;
        default:
          System.out.println("invalid option");
      }
      System.out.println("do you want to continue one more operation");
      op = s.next().charAt(0);
    } while (op != 'n');

  }

}
