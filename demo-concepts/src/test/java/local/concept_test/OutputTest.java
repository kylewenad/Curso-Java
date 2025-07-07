package local.concept_test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OutputTest {

    private PrintStream originalOut;
    private ByteArrayOutputStream outputStream;
    private PrintStream newOut;

    @BeforeEach
    public void setup() {
        //Guardar el output original
        originalOut = System.out;

        //Crear nuevo output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        newOut = new PrintStream(outputStream);
        //Seteamos el system out
        System.setOut(newOut);
    }
    
    @Test
    void demo () {
        
        // Código a probar
        final String TEXT = "Texto de prueba";

        System.out.println(TEXT);
        String output = outputStream.toString().trim();

        //Assert

        assertEquals(TEXT, output);

        //Restablecer output

        System.setOut(originalOut);
    }

    @AfterEach
    public void tearDown() {
            
        //Restablecer output
        System.setOut(originalOut);

    }
}




