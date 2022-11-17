package AdventurePartyInheritanceDemo;

public class Mage extends Player {
    Mage() {
        super();  // calls super class constructor
        this.kind = "Warrior"; // overrides the property assignment in super class
        this.weapon = "Magic staff";
    }

    Mage(String _name) {
        super(_name, "Mage");  // calls super class contructor
        this.magicPower = 15;  // overrides the property assignment because Mage's have more magic power
        this.weapon = "Magic staff";
    }

    // overriding only attack method from Player class and inheriting everything else from Player class
    public void attack() { // mages attack by casting spells using magic power vs with attack power in Player class
        System.out.println("Casting a spell with " + this.weapon + " with " + this.magicPower);
    }

    // adds functionality to Player class getNAme by calling superclass method then doing more stuff
    public void getName() {
        super.getName();  // calls super class getName then adds additionally functionality with line below
        System.out.println("All energies flow through me and from me."); // only mages say this
    }
}
