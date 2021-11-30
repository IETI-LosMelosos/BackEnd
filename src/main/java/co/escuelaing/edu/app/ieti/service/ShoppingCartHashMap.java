package co.escuelaing.edu.app.ieti.service;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import co.escuelaing.edu.app.ieti.repository.document.Product;

@Service
public class ShoppingCartHashMap implements ShoppingCartService {
    private HashMap<Integer,Integer> currentCart = new HashMap<>();
    private Double currentValue= 0.0;

    public ShoppingCartHashMap() {
    }

    public ShoppingCartHashMap(HashMap<Integer,Integer> currentCart, Double currentValue) {
        this.currentCart = currentCart;
        this.currentValue = currentValue;
    }

    public HashMap<Integer,Integer> getCurrentCartHashMap() {
        return this.currentCart;
    }

    public void setCurrentCart(HashMap<Integer,Integer> currentCart) {
        this.currentCart = currentCart;
    }

    public Double getCurrentValue() {
        return this.currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }

    public Product addProduct (Product product, Integer quantity){
        currentCart.put(product.getId(), quantity);
        currentValue+= product.getValue() * quantity;
        return product;
    };

    public Product updateProductQuantity (Product product, Integer quantity){
        if(currentCart.containsKey(product.getId())){
            currentValue-= product.getValue() * currentCart.get(product.getId());
            currentCart.replace(product.getId(), quantity);
            currentValue+= product.getValue() * quantity;
        }
        return product;
    };

    public Product deleteFromCart (Product product){
        if(currentCart.containsKey(product.getId())){
            currentValue-= product.getValue() * currentCart.get(product.getId());
            currentCart.remove(product.getId());
        }
        return product;
    };

    public Double getTotal(){
        return currentValue;
    };

    /**
     * Hace una lista de listas de longitud 2, en la cual la primera posicion corresponde a la llave o el id del producto
     * y la otra la cantidad de dicho producto
     * @return 
     */
    public List<List<Integer>> getCart(){
        List<List<Integer>> cart= new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: currentCart.entrySet()){
            Integer productId= entry.getKey();
            Integer quantity= entry.getValue();
            List<Integer> currentEntry= new ArrayList<>();
            currentEntry.add(productId);
            currentEntry.add(quantity);
            cart.add(currentEntry);
        }
        return cart;
    }
}
