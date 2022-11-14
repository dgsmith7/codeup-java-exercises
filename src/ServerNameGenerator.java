public class ServerNameGenerator {
    public static String[] adjs = {"fast", "slow", "red", "green", "blue", "excited", "calm", "sunny", "dark", "stealthy"};
    public static String[] nouns = {"eagle", "hawk", "dolphin", "nerd", "brain", "puppy", "kitten", "brisket", "fur", "glasses"};

    public static String getRandomElement (String[] words) {
        return (words[(int)(Math.random() * words.length)]);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Here is your server name:");
        System.out.print(getRandomElement(adjs) + "-" + getRandomElement(nouns));
        System.out.println();
    }
}
