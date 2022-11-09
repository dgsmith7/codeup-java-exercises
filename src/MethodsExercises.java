import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.random;


public class MethodsExercises {

    public static void main(String[] args) {
//        System.out.println("\nAddition: ");
//        System.out.println(addition(5, 5));
//        System.out.println("\nSubtraction: ");
//        System.out.println(subtraction(5, 4));
//        System.out.println("\nMultiplication: ");
//        System.out.println(multiplication(2, 7));
//        System.out.println("\nDivision: ");
//        System.out.println(division(10, 2));
//        System.out.println("\nDivision by zero: ");
//        System.out.println(division(10, 0));
//        System.out.println("\nModulus: ");
//        System.out.println(modulus(10, 5));
//        int userInput = getInteger(1, 10);
//        factorial();
        rollDice();
    }

    public static float addition(float v1, float v2) {
        return v1 + v2;
    }

    public static float subtraction(float v1, float v2) {
        return v1 - v2;
    }

    public static float multiplication(float v1, float v2) {
        // with operator
//        return v1 * v2;

        // with a loop instead of operator
//        float sum = 0;
//        for (int i = 0 ; i < v2; i ++) {
//            sum += v1;
//        }
//        return sum;

        // recursively
        if (v2 == 0 || v1 == 0) {
            return 0;
        } else if (v2 > 1) {
            v1 += multiplication(v1, v2 - 1);
        }
        return v1;
    }

    public static float division(float v1, float v2) {
        if (v2 == 0) {
            System.out.print("Undefined / ");
        }
        return v1 / v2;
    }

    public static float modulus(float v1, float v2) {
        return v1 % v2;
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

    public static void factorial() {
        System.out.println("Factorial: ");
        Scanner in = new Scanner(System.in);
        int f = getInteger(1, 25);
//        System.out.println(f + "! = " + loopFactorial(f));
        System.out.println(f + "! = " + recursiveFactorial(f));
        System.out.print("Do you wish to continue (y/n)? ");
        String s = in.nextLine();
        if (s.startsWith("y")) {
            factorial();
        }
    }

    public static long loopFactorial(int f) {
        long sum = 1;
        for (int i = 1; i < f+1; i ++) {
            sum *= i;
        }
        return sum;
    }
    public static int recursiveFactorial(int v) {
        if (v == 1) {
            return 1;
        } else {
            return v * recursiveFactorial(v - 1);
        }
    }

    public static void rollDice() {
        int d1;
        int d2;
        Scanner in = new Scanner(System.in);
        System.out.print("How many sides on one of these dice? ");
        int sides = in.nextInt();
        System.out.print("Press enter to roll the dice? ");
        in.nextLine();
        in.nextLine();
        d1 = (int)(Math.random() * sides + 1);
        d2 = (int)(Math.random() * sides + 1);
        System.out.println("You rolled a " + d1 + " and a " + d2 + ", for a total of " + (d1 + d2 ) + ".");
        System.out.print("Do you wish to roll again (y/n)? ");
        String s = in.nextLine();
        if (s.startsWith("y")) {
            rollDice();
        }
    }
}
