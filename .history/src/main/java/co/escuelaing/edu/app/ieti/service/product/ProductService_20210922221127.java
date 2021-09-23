package co.escuelaing.edu.app.ieti.service.product;

import co.escuelaing.edu.app.ieti.controller.product.*;
import co.escuelaing.edu.app.ieti.repository.document.product;

public interface ProductService {

    public Product add( Pro);

    public Product findById( String id )  throws UserNotFoundException;

    public Product findByEmail( String email ) throws UserNotFoundException;

    public Product findByNickname(String nickname) throws UserNotFoundException;

    public Product deleteById( String id );

    public Product update( UserDto userDto, String id );
    
}


