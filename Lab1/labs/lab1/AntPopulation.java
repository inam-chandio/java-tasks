package labs.lab1;

/**
 * A class to represent an ant population.
 */
public class AntPopulation {
    private int ants; // Current number of ants in the population

    /**
     * Initializes the ant population with a specified number of ants.
     *
     * @param initialAnts The initial number of ants.
     */
    public AntPopulation(int initialAnts) {
        this.ants = initialAnts;
    }

    /**
     * Breeds the ant population, doubling the number of ants.
     */
    public void breed() {
        this.ants *= 2;
    }

    /**
     * Sprays a percentage of the ant population, ensuring proper rounding.
     *
     * @param percent The percentage of ants to spray.
     */
    public void spray(double percent) {
        // Calculate the number of ants to remove and round it correctly
        int antsToRemove = (int) Math.round(this.ants * (percent / 100.0));
        this.ants = Math.max(0, this.ants - antsToRemove); // Ensure ants don't go below 0
    }

    /**
     * Gets the current number of ants in the population.
     *
     * @return The current number of ants.
     */
    public int getAnts() {
        return ants;
    }
}
