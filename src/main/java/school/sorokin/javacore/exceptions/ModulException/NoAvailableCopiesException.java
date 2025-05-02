package school.sorokin.javacore.exceptions.ModulException;

public class NoAvailableCopiesException extends RuntimeException {
    public NoAvailableCopiesException(String massege) {
        super(massege);
    }

    public NoAvailableCopiesException(String massege, Throwable cause) {
        super(massege, cause);
    }
}
