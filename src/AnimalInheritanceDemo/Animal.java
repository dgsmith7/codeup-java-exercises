package AnimalInheritanceDemo;

public class Animal {
    private int numberOfLegs;
    private String prefferedClimate;

    public Animal() {
        this.numberOfLegs = 4;
        this.prefferedClimate = "moderate";
    }

    public String getAnimalInfo() {
        return "Number of legs: " + getNumberOfLegs() + "\nPreferred climate: " + getPrefferedClimate();
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int n) {
        this.numberOfLegs = n;
    }

    public String getPrefferedClimate() {
        return this.prefferedClimate;
    }

    public void setPrefferedClimate(String climate) {
        this.prefferedClimate = climate;
    }
}
