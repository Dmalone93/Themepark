import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VisitorClass {

    Visitor visitor;

    @Before
    public void setUp(){
        visitor = new Visitor(5.11, 300, 30);
    }

    @Test
    public void hasName() {
        assertEquals(5.11, visitor.getHeight());
    }

    @Test
    public void hasMoney() {
        assertEquals(300, visitor.getMoney());
    }

    @Test
    public void hasAge() {
        assertEquals(30, visitor.getAge());
    }
}
