package co.escuelaing.edu.app.ieti.service.product;

import co.escuelaing.edu.app.ieti.controller.product.ProductDto;
import co.escuelaing.edu.app.ieti.exception.Pro;
import co.escuelaing.edu.app.ieti.repository.UserRepository;
import co.escuelaing.edu.app.ieti.repository.document.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceMongoDB implements UserService {

    private final UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(UserDto userDto) {
        return userRepository.save(new User(userDto));
    }

    @Override
    public User findById(String id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            throw new UserNotFoundException();
        }
    }

    @Override
    public User findByEmail(String email) throws UserNotFoundException {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            throw new UserNotFoundException();
        }
    }

    @Override
    public User findByNickname(String nickname) throws UserNotFoundException {
        Optional<User> optionalUser = userRepository.findByNickname(nickname);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            throw new UserNotFoundException();
        }
    }

    @Override
    public List<User> all() {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteById(String id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public User update(UserDto userDto, String id) {
        if (userRepository.findById(id).isPresent()) {
            User user = userRepository.findById(id).get();
            user.update(userDto);
            userRepository.save(user);
            return user;
        }
        return null;
    }
    // TODO uncomment this line
    // Location by coor (latitud, longitud)

}