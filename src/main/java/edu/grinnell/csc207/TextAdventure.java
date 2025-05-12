package edu.grinnell.csc207;

public class TextAdventure {
//Ultimately, your program TextAdventure should operate as follows:
//
//Greet the user of the program
//Set up the initial state of the game, in particular, put the player in the initial room.
//Print the entry text for that initial room.
//While the game has not yet ended:
//Get a command from the user.
//Process that command along with the current room and player state and print out the results of that command.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        System.out.println("""
                           Dear Adventurers, greetings! Welcome to the Fantasy Continent!
                           Here, you'll have the chance to explore four distinct realms:
                           the Arctic Zone, Tropical Kingdom, Death Desert, and Moana.
                           Each holding unique mystical gifts.
                           Now, begin your journey!""");

        System.out.println("You’ve entered a grand temple with four towering doors,\n "
                + "each aligned with one of the cardinal directions—North, South, East, and West.\n "
                + "Every door radiates a distinct aura: one blazes with the "
                + "intensity of scorching sunlight, another glistens as though sealed in ice,\n "
                + "a third echoes faintly with the rhythmic crashing of waves,\n "
                + "and the last carries the thick, humid scent of a tropical rainforest drenched in rain.\n"
                + "You remember an old legend: "
                + "if you collect the four Sacred Trees—each hidden within the elemental palaces\n "
                + "beyond these doors—you will be granted one chance at rebirth…\n "
                + "a chance to return and retake your CSC 207 exam, which you didn’t do so well on this time.\n"
                + "Driven by desperation and determination, you take a deep breath and prepare to begin your journey.\n"
                + "Which direction will you choose first [North, South, East, West]?");

        System.out.println("\nAvailable Actions: \n"
                + "Wait: wait in the room for one turn\n"
                + "Go <direction>: go in the given cardinal direction, e.g., north or south\n"
                + "Talk to <object>: talk to the given object found in the room\n"
                + "Pick up <item>: pick up the given item found in the room\n"
                + "Use <item>: use the given item found in the player's inventory\n"
                + "Attack <object>: attack the given object found in the room\n"
                + "Look at <object>: look at the given object found in the room");
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
        while (!inventory.hasAllFourGifts()) {
            Room next = Parser.parser(curRoom);
            if (next != null) {
                curRoom = next;
            }
        }
        System.out.println("Your mission has been accomplished. \n"
                + "You have reborn! Reborn one week before the CSC207 finals!\n "
                + "This time study hard and debug your projects properly!\n "
                + "Don't play games every day! Wishing you a productive and rewardingsemester!");
    }
}
