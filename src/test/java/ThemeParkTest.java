import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import Stalls.Stall;
import Stalls.TobaccoStall;
import ThemePark.ThemePark;
import attractions.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Attraction park;
    Attraction dodgems;
    Attraction playground;
    Attraction rollercoster;
    Stall candyStall;
    Stall iceCreamStall;
    Stall tobaccoStall;

    @Before
    public void setUp() throws Exception {

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        ArrayList<Stall> stalls = new ArrayList<Stall>();
        park = new Park("park", 5);
        dodgems = new Dodgems("dodgems", 4);
        playground = new Playground("playground", 3);
        rollercoster = new Rollercoster("rollercoster", 3);
        attractions.add(park);
        attractions.add(dodgems);
        attractions.add(playground);
        attractions.add(rollercoster);

        candyStall = new CandyFlossStall("candy", "John", 1, 2);
        iceCreamStall = new IceCreamStall("candy", "John", 1,3);
        tobaccoStall = new TobaccoStall("candy", "John", 1, 3);
        stalls.add(candyStall);
        stalls.add(iceCreamStall);
        stalls.add(tobaccoStall);

        themePark = new ThemePark(attractions, stalls);
    }

    @Test
    public void hasAttractions() {
        assertEquals(4, themePark.getAttractionNumber());
    }

    @Test
    public void hasStalls(){
        assertEquals(3, themePark.getStallNumber());
    }
}
