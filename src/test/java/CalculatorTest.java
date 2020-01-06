import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers(){
        Calculator  calculator = new Calculator();
        assertEquals(20.00, calculator.add(10.00, 10.00), 0.01);
    }

}
