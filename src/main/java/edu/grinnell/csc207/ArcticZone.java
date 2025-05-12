package edu.grinnell.csc207;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Tiffany Tang
 */
public class ArcticZone extends Room {

    private boolean lotusTaken;

    private String intro = "The biting cold wind was blowing. "
            + "You've entered the Arctic Zone.\n"
            + "Looking around, you see many penguins and glaciers. "
            + "In the distance, something is shimmering.\n "
            + "You recall an ancient legend about a giant Arctic Snow Lotus "
            + "at the peak of the northern lands\n. "
            + "It is said to bear mysterious fruit — fruit that grants magical powers.\n"
            + "You are thinking of attacking Lotus.\n";

    /**
     * arctic zone constructor
     */
    public ArcticZone() {
        super("ArcticZone", new ArrayList<>(), null, new HashMap<>(), null);

        lotusTaken = false;

        Item tree = new Item("lotus", this);
        Item seed = new Item("lotusroot", this);

        this.addItem(tree);
        this.addItem(seed);
        this.setWonderTree(tree);
        this.setGift(seed);
    }

    /**
     * if the user uses the item, then it will have the certain effect
     * @param item 
     * @param effect 
     */
    public void use(Item item, String effect) {
        super.use(item, "You ate the lotusroot and suddenly, you float up like a cloud.\n"
                + "You feel a stream of energy flowing through your body.\n"
                + "You feel your Ren and Du meridians \n"
                + "have been unlocked, and you've gained extraordinary power from \n"
                + "a sacred artifact of the Arctic Zone!\n");
        //this.addConnectedRoom("East", new Tianya());
        //go("East");
    }

    /**
     * if the user look at the item, then it will have the certain effect
     * @param item
     * @param effect 
     */
    public void lookAt(Item item, String effect) {
        super.lookAt(item, "It is shimmered with ice.");
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
        return "east";
    }
    
    /**
     * return if the gift of the room has been taken
     */
    public void setTaken() {
        this.lotusTaken = true;
    }
}
