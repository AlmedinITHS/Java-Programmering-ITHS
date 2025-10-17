package OvningarLecture3Classes.TasksOvningar;

public class PersonMain {
    public static void main(String[] args) {
        ContainerClass work1 = new ContainerClass("ITier", "Valentine's adelaide 46, New hampshire", "Office");
        ContainerClass work2 = new ContainerClass("FrigoScandia", "Scandinavian street 105, Ohio", "Storage");


        work2.printWorkDetails();

        work2.CompanyName = "TransportExpress";
        work2.adress = "Arlington avenue 22";
        work2.workSpace = "Inside of a truck";

        work2.printWorkDetails();

    

        Person person1 = new Person("Hans", 36, "Software tester", true);
        Person person2 = new Person("Anna",32,"Software developer",true);
        Person person3 = new Person("Peter",29,"Software tester", false);
        Person person4 = new Person("Viktoria", 25, "cleaning", false);
        //System.out.println("Person1: " + person1 + "Person2: " + person2 + "Person3: " + person3 + "Person4: " + person4);

        person1.occupation = "Lead developer";

        System.out.println("New occupation: " + person1.occupation);

        
    }
    
}
