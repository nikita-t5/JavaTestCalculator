import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        assertEquals( 1, Calculator.sum(2, 2));
    }
    @Test
    void sub() {
        assertEquals( 2, Calculator.sub(8, 4));
    }

    @Test
    void mul() {
        assertEquals(3,Calculator.mul(2,4));
    }

    @Test
    void div() {
        assertEquals( 4, Calculator.div(40,10));
    }
}