package edu.grinnell.csc207;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yutong
 */
public class Inventory {

    List<Item> inventory;

    /**
     * constructor of inventory
     */
    public Inventory() {
        this.inventory = new ArrayList<>();
    }

    /**
     * add item i to inventory
     * @param i 
     */
    public void add(Item i) {
        this.inventory.add(i);
    }

    /**
     * remove item i from inventory
     * @param i 
     */
    public void remove(Item i) {
        this.inventory.remove(i);
    }

    /**
     * check if the inventory has that item 
     * @param name
     * @return true if it has
     */
    public boolean hasItem(String name) {
        if (this.inventory == null) {
            return false;
        }
        for (Item i : this.inventory) {
            if (i.getName().toLowerCase().equals(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    /**
     * check if the player get all gifts
     * @return true if they get all four
     */
    public boolean hasAllFourGifts() {
        return (hasItem("lotusroot")
                && hasItem("coconut")
                && hasItem("gem")
                && hasItem("guava"));
    }

}
