package co.escuelaing.edu.app.ieti.service;

import java.util.List;

import co.escuelaing.edu.app.ieti.repository.document.Product;

public interface ShoppingCartService {
    Product addProduct (Product product, Integer quantity);

    Product updateProductQuantity (Product product, Integer quantity);

    Product deleteFromCart (Product product);

    Double getTotal();

    List<List<Integer>> getCart();
}
