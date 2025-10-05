package EgnaOvningar;

public class Cat {

    public static final int MAX_LIVES = 9;
    private static int catCount = 0;
    String name = "Milena";
    String colour = "Black";
    int age = 3;
    int livesRemaining;

    public void Meow() {
        System.out.println("Meuw");

    }
    public Cat () {
        catCount++;
        livesRemaining = MAX_LIVES;
    }
    public static int getCatCount() {
        return catCount;

    }
  
}
