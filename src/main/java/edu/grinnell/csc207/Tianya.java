package edu.grinnell.csc207;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author yutong
 */
public class Tianya extends Room {

    /*private String intro = "You’ve entered a grand temple with four towering doors,\n "
            + "each aligned with one of the cardinal directions—North, South, East, and West.\n "
            + "Every door radiates a distinct aura: one blazes with the "
            + "intensity of scorching sunlight, another glistens as though sealed in ice,\n "
            + "a third echoes faintly with the rhythmic crashing of waves,\n "
            + "and the last carries the thick, humid scent of a tropical rainforest drenched in rain.\n"
            + "You remember an old legend: "
            + "if you collect the four Sacred Trees—each hidden within the elemental palaces "
            + "beyond these doors—you will be granted one chance at rebirth… "
            + "a chance to return and retake your CSC 207 exam, which you didn’t do so well on this time.\n"
            + "Driven by desperation and determination, you take a deep breath and prepare to begin your journey.\n"
            + "Which direction will you choose first [North, South, East, West]?\n";*/

    public Tianya() {
        super("Tianya", new ArrayList<>(), null, new HashMap<>(), null);

//        this.addConnectedRoom("North", new TropicalKingdom());
//        this.addConnectedRoom("South", new DeathDesert());
//        this.addConnectedRoom("West", new ArcticZone());
//        this.addConnectedRoom("East", new Moana());
    }

    public void use(Item item) {
        System.out.println("You cannot use any objects at the main room!");
    }

    public void lookAt(Item item) {
        System.out.println("It is just an ordinary object.");
    }

    public String getIntro() {
        return "Which direction will you choose next [North, South, East, West]?\\n";
    }
}
