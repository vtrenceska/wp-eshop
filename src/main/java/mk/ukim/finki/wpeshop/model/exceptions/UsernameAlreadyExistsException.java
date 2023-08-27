package mk.ukim.finki.wpeshop.model.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

public class UsernameAlreadyExistsException extends RuntimeException{

    public UsernameAlreadyExistsException(String username){
        super(String.format("User with username %s already exists.", username));
    }
}
