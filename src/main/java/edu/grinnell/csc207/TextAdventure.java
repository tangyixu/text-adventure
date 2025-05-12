package edu.grinnell.csc207;

/**
 * The engine of the text adventure.
 */
public class TextAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("""
        Dear Adventurers, greetings! Welcome to the Fantasy Continent!
        Here, you'll have the chance to explore four distinct kingdoms:
        the Arctic Zone, Tropical Kingdom, Death Desert, and Moana.        
        Each kingdom holds a unique and mysterious gift.
        Now, begin your journey!""");

        System.out.println("You’ve entered a grand temple with four "
                + "towering doors,\n"
                + "each aligned with one main "
                + "direction—North, South, East, "
                + "and West.\n"
                + "Every door exudes a unique aura: "
                + "one blazes with the "
                + "hot sunlight, "
                + "another shines as though "
                + "sealed in ice,\n"
                + "a third faintly echoes the "
                + "rhythmic lapping of waves,\n"
                + "and the last carries the thick, "
                + "humid scent of a tropical rainforest "
                + "drenched in rain.\n"
                + "You remember an old legend: "
                + "if you collect the gifts of four sacred"
                + "trees—each hidden within the "
                + "kingdoms\n"
                + "beyond these doors—you will be "
                + "granted one chance at rebirth,\n"
                + "a chance to return and retake your "
                + "CSC 207 exam that you "
                + "didn’t do so well "
                + "on this time.\n"
                + "Driven by desperation and determination, "
                + "you take a deep "
                + "breath and prepare "
                + "to begin your journey.\n"
                + "Which direction will you choose first "
                + "[North, South, East, West]?");

        System.out.println("\nAvailable Actions: \n"
                + "Wait: wait in the room for one turn\n"
                + "Go <direction>: go in the given cardinal direction, "
                + "e.g., north or south\n"
                + "Talk to <object>: talk to the given object found in "
                + "the room\n"
                + "Pick up <item>: pick up the given item found in the room\n"
                + "Use <item>: use the given item found in the player's "
                + "inventory\n"
                + "Attack <object>: attack the given object found in the room\n"
                + "Look at <object>: look at the given object found "
                + "in the room");
        Tianya mainHall = new Tianya();
        ArcticZone arctic = new ArcticZone();
        TropicalKingdom tropical = new TropicalKingdom();
        Moana sea = new Moana();
        DeathDesert desert = new DeathDesert();

        arctic.addConnectedRoom("east", mainHall);
        tropical.addConnectedRoom("south", mainHall);
        desert.addConnectedRoom("north", mainHall);
        sea.addConnectedRoom("west", mainHall);

        mainHall.addConnectedRoom("north", tropical);
        mainHall.addConnectedRoom("south", desert);
        mainHall.addConnectedRoom("west", arctic);
        mainHall.addConnectedRoom("east", sea);
        Room curRoom = mainHall;
        Inventory inventory = new Inventory();
        while (!inventory.hasAllFourGifts()) {
            Room next = Parser.parser(curRoom, inventory);
            if (next != null) {
                curRoom = next;
            }
        }
        System.out.println("Your mission has been accomplished.\n"
                + "You have reborn! Reborn one week before the CSC207 "
                + "finals!\n"
                + "This time study hard and debug your projects!\n"
                + "Don't play games every day! Wish you a "
                + "productive and rewarding semester!");
    }
}
