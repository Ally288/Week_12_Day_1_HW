import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        int num1 = 1;
        int num2 = 1;
        assertEquals(2, calculator.add(num1,num2));
    }

    @Test
    public void canSubtract() {
        int num1 = 5;
        int num2 = 2;
        assertEquals(3, calculator.subtract(num1,num2));
    }

    @Test
    public void canMultiply() {
        int num1 = 2;
        int num2 = 2;
        assertEquals(4, calculator.multiply(num1, num2));
    }

    @Test
    public void canDivide() {
        double num1 = 5;
        double num2 = 2;
        assertEquals(2.5, calculator.divide(num1, num2), 0.01);
    }

}