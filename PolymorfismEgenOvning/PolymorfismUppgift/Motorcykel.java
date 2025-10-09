package PolymorfismEgenOvning.PolymorfismUppgift;

public class Motorcykel extends Fordon {

    public Motorcykel(int price, double weight) {
        super(price, weight);
    }
    public void drive(int kmPerh) {
        for (int i = 0; i < 300; i++){
        System.out.println(i);
        }
    }
    
}
