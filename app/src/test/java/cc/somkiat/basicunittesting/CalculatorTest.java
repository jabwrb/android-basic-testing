package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void สองบวกเจ็ดต้องได้เท่ากับเก้า() {
        Calculator calculator = new Calculator();
        int result = calculator.plus(2, 7);
        assertEquals(9, result);
    }

    @Test
    public void สองบวกสองต้องได้เท่ากับสี่() {
        Calculator calculator = new Calculator();
        int result = calculator.plus(2, 2);
        assertEquals(4, result);
    }
}
