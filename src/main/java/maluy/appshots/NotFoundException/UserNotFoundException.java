package maluy.appshots.NotFoundException;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
    super("Could not found product with" + id);

}

}
