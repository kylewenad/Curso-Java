package local.concept2_vc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;
//Inyección de dependencias
public class CalcViewTest {
    
    private CalcController ctrlMock;
    private CalcView view;
    private PrintStream originalOut;
    private InputStream originalIn;
    private PrintStream newOut;
    private ByteArrayInputStream inputStream;
    private ByteArrayOutputStream outputStream;
    private String userInput;

    @BeforeEach
    void setup(){
    
        ctrlMock = Mockito.mock(CalcController.class);
        view = new CalcView(ctrlMock);

        //Guardas el input original
        originalIn = System.in;
        //Guardar el output original
        originalOut = System.out;

        //Creamos un ByteArrayInputStream a partir de un str
        inputStream = new ByteArrayInputStream(userInput.getBytes());
        
        //Crear nuevo output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        newOut = new PrintStream(outputStream);
        //Seteamos el system out
        System.setOut(newOut);
    }
    
    @Test
    void testShow() {
        
    }

    @Test
    void testAdd(){
        
        ctrlMock.setNum1(3);
        ctrlMock.setNum2(5);

        Mockito.when(ctrlMock.add()).thenReturn(8);

        //Creamos el String que escribiría el usuario
        String userInput = "3";

        //Creamos un ByteArrayInputStream a partir de un str
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        //se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show();
        } catch (Exception e) {
            // handle exception for exit while in the code
        }
    
        //verify that the controller's add method was called
        Mockito.verify(ctrlMock).add();

        //verify terminal output
        String output = outputStream.toString().trim();
        assert output.contains("El resultado de la suma es 8") : "Output did no contain expected";

        
        // Comparamos userInput
    }

     @Test
    void testSubtraction(){
        
        ctrlMock.setNum1(5);
        ctrlMock.setNum2(3);

        Mockito.when(ctrlMock.subtract()).thenReturn(2);

        //Creamos el String que escribiría el usuario
        String userInput = "4";

        //Creamos un ByteArrayInputStream a partir de un str
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        //se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show();
        } catch (Exception e) {
            // handle exception for exit while in the code
        }
    
        //verify that the controller's add method was called
        Mockito.verify(ctrlMock).subtract();
        
        //verify terminal output
        String output = outputStream.toString().trim();
        assert output.contains("El resultado de la resta es 2") : "Output did no contain expected";


        // Comparamos userInput
    }

      @Test
    void testFactorial() throws BusinessException{
        
        ctrlMock.setNum1(5);
        view = new CalcView(ctrlMock);

        Mockito.when(ctrlMock.calculateFactorial()).thenReturn((120l));
        //hacemos un casting long añadiendo una l al resultado de return

        //Creamos el String que escribiría el usuario
        String userInput = "9";

        //Creamos un ByteArrayInputStream a partir de un str
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        //se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show();
        } catch (Exception e) {
            // handle exception for exit while in the code
        }
    
        //verify that the controller's add method was called
        Mockito.verify(ctrlMock).calculateFactorial();
        
        //verify terminal output
        String output = outputStream.toString().trim();
        assert output.contains("El factorial de 5 es 120") : "Output did no contain expected";
    }

     @Test
    void testFactorialNegatives() throws BusinessException{
        
        ctrlMock.setNum1(-5);
        view = new CalcView(ctrlMock);

        Mockito.when(ctrlMock.calculateFactorial()).thenThrow(new BusinessException(ErrorCodes.ERROR_NEGATIVE, "Error"));
        
        //Creamos el String que escribiría el usuario
        String userInput = "9";

        //Creamos un ByteArrayInputStream a partir de un str
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        //se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show();
        } catch (Exception e) {
            // handle exception for exit while in the code
        }
    
        //verify that the controller's add method was called
        Mockito.verify(ctrlMock).calculateFactorial();
        
        //verify terminal output
        String output = outputStream.toString().trim();
        assert output.contains(ErrorCodes.ERROR_NEGATIVE.toString()) : "Output did no contain expected";
    
    }

     @Test
    void testFactorialBigger20() throws BusinessException{
        
        ctrlMock.setNum1(25);
        view = new CalcView(ctrlMock);

        Mockito.when(ctrlMock.calculateFactorial()).thenThrow(new BusinessException(ErrorCodes.ERROR_BIGGER_20, "Error"));
        
        //Creamos el String que escribiría el usuario
        String userInput = "9";

        //Creamos un ByteArrayInputStream a partir de un str
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        //se lo pasamos a System.in
        System.setIn(inputStream);

        try {
            view.show();
        } catch (Exception e) {
            // handle exception for exit while in the code
        }
    
        //verify that the controller's add method was called
        Mockito.verify(ctrlMock).calculateFactorial();
        
        //verify terminal output
        String output = outputStream.toString().trim();
        assert output.contains(ErrorCodes.ERROR_BIGGER_20.toString()) : "Output did no contain expected";
    
    }

}
