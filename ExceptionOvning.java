import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionOvning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Please enter your name: ");
            String name = scan.nextLine();
            

            System.out.println("Please enter your age: ");
            int age = scan.nextInt();
            

            System.out.println("Please enter your weight: ");
            double weight = scan.nextDouble();
            

            System.out.println("Name: " + name + "\n" + "Age: " + age + "\n" + "Weight: " + weight);
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong input, InputMismatchException error"+ e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Wrong input, Exception error." + e.getMessage());
        }
        finally {
            scan.close();
            System.out.println("Program ended");
        }
    }
    }
        /*Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Please enter your name: ");
            String name = scan.nextLine();
            System.out.println(name);
            
        }
        catch (Exception e) {
            System.out.println("Wrong input. Enter letters");
        }

        try {
            System.out.println("Please enter your age: ");
            int age = scan.nextInt();
            System.out.println(age);

        }
        catch (Exception e) {
            System.out.println("Wrong input. Enter numbers.");
        }
        try {
            System.out.println("Please enter your weight: ");
            double weight = scan.nextDouble();
            System.out.println(weight);
        }
        catch (Exception e){
            System.out.println("Wrong input. Enter decimals");
        }
    
        finally {
            scan.close();
            System.out.println("Program ended");
        }
    


        
    }
    
}
*/