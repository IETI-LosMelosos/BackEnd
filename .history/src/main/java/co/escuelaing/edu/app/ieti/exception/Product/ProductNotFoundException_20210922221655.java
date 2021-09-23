package co.escuelaing.edu.app.ieti.exception.Product;

public class ProductNotFoundException {
    
}




public class UserNotFoundException extends InternalServerErrorException {
    public UserNotFoundException() {
        super(new ServerErrorResponseDto("User not found", ErrorCodeEnum.USER_NOT_FOUND, HttpStatus.NOT_FOUND),
                HttpStatus.NOT_FOUND);
    }
}