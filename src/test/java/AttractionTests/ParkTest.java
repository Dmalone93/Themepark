package AttractionTests;

import attractions.Park;
import attractions.Rollercoster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParkTest {


       Park park;

        @Before
        public void setUp() throws Exception {
            park = new Park("Rolly", 4);
        }

        @Test
        public void canHaveName() {
            assertEquals("Rolly", park.getName());
        }
}
