// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP103 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP 103 Assignment 2 */

/** 
 * Records an action (move or push) in a given direction.
 */

import java.util.Stack;
import ecs100.*;

public class ActionRecord {
    private boolean isPush;  // if it is not a "push", it is a "move"
    private String direction;
    private String action;
    static Stack<ActionRecord> history = new Stack<ActionRecord>();

    public ActionRecord(String action, String dir) {
        // Assigns params to fields
        this.action = action;
        this.direction = dir;

        // adds to the stack
        history.push(this);
    }

    public boolean isPush() {
        return isPush;
    }

    public boolean isMove() {
        return !isPush;
    }

    public String direction() {
        return this.direction;
    }

    public String action() {
        return this.action;
    }

    public String toString() {
        return ((isPush ? "Push" : "Move") + " to " + direction);
    }
}
