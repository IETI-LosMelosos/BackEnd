package co.escuelaing.edu.app.ieti.repository.product;

import co.escuelaing.edu.app.ieti.repository.document.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, String> {

}