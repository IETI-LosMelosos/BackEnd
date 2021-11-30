package co.escuelaing.edu.app.ieti.controller.product;

import co.escuelaing.edu.app.ieti.repository.document.User;
import co.escuelaing.edu.app.ieti.repository.product.document.Product;
import co.escuelaing.edu.app.ieti.service.product.ProductServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/v1/product")
public class ProductController {

    private final ProductServiceI productServiceI;

    public ProductController( @Autowired ProductServiceI productServiceI )
    {
        this.productServiceI = productServiceI;
    }

    @GetMapping
    public List<Product> all()
    {
        return productServiceI.all();
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
