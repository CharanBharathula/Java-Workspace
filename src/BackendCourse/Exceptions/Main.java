package BackendCourse.Exceptions;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        try {
            validate( "Scalar Java Book" );
        } catch (InvalidBookNameException e) {
            throw new RuntimeException(e);
        }

    }

    private static void validate(String bookName) throws InvalidBookNameException {
        if( bookName.contains("Scaler Java") ){
            System.out.println("Book created!:" + bookName );
        }else{
            throw new InvalidBookNameException("Book name should contain 'Scaler Java'");
        }
    }
}
