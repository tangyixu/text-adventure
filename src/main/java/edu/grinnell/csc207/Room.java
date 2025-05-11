package edu.grinnell.csc207;

import java.util.List;
import java.util.Map;

/**
 * A Room class that implements basic responses of four kingdoms.
 *
 * @author Tiffany Tang and Annie Li
 */
public abstract class Room {

    private String intro;

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

    /* The gift from the tree*/
    private Item gift;

    /**
     * Construct a room with a list of items that could be found.
     *
     * @param name
     * @param lst
     * @param tree
     * @param connectedrooms
     */
    public Room(String name, List<Item> lst, Item tree, Map<String, Room> connectedrooms, Item gift) {
        this.name = name;
        this.items = lst;
        this.wonderTree = tree;
        this.connectedrooms = connectedrooms;
        this.gift = gift;
    }

    /**
     * Determine if an item is is interactable in this room.
     *
     * @param item
     * @return true if it is contained, false otherwise.
     */
    public boolean hasItem(Item item) {
        return this.items.contains(item);
    }

    /**
     * Determine if an item is is interactable in this room.
     *
     * @param str
     * @return true if it is contained, false otherwise.
     */
    public boolean hasItem(String str) {
        for (Item i : this.items) {
            if (i.getName().toLowerCase().equals(str.toLowerCase())) {
                return true;
            }
        }
        return false;
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
     * return the name of the gift
     *
     * @return
     */
    public String getGift() {
        return this.gift.getName();
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
     * Get the item from the list based on the item's name.
     *
     * @param name
     * @return
     */
    public Item getItem(String name) {
        for (Item i : this.items) {
            if (i.getName().toLowerCase().equals(name.toLowerCase())) {
                return i;
            }
        }
        return new Item(null, this);
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
     * Add an item to the list
     *
     * @param item
     */
    public void addItem(Item item) {
        this.items.add(item);
    }

    /**
     * set the wonder tree of the room
     *
     * @param tree
     */
    public void setWonderTree(Item tree) {
        this.wonderTree = tree;
    }

    /**
     * set the gift of the room
     *
     * @param gift
     */
    public void setGift(Item gift) {
        this.gift = gift;
    }

    /**
     * wait in the room for one turn
     */
    public void Wait() {
        System.out.println("Time passes.");
    }

    /**
     * go in the given cardinal direction
     *
     * @param Direction a string that contains the direction that the player
     * wants to go
     * @return the next room
     */
    public Room go(String Direction) {
        Room next = connectedrooms.get(Direction);
        if (next == null) {
            System.out.println("The wind whispers that the path to the " + Direction + " does not yet exist...");
            return this;
        } else {
            System.out.println("A gust of wind lifts you gently and places you at the edge of the " + next.getName() + ".");
            System.out.println(next.getIntro());
        }
        return next;
    }

    /**
     * talk to the given object found in the room
     *
     * @param object a item that the player is trying talking to
     */
    public void talkTo(String object) {
        //Item item = new Item(object, this);
        if (hasItem(object)) {
            Item i = this.getItem(name);
            if (i.isWonderTree(this)) {
                System.out.println("You talked to " + i.getName() + ". The" + i.getName()
                        + "says:" + "Welcome to " + this.getName() + "! Only those with courage may take my fruit.");
            } else {
                System.out.println(i.getName() + " cannot speak if it is not a wonder tree!");
            }
        } else {
            System.out.println("You didn't see " + object);
        }

    }

    /**
     * pick up the given item found in the room
     *
     * @param object a item that we want to pick up
     */
    public void pickUp(String object) {
        Item item = new Item(object, this);
        if (hasItem(item) && !item.inBag()) {
            if (item.isGift(this)) {
                items.remove(item);
                item.putInBag();
                System.out.println("You picked up the " + object + ".");
            } else {
                System.out.println(item.getName() + " is not a gift! You cannot bring it away!");
            }
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
    public void use(Item item, String effect) {
        if (item.inBag()) {
            System.out.println("You used" + item.getName() + ". " + effect);
        } else {
            System.out.println("This item is not in your bag! You cannot use it.");
        }
    }

    /**
     * Attack the given object found in the room, and print out effect.
     *
     * @param item
     */
    public void attack(Item item) {
        if (hasItem(item)) { //如果item属于room里可以interact的物品
            if (item.isWonderTree(this) && !item.hasAttacked()) {
                System.out.println("You attacked" + item.getName() + "."
                        + "The gift has fallen down by your foot.");
            } else {
                System.out.println("You cannot attack" + item.getName()
                        + " if it is not a wonder tree or it has been attacked!");
            }
        } else {
            System.out.println("You didn't see " + item.getName());
            //不是的话就说不可以互动
        }
    }

    /**
     * look at the given object found in the room, and print out effect.
     *
     * @param item
     * @param effect
     */
    public void lookAt(Item item, String effect) {
        System.out.println("You looked at" + item.getName() + "." + effect);
    }

    public String getIntro() {
        return this.intro;
    }
}
