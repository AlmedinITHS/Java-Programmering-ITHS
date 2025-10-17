package OvningarLecture3Classes.TasksOvningar;

public class Person {
    public String name;
    public int age;
    public String occupation;
    public boolean active;

    public Person(String name, int age, String occupation, boolean active) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.active = active;
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println("Active: " + active + "\n");
    }
    
}
