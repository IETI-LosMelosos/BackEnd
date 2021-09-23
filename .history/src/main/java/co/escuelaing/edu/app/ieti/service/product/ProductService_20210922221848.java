package co.escuelaing.edu.app.ieti.service.product;

import co.escuelaing.edu.app.ieti.controller.product.*;
import co.escuelaing.edu.app.ieti.repository.document.product.*;
import co.escuelaing.edu.app.ieti.exception.Product.*;

public interface ProductService {

    public Product add( ProductDto productDto );

    public Product findProductById( String id )  throws ProductNotFoundException;

    public Product findByEmail( String email ) throws UserNotFoundException;

    public Product findByNickname(String nickname) throws UserNotFoundException;

    public Product deleteById( String id );

    public Product update( UserDto userDto, String id );
    
}


