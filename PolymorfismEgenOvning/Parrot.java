package PolymorfismEgenOvning;

public class Parrot extends Animal implements Talking {

    public Parrot(int age,double weight, double length, String name) {
        super(age, weight, length);// super kallar på parentklassen Animal
        this.name = name;
    }
    public void fly(double timeMinutes) {
        System.out.println(name + " flaps its wings and flies for " + time + " seconds.");
    }

    public void talk(String message) {
        System.out.println(name + " says: " + message);
    }

}
