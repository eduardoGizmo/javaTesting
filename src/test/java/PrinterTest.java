import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void init(){
        printer = new Printer(90, 200);
    }

    @Test
    public void shouldCountNumOfSheets(){
        assertEquals(90, printer.getSheets());
    }

    @Test
    public void shouldCountTonerVolume(){
        assertEquals( 200, printer.getToner());
    }

    @Test
    public void shouldPrint(){
        printer.print(10, 4);
        assertEquals(50, printer.getSheets());
        assertEquals(160, printer.getToner());
    }

    @Test
    public void shouldntPrint(){
        printer.print(10, 10);
        assertEquals(90, printer.getSheets());
    }


}
