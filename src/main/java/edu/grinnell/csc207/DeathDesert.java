package edu.grinnell.csc207;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author yutong
 */
public class DeathDesert extends Room {

    private boolean gemTaken;

    private String intro = "As soon as you open the door, the wind blows sand in your face.\n"
            + "You've entered the Death Desert!\nYou spot scorpions nearby,"
            + " and in the distance, you see a shimmering mirage.\n"
            + "You need to obtain something from the pyramid for the quest"
            + "to be considered complete.\n You are prepared to attack the pyramid.";
    
    /**
     * the constructor of death dessert
     */
    public DeathDesert() {
        super("DeathDesert", new ArrayList<>(), null, new HashMap<>(), null);

        gemTaken = false;

        Item tree = new Item("pyramid", this);
        Item gem = new Item("gem", this);

        this.addItem(tree);
        this.addItem(gem);
        this.setWonderTree(tree);
        this.setGift(gem);
    }

    /**
     * if the user uses the item, then it will have the certain effect
     * @param item 
     * @param effect 
     */
    public void use(Item item, String effect) {
        super.use(item, "You hold the gem in your hand tightly, and suddenly \n"
                + "it emits a dazzling light that envelops you. In an instant,\n"
                + " you find yourself clad in golden armor, which quickly turns\n"
                + " invisible. Yet you feel your combat power has increased\n"
                + "dramatically, filling you with newfound confidence to \n"
                + "continue your exploration.");
        //this.addConnectedRoom("North", new Tianya());
        go("north");
    }

    /**
     * if the user look at the item, then it will have the certain effect
     * @param item
     * @param effect 
     */
    public void lookAt(Item item, String effect) {
        super.lookAt(item, " It is covered with dusts and sand.");
    }

    /**
     * get the introduction of the room
     * @return a string of the intro of the room
     */
    public String getIntro() {
        return this.intro;
    }

    /**
     * get the direction to the main room
     * @return 
     */
    @Override
    public String getDirToMain() {
        return "north";
    }
    
    /**
     * return if the gift of the room has been taken
     */
    public void setTaken() {
        this.gemTaken = true;
    }

}
