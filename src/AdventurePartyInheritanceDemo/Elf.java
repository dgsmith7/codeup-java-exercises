package AdventurePartyInheritanceDemo;

public class Elf extends Player {
    Elf() {
        super();  // calls super class constructor
        this.kind = "Warrior"; // overrides the property assignment in super class
        this.weapon = "Bow of Infinity";
    }

    Elf(String _name) {
        super(_name, "Elf");
        this.magicPower = 10;  // overrides the property assignment because Mage's have more magi power
        this.weapon = "Bow of Infinity";
    }

    // overriding attack method from Player class
    public void attack() { // elves attack with magic weapons with  magic power and attack power
        System.out.println("Attacking with " + this.weapon + " with " + (this.magicPower + this.attackPower));
    }

    public void getName() { // elves must say where they are from when they utter their name so we override getName here.
        System.out.println(this.name + " the " + this.kind + " of the Elven Woods of Armadon.");
    }
}
