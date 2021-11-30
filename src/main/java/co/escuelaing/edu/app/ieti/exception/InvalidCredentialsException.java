package co.escuelaing.edu.app.ieti.exception;

import co.escuelaing.edu.app.ieti.error.ErrorCodeEnum;
import co.escuelaing.edu.app.ieti.error.InternalServerErrorException;
import co.escuelaing.edu.app.ieti.exception.ServerErrorResponseDto;
import org.springframework.http.HttpStatus;

public class InvalidCredentialsException extends InternalServerErrorException
{
    public InvalidCredentialsException()
    {
        super( new ServerErrorResponseDto( "Invalid username or password", ErrorCodeEnum.INVALID_USER_CREDENTIALS,
                HttpStatus.UNAUTHORIZED ), HttpStatus.UNAUTHORIZED );
    }
}

