package shapes;

import util.Input;

public class CircleApp {
    private static final Input input = new Input();
    private static int nCircles = 0;

    private static void makeACircle() {
        double radius = input.getDouble(1.0, 100.0, "Please enter the radius of your new circle: ");
        Circle circle = new Circle(radius);
        System.out.println();
        System.out.println("Area is : " + circle.getArea());
        System.out.println("Circumference is : " + circle.getCircumference());
        System.out.println();
        incTotal();
    }

    public static void incTotal() {
        nCircles ++;
    }

    public static void main(String[] args) {
         boolean done = false;
         while (!done) {
             System.out.println();
             makeACircle();
             System.out.println();
             done = !input.yesNo("Do you want to make another circle? ");
             System.out.println();
         }
         System.out.println("You generated " + nCircles + " circles.");
    }

}
