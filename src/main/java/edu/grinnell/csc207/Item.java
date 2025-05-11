package edu.grinnell.csc207;

/**
 * Items
 *
 * @author Tiffany Tang
 */
public class Item {

    private Room room;
    private String name;
    private boolean inBag;
    private boolean attacked;

    /**
     * Construct a new item with name and default to be not in bag.
     *
     * @param name
     * @param room
     */
    public Item(String name, Room room) {
        this.room = room;
        this.name = name;
        this.inBag = false;
        attacked = false;
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

    /**
     * True if it is a wonder tree.
     *
     * @param room
     * @return if it is a wonder tree.
     */
    public boolean isWonderTree(Room room) {
        return (this.name.equals(room.getTreeName()));
    }

    public boolean isGift(Room room) {
        return this.name.equals(room.getGift());
    }

    /**
     * Determine if an object has been attacked.
     *
     * @return true is it has been attacked. False otherwise.
     */
    public boolean hasAttacked() {
        return this.attacked;
    }
    
    public void setAttackedTrue(){
        attacked = true;
    }

    /**
     * set the room of the item to room
     *
     * @param room
     */
    public void setRoom(Room room) {
        this.room = room;
    }
}
