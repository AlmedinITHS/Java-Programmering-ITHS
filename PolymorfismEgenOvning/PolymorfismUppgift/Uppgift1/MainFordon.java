package PolymorfismEgenOvning.PolymorfismUppgift.Uppgift1;

public class MainFordon {
    public static void main(String[] args) {
        Helikopter helikopter1 = new Helikopter(30, 10000);

        helikopter1.fly(true);

        Bat bat1 = new Bat(500000, 10000);

        bat1.go();
        System.out.println(bat1.getPrice());
        System.out.println(bat1.weight);

        bat1.namnAgare = "Annika";

        System.out.println(bat1.namnAgare);
        
        


    }
    
}
