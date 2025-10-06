import java.util.Scanner;



public class DC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to my DistanceCoverter!Chose 1 for kilometers and 2 for miles.");
        int userInput = scan.nextInt();
        if (userInput == 1) {
            try {
                System.out.println("Nice! Input the value to get it in kilometers: ");
            }
            catch (Exception e){
                System.out.println("Wrong input. Try again, write 'Kilometers' or 'miles'. ");
            }
            System.out.println("Enter distance in miles: ");
            double miles = scan.nextDouble();
            
        }
        else if (userInput == "Miles") {
            try {
                System.out.println("Ok mr. imperialist, write your value in miles: ");
            }
            catch (Exception e){
                System.out.println("Wrong input. Try again, write 'Kilometers' or 'miles'");
            }
        }
        
    }
    static double milesToKilometers() {
        Scanner scan = new Scanner(System.in);
        double miles = scan.nextInt();
        double kilometers = miles * 1.609344;
        return kilometers;
    }
    
}
