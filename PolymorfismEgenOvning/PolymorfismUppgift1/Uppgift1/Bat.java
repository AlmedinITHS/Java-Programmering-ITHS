package PolymorfismEgenOvning.PolymorfismUppgift.Uppgift1;

import java.util.Random;

public class Bat extends Fordon {

    public Bat (int price, double weight) {
        super(price, weight);
    }
    public void go() {
        Random random1 = new Random();
        double gpsPosition = random1.nextInt(10, 100);
        System.out.println(gpsPosition);
    }
    
}
