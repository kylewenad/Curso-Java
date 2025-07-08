package local.concept2_vc;
//test para detectar los cornerCase (casos raros)
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
    @CsvSource(value= {"0, 0, 0", "3, 3, 6", "-5, 7, 2", "-10, 5, -5"})
    // 0+0=0, 3+3=6, -5+7=2, -10+5=-5
    public void testAdd(int n1, int n2, int e){
        calculator.setNum1(n1);
        calculator.setNum2(n2);
        assertEquals(e,calculator.add());
    }

    @ParameterizedTest (name = "[{index}]{0}-{1} = {2}")
    @CsvSource(value= {"0, 0, 0", "3, 3, 0", "-5, 7, -12", "-10, 5, -15"})
    // 0-0=0, 3-3=0, -5-7=-12, -10-5=-15
    public void testSubtract(int n1, int n2, int e){
        calculator.setNum1(n1);
        calculator.setNum2(n2);
        assertEquals(e,calculator.subtract());
    }

    @ParameterizedTest (name = "[{index}]{0}*{1} = {2}")
    @CsvSource(value= {"0, 0, 0", "3, 3, 9", "-5, 7, -35", "10, -5, -50"})
    // 0*0=0, 3*3=9, -5*7=-35, 10*-5=-50
    public void testMultiply(int n1, int n2, int e){
        calculator.setNum1(n1);
        calculator.setNum2(n2);
        assertEquals(e,calculator.multiply());
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

    @ParameterizedTest (name = "[{index}]{0}/{1} = {2}")
    @CsvSource(value= {"3, 3, 1", "-50, 5, -10", "10, -5, -2"})
    // 3/3=1, -50/5=-10, 10/-5=-2
    public void testIntDivide(int n1, int n2, int e) throws BusinessException{
        calculator.setNum1(n1);
        calculator.setNum2(n2);
        assertEquals(e,calculator.intDivide());
    }

    @Test
    public void testDecimalDivideDefault() throws BusinessException {
        // 0/0
        double result = calculator.decimalDivide();
        assertEquals(Double.NaN, result, 1);
    }

    @ParameterizedTest (name = "[{index}]{0}/{1} = {2}")
    @CsvSource(value= {"7, 3, 2.33", "-7, 3, -2.33"})
    // 7/3=2.33, -50/5=-10, 10/-5=-2
    public void testDecimalDivide(int n1, int n2, double e) throws BusinessException{
        calculator.setNum1(n1);
        calculator.setNum2(n2);
        assertEquals(e,calculator.decimalDivide(),0.01);
    }
    
    @Test
    public void testDecimalByZero() throws BusinessException {
        int num1 = 3;
        int num2 = 0;
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        double result = calculator.decimalDivide();
        assertEquals(Double.POSITIVE_INFINITY, result, 0.01);//delta es el margen de error del resultado de los decimales
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

    @ParameterizedTest (name = "[{index}]{0}/{1} = {2}")
    @CsvSource(value= {"5, 3, 1.66", "5, -3, -1.66"})
    // 7/3=2.33, -50/5=-10, 10/-5=-2
    public void testDecimalDivideNoNan(int n1, int n2, double e) throws BusinessException{
        calculator.setNum1(n1);
        calculator.setNum2(n2);
        assertEquals(e,calculator.decimalDivideNoNan(),0.01);
    }

    @ParameterizedTest (name = "[{index}]{0} = {1}")
    @CsvSource(value= {"0, 1", "5, 120"})
    // 0=1, 5=120
    public void testCalculateFactorial(int n1, int e) throws BusinessException{
        calculator.setNum1(n1);
        assertEquals(e, calculator.calculateFactorial());
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
