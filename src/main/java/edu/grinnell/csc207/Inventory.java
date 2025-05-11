package edu.grinnell.csc207;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    List<Item> inventory = new ArrayList<>();

    public Inventory() {
        this.inventory = null;
    }

    public void add(Item i) {
        this.inventory.add(i);
    }

    public void remove(Item i) {
        this.inventory.remove(i);
    }

    public boolean hasItem(String name) {
        for (Item i : this.inventory) {
            if (i.getName().toLowerCase().equals(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAllFourGifts() {
        return (hasItem("LotusSeed")
                && hasItem("Coconut")
                && hasItem("gem")
                && hasItem("guava"));
    }

}
