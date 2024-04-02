package TicTacToe.Exception;

public class InvalidPlayerSizeException extends RuntimeException{
    public InvalidPlayerSizeException() {
    }

    public InvalidPlayerSizeException(String message) {
        super(message);
    }

    public InvalidPlayerSizeException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public InvalidPlayerSizeException(java.lang.Throwable cause) {
        super(cause);
    }

    public InvalidPlayerSizeException(String message, java.lang.Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
