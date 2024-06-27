package maluy.appshots.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import maluy.appshots.NotFoundException.UserNotFoundException;

@RestController
public class UserExceptionHandler {
    
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String UserNotFoudHandler(UserNotFoundException e){
        return e.getMessage();
    }

}
