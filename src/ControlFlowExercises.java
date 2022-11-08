import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println();
//
//        int i = 100;
//        do {
//              System.out.println(i);
//              i -= 5;
//        } while (i >= -10);

//       long j = 2;
//        do {
//            System.out.println(j);
//            j *= j;
//        } while (j <= 100000);

//        for (int i = 5; i <= 15; i ++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

//        for (int i = 100; i >= -10; i -= 5) {
//            if (i % 5 == 0) {
//                System.out.println(i);
//            }
//        }

//        for(long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

//        for (int i = 0; i < 100; i ++) {
//            System.out.print(i);
//            if (i % 3 == 0 && i% 5 == 0) {
//                System.out.println(" FizzBuzz");
//            } else
//            if (i % 3 == 0 ) {
//                System.out.println(" Fizz");
//            } else
//            if (i % 5 == 0) {
//                System.out.println(" Buzz");
//            } else {
//                System.out.println();
//            }
//        }

        Scanner in = new Scanner(System.in);
//        System.out.print("What number would you like to go up to? ");
//        int lim = in.nextInt();
//        System.out.println("");
//        System.out.println("Here is your table!");
//        System.out.println("");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 0; i <= lim; i ++) {
//            System.out.printf("%-6d | %-7d | %-5d%n", i, i*i, i*i*i);
//        }

        System.out.print("What is the numerical grade? ");
        int lim = in.nextInt();
        if (lim <= 59) {
            System.out.println("F");
        } else if (lim <= 62) {
            System.out.println("D-");
        } else if (lim <= 64) {
            System.out.println("D-");
        } else if (lim <= 66) {
            System.out.println("D+");
        } else if (lim <= 73) {
            System.out.println("C-");
        } else if (lim <= 76) {
            System.out.println("C");
        } else if (lim <= 79) {
            System.out.println("C+");
        } else if (lim <= 82) {
            System.out.println("B-");
        } else if (lim <= 85) {
            System.out.println("B");
        } else if (lim <= 87) {
            System.out.println("B+");
        } else if (lim <= 93) {
            System.out.println("A-");
        }else if (lim <= 97) {
            System.out.println("A");
        }else if (lim <= 100) {
            System.out.println("A+");
        }
    }
}
