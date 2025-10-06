import java.util.Scanner;

public class LearningMethodsOvning {
    public static void main(String[] args) {

        Introduction();
        getName();
        getAge();
        QuestionIndoorVsOutdoor();
        

    }
    static void Introduction() {
        System.out.println("Hello! I want to show you how to use methods!");
        
    }
    static void getName() {
        Scanner sc = new Scanner (System.in);
        String name;
        System.out.println("First off, what is your name?");
        name = sc.nextLine();
         System.out.println("Nice to meet you " + name + "!");
         
    }
    static void getAge() {
        Scanner sc = new Scanner (System.in);
        int age;
        System.out.println("What is your age?");
        age = sc.nextInt();
        System.out.println("That means you were born in " + (2025 - age) + "!");
        
    }
    static void QuestionIndoorVsOutdoor() {
        Scanner sc = new Scanner(System.in);
         boolean indoorPerson = false;
        boolean outdoorPerson = false;
        System.out.println("Are you an inddor or outdoor person?");
        String answer = sc.nextLine();
        if(answer.matches("outdoor") || answer.matches("Indoor")) {
            indoorPerson = true;
        }
        else if (answer.matches("outdoor")|| answer.matches("Outdoor")) {
            outdoorPerson = true;
        }
        else {
            System.out.println("That was an unexpected answer! O.o");
        }
        if (indoorPerson == true) {
            System.out.println("Awesome! What is it that you do indoors?");
        }
        else if (outdoorPerson == true) {
            System.out.println("Wow cool! Thats unusual nowadays. What is it you like about the great outdoors?");

        }
        else {
            System.out.println("Lets start over!");
        }
        sc.close();
        

    }
    

}