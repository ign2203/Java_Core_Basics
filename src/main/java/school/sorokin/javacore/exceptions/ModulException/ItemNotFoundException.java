package school.sorokin.javacore.exceptions.ModulException;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(String massege) {
        super(massege);
    }

    public ItemNotFoundException(String massege, Throwable cause) {
        super(massege, cause);
    }
}
