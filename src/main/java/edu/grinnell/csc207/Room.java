package edu.grinnell.csc207;

import java.util.List;

/**
 * A Room class that implements basic responses of four kindoms.
 *
 * @author Tiffany Tang and Annie Li
 */
public class Room {

    private List<Item> items;
    private List<String> objects;
    private Map<String, Room> connectedrooms;
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

    /**
     * wait in the room for one turn
     */
    public void Wait() {
        System.out.println("Time passes");
    }

    /**
     * go in the given cardinal direction
     *
     * @param Direction a string that contains the direction that the player
     * wants to go
     */
    public void Go(String Direction) {
        Room next = connectedrooms.get(Direction);
        if (next == null) {
            System.out.println("The wind whispers that the path to the " + Direction + " does not yet exist...");
        } else {
            items = next.items;
            connectedrooms = next.connectedrooms;
            name = next.name;
            wonderTree = next.wonderTree;
            System.out.println("A gust of wind lifts you gently and places you at the edge of the " + name + ".");
        }

    }

    /**
     * talk to the given object found in the room
     *
     * @param object a String of the object that the player is trying talking to
     */
    public void TalkTo(String object) {
        if (objects.contains(object.toLowerCase())) {
            System.out.println("You try talking to the " + object + ", but it says nothing.");
        } else {
            System.out.println("You didn't see " + object);
        }

    }

    /**
     * pick up the given item found in the room
     * @param item a string is the item that we want to pick up
     */
    public void PickUp(String item) {
        if (items.contains(item.toLowerCase())) {
            items.remove(item.toLowerCase());
            //inventory.add(item.toLowerCase()); 
            System.out.println("You picked up the " + item + ".");
        } else {
            System.out.println("You didn't see the " + item + ".");
        }
    }

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

    public void Lookat(Item item) {

    }// look at the given object found in the room

    public String getTreeName() {
        return this.wonderTree.getName();
    }
}
