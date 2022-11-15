package GroceryListApp;

import util.Input;

import java.util.ArrayList;

public class List {
    private static Input input = new Input();
    private static ArrayList<ListItem> list = new ArrayList<>();

    public static void main(String[] args) {
        if (!input.yesNo("Do you want to make a list?")) {
            System.out.println("Goodbye.  See you next time.");
            System.exit(0);  //  NO
        } else {
            boolean done = false;
            String newName;
            String newCat;
            int newQuant;
            while (!done) { // YES
                newName = input.getString("Please enter the item's name: ");
                int which = input.getInt(1, 5, "Please choose a category:\n1-Dairy  2-Bakery  3-Butcher  4-Produce  5-Other");
                switch (which) {
                    case 1: newCat = "Dairy"; break;
                    case 2: newCat = "Bakery"; break;
                    case 3: newCat = "Butcher"; break;
                    case 4: newCat = "Produce"; break;
                    default: newCat = "Other"; break;
                }
                newQuant = input.getInt(1, 100, "Please enter the quantity:");
                addListItem(newName, newCat, newQuant);
                System.out.println("Item added " + newName + ", " + newCat + ", " + newQuant + "\n");
                done = input.yesNo("Do you want to enter a new item?");
             }
            sortList();
            System.out.println("Here is your list...");
            displayList();
        /*
        --do you wanna make a list
            y - do you wanna enter new item
                y - show cats
                    choose cat
                    enter name
                    enter quant
                n - exit
            n - exit
        sort list by name then cat
        show list
        while not done
        show other menu
            1 edit item
            2 show all
            3 show filter by cat - show only
            4 exit
        get selection
        switch sel
        */
        }
    }

    public static void addListItem(String name, String cat, int quant) {
        list.add(new ListItem(name, cat, quant));
    }

    public static void displayList() {
        String item;
        System.out.println("list item" + "name" + "category" + "quantity");
        for (int i = 0 ; i < list.size(); i ++) {
//            item = i + " - " + list.get(i).
        }
    }

    public static void sortList() {  // by category and name w/ quant

    }

}

