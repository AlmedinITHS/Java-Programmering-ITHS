package EnklaOvningarFranSlide;

public class MainTestdjur {
     int age;
    double weightInKg;
    String name;
    public static void main(String[] args) {
        MainTestdjur dog1 = new MainTestdjur();
        KlassTestDjurHast hast1 = new KlassTestDjurHast();

        dog1.name = "Doris";
        dog1.age = 2;
        dog1.weightInKg = 100;

        System.out.println("Namn: " + dog1.name + " Ålder: " + dog1.age + " Vikt: " + dog1.weightInKg);

        hast1.stegra();
        hast1.gnagga();
        

        System.out.println(hast1.age +"\n"+ hast1.name +"\n"+ hast1.weightInKg);

        KlassTestDjurHast hast2 = new KlassTestDjurHast(3);

        System.out.println(hast2);
        


        
        
        
        
        
    }
}

    

