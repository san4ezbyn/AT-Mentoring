package exceptions;

public class MyFileNotFoundException extends Exception {
    public MyFileNotFoundException(String message) {
        super(message);
    }
}
