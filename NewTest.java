
import java.util.Scanner;

public class NewTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Mata in ett nummer mellan 1 och 6: ");
        
       int nummer = scan.nextInt();

        if (nummer < 0 || nummer > 6) {
            System.out.println("Felaktig inmatning, försök igen");

        }
        else {
            System.out.println(" Bra jobbat, du matade in nummer " + nummer);

        }
        scan.close();
    }
}
    

