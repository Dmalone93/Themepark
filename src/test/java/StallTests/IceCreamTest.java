package StallTests;

import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceCreamTest {

    IceCreamStall iceCreamStall;

    @Before
    public void setUp() throws Exception {
        iceCreamStall = new IceCreamStall("Tobacco", "Jay", 1, 4);

    }

    @Test
    public void hasName() {
        assertEquals("Tobacco", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Jay", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSlot() {
        assertEquals(1, iceCreamStall.getParkingSlot());
    }
}