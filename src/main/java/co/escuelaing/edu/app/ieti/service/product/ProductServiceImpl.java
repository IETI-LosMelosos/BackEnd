package co.escuelaing.edu.app.ieti.service.product;

import co.escuelaing.edu.app.ieti.controller.product.ProductDto;
import co.escuelaing.edu.app.ieti.exception.Product.ProductNotFoundException;
import co.escuelaing.edu.app.ieti.repository.document.User;
import co.escuelaing.edu.app.ieti.repository.product.document.Product;
import co.escuelaing.edu.app.ieti.repository.product.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductServiceImpl implements ProductServiceI {

    private final ProductRepository productRepository;

    public ProductServiceImpl(@Autowired ProductRepository productrepository) {
        this.productRepository = productrepository;
    }

    @Override
    public List<Product> all() {
        return productRepository.findAll();
    }

    @Override
    public Product add(ProductDto productDto) {
        return productRepository.save(new Product(productDto));
    }

    @Override
    public Product findById(String id) throws ProductNotFoundException {
        Optional<Product> oProduct = productRepository.findById(id);
        if (oProduct.isPresent()) {
            return oProduct.get();
        } else {
            throw new ProductNotFoundException();
        }
    }

    @Override
    public Boolean deleteById(String id) throws ProductNotFoundException {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Product update(ProductDto productDto, String id) {
        if (productRepository.findById(id).isPresent()) {
            Product product = productRepository.findById(id).get();
            product.update(productDto);
            productRepository.save(product);
            return product;
        }
        return null;
    }
}