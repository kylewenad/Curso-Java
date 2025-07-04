package local.concept2_vc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void testCalculateFactorial() {
        
    }

    @Test
    public void testCalculateFactorial2() {
        
    }

    @Test
    public void testDecimalDivide() {
     
    } 

    @Test
    public void testIntDivide() {
          // 0/0
        try {
            calculator.intDivide();
        } catch (BusinessException e) {
        BusinessException expected = new BusinessException(ErrorCodes.ERROR_ZERO, "Dividiendo por cero");
        assertTrue(expected.equals(e));
        }
    }


    @Test
    public void testRestDivision() {
        
    }




}
