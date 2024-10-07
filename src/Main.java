import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 10
        int randomNumber = random.nextInt(10) + 1; // Generates 1 to 10
        int userGuess = 0;

        // Get the user's guess
        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                if (userGuess < 1 || userGuess > 10) {
                    System.out.println("Invalid input. Please guess a number between 1 and 10.");
                }
            } else {
                System.out.println("Invalid input. Please enter an number.");
                scanner.next();
            }
        } while (userGuess < 1 || userGuess > 10);

        // Display the random number and check the guess
        System.out.println("The random number is: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("Congratulations! Your guess is on the money!");
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess is low.");
        } else {
            System.out.println("Your guess is high.");
        }

    }
}
