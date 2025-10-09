package PolymorfismEgenOvning.PolymorfismUppgift.Uppgift1;

abstract class Fordon {

    private int price;
    protected double weight; 

    public Fordon (int price, double weight) {
        this.price = price;
        this.weight = weight;
    }
    public int getPrice() {
        return price;
        
    }
    public void setPrice(int price) {
        this.price = price;
    }

    
}
