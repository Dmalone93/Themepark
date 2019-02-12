package StallTests;

import Stalls.TobaccoStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TobaccoTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Tobacco", "Jay", 1, 3);
        visitor = new Visitor(5.11, 50, 30);

    }

    @Test
    public void hasName() {
        assertEquals("Tobacco", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Jay", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSlot() {
        assertEquals(1, tobaccoStall.getParkingSlot());
    }

    @Test
    public void overAge() {
        assertEquals(true, tobaccoStall.isAlloweedTo(visitor));
    }
}
