package edu.grinnell.csc207;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Tiffany Tang
 */
public class ArcticZone extends Room {

    private boolean loctusTaken;
    
    private String intro;

    public ArcticZone() {
        super("ArcticZone", new ArrayList<>(), null, new HashMap<>(), null);
        
        loctusTaken = false;
        
        //TODO
        intro = "";

        Item tree = new Item("Loctus", this);
        Item seed = new Item("LoctusSeed", this);

        this.addItem(tree);
        this.addItem(seed);
        this.setWonderTree(tree);
        this.setGift(seed);
        
        this.addConnectedRoom("East", new Tianya());
    }

}
