package local.concept_test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class InputTest {

    private InputStream originalIn;

    @BeforeClass
    void setup(){
        originalIn = System.in;
    }
    
    
    @Test
    void demo () {

        //Creamos el String que escribiría el usuario
        String userInput = "This is a test for console input.";

        //Creamos un ByteArrayInputStream a partir de un str
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());

        //se lo pasamos a System.in
        System.setIn(inputStream);

        // Comparamos userInput

    }

    @AfterClass
    void tearDown() {
        //Recuperamos el System.in original
        System.setIn(originalIn);
    }

    public String simulateScanner() {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Ingresa tu nombre: ");;
            return scanner.nextLine();
        }
    }

    
}
