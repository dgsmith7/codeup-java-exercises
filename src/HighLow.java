import java.util.Scanner;
import static java.lang.Math.random;

public class HighLow {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        Scanner in = new Scanner (System.in);
        int guess = 0;
        int turns = 0;
        int secretNumber = (int)(Math.random() * 100 + 1);
        System.out.println("Try to guess the secret number between 1 and 100 (inclusive).");
        while (secretNumber != guess && turns < 10) {
            guess = getInteger(1,100);
            if (guess < secretNumber) {
                System.out.println("Higher!");
            }
            if (guess > secretNumber) {
                System.out.println("Lower!");
            }
            turns++;
        }
        if (turns >= 10) {
            System.out.println(turns + " is the limit.  ");
        } else {
            System.out.println("Good guess.  You got it.  It took you " + turns + " tries.");
        }
        System.out.print("Wanna play again (y/n)? ");
        String s = in.nextLine();
        if (s.startsWith("y")) {
            guessNumber();
        }

    }

    public static int getInteger(int min, int max) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int input = in.nextInt();
        while (input < min || input > max) {
            System.out.println("Out of range.  Try again.");
            input = getInteger(min, max);
        }
        return input;
    }


}

/*
Welcome to the world of game development!

You are going to build a high-low guessing game. Create a class named HighLow inside of src.

The specs for the game are:

Game picks a random number between 1 and 100.
Prompts user to guess the number.
All user inputs are validated.
If user's guess is less than the number, it outputs "HIGHER".
If user's guess is more than the number, it outputs "LOWER".
If a user guesses the number, the game should declare "GOOD GUESS!"
Hints

Use the random method of the java.lang.Math class to generate a random number.
Bonus

Keep track of how many guesses a user makes.
Set an upper limit on the number of guesses.

 */