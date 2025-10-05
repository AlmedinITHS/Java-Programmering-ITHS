package EgnaOvningar;

public class CatMain {
    public static void main(String[] args) {

        System.out.println(Cat.getCatCount());
        Cat myCat = new Cat();

        myCat.Meow();
        myCat.name = "Milena";
        myCat.age = 5;
        System.out.println(Cat.MAX_LIVES);
         
        System.out.println(Cat.getCatCount());
    }
    
}
