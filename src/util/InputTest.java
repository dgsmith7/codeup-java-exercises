package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println();
        System.out.println("Can you ride a bike? ");
        System.out.println("Answered in the affirmative = " + input.yesNo());
        System.out.println("Answered in the affirmative = " + input.yesNo("How about a unicycle?"));

        System.out.println();
        int intMin = 7;
        int intMax = 53;
        System.out.println("You entered a " + input.getInt(intMin, intMax));
        System.out.println("You entered a " + input.getInt(intMin, intMax, "I also need another one - thanks."));

        System.out.println();
        double doubleMin = 3.1415;
        double doubleMax = 6.2830;
        System.out.println("You entered a " + input.getDouble(doubleMin, doubleMax));
        System.out.println("You entered a " + input.getDouble(doubleMin, doubleMax,"I also need another one - thanks."));
    }
}
