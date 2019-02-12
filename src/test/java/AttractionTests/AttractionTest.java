package AttractionTests;

import attractions.Attraction;
import attractions.Rollercoster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AttractionTest {

    Attraction attraction;

    @Before
    public void setUp() throws Exception {
        attraction = new Rollercoster("Roller", 20);
    }

    @Test
    public void hasName() {
        assertEquals("Roller", attraction.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(20, attraction.getRating());
    }
}
