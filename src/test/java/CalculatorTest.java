import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        assertEquals( 4, Calculator.sum(100, 2));
    }
    @Test
    void sub() {
        assertEquals( 4, Calculator.sub(8, 4));
    }

    @Test
    void mul() {
        assertEquals(8,Calculator.mul(200,4));
    }

    @Test
    void div() {
        assertEquals( 4, Calculator.div(40,10));
    }
}