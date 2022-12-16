import java.util.Scanner;

public class TryStuff {
    public static void main(String[] args) {
//        int[] highScores = {5,5,5,5,5,5,5};
//        int i = 0;
//        for (int value : highScores)
//        {
//            System.out.println( highScores[i] );
//            System.out.println( value );
//            i ++;
//        }
//        guessAge();
//        tryit();
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

    public static void tryit() {
        int[][] primes = new int[3][3];
        primes[2][2] = 1;

        System.out.println(primes[1][2]);
    }
}
