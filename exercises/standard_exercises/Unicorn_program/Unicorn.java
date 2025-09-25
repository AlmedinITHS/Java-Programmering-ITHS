package Unicorn_program;
public class Unicorn {
    private int age;
    String color, mood;
    boolean horn, alive;

    
    

    Unicorn(int age, String color, String mood, boolean horn, boolean alive) {
        this.age = age;
        this.color = color;
        this.mood = mood;
        this.horn = horn;
        this.alive = alive;

    }
    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return age;
    }
    void runWild() {}
    
}
