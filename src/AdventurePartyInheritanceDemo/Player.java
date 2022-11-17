package AdventurePartyInheritanceDemo;

public class Player {  // this is the super class
    protected String name;
    protected String kind;
    protected String weapon;
    protected int attackPower;
    protected int shieldPower;
    protected int magicPower;

    Player() {
        this.name = "John Doe";
        this.kind = "player of unknown kind.";
        this.weapon = "weapon of unknown kind";
        this.attackPower = 10;
        this.shieldPower = 3;
        this.magicPower = 3;
    }

    Player(String _name, String _kind) {
        this.name = _name;
        this.kind = _kind;
        this.attackPower = 10;
        this.magicPower = 3;
    }

    public void attack() {
        System.out.println("Attacking with " + this.weapon + " with " + this.attackPower);
    }

    public void getName() {
        System.out.println(this.name + " the " + this.kind);
    }
}
