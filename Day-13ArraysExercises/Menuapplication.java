import java.util.*;

class Menuapplication {

  public static void insertAtfirst(int arr[], int size) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number:");
    int number = s.nextInt();
    arr[0] = number;
    System.out.println("Array is:");
    for (int i = 0; i <= size - 1; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void insertAtend(int arr[], int size) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number:");
    int number = s.nextInt();
    arr[size - 1] = number;
    System.out.println("Array is:");
    for (int i = 0; i <= size - 1; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void insertAtspecificindex(int arr[], int size) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the index:");
    int index_number = s.nextInt();
    System.out.println("enter the number:");
    int number = s.nextInt();
    arr[index_number] = number;
    System.out.println("Array is:" + arr);
    for (int i = 0; i <= size - 1; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void removeAtfirstindex(int arr[], int size) {
    Scanner s = new Scanner(System.in);
    int number = s.nextInt();
    for (int i = 0; i < size - 1; i++) {
      arr[i] = arr[i + 1];
    }
    size--;
    System.out.println("Element removed at first successfully.");

  }

  public static void removeAtlastindex(int arr[], int size) {
    Scanner s = new Scanner(System.in);
    int number = s.nextInt();
    for (int i = 0; i < size - 1; i++) {
      arr[i] = arr[i + 1];
    }
    size--;
    System.out.println("Element removed at last successfully.");

  }

  public static void removeAtspecificindex(int arr[], int size) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the index  element to be removed: ");
    int index = s.nextInt();
  if (index < 0 || index >= size) {
      System.out.println("Invalid index");
    }
    for (int i = index; i < size - 1; i++) {
      arr[i] = arr[i + 1];
    }
    size--;
    System.out.println("Element removed successfully.");
  }

public static void removeuserenterElement(int arr[], int size) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter element from user:");
    int number = s.nextInt();
    for (int i = 0; i <= size - 1; i++) {
      if (arr[i] == number) {
        arr[i] = arr[i + 1];
      }
    }
  }

  public static void AscendingorDescending(int arr[], int size) {
    System.out.println("Ascending array is:");
    for (int i = 0; i < size - 1; i++) {
      for (int j = i + 1; j < size; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void main(String[] r) {
    Scanner s = new Scanner(System.in);
    System.out.print("enter the size:");
    int arraysize = s.nextInt();
    int array[] = new int[arraysize];
    System.out.println("1.Insert an element in first index");
    System.out.println("2.Insert an element in last index");
    System.out.println("3.Insert an element in specified index");
    System.out.println("4.Remove element from first index");
    System.out.println("5.Remove element from last index");
    System.out.println("6.Remove element from specified index");
    System.out.println("7.Remove user eneted element");
    System.out.println("8.Display all in ASC/DESC order");
    System.out.print("which operations do you want:");
    // for(int i=0;i<=arraysize-1;i++)

    // System.out.println(array[i]);

    int option = s.nextInt();
    switch (option) {
      case 1:
        insertAtfirst(array, arraysize);
        break;
      case 2:
        insertAtend(array, arraysize);
        break;
      case 3:
        insertAtspecificindex(array, arraysize);
        break;
      case 4:
        removeAtfirstindex(array, arraysize);
        break;
      case 5:
        removeAtlastindex(array, arraysize);
        break;
      case 6:
        removeAtspecificindex(array, arraysize);
        break;
      case 7:
        removeuserenterElement(array, arraysize);
        break;
      case 8:
        AscendingorDescending(array, arraysize);
        break;

    }
  }
}