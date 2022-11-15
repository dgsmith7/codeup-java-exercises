package GroceryListApp;

import java.util.HashMap;

public class ListItem {
    HashMap<String, String> item = new HashMap<>(); // name:category
    int quantity;

    public ListItem(String name, String cat, int quant) {
        this.item.put(name, cat);
        this.quantity = quant;
    }

    public HashMap<String, String> getItem() {
        return this.item;
    }

    public String getName() {
        return this.item.keySet().toString();
    }

    public String getCategory() {
        return this.item.get(this.item.keySet().toString());
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void changeName(String newName) {
        this.item.replace(newName, this.getCategory());
    }

    public void changeCategory(String newCat) {
        this.item.replace(this.getName(), newCat);
    }

    public void changeQuantity(int newQuant) {
        this.quantity = newQuant;
    }
}
