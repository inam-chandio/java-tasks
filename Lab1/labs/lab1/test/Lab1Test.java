package labs.lab1.test;

import static org.junit.Assert.*; // Import for JUnit assertions

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

import labs.lab1.*;
import org.junit.Assert;
import org.junit.Test;

public class Lab1Test {

    private final double EPSILON = 1e-3;

    @Test
    public void problem1() {
        Assert.assertEquals("Holle, Werld!", Main.problem1_switchEO("Hello, World!"));
        assertEquals("EEEEEEHHH...", Main.problem1_switchEO("OOOOOOHHH..."));
        assertEquals("Java is fun!", Main.problem1_switchEO("Java is fun!"));
    }

    @Test
    public void problem2() {
        assertTrue(Main.problem2_hasStr("lovely", "love"));
        assertTrue(Main.problem2_hasStr("Blovely", "love"));
        assertFalse(Main.problem2_hasStr("URlovely", "love"));
        assertFalse(Main.problem2_hasStr("Lovely", "love"));
        assertFalse(Main.problem2_hasStr("", "love"));
        assertFalse(Main.problem2_hasStr("hello", "love"));
        assertTrue(Main.problem2_hasStr("love", "love"));
        assertFalse(Main.problem2_hasStr("lovely", "lovelyy"));
        assertFalse(Main.problem2_hasStr("look", "love"));
        assertTrue(Main.problem2_hasStr("lovelovelovelove", "love"));
    }

    @Test
    public void problem3() {
        int numPics = 5;
        String numString = Main.problem3_slotMachine(numPics);
        Scanner s = new Scanner(numString);
        ArrayList<Integer> nums = new ArrayList<>();
        while (s.hasNext()) {
            nums.add(s.nextInt());
        }
        assertEquals(4, nums.size());
        for (Integer num : nums) {
            assertTrue(num >= 1);
            assertTrue(num <= numPics);
        }
        s.close();
    }

    @Test
    public void problem4() {
        assertEquals(new BigInteger("23230572939574190285016132680582106822956386016021987551618623681"),
                Main.problem4_bigPower(new BigInteger("12345678987654321")));
    }

    @Test
    public void problem5() {
        assertEquals("SATURDAY", Main.problem5_getDayOfWeek(12, 25, 2021));
        assertEquals("FRIDAY", Main.problem5_getDayOfWeek(12, 18, 2020));
        assertEquals("MONDAY", Main.problem5_getDayOfWeek(4, 2, 1934));
    }

    @Test
    public void problem6() {
        Circuit wiring = new Circuit(); // Directly instantiate Circuit
        assertEquals(0, wiring.getSwitchState(1));
        assertEquals(0, wiring.getSwitchState(2));
        assertEquals(0, wiring.getLampState());
        wiring.toggleSwitch(1);
        assertEquals(1, wiring.getSwitchState(1));
        assertEquals(0, wiring.getSwitchState(2));
        assertEquals(1, wiring.getLampState());
        wiring.toggleSwitch(2);
        assertEquals(1, wiring.getSwitchState(1));
        assertEquals(1, wiring.getSwitchState(2));
        assertEquals(0, wiring.getLampState());
    }

    @Test
    public void problem7() {
        Employee e = new Employee("Alice", 1000); // Directly instantiate Employee
        assertEquals(1000.0, e.getSalary(), EPSILON);
        e.raiseSalary(10);
        assertEquals(1100.0, e.getSalary(), EPSILON);
        e.raiseSalary(10);
        assertEquals(1210.0, e.getSalary(), EPSILON);
    }

    @Test
    public void problem8() {
        AntPopulation pop = new AntPopulation(100);
        assertEquals(100, pop.getAnts());
        pop.breed();
        assertEquals(200, pop.getAnts());
        pop.spray(10);
        assertEquals(180, pop.getAnts());  // 10% of 200 = 20, so 200 - 20 = 180
        pop.spray(50);
        assertEquals(90, pop.getAnts());   // 50% of 180 = 90, so 180 - 90 = 90
    }


    @Test
    public void problem9() {
        Microwave microwave = new Microwave(); // Directly instantiate Microwave
        microwave.increaseTime();
        microwave.switchPower();
        assertEquals("Cooking for 30 seconds at level 2", microwave.start());
        microwave.increaseTime();
        microwave.switchPower();
        assertEquals("Cooking for 60 seconds at level 1", microwave.start());
    }

    @Test
    public void problem10() {
        Battery battery = new Battery(100); // Directly instantiate Battery
        assertEquals(100.0, battery.getRemainingCapacity(), EPSILON);
        battery.drain(50);
        assertEquals(50.0, battery.getRemainingCapacity(), EPSILON);
        battery.drain(60);
        assertEquals(0.0, battery.getRemainingCapacity(), EPSILON);
        battery.charge();
        assertEquals(100.0, battery.getRemainingCapacity(), EPSILON);
    }
}
