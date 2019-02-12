package AttractionTests;

import attractions.Dodgems;
import attractions.Rollercoster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;


    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Dodgy", 5);
    }

    @Test
    public void canHaveName() {
        assertEquals("Dodgy", dodgems.getName());
    }
}
