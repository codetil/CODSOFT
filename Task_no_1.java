import java.util.Random;
import java.util.*;
// Task no 1 :- Number game...
public class Task_no_1 {            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        boolean playAgain = true;

        while (playAgain) {
            // Generate a random number between 1 and 100
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;
            System.out.println("Hey,\nWelcome to the number game...\nYou have about " + maxAttempts +" attempts to win the game.");
            System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! \nYou guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    // To give points to user if it guesses no correctly. 
                    totalScore += maxAttempts - attempts + 1;
                } else if (guess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                if (attempts == maxAttempts && !guessedCorrectly) {
                    System.out.println("Sorry, you've run out of attempts. The number was " + targetNumber + ".");
                }
            }

            System.out.println("Your current score: " + totalScore);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing.\nYour final score: " + totalScore);
        sc.close();
    }
}