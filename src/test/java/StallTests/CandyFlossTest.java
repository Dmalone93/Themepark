package StallTests;

import Stalls.CandyFlossStall;
import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CandyFlossTest {

        CandyFlossStall candyFlossStall;

        @Before
        public void setUp() throws Exception {
            candyFlossStall = new CandyFlossStall("Floss", "George", 2, 5);

        }

        @Test
        public void hasName() {
            assertEquals("Floss", candyFlossStall.getName());
        }

        @Test
        public void hasOwnerName() {
            assertEquals("George", candyFlossStall.getOwnerName());
        }

        @Test
        public void hasParkingSlot() {
            assertEquals(2, candyFlossStall.getParkingSlot());
        }

    @Test
    public void hasRating() {
            assertEquals(5, candyFlossStall.getRating());
    }
}
