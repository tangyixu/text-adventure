package edu.grinnell.csc207;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author yutong
 */
public class TropicalKingdom extends Room {

    private boolean guavaTaken;

    private String intro = "As soon as you open the door, a wave of humidity washes over you. "
            + "You've arrived at the **Tropical Kingdom**! "
            + "The calls of birds echo through the forest, "
            + "and you spot venomous snakes flicking their "
            + "tongues not far away. Vines sprawl in every direction. "
            + "You really love guavas, and you remember that the tree "
            + "they grow on is beautiful—like a rainbow—and is said to "
            + "drop mysterious gifts. You're considering attacking the **Rainbow Tree**!";

    public TropicalKingdom() {
        super("TropicalKingdom", new ArrayList<>(), null, new HashMap<>(), null);

        guavaTaken = false;

        Item tree = new Item("Rainbow Tree", this);
        Item guava = new Item("guava", this);

        this.addItem(tree);
        this.addItem(guava);
        this.setWonderTree(tree);
        this.setGift(guava);

        this.addConnectedRoom("South", new Tianya());
    }
}
