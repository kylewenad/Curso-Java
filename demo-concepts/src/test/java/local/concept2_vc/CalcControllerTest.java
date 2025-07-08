package local.concept2_vc;
//test para detectar los cornerCase (casos raros)

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;

public class CalcControllerTest {
    
    private CalcController calculator;
    
    @BeforeEach
    public void config(){
        calculator = new CalcController();
    }
    
    @ParameterizedTest (name = "[{index}]{0}+{1} = {2}")
    @CsvSource(value= {"0, 0, 0", "3, 3, 6"})
    @Test
    public void testAdd1(int n1, int n2, int e) {
        calculator.setNum1(n1);
        calculator.setNum2(n2);
        assertEquals(e,calculator.add());
    }

    @Test
    public void testAddDefault() {
        //0+0
        assertEquals(0,calculator.add());
        //(lo que yo espero, resultado)
    }
    
    @Test
    public void testAdd(){
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
        assertEquals(0, calculator.subtract());
    }

    @Test
    public void testSubtract() {
        //7-3
        int num1 = 7;
        int num2 = 3;
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
    public void testIntDivideDefault() {
          // 0/0
        try {
            calculator.intDivide();
            fail("Situación no contemplada");
        } catch (BusinessException e) {
            BusinessException expected = new BusinessException(ErrorCodes.ERROR_ZERO, "Dividiendo por 0");
            assertEquals(expected.getMessage(), e.getMessage());
        
        } catch (Exception e) {
            fail("Excepción no soportada");
            //un método fail al que nunca debe llegar, pero si llega estará el aviso
        }
    }
    
    @Test
    public void intDivideDefaultTest2(){
        // 0/0
        try {
            calculator.intDivide();
            fail("Situación no contemplada");
        } catch (BusinessException e){
            assertTrue(true);
        } catch (Exception e) {
            fail("Excepción no soportada");
        }
    }

    @Test
    public void testIntDivide() throws BusinessException {
        // 7/3
        int num1 = 7;
        int num2 = 3;
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
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        int result = calculator.intDivide();
        int result2 = calculator.restDivision();
        assertEquals(-2, result);
        assertEquals(1, result2);
    }

    @Test
    public void testDecimalDivideDefault() throws BusinessException {
        // 0/0
        double result = calculator.decimalDivide();
        assertEquals(Double.NaN, result, 1);
    }

    @Test
    public void testDecimalDivide() throws BusinessException {
        // 7/3
        int num1 = 7;
        int num2 = 3;
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
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        double result = calculator.decimalDivide();
        assertEquals(-2.33, result, 0.01);
        //delta es el margen de error del resultado de los decimales
    } 

    @Test
    public void testDecimalByZero() throws BusinessException {
        int num1 = 3;
        int num2 = 0;
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        double result = calculator.decimalDivide();
        assertEquals(Double.POSITIVE_INFINITY, result, 0.01);
    }

    @Test
    public void testDecimalDivideNoNanDefault(){
        // 0/0
        try {
            calculator.decimalDivideNoNan();
            fail("Situación no contemplada");
        } catch (BusinessException e) {
            assertTrue(true);
        } catch (Exception e) {
            fail("Excepción no soportada");
        }
    }
    
    @Test
    public void testDecimalDivideNoNan() throws BusinessException {
        int num1 = 5;
        int num2 = 3;
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        //double result = calculator.decimalDivideNoNan();
        assertEquals(1.66, calculator.decimalDivideNoNan(), 0.01);
    }
    
    @Test
    public void testDecimalDivideNoNanNegatives() throws BusinessException{
        int num1 = 5;
        int num2 = -3;
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        double result = calculator.decimalDivideNoNan();
        assertEquals(-1.66, result, 0.01);
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
        calculator.setNum1(num1);
        try {
            calculator.calculateFactorial();
            fail("Situación no contemplada");
        } catch (BusinessException e) {
            assertTrue(e.getMessage().contains(ErrorCodes.ERROR_NEGATIVE.toString()));
        }
    }

    @Test
    public void testCalculateFactorialNegativesLAmbda() {
        // -3
        int num1 = -3;
        calculator.setNum1(num1);
        
        assertThrows(BusinessException.class,
            () -> {
            calculator.calculateFactorial();
        });
    }//método lambda () -> {}

    @Test
    public void testCalculateFactorialBigger20() {
        int num1 = 23;
        calculator.setNum1(num1);
        try {
            calculator.calculateFactorial();
            fail("Situación no contemplada");
        } catch (BusinessException e) {
            assertTrue(e.getMessage().contains(ErrorCodes.ERROR_BIGGER_20.toString()));
        }
        
    }

    @Test
    public void testCalculateFactorialBigger20Lambda() {
        int num1 = 23;
        calculator.setNum1(num1);
        
        assertThrows(BusinessException.class,
            () -> calculator.calculateFactorial());
    }

    @ParameterizedTest(name = "[{index}]{0}^{1} = {2}")
    @CsvSource(value = {"2, 2, 4", "3, 2, 9", "3, 5, 243", "-3, 3, -27"}) //formato csv para pasar datos entre datos por ejemplo entre tablas
    public void testPow1(int n1, int n2, int e) throws BusinessException {
        calculator.setNum1(n1);
        calculator.setNum2(n2);
        assertEquals(e, calculator.pow());
    }     

    @Test
    public void testPowNegativeNum2() throws BusinessException{
        //3^(-3) = ?? Error
        int num1 = 3;
        int num2 = -3;
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        assertThrows(BusinessException.class, () -> calculator.pow());
    }
}
