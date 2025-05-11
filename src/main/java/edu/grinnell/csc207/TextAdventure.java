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
        mainHall.addConnectedRoom("north", tropical);
        mainHall.addConnectedRoom("south", desert);
        mainHall.addConnectedRoom("west", arctic);
        mainHall.addConnectedRoom("east", sea);
        Room curRoom = mainHall;
        while (!inventory.hasAllFourGifts()) {
            Parser.parser(curRoom);
        }
    }
}
