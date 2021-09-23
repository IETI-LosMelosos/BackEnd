package co.escuelaing.edu.app.ieti.service.product;

import co.escuelaing.edu.app.ieti.controller.product.ProductDto;
import co.escuelaing.edu.app.ieti.exception.Product.ProductNotFoundException;
import co.escuelaing.edu.app.ieti.repository.product.document.Product;


public interface ProductServiceI {

    public Product add(ProductDto productDto );

    public Product findById( String id )  throws ProductNotFoundException;

    public Boolean deleteById( String id ) throws ProductNotFoundException;

    public Product update( ProductDto productDto, String id );
    
}


