package edu.grinnell.csc207;

public class Room {
    Wait //wait in the room for one turn
    Go<direction> // go in the given cardinal direction, e.g., north or south
    Talk to<object> // talk to the given object found in the room
    Pick up<item> // pick up the given item found in the room
    Use <item> //use the given item found in the player's inventory
    Attack<object> // attack the given object found in the room
    Look at<object> // look at the given object found in the room
}