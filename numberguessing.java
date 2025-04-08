import java.util.Scanner;
import java.util.Random; // Or use Math.random()

public class NumberGuessingGame {

    public static void main(String[] args) {

        // 1. Setup
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        // Generate a random number between lowerBound and upperBound (inclusive)
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound; 
        int numberOfTries = 0;
        int userGuess = 0; // Initialize userGuess
        boolean guessedCorrectly = false;

        // 2. Welcome Message
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("Try to guess it!");

        // 3. Game Loop
        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");

            // Basic input validation
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                numberOfTries++; // Increment tries only on valid input

                // 4. Check the Guess
                if (userGuess < lowerBound || userGuess > upperBound) {
                    System.out.println("Please guess a number within the range (" + lowerBound + " - " + upperBound + ").");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    guessedCorrectly = true; // Exit the loop
                    System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly!");
                    System.out.println("It took you " + numberOfTries + " tries.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input to prevent infinite loop
            }
        }

        // 5. Cleanup
        scanner.close(); // Close the scanner when done
        System.out.println("Thanks for playing!");
    }
}
