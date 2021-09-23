package co.escuelaing.edu.app.ieti.repository.product.document;

import co.escuelaing.edu.app.ieti.controller.product.ProductDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

    @Id
    String id;

    String nombre;

    String descripcion;

    Integer existencias;

    Double precioUnitario;

    public Product(){

    }

    public Product(ProductDto productDto) {
        nombre = productDto.getNombre();
        descripcion = productDto.getDescripcion();
        existencias = productDto.getExistencias();
        precioUnitario = productDto.getPrecioUnitario();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getExistencias() {
        return existencias;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void update(ProductDto productDto) {
        this.nombre = productDto.getNombre();
        this.descripcion = productDto.getDescripcion();
        this.existencias = productDto.getExistencias();
        this.precioUnitario = productDto.getPrecioUnitario();
    }


}
