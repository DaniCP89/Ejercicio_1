import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    void starUp(){
        fibonacci = new Fibonacci();
    }

    @Test
    void fibonacciWithNegativeNumberReturnsException(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }

    @Test
    void fibonacciAsZeroReturnsZero(){
        assertEquals(0, fibonacci.compute(0));
    }

    @Test
    void fibonacciAsOneReturnsOne(){
        assertEquals(1, fibonacci.compute(1));
    }

    @Test
    void fibonacciAsNumberGreaterThanOne(){
        assertEquals(1, fibonacci.compute(2));
        assertEquals(2, fibonacci.compute(3));
        assertEquals(21, fibonacci.compute(8));
        assertEquals(55, fibonacci.compute(10));
    }
}
