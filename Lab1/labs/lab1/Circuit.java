package labs.lab1;

/**
 * A class to represent a circuit with two switches.
 */
public class Circuit {
    private int switch1 = 0;  // State of switch 1 (0 = off, 1 = on)
    private int switch2 = 0;  // State of switch 2 (0 = off, 1 = on)

    /**
     * Toggles the state of the specified switch.
     *
     * @param switchNum The switch number (1 or 2).
     */
    public void toggleSwitch(int switchNum) {
        if (switchNum == 1) {
            switch1 = (switch1 == 0) ? 1 : 0;
        } else if (switchNum == 2) {
            switch2 = (switch2 == 0) ? 1 : 0;
        }
    }

    /**
     * Gets the lamp state based on the switch states.
     *
     * @return The lamp state (0 = off, 1 = on).
     */
    public int getLampState() {
        return (switch1 + switch2) % 2;
    }

    /**
     * Gets the state of the specified switch.
     *
     * @param switchNum The switch number (1 or 2).
     * @return The state of the switch (0 or 1).
     */
    public int getSwitchState(int switchNum) {
        if (switchNum == 1) {
            return switch1;
        } else {
            return switch2;
        }
    }
}
