import java.util.*;

class Frequency {
  public static void frequency(int arr[], int s) {

    for (int i = 0; i < s; i++) {
      int a = 0;
      int count = 0;
      for (int j = i + 1; j < s; j++) {
        if (arr[i] == arr[j]) {
          a = 1;
          break;
        }
      }
      if (a == 1)
        continue;
      for (int j = 0; j <= i; j++) {
        if (arr[i] == arr[j])
          count += 1;
      }
      System.out.println(arr[i] + ":" + count);
    }
  }

  public static void main(String[] r) {
    Scanner s = new Scanner(System.in);
    System.out.print("enter the array size:");
    int size = s.nextInt();
    System.out.print("enter the array elements:");
    int array[] = new int[size];
    for (int i = 0; i <= size - 1; i++) {
      array[i] = s.nextInt();
    }
    frequency(array, size);
  }
}