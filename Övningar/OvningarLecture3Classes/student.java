package OvningarLecture3Classes;

public class Student {
    public String name;
    public int age;
    public double grade;
 
public Student(int age, double grade, String name) {
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
   Student student1 = new Student(30, 7.6, "Dino");

    student1.printDetails();
    
   }
}

