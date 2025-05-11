package edu.grinnell.csc207;

import java.util.*;

/**
 *
 * @author Annie and Tiffany
 */
public class Moana extends Room {

    private String introduction = "You’ve entered a coastal region, "
            + "walking along a sandy beach lined with countless coconut trees. "
            + "The sea breeze and the sweet scent of coconuts fill the air. "
            + "As you take in the scene, you notice something unusual in the "
            + "distance—a massive coconut tree, entirely made of gold. "
            + "Sunlight reflects off its surface, casting dazzling rays "
            + "in all directions. "
            + "You pause for a moment, considering whether to attack [coconut tree].";
    private boolean coconutTaken = false;

    public Moana() {
        super("Moana", new ArrayList<>(), null, new HashMap<>(), null);

        Item tree = new Item("Coconut Tree", this);
        Item coconut = new Item("Coconut", this);

        this.addItem(tree);
        this.addItem(coconut);
        this.setWonderTree(tree);
        this.setGift(coconut);
    }

    public void waitResponse() {
        System.out.println("You feel the ocean breeze and hear the song of the waves.");
    }

    @Override
    public void use(Item item, String effect) {
        super(item, "");
    }

}
