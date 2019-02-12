package AttractionTests;

import ThemePark.Visitor;
import attractions.Rollercoster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollercosterTest {

    Rollercoster rollercoster;
    Visitor visitor;


    @Before
    public void setUp() throws Exception {
        rollercoster = new Rollercoster("Rolly", 2);
        visitor = new Visitor(5.11, 50, 30);
    }

    @Test
    public void canHaveName() {
        assertEquals("Rolly", rollercoster.getName());
    }

    @Test
    public void testSecuirty() {
        assertEquals(true, rollercoster.isAlloweedTo(visitor));
    }
}
