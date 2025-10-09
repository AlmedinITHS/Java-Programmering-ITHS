package PolymorfismEgenOvning;

public class Test {
    public static void main(String[] args) {
        Walrus Walrs = new Walrus(10, 150, 110);

        Walrs.printAge();
        Walrs.printWeight();
        Walrs.printLength();

        System.out.println(Walrs instanceof Walrus);
        System.out.println(Walrs instanceof Animal);

        walrusChecker(Walrs);

        Parrot parrt = new Parrot(3, 0.050, 0.15, "Tommy");
        parrt.fly(20.6);
        parrt.talk("Tommy wants a cracker!");

        Robot robt = new Robot();
        robt.talk("Hello!");
        robt.talk("The weather surely is lovely today!");

        walrusChecker(parrt);
        System.out.println("This object is a: " + robt.getClass().getSimpleName() + " object");

        introduce(parrt);
        introduce(robt);


    }
    public static void walrusChecker(Animal a) {
        if (a instanceof Walrus != true) {
            System.out.println("This animal is not a walrus!");
        }
        else {
            System.out.println("Seems like this is indeed a Walrus!");
        }
    }
    public static void introduce(Talking t) {
      t.talk("Hello!");
    }
}