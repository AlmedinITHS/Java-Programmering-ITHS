package Unicorn_program.Methods;
import java.util.Scanner;// Behövs för att ta emot input med scanner

public class distanceConverter {
    public static void main(String[] args) {
        milesToKilometers(3.68);
        milesToKilometers(4.7);
        milesToKilometers(6.75);
        milesToKilometers2();

        System.out.println("Please input your age:");
        Scanner scan = new Scanner(System.in); //Vi skapar ett nytt objekt från scannerklassen, döper den till scan
        byte age = scan.nextByte();

        System.out.println("Please input your name: ");
        String name = scan.next();

        System.out.println("Please input your initials, if any; ");
        char nameInitials = scan.ne();

        scan.close();

        Scanner scan2 = new Scanner(System.in);
        double distance = scan2.nextDouble();
        System.out.println(distance);
    }
    static void milesToKilometers2() {
        double miles = 100;
        double kilometers = miles * 1.60934;
        System.out.println(kilometers);
    }
    static void milesToKilometers(double miles){
        
        double kilometers = miles * 1.60934;

        System.out.println(kilometers);
    }
    static void kilometersToMiles(double kilometers) {
        double miles = kilometers / 1.60934;
        System.out.println(miles);
    }
    
}
