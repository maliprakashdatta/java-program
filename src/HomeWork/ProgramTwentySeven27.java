//Write a program that generates a random number and asks the user to guess what the number is.
// If the user's guess is higher than the random number, the program should display "Too high, try again."
//If the user's guess is lower than the random number, the program should display "Too low, try again."
//The program should use a loop that repeats until the user correctly guesses the random number.
package HomeWork;
import java.util.Random;
import java.util.Scanner;
public class ProgramTwentySeven27
{
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int guess;

        System.out.println("Welcome to the Guess the Number game!");

        // Loop until the user guesses the correct number
        Scanner scanner=new Scanner(System.in);
       // Scanner scanner;
        do {
            System.out.print("Guess the number (between 1 and 100): ");
            guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            }
        } while (guess != randomNumber);

        scanner.close();

    }
}
