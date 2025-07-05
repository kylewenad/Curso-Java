package local.concept1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;

public class FactorialTest {

    Factorial factorial = new Factorial();
    short number;
    @Test
    public void testCalculateFactorial2() {
        // factorial de 1
        short number = 5;
        long result = 1;

        for (short i = number; i > 0; i--) {
            result = result * i;
        }
        assertEquals(120, result);

    }
    @Test
    public void testCalculateFactorialDefault() throws BusinessException {
        short number = -1;
        try {
            factorial.calculateFactorial();
        } catch (BusinessException e) {
            BusinessException expected = new BusinessException(ErrorCodes.ERROR_NEGATIVE, "No se puede calcular el factorial de " + number)
            assertTrue(true);
    }
}
     @Test
    public void testCalculateFactorialDefault2() throws BusinessException {
    short number = 15;
        if (number > 10) {
        String message = "No se puede calcular el factorial de " + number;
        //throw new TechnicalException(message);
        throw new BusinessException(ErrorCodes.ERROR_BIGGER_20, message);
        }

        long result = 1;
        
        for (short i = number; i > 0; i--) {
            result = result * i;
        }
        assertTrue(true);
    }
    
    @Test
    public void testMain() {

    }

    @Test
    public void testShowNumber() {

    }
}
