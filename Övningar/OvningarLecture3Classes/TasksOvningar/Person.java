package OvningarLecture3Classes.TasksOvningar;

public class Person {
    public String name;
    public int age;
    public String occupation;
    public boolean Singlestatus;

    public Person(String name, int age, String occupation, boolean status) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.Singlestatus = status;
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println("Singlestatus: " + Singlestatus + "\n");
    }
    public static void main(String[] args) {
        Person person1 = new Person("Dino", 36, "it-consultant", true);

        person1.printDetails();
    }
}
