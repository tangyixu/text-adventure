package edu.grinnell.csc207;

import java.util.List;
import java.util.Map;

/**
 * A Room class that implements basic responses of four kindoms.
 *
 * @author Tiffany Tang and Annie Li
 */
public class Room {

    /* The items that are available to interact with in this room.*/
    private List<Item> items;

    //private List<String> objects; items代表房间里可以互动的物品 其余摆设用第一次enter room的输出string表示

    /* The rooms that this current room is connected to, which are stored in pairs wit key as the name of the room,
    and values as the room itself.*/
    private Map<String, Room> connectedrooms;

    /* Name of the room*/
    private String name;

    /* The magical wonder tree in the room, which yields gifts after being attacked.*/
    private Item wonderTree;

    /**
     * Construct a room with a list of items that could be found.
     *
     * @param name
     * @param lst
     * @param tree
     */
    public Room(String name, List<Item> lst, Item tree) {
        this.name = name;
        this.items = lst;
        this.wonderTree = tree;
        this.connectedrooms = null;
    }

    /**
     * Determine if an item is is interactable in this room.
     *
     * @param item
     * @return
     */
    public boolean hasItem(Item item) {
        return this.items.contains(item);
    }

    /**
     * Return wonder tree's name.
     *
     * @return wonder tree's name.
     */
    public String getTreeName() {
        return this.wonderTree.getName();
    }

    /**
     * Return the name of the room.
     *
     * @return the name of the room.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Add another room to be the connectedRoom of this room.
     *
     * @param direction
     * @param room
     */
    public void addConnectedRoom(String direction, Room room) {
        this.connectedrooms.put(direction, room);
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
        if (objects.contains(object.toLowerCase())) { //objects需要被替换
            System.out.println("You try talking to the " + object + ", but it says nothing.");
        } else {
            System.out.println("You didn't see " + object);
        }

    }

    /**
     * pick up the given item found in the room
     *
     * @param item a string is the item that we want to pick up
     */
    public void PickUp(String item) {
        if (items.contains(item.toLowerCase())) { //可以调用前文我写的hasItem
            items.remove(item.toLowerCase());//可能需要修改一下调用参数
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
     * @param effect
     */
    public void Use(Item item, String effect) {
        if (item.inBag()) {
            System.out.println("You used" + item.getName() + "." + effect);
        } else {
            System.out.println("This item is not in your bag! You cannot use it.");
        }
    }

    /**
     * Attack the given object found in the room, and print out effect.
     *
     * @param item
     * @param effect
     */
    public void Attack(Item item, String effect) {
        if (hasItem(item)) { //如果item属于room里可以interact的物品
            if (item.isWonderTree(this) && !item.hasAttacked()) {
                System.out.println("You attacked" + item.getName() + "."
                        + effect);
            } else {
                System.out.println("You cannot attack" + item.getName()
                        + " if it is not a wonder tree or it has been attacked!");
            }
        } else {
            System.out.println("You cannot interact with" + item.getName());
            //不是的话就说不可以互动
        }
    }

    /**
     * look at the given object found in the room, and print out effect.
     *
     * @param item
     * @param effect
     */
    public void Lookat(Item item, String effect) {
        System.out.println("You looked at" + item.getName() + effect);
    }
}
