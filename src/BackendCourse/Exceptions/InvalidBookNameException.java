package BackendCourse.Exceptions;

public class InvalidBookNameException extends Exception {
    InvalidBookNameException( String message ){
        super(message);
    }
}
