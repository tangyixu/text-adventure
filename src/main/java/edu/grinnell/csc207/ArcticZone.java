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
        String effect = "You drink the coconut juice and blow across the hollow coconut.\n"
                + "The sound from the coconut summons a swarm of fish.\n"
                + "The waves stirred up by the fish can carry you back to Tianya.\n";
        super.use(item, effect);
        
        this.addConnectedRoom("East", new Tianya());
        go("East");
    }

}
