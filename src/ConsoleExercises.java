import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class ConsoleExercises {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

//        System.out.print("Enter an integer, please: ");
//        int myInteger = in.nextInt();
//        System.out.println("You entered a " + myInteger);

//        System.out.print("Enter an three words seperated by a space, please: ");
//        String first = in.next();
//        String second = in.next();
//        String third = in.next();
//        System.out.println("You entered these three words:");
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);

//        System.out.print("Enter a sentence, please: ");
//        String sentence = in.nextLine();
//        System.out.println("You entered :");
//        System.out.println(sentence);

//        System.out.print("Enter the length of your room: ");
//        String len = in.nextLine();
//        System.out.print("Enter the width of your room: ");
//        String wid = in.nextLine();
        System.out.print("Enter the length and width of your room: ");

        float l = parseFloat(in.next());
        float w = parseFloat(in.next());
        float area = l * w;
        System.out.printf("The area of the room is: %.2f%n", area);
        float p = l + l + w + w;
        System.out.printf("The perimeter of the room is: %.2f%n", p);

//        String s = "Geeksforgeeks has Scanner Class Methods";
//
//        // create a new scanner
//        // with the specified String Object
//        Scanner scanner = new Scanner(s);
//
//        // print a line of the scanner
//        System.out.println("Scanner String: \n"
//                + scanner.nextLine());
//
//        // display the old delimiter
//        System.out.println("Old delimiter: "
//                + scanner.delimiter());
//
//        // change the delimiter of this scanner
//        scanner.useDelimiter("<--->");
//
//        // display the new delimiter
//        System.out.println("New delimiter: "
//                + scanner.delimiter());
//
//        // close the scanner
//        scanner.close();
    }
}
