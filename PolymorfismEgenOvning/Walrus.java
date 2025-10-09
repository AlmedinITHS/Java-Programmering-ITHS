package PolymorfismEgenOvning;

public class Walrus extends Animal {
    
    public Walrus(int age, double weight, double length) {
        super(age, weight,length);
    }
    public void printAge() {
        System.out.println("Age: " + age);
    }
    public void printWeight() {
        System.out.println("Weight: " + weight);
    }
    public void printLength() {
        System.out.println("Length: " + getLength());
    }
}