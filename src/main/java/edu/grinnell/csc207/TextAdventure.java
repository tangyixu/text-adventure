package edu.grinnell.csc207;

import java.util.ArrayList;

/**
 *
 * @author XIALUO
 */
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
        System.out.println("Dear Adventurers, greetings! Welcome to the Fantasy Continent! "
                + "Here, you'll have the chance to explore four distinct realms: "
                + "the Arctic Zone, Tropical Kingdom, Death Desert, and Moana—each "
                + "holding unique mystical gifts. Now, begin your journey!");
        Tianya mainHall = new Tianya();
        Room curRoom = mainHall;
        while (!inventory.hasAllFourGifts()) {
            Parser.parser(curRoom);
        }

    }

}
