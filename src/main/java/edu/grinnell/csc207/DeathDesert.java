/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.grinnell.csc207;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author yutong
 */
public class DeathDesert extends Room {
    private boolean gemTaken;

    private String intro = "As soon as you open the door, a mouthful of sand hits you. "
            + "You've entered the **Death Desert**! You spot scorpions nearby, "
            + "and in the distance, you see a shimmering mirage. "
            + "You need to obtain something from the pyramid for the quest "
            + "to be considered complete. You prepare to attack the pyramid.";


    public DeathDesert() {
        super("DeathDesert", new ArrayList<>(), null, new HashMap<>(), null);
        
        gemTaken = false;

        Item tree = new Item("Pyramid", this);
        Item gem = new Item("gem", this);

        this.addItem(tree);
        this.addItem(gem);
        this.setWonderTree(tree);
        this.setGift(gem);
    }
    
    public void use(Item item) {
        String effect = "You drink the coconut juice and blow across the hollow coconut.\n"
                + "The sound from the coconut summons a swarm of fish.\n"
                + "The waves stirred up by the fish can carry you back to Tianya.\n";
        super.use(item, effect);
        
        this.addConnectedRoom("North", new Tianya());
        go("North");
    }
}
