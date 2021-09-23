package co.escuelaing.edu.app.ieti.exception.Product;

public class ProductNotFoundException {
    
}
package co.escuelaing.edu.app.ieti.exception;


import co.escuelaing.edu.app.ieti.error.ErrorCodeEnum;
import co.escuelaing.edu.app.ieti.error.InternalServerErrorException;
import org.springframework.http.HttpStatus;


public class UserNotFoundException extends InternalServerErrorException {
    public UserNotFoundException() {
        super(new ServerErrorResponseDto("User not found", ErrorCodeEnum.USER_NOT_FOUND, HttpStatus.NOT_FOUND),
                HttpStatus.NOT_FOUND);
    }
}