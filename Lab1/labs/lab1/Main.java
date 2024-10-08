package labs.lab1;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Random;

/**
 * The Main class serves as the entry point for the program.
 * It demonstrates various functionalities such as string manipulation,
 * random number generation, and date calculations.
 */
public class Main {

    /**
     * The main method that executes the program.
     * It calls various problem-solving methods and prints the results to the console.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Problem 1: Demonstrating character swapping in a string
        String problem1Result = problem1_switchEO("Hello Everyone!");
        System.out.println("SwitchEO: " + problem1Result);

        // Problem 2: Checking if string 'b' exists at the start of string 'a'
        boolean problem2Result = problem2_hasStr("hello", "he");
        System.out.println("HasStr: " + problem2Result);

        // Problem 3: Simulating a slot machine with random numbers
        String problem3Result = problem3_slotMachine(7);
        System.out.println("SlotMachine: " + problem3Result);

        // Problem 4: Calculating the fourth power of a BigInteger
        BigInteger bigInt = new BigInteger("5");
        BigInteger problem4Result = problem4_bigPower(bigInt);
        System.out.println("BigPower: " + problem4Result);

        // Problem 5: Getting the day of the week for a given date
        String problem5Result = problem5_getDayOfWeek(10, 6, 2024);
        System.out.println("GetDayOfWeek: " + problem5Result);

        // Problem 6: Creating a Circuit and toggling switches
        Circuit circuit = new Circuit();
        circuit.toggleSwitch(1);
        circuit.toggleSwitch(2);
        int lampState = circuit.getLampState();
        System.out.println("Circuit: Lamp State: " + lampState);

        // Problem 7: Creating an Employee and raising their salary
        Employee employee = new Employee("GuL", 50000);
        employee.raiseSalary(10);
        System.out.println("Employee: New Salary: " + employee.getSalary());

        // Problem 8: Managing an AntPopulation and performing actions
        AntPopulation antPopulation = new AntPopulation(100);
        antPopulation.breed();
        antPopulation.spray(20);
        System.out.println("AntPopulation: Remaining Ants: " + antPopulation.getAnts());

        // Problem 9: Using a Microwave and starting the cooking process
        Microwave microwave = new Microwave();
        microwave.increaseTime();
        microwave.switchPower();
        System.out.println("Microwave: " + microwave.start());

        // Problem 10: Managing a Battery and checking its remaining capacity
        Battery battery = new Battery(100);
        System.out.println("Battery: Initial device battery: " + battery.getRemainingCapacity());
        battery.drain(20);
        System.out.println("Battery: Device battery after usage: " + battery.getRemainingCapacity());
    }

    /**
     * Swaps 'e' and 'o' characters in a given string, maintaining case.
     *
     * @param str The input string to process.
     * @return The modified string with 'e' and 'o' swapped.
     */
    public static String problem1_switchEO(String str) {
        str = str.replace('e', '\0');  // Temporarily replace 'e'
        str = str.replace('o', 'e');    // Replace 'o' with 'e'
        str = str.replace('\0', 'o');    // Replace temp with 'o'
        str = str.replace('E', '\0');    // Temporarily replace 'E'
        str = str.replace('O', 'E');      // Replace 'O' with 'E'
        str = str.replace('\0', 'O');      // Replace temp with 'O'

        return str; // Return the modified string
    }

    /**
     * Checks if string 'b' appears at the beginning of string 'a',
     * allowing for one character to be skipped.
     *
     * @param a The main string to check.
     * @param b The substring to look for.
     * @return True if 'b' exists at the start of 'a' or after skipping the first character, false otherwise.
     */
    public static boolean problem2_hasStr(String a, String b) {
        if (a.length() >= b.length()) {
            // Check if 'b' is a prefix of 'a' or if 'b' follows after the first character of 'a'
            return a.startsWith(b) || a.substring(1).startsWith(b);
        }
        return false; // Return false if 'a' is shorter than 'b'
    }

    /**
     * Simulates a slot machine by generating a series of random numbers.
     *
     * @param numPics The upper limit for random number generation.
     * @return A string representing the random numbers generated for the slot machine.
     */
    public static String problem3_slotMachine(int numPics) {
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            result.append(random.nextInt(numPics) + 1).append(" "); // Generate random numbers
        }
        return result.toString().trim(); // Return the generated numbers as a string
    }

    /**
     * Calculates the fourth power of a given BigInteger.
     *
     * @param bigInt The BigInteger to raise to the fourth power.
     * @return The result of raising the input BigInteger to the fourth power.
     */
    public static BigInteger problem4_bigPower(BigInteger bigInt) {
        return bigInt.pow(4); // Return the fourth power of the input BigInteger
    }

    /**
     * Gets the day of the week for a specified date.
     *
     * @param month The month of the date.
     * @param day   The day of the month.
     * @param year  The year of the date.
     * @return The name of the day of the week for the given date in uppercase.
     */
    public static String problem5_getDayOfWeek(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day); // Create a LocalDate object
        return date.getDayOfWeek().toString().toUpperCase(); // Return the day of the week in uppercase
    }
}
