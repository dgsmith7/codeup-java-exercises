import java.util.Scanner;

public class TryStuff {
    public static void main(String[] args) {
        //guessAge();
    }


    public static void guessAge() {
        Scanner in = new Scanner (System.in);
        int guess = 0;
        int age = 52;
        System.out.print("Try to guess my age by entering a number. ");
        while (age != guess) {
            guess = in.nextInt();
            if (guess < age) {
                System.out.println("higher!");
            }
            if (guess > age) {
                System.out.println("lower!");
            }
        }
        System.out.println("You got it.");
    }
}
