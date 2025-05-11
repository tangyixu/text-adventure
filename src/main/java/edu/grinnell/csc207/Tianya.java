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
public class Tianya extends Room {

    private String intro = "You’ve entered a grand temple with four towering doors, "
            + "each aligned with one of the cardinal directions—North, South, East, and West. "
            + "Every door radiates a distinct aura: one blazes with the "
            + "intensity of scorching sunlight, another glistens as though sealed in ice, "
            + "a third echoes faintly with the rhythmic crashing of waves, "
            + "and the last carries the thick, humid scent of a tropical rainforest drenched in rain."
            + "You remember an old legend: "
            + "if you collect the four Sacred Trees—each hidden within the elemental palaces "
            + "beyond these doors—you will be granted one chance at rebirth… "
            + "a chance to return and retake your CSC 207 exam, which you didn’t do so well on this time."
            + "Driven by desperation and determination, you take a deep breath and prepare to begin your journey.\n"
            + "Which direction will you choose first [North, South, East, West]?";

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
