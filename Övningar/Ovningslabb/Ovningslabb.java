package Ovningslabb;

import java.util.Scanner;
import java.util.Random;

public class Ovningslabb {
    public static void main(String[] args) {
        System.out.println("Program started, welcome to RollADice");
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int dice = rollDice(rand);
        int maxTries = 5;

        playGame(scanner, dice, maxTries);

        System.out.println("Game end");
        scanner.close();

    }

    public static int rollDice(Random rand) {
        int result = rand.nextInt(1, 7);
        System.out.println("The computer rolled a " + result);
        return result;
    }

    public static void playGame(Scanner scanner, int dice, int maxTries) {
        int userTries = 0;
        System.out.println("Guess a number!");

        while (userTries <= maxTries) {
            String userInput = scanner.nextLine();

            if (isValidInteger(userInput)) {
                int userGuess = Integer.parseInt(userInput);

                if (isInRange(userGuess)) {
                    System.out.println("Valid input: " + userGuess);

                    if (checkGuess(userGuess, dice)) {
                        break;
                    } else {
                        userTries++;
                        System.out.println("Guess again: ");
                    }
                } else {
                    System.out.println("Enter an integer between 1-6");
                    userTries++;
                }

            } else {
                System.out.println("Enter an integer between 1-6");
                userTries++;
            }
        }
    }

    public static boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);// Omvandlar och kontrollerar ifall det är en integers som är inmatad
            return true;
        } catch (Exception errorMessage) {
            return false;
        }
    }

    public static boolean isInRange(int number) {
        return number >= 1 && number <= 6;
    }

    public static boolean checkGuess(int guess, int dice) {
        if (guess > dice) {
            System.out.println("You won with this number: " + guess + " dice roll: " + dice);
            return true;
        } else if (guess == dice) {
            System.out.println("Draw, your number: " + guess + " dice: " + dice);
            return false;
        } else {
            System.out.println("You lost with number: " + guess + " vs: " + dice);
            return true;
        }
    }

}
