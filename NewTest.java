
public class NewTest {
    int age;
    double weightInKg;
    String name;
    public static void main(String[] args) {
        NewTest dog1 = new NewTest();
        NewTestNyttDjur hast1 = new NewTestNyttDjur();

        dog1.name = "Doris";
        dog1.age = 1;
        dog1.weightInKg = 1.6;

        System.out.println("Namn: " + dog1.name + " Ålder: " + dog1.age + " Vikt: " + dog1.weightInKg);

        hast1.stegra();
        hast1.gnagga();
        

        System.out.println(hast1.age +"\n"+ hast1.name +"\n"+ hast1.weightInKg);


        
        
        
        
        
    }
}

    

