import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void init(){
        printer = new Printer(90);
    }

    @Test
    public void shouldCountNumOfSheets(){
        assertEquals(90, printer.getSheets());
    }


}
