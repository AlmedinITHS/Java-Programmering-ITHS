package Unicorn_program;
public class MakeUnicorns {
    public static void main(String[] args) {
        Unicorn Bengt = new Unicorn(5, "Blå", "Glad", true, true);
        Unicorn Ilse = new Unicorn(4, "gul", "Likgiltig", false, false);

        System.out.println("This is Bengt");
        System.out.println(Bengt.getAge());   // Måste vara i main
        Bengt.setAge(6);
        System.out.println(Bengt.getAge());


        System.out.println("Is this a unicorn?");
        //System.out.println(Ilse);// Printar dessa två objekters referenser

        if (Ilse.horn == false) {
            System.out.println("Ilse is a unicorn");
        }
        else {
            System.out.println("Ilse is an imposter! She's just a horse with a dream");
        }
    }
    
}
