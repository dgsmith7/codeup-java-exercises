package AdventurePartyInheritanceDemo;

public class Main {
    public static Player[] players = new Player[4];

    public static void main(String[] args) {
        System.out.println();
        players[0] = new Player();  // calls default contructor
        players[1] = new Warrior("Laura the Lioness");  // calls default contructor
        players[2] = new Mage("Kenneth the Wise");  // calls default contructor
        players[3] = new Elf("Lola the Enchanted");  // calls default contructor
        for (int i = 0; i < players.length; i++) {
            // polymorphism - notice players has an element from super class and elements from each different subclass
            players[i].getName();
            players[i].attack();
            System.out.println();
        }
    }
}

