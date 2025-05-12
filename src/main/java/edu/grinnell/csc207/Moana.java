package edu.grinnell.csc207;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Annie and Tiffany
 */
public class Moana extends Room {

    /**
     * If the gift has been taken.
     */
    private boolean coconutTaken;
    /**
     * Greetings of the room.
     */
    private String intro = "You’ve entered a coastal region, "
            + "walking along the beach lined with countless "
            + "coconut trees. \n"
            + "The sea breeze and the sweet scent of coconuts fill the "
            + "air. \n"
            + "As you take in the scene, you notice something unusual in the "
            + "distance—a huge coconut tree, entirely made of gold. \n"
            + "The sunlight reflects off its surface, casting dazzling lights "
            + "in all directions\n."
            + "You pause for a moment, considering whether to "
            + "attack coconut tree.\n";

    /**
     * Construct a Moana room.
     */
    public Moana() {
        super("Moana", new ArrayList<>(), null, new HashMap<>(), null);

        coconutTaken = false;

        Item tree = new Item("coconut tree", this);
        Item coconut = new Item("coconut", this);

        this.addItem(tree);
        this.addItem(coconut);
        this.setWonderTree(tree);
        this.setGift(coconut);
    }

    /**
     * Use an item.
     *
     * @param item
     * @param effect
     */
    public void use(Item item, String effect) {
        super.use(item, "You drink the coconut juice and blow across the "
                + "hollow coconut.\n"
                + "The sound from the coconut summons a swarm of fish.\n"
                + "The waves stirred up by the fish can carry you "
                + "back to Tianya.\n");

        this.addConnectedRoom("West", new Tianya());
        go("West");
    }

    /**
     * if the user look at the item, then it will have the certain effect
     * @param item
     * @param effect 
     */
    public void lookAt(Item item, String effect) {
        super.lookAt(item, "It is shining under the sunshine.");
    }

    /**
     * Return greetings.
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
        return "west";
    }
    
    /**
     * return if the gift of the room has been taken
     */
    public void setTaken() {
        this.coconutTaken = true;
    }
}
