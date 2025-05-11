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
    }

    public void use(Item item) {
        String effect = "You eat the juicy guava and dance in the rain.\n"
                + "You find the Rainbow Tree suddenly starts glowing. Animals come out and dance with you.\n"
                + "An elephant stops in front of you and carrys you back to Tianya.\n";
        super.use(item, effect);

        this.addConnectedRoom("South", new Tianya());
        go("South");
    }
    
    public void lookAt(Item item) {
        super.lookAt(item, "It is covered with leaves and colorful flowers.");
    }

    public String getIntro() {
        return this.intro;
    }
}
