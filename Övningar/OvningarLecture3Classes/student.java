package OvningarLecture3Classes;

public class student {
    private String name;
    private int age;
    private double grade;

public student(String name, int age, double grade) {
    this.name = name;
    this.age = age;
    this.grade = grade;
}
public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Grade: " + grade);
}
public static void main(String[] args) {
    student student = new student("Max", 30,7.7);
    student.printDetails();
    }
}



