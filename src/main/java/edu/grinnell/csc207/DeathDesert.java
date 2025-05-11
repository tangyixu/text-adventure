package edu.grinnell.csc207;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author yutong
 */
public class DeathDesert extends Room {

    private boolean gemTaken;

    private String intro = "As soon as you open the door, a mouthful of sand hits you.\n "
            + "You've entered the Death Desert! \n You spot scorpions nearby, "
            + "and in the distance, you see a shimmering mirage. \n"
            + "You need to obtain something from the pyramid for the quest "
            + "to be considered complete.\n You are prepared to attack the pyramid.";

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

    public void use(Item item) {
        super.use(item, "You clutch the gemstone in your hand, and suddenly "
                + "it emits a dazzling light that envelops you. "
                + "In an instant, you find yourself clad in golden armor, "
                + "which quickly turns invisible. Yet you feel your "
                + "combat power has increased dramatically, filling you "
                + "with newfound confidence to continue your exploration.");
        this.addConnectedRoom("North", new Tianya());
        go("North");
    }

    public void lookAt(Item item, String effect) {
        super.lookAt(item, " It is covered with dusts and sand.");
    }

    public String getIntro() {
        return this.intro;
    }

}
