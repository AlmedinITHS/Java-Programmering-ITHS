package PolymorfismEgenOvning.PolymorfismUppgift.Uppgift1;

public class Helikopter extends Fordon {

    public Helikopter(int price, double weight) {
        super(price, weight);
    }
    public void fly(boolean isFlying) {
        for(int i = 0; i < 3000; i ++) {
            System.out.println(i);
        }
    }
    
    
}
