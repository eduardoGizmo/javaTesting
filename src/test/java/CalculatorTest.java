import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @Test
    public void shouldAddTwoNumbers(){
        assertEquals(20.00, calculator.add(10.00, 10.00), 0.01);
    }
    @Test
    public void shouldSubtractTwoNumbers(){
        assertEquals(10.00, calculator.subtract(20.00, 10.00), 0.01);
    }
}
