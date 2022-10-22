import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldEqualFour(){
        //object creation
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add( 2, 2) ); //assert or check
    }

    @Test
    void threePlusSevenShouldEqualFour(){
        //object creation
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add( 3, 7) ); //assert or check
    }
}
