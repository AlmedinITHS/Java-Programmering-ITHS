package PolymorfismEgenOvning;

public class Test {
    public static void main(String[] args) {
        Walrus w = new Walrus(14, 200.5, 124.3);
        
        w.printAge();
        w.getLength();
        w.printWeight();

        System.out.println(w instanceof Walrus);
        System.out.println(w instanceof Animal);
    }
    
    public static void walrusChecker(Animal a) {
        if (a instanceof Walrus != true) {
            System.out.println("This animal is not a walrus");
        }
        else {
            System.out.println("Seems like this is indeed a Walrus!");
        }

        public static void introduce(Talking t) {
            t.talk("Hello");
        }
    }
}
