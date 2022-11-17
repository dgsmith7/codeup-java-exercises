package AdventurePartyInheritanceDemo;

public class Warrior extends Player {  // a subclass
    Warrior() {
        super();  // calls super class constructor
        this.kind = "Warrior"; // overrides the property assignment in super class
        this.weapon = "Battle Axe";
    }

    Warrior(String _name) {  // notice it can have a different constructor than superclass as shown here
        super(_name, "Warrior");
        this.weapon = "Battle Axe";
    }

    // inherits all functionality from super class Player and doesn't override any of it
    // we know this because you dont see any methods down here
}
