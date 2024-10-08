package labs.lab1;

/**
 * A class to represent a microwave oven.
 */
public class Microwave {
    private int time = 0;  // Cooking time in seconds
    private int power = 1; // Power level (1 or 2)

    /**
     * Increases the cooking time by 30 seconds.
     */
    public void increaseTime() {
        time += 30;
    }

    /**
     * Switches the power level between 1 and 2.
     */
    public void switchPower() {
        power = (power == 1) ? 2 : 1;
    }

    /**
     * Starts the microwave and returns a cooking message.
     *
     * @return A message indicating the cooking time and power level.
     */
    public String start() {
        return "Cooking for " + time + " seconds at level " + power;
    }

    /**
     * Resets the microwave to initial state.
     */
    public void reset() {
        time = 0;
        power = 1;
    }
}
