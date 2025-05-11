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
public class DeathDessert extends Room {
    private boolean gemTaken;
    
    private String intro;

    public DeathDessert() {
        super("DeathDessert", new ArrayList<>(), null, new HashMap<>(), null);
        
        gemTaken = false;
        
        //TODO
        intro = "";

        Item tree = new Item("Pyramid", this);
        Item gem = new Item("gem", this);

        this.addItem(tree);
        this.addItem(gem);
        this.setWonderTree(tree);
        this.setGift(gem);
        
        this.addConnectedRoom("East", new Tianya());
    }
}
