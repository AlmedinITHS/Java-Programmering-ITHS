package PolymorfismEgenOvning.Uppgift2;

public class Saljare extends Person{
    public Saljare(String namn, String jobb, int age, int pengarPaBanken, String foretagsnamn) {
        super(namn,jobb,age,pengarPaBanken);
        this.foretagsnamn = foretagsnamn;
    } 
    public void printInfoSaljare() {
        System.out.println("Säljare info: " + namn + jobb + age + getPengar());
    }
    // Man kan lägga till metoder för att köpa och sälja bil för varje 
    
}
