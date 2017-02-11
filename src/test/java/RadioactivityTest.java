package test.java;

import main.java.RadioactivityMeasurer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test method on Radioactivity
 *
 */
public class RadioactivityTest {

    @Test
    public void should_return_low_level_for_0() throws Exception {
        assertEquals(RadioactivityMeasurer.measure(0), "low");
    }

    @Test
    public void should_return_low_level_for_50() throws Exception {
        assertEquals(RadioactivityMeasurer.measure(50), "low");
    }

    @Test
    public void should_return_medium_low_level_for_51() throws Exception {
        assertEquals(RadioactivityMeasurer.measure(51), "medium_low");
    }

    @Test
    public void should_return_medium_low_level_for_100() throws Exception {
        assertEquals(RadioactivityMeasurer.measure(100), "medium_low");
    }

    @Test
    public void should_return_medium_high_level_for_101() throws Exception {
        assertEquals(RadioactivityMeasurer.measure(101), "medium_high");
    }

    @Test
    public void should_return_medium_high_level_for_150() throws Exception {
        assertEquals(RadioactivityMeasurer.measure(150), "medium_high");
    }

    @Test
    public void should_return_high_level_for_151() throws Exception {
        assertEquals(RadioactivityMeasurer.measure(151), "high");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_for_negative_value() throws IllegalArgumentException {
        RadioactivityMeasurer.measure(-1);
    }
}
