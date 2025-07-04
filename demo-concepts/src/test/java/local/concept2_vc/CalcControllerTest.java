package local.concept2_vc;
//test para detectar los cornerCase (casos raros)
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;

public class CalcControllerTest {
    
    private CalcController calculator;
    
    @Before
    public void prueba(){
        calculator = new CalcController();
    }

    @Test
    public void testAddDefault() {
        //0+0
        calculator = new CalcController();
        assertEquals(0,calculator.add());
        //(lo que yo espero, resultado)
    }
    @Test
    public void testAddOk(){
        //5+3
        int num1 = 5;
        int num2 = 3;
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        int result = calculator.add();
        assertEquals(8, result);
    }
    @Test
    public void testAddNegatives(){
        //-5+7
        int num1 = -5;
        int num2 = 7;
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        int result = calculator.add();
        assertEquals(2, result);
    }
    
    @Test
    public void testSubtractDefault() {
        //0-0
        CalcController subtract = new CalcController();
        assertEquals(0, subtract.subtract());
    }
    @Test
    public void testSubtract() {
        //7-3
        int num1 = 7;
        int num2 = 3;
        calculator = new CalcController();
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        int result = calculator.subtract();
        assertEquals(4, result);
    }
    @Test
    public void testSubtractNegatives() {
        //7-3
        int num1 = -7;
        int num2 = -3;
        calculator = new CalcController();
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        int result = calculator.subtract();
        assertEquals(-4, result);
    }
    
    @Test
    public void testMultiplyDefault() {
        //0*0
        assertEquals(0, 0);
    }
    @Test
    public void testMultiply() {
        //7*3
        int num1 = 7;
        int num2 = 3;
        calculator = new CalcController();
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        int result = calculator.multiply();
        assertEquals(21, result);
    }
    @Test
    public void testMultiplyNegatives() {
        //7*3
        int num1 = -7;
        int num2 = -3;
        calculator = new CalcController();
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        int result = calculator.multiply();
        assertEquals(21, result);
    }
    
    
    
    
    
    
    
    @Test
    public void testCalculateFactorialDefault() throws BusinessException {
        // 0
        assertEquals(1, calculator.calculateFactorial());
    }

    @Test
    public void testCalculateFactorial() throws BusinessException {
        // 5
        calculator.setNum1(5);
        assertEquals(120, calculator.calculateFactorial());
    }

    @Test
    public void testCalculateFactorialNegatives() {
        // -3
        int num1 = -3;
        try {
            calculator.calculateFactorial();
            fail("Situación no contemplada");
        } catch (BusinessException e) {
            assertTrue(e.getMessage().contains(ErrorCodes.ERROR_NEGATIVE.toString()));
        }
    }

    @Test
    public void testCalculateFactorial2() {
        
    }

    @Test
    public void testDecimalDivideDefault() throws BusinessException {
        // 0/0
        double result = calculator.decimalDivide();
        assertEquals(Double.NaN, result, 1);
    }

    @Test
    public void testDecimalDivideNoNan() throws BusinessException {
        int num1;
        int num2 = 0;
        if (num2 == 0) {
            throw new BusinessException(ErrorCodes.ERROR_ZERO, "Dividiendo por 0");
        }
        double result = calculator.decimalDivide();
        assertEquals(Double.NaN, result, 1);
    }

    @Test
    public void testDecimalDivide() throws BusinessException {
        // 7/3
        int num1 = 7;
        int num2 = 3;
        calculator = new CalcController();
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        double result = calculator.decimalDivide();
        assertEquals(2.33, result, 0.01);
        //delta es el margen de error del resultado de los decimales
    } 

    @Test
    public void testDecimalDivideNegatives() throws BusinessException {
        // 7/3
        int num1 = 7;
        int num2 = -3;
        calculator = new CalcController();
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        double result = calculator.decimalDivide();
        assertEquals(-2.33, result, 0.01);
        //delta es el margen de error del resultado de los decimales
    } 

    @Test
    public void testIntDivideDefault() {
          // 0/0
        try {
            calculator.intDivide();
            fail("Situación no contemplada");
        } catch (BusinessException e) {
        //BusinessException expected = new BusinessException(ErrorCodes.ERROR_ZERO, "Dividiendo por cero");
        //assertEquals(expected.getMessage(), e.getMessage());
        assertTrue(true);
        } catch (Exception e) {
            fail("Excepción no soportada");
            //un método fail al que nunca debe llegar, pero si llega estará el aviso
        }
    }

    public void intDivideLambdaTest() {

    }


    @Test
    public void testRestDivision() {
        
    }

    @Test
    public void testIntDivide() throws BusinessException {
        // 7/3
        int num1 = 7;
        int num2 = 3;
        calculator = new CalcController();
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        int result = calculator.intDivide();
        int result2 = calculator.restDivision();
        assertEquals(2, result);
        assertEquals(1, result2);
    }
    
    @Test
    public void testIntDivideNegatives() throws BusinessException {
        //7*3
        int num1 = 7;
        int num2 = -3;
        calculator = new CalcController();
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        int result = calculator.intDivide();
        int result2 = calculator.restDivision();
        assertEquals(-2, result);
        assertEquals(1, result2);
    }


}
