package PolymorfismEgenOvning;

public class Test {
    public static void main(String[] args) {
        Walrus walrus1 = new Walrus(15, 250, 125);
        
        walrus1.printAge();
        walrus1.printLength();
        walrus1.printWeight();

        System.out.println(walrus1 instanceof Walrus);
        System.out.println(walrus1 instanceof Animal);

        walrusChecker(walrus1);

        Parrot parrot1 = new Parrot(10, 0.0050, 0.15, "Tommy");
        parrot1.fly(20.6);
        parrot1.talk("Tommy wants a cracker!");

        Robot robot1 = new Robot();
        robot1.talk("Hello");
        robot1.talk("The weather surely is lovely today!");

        walrusChecker(parrot1);
        System.out.println("This object is a: " + parrot1.getClass().getSimpleName() + " object.");

        introduce(parrot1);
        introduce(robot1);


    }
    public static void walrusChecker(Animal a) {
    if (a instanceof Walrus != true) {
        System.out.println("This is not a Walrus!");
    }
    else {
        System.out.println("Seems like this is indeed a Walrus!");
    }
}

    public static void introduce(Talking t) {
        t.talk("Hellow!");
    
    }
}
