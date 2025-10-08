package codealongs.Methods;
import java.util.Scanner;

public class DC2 {
    public static void main(String[] args) {
        Introduction();
        Choice();

    }

    static double milesToKilometers() {
        Scanner scan = new Scanner(System.in);
        double miles = scan.nextInt();
        double kilometers = miles * 1.609344;
        scan.close();
        // Raderade System.out.println(kilometers);
        return kilometers;
    }

    static double KilometersToMiles() {
        Scanner scan = new Scanner(System.in);
        double kilometers = scan.nextInt();
        double miles = kilometers / 1.609344;
        scan.close();
        // Raderade System.out.println(miles);
        return miles;

    }

    static void Introduction() {
        System.out.println("Welcome to the DistanceCoverter!");
        System.out.println("Chose 1 to convert to kilometers and 2 to convert to miles.");
    }

    static void Choice() {
        boolean isRunning = true;

        while (isRunning) {

         {
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();

            

            if (userInput == 1) {
                System.out.println("Input the value to get it in kilometers: ");
                double miles = milesToKilometers();
                System.out.println(miles);
            } else if (userInput == 2) {
                System.out.println("Input the value to get it in miles");
                double kilometers = KilometersToMiles();
                System.out.println(kilometers);
                
            }
            else {
                System.out.println("Invalid input.");
            } 
            
            System.out.println("Do you want to convert another distance? Yes/No?");
            scan.nextLine();
            String answer =scan.nextLine();
            if (answer == "Yes") {
                Choice();
            }
            else if (answer =="No") {
                System.out.println("Thank you for converting. Bye!");
            }
            
        }
        
    }
        
}
}
