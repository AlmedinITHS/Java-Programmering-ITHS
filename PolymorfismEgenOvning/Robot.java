package PolymorfismEgenOvning;

public class Robot implements Talking {

    public void talk(String message) {
        System.out.println("Message received. Generating voice output...");
        if (message.length() < 25) {
            System.out.println(message);
        } else {
            System.out.println("Error. Message too long for voice model!");
        }
    }

    public static void main(String[] args) {
        Robot rob1 = new Robot();
        Parrot Tommy = new Parrot(4, 2.4, 2.0, "Tommy");

        rob1.talk("Hej");
        rob1.talk(" Tjena mitt namn är Almedin och jag gillar att bada");

        Tommy.fly(4);

    }
}
