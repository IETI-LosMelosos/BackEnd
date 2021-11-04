package co.escuelaing.edu.app.ieti.exception.Product;

import co.escuelaing.edu.app.ieti.error.ErrorCodeEnum;
import co.escuelaing.edu.app.ieti.error.InternalServerErrorException;
import co.escuelaing.edu.app.ieti.exception.ServerErrorResponseDto;
import org.springframework.http.HttpStatus;

public class ProductNotFoundException extends InternalServerErrorException {
    public ProductNotFoundException() {
        super(new ServerErrorResponseDto("User not found", ErrorCodeEnum.PRODUCT_NOT_FOUND, HttpStatus.NOT_FOUND),
                HttpStatus.NOT_FOUND);
    }
}