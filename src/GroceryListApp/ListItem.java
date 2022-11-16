package GroceryListApp;

public class ListItem {
    private String name;
    private String category;
    private int quantity;

    public ListItem(String name, String cat, int quant) {
        this.name = name;
        this.category = cat;
        this.quantity = quant;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setName(String newName) {
        this. name = newName;
    }

    public void setCategory(String newCat) {
        this.category = newCat;
    }

    public void setQuantity(int newQuant) {
        this.quantity = newQuant;
    }
}
