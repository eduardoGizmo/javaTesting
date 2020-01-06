import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    private Bottle bottle;

    @Before
    public void init(){
        bottle = new Bottle();
    }

    @Test
    public void shouldStartsAtVolume100(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void shouldRemove10WhenDrinking(){
        // ACTION
        bottle.drink();
        // ASSERTION
        assertEquals(90, bottle.getVolume());

    }

    @Test
    public void shouldSetTo0Volume(){
        bottle.empty();
        // ASSERTION
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void shouldSetTheVolumeTo100(){
        bottle.reFill();
        assertEquals(100, bottle.getVolume());
    }
}
