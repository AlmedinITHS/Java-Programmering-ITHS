package EnklaOvningarFranSlide;
public class KlassTestDjurHast {
    int age = 10;
    double weightInKg = 550;
    String name = "Penny";
    void gnagga() {
        System.out.println("GNÄÄÄGGÄGÄGÄGÄGA");
    }
    void stegra() {
        System.out.println("Hästen stegrar!");
    }
    KlassTestDjurHast(int age, double weightInKg, String name) {
        this.age = age;
        this.weightInKg = weightInKg;
        this.name = name;
    }
    KlassTestDjurHast(int age) {
        this(5,350, "Ferrari");
    }
    KlassTestDjurHast() {
        this(1,80,"Newborn horse");
    }

}
