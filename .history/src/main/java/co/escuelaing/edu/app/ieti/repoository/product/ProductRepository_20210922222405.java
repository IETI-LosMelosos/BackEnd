package co.escuelaing.edu.app.ieti.repository.product;

import co.escuelaing.edu.app.ieti.repository.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
    Optional<User> findByNickname(String nickname);

}