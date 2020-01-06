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

}
