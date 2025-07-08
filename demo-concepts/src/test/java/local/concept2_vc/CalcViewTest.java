package local.concept2_vc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;
//Inyección de dependencias
public class CalcViewTest {
    
    private PrintStream originalOut;
    private ByteArrayOutputStream outputStream;
    private InputStream originalIn;
    private CalcView view;
    private CalcController ctrlMock;

    @BeforeEach
    public void setup(){
    
        ctrlMock = Mockito.mock(CalcController.class);
        view = new CalcView(ctrlMock);

        //Guardar el input original
        originalIn = System.in;
        //Guardar el output original
        originalOut = System.out;

        //Crear nuevo output
        outputStream = new ByteArrayOutputStream();
        PrintStream newOut = new PrintStream(outputStream);
        
        //Seteamos el system out
        System.setOut(newOut);
    }
    
    @Test
    void testAdd(){
        
        ctrlMock.setNum1(3);
        ctrlMock.setNum2(5);

        Mockito.when(ctrlMock.add()).thenReturn(8);

        //Creamos el String de lo que respondería el usuario al ofrecerle las opciones, en este caso la suma.
        String userInput = "3";

        //Creamos un ByteArrayInputStream a partir de un string
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        //se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show();
        } catch (NoSuchElementException e) {
            // handle exception for exit while in the code
        }
    
        //verify that the controller's add method was called
        Mockito.verify(ctrlMock).add();

        //verify terminal output
        String output = outputStream.toString().trim();
        assert output.contains("El resultado de la suma es 8") : "Output did no contain expected";
    }

     @Test
    void testSubtraction(){
        
        ctrlMock.setNum1(5);
        ctrlMock.setNum2(3);

        Mockito.when(ctrlMock.subtract()).thenReturn(2);

        //String que escribiría el usuario para que muestre una resta.
        String userInput = "4";

        //Creamos un ByteArrayInputStream a partir de un str
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        //se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show();
        } catch (NoSuchElementException e) {
            // handle exception for exit while in the code
        }
    
        //verify that the controller's add method was called
        Mockito.verify(ctrlMock).subtract();
        
        //verify terminal output
        String output = outputStream.toString().trim();
        assert output.contains("El resultado de la resta es 2") : "Output did no contain expected";
    }

      @Test
    void testFactorial() throws BusinessException{
        
        ctrlMock.setNum1(5);
        view = new CalcView(ctrlMock);

        Mockito.when(ctrlMock.calculateFactorial((byte)1)).thenReturn((120l));
        //hacemos un casting long añadiendo una l al resultado

        //String que escribiría el usuario para hacer un factorial.
        String userInput = "3";

        //Creamos un ByteArrayInputStream a partir de un str
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        //se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show(true);
        } catch (NoSuchElementException e) {
            // handle exception for exit while in the code
        }
    
        //verify that the controller's add method was called
        Mockito.verify(ctrlMock).calculateFactorial((byte)1);
        
        //verify terminal output
        String output = outputStream.toString().trim();
        assert output.contains("El factorial de 0 es 120") : "Output did no contain expected";
    }

     @Test
    void testFactorialNegatives() throws BusinessException{
        
        ctrlMock.setNum1(-5);
        view = new CalcView(ctrlMock);

        Mockito.when(ctrlMock.calculateFactorial((byte)1)).thenThrow(new BusinessException(ErrorCodes.ERROR_NEGATIVE, "Error"));
        
        //Creamos el String que escribiría el usuario
        String userInput = "9";

        //Creamos un ByteArrayInputStream a partir de un str
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        //se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show(true);
        } catch (NoSuchElementException e) {
            // handle exception for exit while in the code
        }
    
        //verify that the controller's add method was called
        Mockito.verify(ctrlMock).calculateFactorial((byte)1);
        
        //verify terminal output
        String output = outputStream.toString().trim();
        assert output.contains(ErrorCodes.ERROR_NEGATIVE.toString()) : "Output did no contain expected";
    }

     @Test
    void testFactorialBigger20() throws BusinessException{
        
        ctrlMock.setNum1(25);
        view = new CalcView(ctrlMock);

        Mockito.when(ctrlMock.calculateFactorial((byte)2)).thenThrow(new BusinessException(ErrorCodes.ERROR_BIGGER_20, "Error"));
        
        //Creamos el String que escribiría el usuario
        String userInput = "4";

        //Creamos un ByteArrayInputStream a partir de un str
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        //se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show(true);
        } catch (NoSuchElementException e) {
            // handle exception for exit while in the code
        }
    
        //verify that the controller's add method was called
        Mockito.verify(ctrlMock).calculateFactorial((byte)2);
        
        //verify terminal output
        String output = outputStream.toString().trim();
        assert output.contains(ErrorCodes.ERROR_BIGGER_20.toString()) : "Output did no contain expected";
    }

    @AfterEach
    public void tearDown() {
        //Restablecer el input original
        System.setIn(originalIn);
        //Restablecer el output original
        System.setOut(originalOut);
    }
}
