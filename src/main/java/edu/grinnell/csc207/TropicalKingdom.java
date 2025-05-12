package edu.grinnell.csc207;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author yutong
 */
public class TropicalKingdom extends Room {

    /**
     * If the gift has been taken.
     */
    private boolean guavaTaken;

    /**
     * Greetings of the room.
     */
    private String intro = "As soon as you open the door, "
            + "a wave of humidity washes over you. \n"
            + "You've arrived at the Tropical Kingdom! \n"
            + "The calls of birds echo through the forest, \n"
            + "and you spot venomous snakes flicking their "
            + "tongues not far away. Vines sprawl in "
            + "every direction. \n"
            + "You really love guavas, and you remember "
            + "that the tree \n"
            + "they grow on is beautiful—like a rainbow—"
            + "and is said to \n"
            + "drop mysterious gifts. You're considering "
            + "attacking the Rainbow Tree!\n";

    /**
     * Construct a tropical kingdom room.
     */
    public TropicalKingdom() {
        super("TropicalKingdom", new ArrayList<>(), null,
                new HashMap<>(), null);

        guavaTaken = false;

        Item tree = new Item("Rainbow Tree", this);
        Item guava = new Item("guava", this);

        this.addItem(tree);
        this.addItem(guava);
        this.setWonderTree(tree);
        this.setGift(guava);
    }

    /**
     * Use the item.
     *
     * @param item
     */
    public void use(Item item) {
        String effect = "You eat the juicy guava and dance in the rain.\n"
                + "You find the Rainbow Tree suddenly starts glowing."
                + " Animals come out and dance with you.\n"
                + "An elephant stops in front of you and carrys "
                + "you back to Tianya.\n";
        super.use(item, effect);

        //this.addConnectedRoom("South", new Tianya());
        //go("south");
    }

    /**
     * Look at the item.
     *
     * @param item
     */
    public void lookAt(Item item) {
        super.lookAt(item, "It is covered with leaves and colorful flowers.");
    }

    /**
     * Return the greetings of the room.
     *
     * @return greetings.
     */
    public String getIntro() {
        return this.intro;
    }

    /**
     * Determine the direction back to main.
     *
     * @return the direction back to main.
     */
    @Override
    public String getDirToMain() {
        return "south";
    }
}
