package co.escuelaing.edu.app.ieti.service.product;

import co.escuelaing.edu.app.ieti.repoository.product.document.Product;

public interface ProductService {

    public Product create( UserDto userDto );

    public Product findById( String id )  throws UserNotFoundException;

    public Product findByEmail( String email ) throws UserNotFoundException;

    public Product findByNickname(String nickname) throws UserNotFoundException;

    public Product<User> all();

    public boolean deleteById( String id );

    public User update( UserDto userDto, String id );
    
}


