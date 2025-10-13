import java.util.InputMismatchException;
import java.util.Scanner;

public class NewTest {
    public static void main(String[] args) {
        //Compile type exception
        //int myInteger = 7.8;

        //Try catch; kodblocket inom try testas; kodblocket inom catch exekveras 
        
        int [] myArray = new int[5];

        try {
            myArray[4] = 12;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Whoops!" + e.getMessage());
        }

        //Throwable-klassen är en superklass

        Scanner scan = new Scanner(System.in);

        try {
            scan.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Whoops! Wrong input type!");
        }
        finally {
            scan.close();
        }

        



    }
    


}
