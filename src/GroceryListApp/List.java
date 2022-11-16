package GroceryListApp;

import util.Input;

import java.util.*;

import static java.lang.Integer.parseInt;

public class List {
    private static final Input input = new Input();
    private static ArrayList<ListItem> list = new ArrayList<>();
    private static final HashMap<String, String> categories = new HashMap<>();

    public static void main(String[] args) {
        if (!input.yesNo("Do you want to make a new list?")) {
            System.out.println("Goodbye.  See you next time.");
            System.exit(0);  //  NO
        } else {
            boolean done = false;
            String newName;
            String newCat;
            int newQuant;
            while (!done) { // YES
                newName = input.getString("Please enter the item's name: ");
                newCat = getCategoryInput();
                newQuant = input.getInt(1, 100, "Please enter the quantity:");
                addListItem(newName, newCat, newQuant);
                System.out.println("Item added " + newName + ", " + newCat + ", " + newQuant + "\n");
                done = !input.yesNo("Do you want to enter a new item?");
            }
            System.out.println("Here is your list...");
            displayList();
            System.out.println();
            done = false;
            int which;
            while (!done) {
                which = input.getInt(1, 4, "Please choose from the list below:\n1-Edit item  2-Show all  3-Show by Category  4-exit");
                switch (which) {
                    case 1:
                        int i = input.getInt(0, list.size(), "Enter item number");
                        updateItem(i);
                        break;
                    case 2:
                        displayList();
                        System.out.println();
                        break;
                    case 3:
                        String c;
                        do {
                            c = input.getString("Enter a category");
                        } while (!categories.containsValue(c));
                        listByCategory(c);
                        break;
                    case 4:
                        done = true;
                        break;
                }
            }
        }
    }

    public static String getCategoryInput() {
        String newCat;
        int which = input.getInt(1, 5, "Please choose a category:\n1-Dairy  2-Bakery  3-Butcher  4-Produce  5-Other");
        switch (which) {
            case 1:
                newCat = "Dairy";
                break;
            case 2:
                newCat = "Bakery";
                break;
            case 3:
                newCat = "Butcher";
                break;
            case 4:
                newCat = "Produce";
                break;
            default:
                newCat = "Other";
                break;
        }
        return newCat;
    }


    public static void updateItem(int i) {
        System.out.printf("%5s%15s%15s%15s%n", "item#", "Name", "Category", "Quantity");
        System.out.printf("%5s%15s%15s%15s%n", "-----", "----", "--------", "--------");
        System.out.printf("%5s%15s%15s%15s%n", i, list.get(i).getName(), list.get(i).getCategory(), list.get(i).getQuantity());
        String newName;
        String newCat;
        int newQuant;
        newName = input.getString("Please enter the item's name: ");
        newCat = getCategoryInput();
        newQuant = input.getInt(1, 100, "Please enter the quantity:");
        list.get(i).setName(newName);
        list.get(i).setCategory(newCat);
        list.get(i).setQuantity(newQuant);
    }

    public static ArrayList<ListItem> sortList() {
        ArrayList<ListItem> newList = new ArrayList<>();
        String[] newArray = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i).getCategory() + "-" + list.get(i).getName() + "-" + list.get(i).getQuantity();
        }
        Arrays.sort(newArray);
        for (String s : newArray) {
            String[] splitList = s.split("-");
            newList.add(new ListItem(splitList[1], splitList[0], parseInt(splitList[2])));
        }
        return newList;
    }

    public static void addListItem(String name, String cat, int quant) {
        list.add(new ListItem(name, cat, quant));
        categories.put(name, cat);
    }

    public static void displayList() {
        list = sortList();
        System.out.printf("%5s%15s%15s%15s%n", "item#", "Name", "Category", "Quantity");
        System.out.printf("%5s%15s%15s%15s%n", "-----", "----", "--------", "--------");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%5s%15s%15s%15s%n", i, list.get(i).getName(), list.get(i).getCategory(), list.get(i).getQuantity());
        }
    }

    public static void listByCategory(String cat) {
        System.out.printf("%5s%15s%15s%15s%n", "item#", "Name", "Category", "Quantity");
        System.out.printf("%5s%15s%15s%15s%n", "-----", "----", "--------", "--------");
        for (int i = 0; i < list.size(); i++) {
            if (categories.get(list.get(i).getName()).equals(cat)) {
                System.out.printf("%5s%15s%15s%15s%n", i, list.get(i).getName(), list.get(i).getCategory(), list.get(i).getQuantity());
            }
        }
    }

    public static void makeFakeData() {  // for testing
        addListItem("Milk", "Dairy", 1);
        addListItem("Pretzels", "Bakery", 12);
        addListItem("Cheese", "Dairy", 1);
        addListItem("Cream", "Dairy", 1);
        addListItem("Bread", "Bakery", 1);
        addListItem("Pastrami", "Butcher", 1);
        addListItem("Salad", "Produce", 2);
        addListItem("Butter", "Dairy", 1);
        addListItem("Apple", "Produce", 1);
        addListItem("Mustard", "Other", 1);
    }
}

