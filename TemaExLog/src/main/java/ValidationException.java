public class ValidationException extends Exception {
    private String erorr;

    public ValidationException(String message) {
        super(message);
        erorr = "Erorr: ";
    }

    public String getErorr() {
        return erorr;
    }
}
