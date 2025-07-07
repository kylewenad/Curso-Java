package local.concept_test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputTest {

    private InputStream originalIn;

    @BeforeEach
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

    @AfterEach
    void tearDown() {
        //Recumperamos el System.in original
        System.setIn(originalIn);
    }

    
}
