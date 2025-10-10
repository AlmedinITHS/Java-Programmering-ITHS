package PolymorfismEgenOvning.Uppgift2;

abstract class Person {
    public String namn;
    public String jobb;
    public int age;
    private double pengarPaBanken;

    public String foretagsnamn;

    public Person(String namn, String jobb, int age, int pengarPaBanken) {
        this.namn = namn;
        this.jobb = jobb;
        this.age = age;
        this.pengarPaBanken = pengarPaBanken;
        
    }
    public double getPengar() {
        return pengarPaBanken;
    }
    public void setPengar(double pengarPaBanken) {
        this.pengarPaBanken = pengarPaBanken;
    }


    
}
