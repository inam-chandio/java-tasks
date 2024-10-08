package labs.lab1;

/**
 * A class to represent a battery with a certain capacity.
 */
public class Battery {
    private double capacity;         // Maximum capacity of the battery
    private double currentCapacity;  // Current charge level of the battery

    /**
     * Initializes the battery with the specified capacity.
     *
     * @param capacity The total capacity of the battery.
     */
    public Battery(double capacity) {
        this.capacity = capacity;
        this.currentCapacity = capacity;  // Initially fully charged
    }

    /**
     * Drains a specified amount of charge from the battery.
     *
     * @param amount The amount of charge to drain.
     */
    public void drain(double amount) {
        currentCapacity = Math.max(0, currentCapacity - amount);
    }

    /**
     * Fully recharges the battery.
     */
    public void charge() {
        currentCapacity = capacity;
    }

    /**
     * Gets the remaining capacity of the battery.
     *
     * @return The remaining charge in the battery.
     */
    public double getRemainingCapacity() {
        return currentCapacity;
    }
}
