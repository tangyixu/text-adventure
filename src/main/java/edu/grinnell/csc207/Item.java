package edu.grinnell.csc207;

/**
 * Items
 *
 * @author Tiffany Tang
 */
class Item {

    private String name;
    private boolean inBag;

    /**
     * Construct a new item with name and default to be not in bag.
     *
     * @param name
     * @param inBag
     */
    public Item(String name, boolean inBag) {
        this.name = name;
        this.inBag = false;

    }

    /**
     * Put the item in the bag.
     */
    public void putInBag() {
        this.inBag = true;
    }

    /**
     * Return the name of the item.
     *
     * @return the name of the item as a string.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Determine if the item is collected in bag.
     *
     * @return true if it is in the inventory, false otherwise.
     */
    public boolean inBag() {
        return this.inBag;
    }
}
