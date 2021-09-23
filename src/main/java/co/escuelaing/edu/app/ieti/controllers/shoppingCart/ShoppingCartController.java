package co.escuelaing.edu.app.ieti.controllers.shoppingCart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.escuelaing.edu.app.ieti.repository.document.Product;
import co.escuelaing.edu.app.ieti.service.ShoppingCartService;

@RestController
@RequestMapping("v1/shoppingcart")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(@Autowired ShoppingCartService shoppingCartService){
        this.shoppingCartService= shoppingCartService;
    }

    
    @GetMapping("/currentcart")
    public ResponseEntity<List<List<Integer>>> currentCart(){
        return ResponseEntity.ok( shoppingCartService.getCart());
    }

    @GetMapping("/currentvalue")
    public ResponseEntity<Double> curretValue() {
        return ResponseEntity.ok( shoppingCartService.getTotal() );
    }
    
    @PostMapping
    public ResponseEntity<Product> addToCart(@RequestBody Product product, @RequestBody Integer quantity){
        shoppingCartService.addProduct(product, quantity);
        return ResponseEntity.ok( product );
    }

    @PutMapping
    public ResponseEntity<Product> updateCart(@RequestBody Product product, @RequestBody Integer quantity){
        shoppingCartService.updateProductQuantity(product, quantity);
        return ResponseEntity.ok( product );
    }

    @DeleteMapping
    public ResponseEntity<Product> removeFromCart(@RequestBody Product product){
        shoppingCartService.deleteFromCart(product);
        return ResponseEntity.ok( product );
    }
}
