package co.escuelaing.edu.app.ieti.service;

import co.escuelaing.edu.app.ieti.controller.user.*;
import co.escuelaing.edu.app.ieti.exception.UserNotFoundException;
import co.escuelaing.edu.app.ieti.repository.document.User;

import java.util.List;

public interface UserService {

    public User create( UserDto userDto );

    public User findById( String id )  throws UserNotFoundException;

    public User findByEmail( String email ) throws UserNotFoundException;

    public User findByNickname(String nickname) throws UserNotFoundException;

    public List<User> all();

    public boolean deleteById( String id );

    public User update( UserDto userDto, String id );
    
}  