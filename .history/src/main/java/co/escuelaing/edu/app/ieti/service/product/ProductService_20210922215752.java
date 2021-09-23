package co.escuelaing.edu.app.ieti.service.product;

public interface ProductService {

    pub
    
}


public interface UserService {

    public User create( UserDto userDto );

    public User findById( String id )  throws UserNotFoundException;

    public User findByEmail( String email ) throws UserNotFoundException;

    public User findByNickname(String nickname) throws UserNotFoundException;

    public List<User> all();

    public boolean deleteById( String id );

    public User update( UserDto userDto, String id );
    
}  