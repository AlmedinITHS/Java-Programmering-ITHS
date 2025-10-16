package OvningarLecture3Classes.TasksOvningar;

public class PersonMain {
    public static void main(String[] args) {

        ContainerClass work1 = new ContainerClass("ITier", "Valentine's adelaide 46, New hampshire", "Office");
        ContainerClass work2 = new ContainerClass("FrigoScandia", "Scandinavian street 105, Ohio", "Storage");

        work2.printWorkDetails();

        work2.ContainerClass("TransportExpress", "Arlington avenue 25, Washington"," Truck");

        Person person1 = new Person("Dino", 36, "Software tester", true);
        Person person2 = new Person("Anna",32,"Software developer",true);
        Person person3 = new Person("Peter",29,"Software tester", false);

    }
    
}
