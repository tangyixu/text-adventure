package edu.grinnell.csc207;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The main room of the game.
 *
 * @author yutong
 */
public class Tianya extends Room {

    /**
     * Construct a tianya room.
     */
    public Tianya() {
        super("Tianya", new ArrayList<>(), null, new HashMap<>(), null);

//        this.addConnectedRoom("North", new TropicalKingdom());
//        this.addConnectedRoom("South", new DeathDesert());
//        this.addConnectedRoom("West", new ArcticZone());
//        this.addConnectedRoom("East", new Moana());
    }

    /**
     * Use an item.
     *
     * @param item
     * @param effect
     */
    public void use(Item item, String effect) {
        System.out.println("You cannot use any objects at the main room!");
    }

    /**
     * Look at an item.
     *
     * @param item
     */
    public void lookAt(Item item) {
        System.out.println("It is just an ordinary object.");
    }

    /**
     * Return greetings.
     *
     * @return greetings.
     */
    public String getIntro() {
        return "Which direction will you choose next [North, "
                + "South, East, West]?\n";
    }
}
