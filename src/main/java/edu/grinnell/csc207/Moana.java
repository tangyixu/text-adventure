package edu.grinnell.csc207;

import java.util.*;

/**
 *
 * @author Annie and Tiffany
 */
public class Moana extends Room {

    private boolean coconutTaken;
    
    private String intro;

    public Moana() {
        super("Moana", new ArrayList<>(), null, new HashMap<>(), null);
        
        coconutTaken = false;
        
        //TODO
        intro = "";

        Item tree = new Item("Coconut Tree", this);
        Item coconut = new Item("Coconut", this);

        this.addItem(tree);
        this.addItem(coconut);
        this.setWonderTree(tree);
        this.setGift(coconut);
        
        this.addConnectedRoom("West", new Tianya());
    }

    public void waitResponse() {
        System.out.println("You feel the ocean breeze and hear the song of the waves.");
    }

    @Override
    public void use(Item item, String effect) {
       
    }

}
