package edu.grinnell.csc207;

import java.util.List;

/**
 * A Room class that implements basic responses of four kindoms.
 *
 * @author Tiffany Tang and Annie Li
 */
public class Room {

    private List<Item> items;
    private String name;
    private Item wonderTree;

    /**
     * Construct a room with a list of items that could be found.
     *
     * @param name
     * @param lst
     */
    public Room(String name, List<Item> lst, Item tree) {
        this.name = name;
        this.items = lst;
        this.wonderTree = tree;
    }

    //Wait////wait in the room for one turn
    //Go<direction> // go in the given cardinal direction, e.g., north or south
    //Talk to<object> // talk to the given object found in the room
    //Pick up<item> // pick up the given item found in the room
    /**
     * Use the given item found in the player's inventory
     *
     * @param item
     */
    public void Use(Item item) {
        //To-do: Implement me!
    }

    public void Attack(Item item) {

    }// attack the given object found in the room

    public void Look at(Item item) {

    }// look at the given object found in the room

    public String getTreeName() {
        return this.wonderTree.getName();
    }
}
