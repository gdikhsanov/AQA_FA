package Codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("", Kata0.countingSheep(0));
        assertEquals("1 sheep...", Kata0.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", Kata0.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", Kata0.countingSheep(3));
    }
}