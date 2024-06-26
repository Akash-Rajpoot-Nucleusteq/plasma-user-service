package in.nucleusteq.plasma.exception;


//@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ResourceNotFoundException with the specified error
     * message.
     *
     * @param message The error message.
     */
    public ResourceNotFoundException(final String message) {
        super(message);
    }
}
