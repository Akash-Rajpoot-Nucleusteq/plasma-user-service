package in.nucleusteq.plasma.exception;

public class InvalidCredentialsException extends Exception{
    /**
     * serial id.
     */
    private static final long serialVersionUID = -7556398392266114494L;

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
