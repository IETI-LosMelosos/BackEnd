package co.escuelaing.edu.app.ieti.exception.Product;

import co.escuelaing.edu.app.ieti.error.ErrorCodeEnum;
import co.escuelaing.edu.app.ieti.error.InternalServerErrorException;
import org.springframework.http.HttpStatus;

public class ProductNotFoundException extends InternalServerErrorException {
    public UserNotFoundException() {
        super(new ServerErrorResponseDto("User not found", ErrorCodeEnum.PRODUCT_NOT_FOUND, HttpStatus.NOT_FOUND),
                HttpStatus.NOT_FOUND);
    }
}