package WEboard;

import java.awt.AWTException;
import java.awt.Robot;

public class Action {

    private int key;
    private Robot rob;

    private Action() {
        key = 0;
        try {
            rob = new Robot();
        } catch (AWTException e) {
            System.exit(0);
        }
    }
    private Action(int key) {
        this.key = key;
        try {
            rob = new Robot();
        } catch (AWTException e) {
            System.exit(0);
        }
    }
    
    public void perform() {
        try {    
            rob.keyPress(key);
            rob.keyRelease(key);
        }
        catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}