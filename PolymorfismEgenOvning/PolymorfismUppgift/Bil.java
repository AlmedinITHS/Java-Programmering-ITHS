package PolymorfismEgenOvning.PolymorfismUppgift;

public class Bil extends Fordon{
    
    public Bil(int price, double weight) {
        super(price, weight);
    }
    public void drive(int kmPerh) {
        for(int i = 0; i < 240;i++) {
            System.out.println(i);
        }
    }
    
}
