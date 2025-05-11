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
public class TropicalKingdom extends Room{
    private boolean guavaTaken;
    
    private String intro;

    public TropicalKingdom() {
        super("TropicalKingdom", new ArrayList<>(), null, new HashMap<>(), null);
        
        guavaTaken = false;

        Item tree = new Item("Rainbow Tree", this);
        Item guava = new Item("guava", this);

        this.addItem(tree);
        this.addItem(guava);
        this.setWonderTree(tree);
        this.setGift(guava);
        
        this.addConnectedRoom("South", new Tianya());
    }
}
