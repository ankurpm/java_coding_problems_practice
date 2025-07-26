package interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

public class StatsCalculatorTest {

    @Test
    void testMean() {
        assertEquals(3.0, StatsCalculator.mean(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(15.0, StatsCalculator.mean(Arrays.asList(10, 20)));
    }

    @Test
    void testMedian() {
        assertEquals(3.0, StatsCalculator.median(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(2.5, StatsCalculator.median(Arrays.asList(1, 2, 3, 4)));
    }

    @Test
    void testMode() {
        assertEquals(2, StatsCalculator.mode(Arrays.asList(1, 2, 2, 3, 3)));
        assertEquals(1, StatsCalculator.mode(Arrays.asList(4, 4, 1, 1, 2)));
        assertEquals(2, StatsCalculator.mode(Arrays.asList(9, 9, 9, 2, 2, 2)));
    }

    @Test
    void testEmptyCollection() {
        assertThrows(IllegalArgumentException.class, () -> StatsCalculator.mean(Collections.emptyList()));
        assertThrows(IllegalArgumentException.class, () -> StatsCalculator.median(Collections.emptyList()));
        assertThrows(IllegalArgumentException.class, () -> StatsCalculator.mode(Collections.emptyList()));
    }
}
