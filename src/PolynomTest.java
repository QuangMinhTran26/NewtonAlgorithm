import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PolynomTest {

    @Test
    public void calculateValue() {
        Polynom p = new Polynom();
        double[] test = {2,1,2};
        p.getFactors();
        p.setFactors(test);

        assertEquals(12, p.calculateValue(2));

    }

    @org.junit.jupiter.api.Test
    public void calculateDerivativeAtPoint() {
        Polynom p = new Polynom();
        double[] test = {4,3,2,1};
        p.getFactors();
        p.setFactors(test);

        assertEquals(62, p.calculateDerivativeAtPoint(2));
    }
}