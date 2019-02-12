package AttractionTests;

import ThemePark.Visitor;
import attractions.Playground;
import attractions.Rollercoster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaygroundTest {

        Playground playground;
        Visitor visitor;

        @Before
        public void setUp() throws Exception {
            playground = new Playground("Playground", 3);
            visitor = new Visitor(5.11, 50, 30);
        }

        @Test
        public void canHaveName() {
            assertEquals("Playground", playground.getName());
        }

        @Test
        public void canPlayInPlayground() {
            assertEquals(false, playground.isAlloweedTo(visitor));
    }
}
