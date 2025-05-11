package edu.grinnell.csc207;

import java.util.*;

/**
 *
 * @author Annie and Tiffany
 */
public class Moana extends Room {

    private boolean coconutTaken;

    private String intro = "You’ve entered a coastal region, "
            + "walking along a sandy beach lined with countless coconut trees. \n"
            + "The sea breeze and the sweet scent of coconuts fill the air. \n"
            + "As you take in the scene, you notice something unusual in the "
            + "distance—a massive coconut tree, entirely made of gold. \n"
            + "Sunlight reflects off its surface, casting dazzling rays "
            + "in all directions\n. "
            + "You pause for a moment, considering whether to attack [coconut tree].\n";

    public Moana() {
        super("Moana", new ArrayList<>(), null, new HashMap<>(), null);

        coconutTaken = false;

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

    public void use(Item item) {
        String effect = "You drink the coconut juice and blow across the hollow coconut.\n"
                + "The sound from the coconut summons a swarm of fish.\n"
                + "The waves stirred up by the fish can carry you back to Tianya.\n";
        super.use(item, effect);

        this.addConnectedRoom("West", new Tianya());
        go("West");
    }

    public void lookAt(Item item) {
        super.lookAt(item, "It is shining under the sunshine.");
    }

    public String getIntro() {
        return this.intro;
    }

}
