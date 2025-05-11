package edu.grinnell.csc207;

import java.util.*;

/**
 *
 * @author Tiffany Tang and Annie Li
 */
public class Parser {

    private static Scanner sc = new Scanner(System.in);

    public static Room parser(Room room) {
        String input = sc.nextLine().toLowerCase();
        if (input.startsWith("wait")) {
            room.Wait();
        } else if (input.startsWith("go") && input.length() > 3) {
            String[] words = input.substring(3).trim().split(" ");
            String object = words[0];
            //System.out.println("The direction is " + object);
            Room next = room.go(object);
            return next;
        } else if (input.startsWith("talk to") && input.length() > 8) {
            String[] words = input.substring(8).trim().split(" ");
            String object = words[0];
            room.talkTo(object);
        } else if (input.startsWith("pick up") && input.length() > 8) {
            String[] words = input.substring(8).trim().split(" ");
            String object = words[0];
            room.pickUp(object);
        } else if (input.startsWith("use") && input.length() > 4) {
            String[] words = input.substring(4).trim().split(" ");
            String object = words[0];
            if (room.hasItem(object)) {
                room.use(room.getItem(object), null);
            } else {
                System.out.println("The object that you tried to use is not here!");
            }
        } else if (input.startsWith("attack") && input.length() > 7) {
            String[] words = input.substring(7).trim().split(" ");
            String object = words[0];
            if (room.hasItem(object)) {
                room.attack(room.getItem(object));
            } else {
                System.out.println("The object that you tried to attack is not here!");
            }
        } else if (input.startsWith("look at") && input.length() > 8) {
            String[] words = input.substring(8).trim().split(" ");
            String object = words[0];
            if (room.hasItem(object)) {
                room.lookAt(room.getItem(object), null);
            } else {
                System.out.println("The object that you tried to look at is not here!");
            }
        } else {
            System.out.println("I didn't understand what you want to say...");
        }
        return null;
    }
}
