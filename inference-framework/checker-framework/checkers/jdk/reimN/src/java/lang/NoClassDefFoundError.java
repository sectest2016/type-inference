package java.lang;
import checkers.inference2.reimN.quals.*;

public class NoClassDefFoundError extends LinkageError {
    private static final long serialVersionUID = 9095859863287012458L;

    public NoClassDefFoundError() {
        throw new RuntimeException("skeleton method");
    }

    public NoClassDefFoundError(String s) {
        throw new RuntimeException("skeleton method");
    }
}
