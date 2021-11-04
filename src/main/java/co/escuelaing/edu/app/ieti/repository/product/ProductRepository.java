package co.escuelaing.edu.app.ieti.repository.product;

import co.escuelaing.edu.app.ieti.repository.product.document.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepository extends MongoRepository<Product, String> {

}