
/*To-do List: Create a class called ToDoList that stores a collection of tasks in a LinkedList. The class should have methods to add, edit, and delete tasks, as well as to mark a task as complete and display all incomplete tasks.*/
import java.util.*;

class TodoListImp implements InterfaceTodolist {
  LinkedList l = new LinkedList();
  Scanner s = new Scanner(System.in);

void additems() {
    System.out.println("enter how many tasks do you want:");
    int num_task = s.nextInt();
    String s1;
    for (int i = 0; i < num_task; i++) {
      s1 = s.next();
      l.add(s1);
    }
    ListIterator r = l.listIterator();
    while (r.hasNext()) {
      System.out.println(r.next());
    }
  }

  void edittask() {
    System.out.println("enter the task to  edit:");
    String edit_task = s.next();
    System.out.println("1.add at first");
    System.out.println("2.add at last:");
    System.out.println("enter the option:");
    int option = s.nextInt();
    switch (option) {
      case 1:
        l.addFirst(edit_task);
        break;
      case 2:
        l.addLast(edit_task);
        break;
      default:
        System.out.println("enter valid option");
    }
    ListIterator r = l.listIterator();
    while (r.hasNext()) {
      System.out.println(r.next());
    }

  }

  void deletetask() {
    System.out.println("enter the task to be removed:");
    String task = s.next();
    l.remove(task);
    ListIterator r = l.listIterator();
    while (r.hasNext()) {
      System.out.println(r.next());
    }
  }
}
