package edu.grinnell.csc207;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Tiffany Tang
 */
public class ArcticZone extends Room {

    private boolean loctusTaken;

    private String introduction = "The biting cold wind lashes against your face. "
            + "You've entered the Arctic Zone. "
            + "Looking around, you see many penguins and glaciers. "
            + "In the distance, something is shimmering. "
            + "You recall an ancient legend that speaks of a giant Arctic Snow Lotus "
            + "at the peak of the northern lands. "
            + "It is said to bear mysterious fruit—fruit that grants magical powers."
            + "You are thinking of attacking [Lotus].";

    public ArcticZone() {
        super("ArcticZone", new ArrayList<>(), null, new HashMap<>(), null);

        loctusTaken = false;

        Item tree = new Item("Loctus", this);
        Item seed = new Item("LoctusSeed", this);

        this.addItem(tree);
        this.addItem(seed);
        this.setWonderTree(tree);
        this.setGift(seed);
    }

    public void use(Item item) {
        super.use(item, "You ate the lotus seed and suddenly, you float up like a cloud."
                + "You feel a stream of energy flowing through your body. "
                + "You sense your Governing and Conception Vessels (Ren and Du meridians) "
                + "have been unlocked, and you've gained extraordinary power from "
                + "a sacred artifact of the Arctic Zone!");
        this.addConnectedRoom("East", new Tianya());
        go("East");
    }

    public void lookAt(Item item) {
        super.lookAt(item, "It is shimmered with ice.");
    }

}
