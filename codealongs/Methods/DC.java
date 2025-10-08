package codealongs.Methods;
import java.util.Scanner;

public class DC {
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
        System.out.println("Welcome to my DistanceCoverter!");
        System.out.println("Chose 1 to convert to kilometers and 2 to convert to miles.");
    }

    static void Choice() {

        try {
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
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
                Choice();
                
                
                
            }
            System.out.println("Do you want to convert again? Yes/No?");
            scan.nextLine();
            String StringUserInput = scan.nextLine();
            if (StringUserInput == "Yes") {
                Choice();
            } else if (StringUserInput == "No") {
                System.out.println("Thank you for converting, bye bye!");
                scan.close();
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Enter numbers only. ");  
            Choice();   
        }
    }
    

}/*
  * Jag testade att lägga en booleanvariabel i en whileloop från början av
  * metoden
  * och fick problemet att catchkodblocket blev en oändlig loop. Jag testade både
  * med
  * nästalade ifsatser och switchsatser med samma booleanvariabel-loop och blev
  * psykad.
  * I slutändan klurade jag ut att jag bara kan starta om metoden Choice efter
  * else if,
  * else och catch-satserna
  */
