package OvningarLecture4Metoder;

import java.util.Scanner;

public class MathMethods {

    //Faktoriell beräkning, ex: 4 ger 1x2x3x4 = 24

    public static int calculateFactorial(int number) {
        int factorial = 1;

        if (number < 0) {
            System.out.println("Error: factorial is undefined for negative integers.");
            return 0;
        }

        if (number == 0) {
            factorial = 1;
            return factorial;
        }
        for (int i = 1; i <= number; i ++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int calculateFibonacci(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Position must be a positive integer.");
        }

        if (number == 1 || number == 2) {
            return number - 1;
        }

        int previous = 0;
        int current = 1;
        int fibonacci = 0;

        for (int i = 3; i <= number; i++) {
            fibonacci = previous + current;
            previous = current;
            current = fibonacci;
        }
        return fibonacci;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Factorial: Enter a positive integer: ");
        int factInput = scan.nextInt();
        int factResult = calculateFactorial(factInput);
        System.out.println("The factorial of " + factInput + " is: " + factResult);

        System.out.println("Fibonacci: Enter a positive integer: ");
        int fiboInput = scan.nextInt();
        int fiboResult = calculateFibonacci(fiboInput);
        System.out.println("The fibonacci number at position " + fiboInput + " is " + fiboResult);

        

        scan.close();
    }
}

    

