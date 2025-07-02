package src.main.java.local.exceptions;

public class ErrorCode {
    ERROR_EVEN("No se admiten números pares"), 
    ERROR_NEGATIVE("No se admiten números negativos"),
    ERROR_ZERO("No se puedo dividir por cero");

    String message;

    ErrorCodes(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
