package codealongs.Polymorphism.finished;
abstract class Animal { //Abstract class utökas till subklasser
    public int age;     //Man kan inte skapa objekt från dem
                        //Public: Synlig för alla klasser, även subklasser 
    protected double weight; //Protected: Osynlig för utomstående klasser men synlig för subklasser
    private double length; // Private: Osynlig för alla klasser, även subklasser

    public String name;

    public Animal(int age, double weight, double length) { //Konstruktor med tre parametrar, som heter exakt som klassen och returnerar ingenting!
        this.age = age; 
        this.weight = weight;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
