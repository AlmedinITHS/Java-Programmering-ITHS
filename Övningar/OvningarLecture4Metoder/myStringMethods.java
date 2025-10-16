package OvningarLecture4Metoder;

import java.util.Scanner;

public class myStringMethods {
    
    //Jag gör bara metoderna för bakvänd string och tecken-räknare,
    //Resten är för svårt eller för långt.
    
    public static String stringReverser(String string) {
        String reverseString = "";

        for (int i = string.length()-1; i >= 0; i--) {
            reverseString += string.charAt(i);
        }
        return reverseString;

    }
    public static int charCounter(String string, char pattern) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == pattern) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert a string: ");
        String revInput = scan.nextLine();
        System.out.println("Reversed string: " + stringReverser(revInput));

        System.out.print("Insert a string: ");
        String counterInput = scan.nextLine();
        System.out.println("Insert a pattern character: ");
        char patternInput = scan.nextLine().charAt(0);
        System.out.println("The count of the character " + patternInput + " is " + charCounter(counterInput, patternInput));


        scan.close();
    }
}
