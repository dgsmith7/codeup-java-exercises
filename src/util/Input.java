package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String specialMessage) {
        System.out.println(specialMessage + "\n");
        String s = scanner.nextLine();
        return s;
    }

    public boolean yesNo() {
        scanner.nextLine();
        String s = scanner.nextLine();
        return (s.toUpperCase().startsWith("Y"));
    }

    public boolean yesNo(String specialMessage) {
        System.out.println(specialMessage);
        String s = scanner.nextLine();
        return (s.toUpperCase().startsWith("Y"));
    }

    public int getInt(int min, int max) {
        System.out.print("Please enter a whole number between " + min + " and " + max + ": ");
        int newInput = getInt();
        if (newInput < min || newInput > max) {
            newInput = getInt(min, max);
        }
        return newInput;
    }

    public int getInt(int min, int max, String specialMessage) {
        System.out.println(specialMessage);
        int newInput = getInt();
        if (newInput < min || newInput > max) {
            newInput = getInt(min, max);
        }
        return newInput;
    }

    private int getInt() {
        int newInput;
        newInput = this.scanner.nextInt();
        scanner.nextLine();
        return newInput;
    }

    public double getDouble(double min, double max) {
        System.out.print("Please enter a decimal between " + min + " and " + max + ": ");
        double newInput = getDouble();
        if (newInput < min || newInput > max) {
            newInput = getDouble(min, max);
        }
        System.out.println();
        return newInput;
    }

    public double getDouble(double min, double max, String specialMessage) {
        System.out.println(specialMessage);
        double newInput = getDouble();
        if (newInput < min || newInput > max) {
            newInput = getDouble(min, max);
        }
        return newInput;
    }

    private double getDouble() {
        double newInput;
        newInput = this.scanner.nextDouble();
        scanner.nextLine();
        return newInput;
    }


}
