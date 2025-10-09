package PolymorfismEgenOvning.Uppgift2;

public class Kopare extends Person {

    public Kopare(String namn, String jobb, int age, int pengarPaBanken) {
        super(namn, jobb, age, pengarPaBanken);
        
    }
    public void printInfoKopare() {
        System.out.prinln("Köpare info:" + namn + jobb + age + getPengar());
    }

    
}
