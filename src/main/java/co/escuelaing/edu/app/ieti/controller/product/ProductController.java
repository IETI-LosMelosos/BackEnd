package co.escuelaing.edu.app.ieti.controller.product;

import co.escuelaing.edu.app.ieti.repository.product.document.Product;
import co.escuelaing.edu.app.ieti.service.product.ProductServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductServiceI productServiceI;

    public ProductController( @Autowired ProductServiceI productServiceI )
    {
        this.productServiceI = productServiceI;
    }

    @GetMapping( "/{id}" )
    public Product findById(@PathVariable String id )
    {
        return productServiceI.findById( id );
    }


    @PostMapping
    public ResponseEntity<Product> create( @RequestBody ProductDto productDto )
    {
        return ResponseEntity.ok( productServiceI.add( productDto ) );
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<Product> update( @RequestBody ProductDto productDto, @PathVariable String id )
    {
        return ResponseEntity.ok( productServiceI.update( productDto, id ) );
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        return ResponseEntity.ok( productServiceI.deleteById( id ) );
    }
    
}
