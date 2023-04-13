/*Create a class 'Student' with three data members which are name, age, and address. The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". It has two members with the same name 'setInfo'. The first method has two parameters for name and age and assigns the same whereas the second method takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 2 students.*/
import java.util.*;
public class Student {
     String name;
    int age;
     String address;

    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }

public static void main(String[] args) {
    Student student1 = new Student();
  Scanner s=new Scanner(System.in);
  System.out.println("enter the student name:");
  String name=s.next();
  System.out.println("enter the student age:");
  int age=s.nextInt();
  System.out.println("enter the student address:");
  String address=s.next();
    student1.setInfo(name,age,address);
    student1.printInfo();
    student1.setInfo(name,age);

}
}
