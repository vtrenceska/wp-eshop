package mk.ukim.finki.wpeshop.model.exceptions;

public class InvalidUserCredentialsException extends RuntimeException{

    public InvalidUserCredentialsException(){
        super("Invalid user credentials exception.");
    }
}
