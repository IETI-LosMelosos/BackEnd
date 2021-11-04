package co.escuelaing.edu.app.ieti.service.product;

import co.escuelaing.edu.app.ieti.controller.product.ProductDto;
import co.escuelaing.edu.app.ieti.exception.Product.ProductNotFoundException;
import co.escuelaing.edu.app.ieti.repository.product.document.Product;

import java.util.List;


public interface ProductServiceI {

    public List<Product> all();

    public Product add(ProductDto productDto );

    public Product findById( String id )  throws ProductNotFoundException;

    public Boolean deleteById( String id ) throws ProductNotFoundException;

    public Product update( ProductDto productDto, String id );
    
}


