package calculator.util;

public enum ErrorMessage {
   NON_NUMERIC_INPUT("[ERROR] ");


    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
