package week10.stack;

public class StackOverflowException extends RuntimeException {
    public StackOverflowException(String message) {
        super(message);
    }
}