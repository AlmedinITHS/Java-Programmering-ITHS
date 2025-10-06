import java.util.Scanner;

package codealongs.Methods;

public class DC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to my DistanceCoverter! Do you want to convert your values to kilometers or miles?");
        String userInput = scan.nextLine();
        if (userInput == "Kilometers") {
            try {
                System.out.println("Nice! Input the value to get it in kilometers");
            }
            catch (Exception e){
                System.out.println("Wrong input. Try again plaese.");

            }
        }
        
    }
    
}
