import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before

    public void before() {
        calculator = new Calculator();
    }


    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2.5,2.5), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtract(10.75, 7.75), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(30.25, calculator.multiply(5.5, 5.5), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(3.21, calculator.divide(8.85, 2.75), 0.01);
    }
}
