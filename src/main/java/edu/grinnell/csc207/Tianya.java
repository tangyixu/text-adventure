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
public class Tianya extends Room{
    
    public Tianya() {
        super("Moana", new ArrayList<>(), null, new HashMap<>());

        Item tree = new Item("Coconut Tree", false, this);
        Item coconut = new Item("Coconut", false, this);

        this.addItem(tree);
        this.addItem(coconut);
        this.setWonderTree(tree);
        
        this.addConnectedRoom("West", new Tianya());
    }
    
}
