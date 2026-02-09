/**
 * This program generates a random number between 1 and 100
 * and asks the user to guess it. The program gives feedback
 * if the guess is too high or too low until the user guesses correctly.
 */

import java.util.Scanner;

public class GuessNumber
{
    public static void main(String[] args)
    {
        // Constant used to scale the random number range
        final int RANDOM_MULTIPLIER = 100;

        // Generate a random number between 1 and 100
        int number = (int) (Math.random() * RANDOM_MULTIPLIER) + 1;

        // Create a Scanner object to read user input
        Scanner keyboardInput = new Scanner(System.in);

        //  the user will  start guessing
        System.out.println("Guess a magic number between 0 and 100");

        //  guess to a value that cannot equal the random number
        int guess = -1;

        // Loop continues until the user guesses the correct number
        while (guess != number)
        {
            // Ask the user for a guess
            System.out.print("\nEnter your guess: ");
            guess = keyboardInput.nextInt();

            // Check if the guess is correct
            if (guess == number)
            {
                System.out.println("Yes, the number is " + number);
            }
            // If the guess is too high
            else if (guess > number)
            {
                System.out.println("Your guess is too high");
            }
            // If the guess is too low
            else
            {
                System.out.println("Your guess is too low");
            }
        }

    } // end of main
} // end of class