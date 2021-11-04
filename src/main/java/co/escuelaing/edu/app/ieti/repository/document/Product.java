package co.escuelaing.edu.app.ieti.repository.document;

public class Product {
    Integer id;
    Double value;


    public Product() {
    }

    public Product(Integer id, Double value) {
        this.id = id;
        this.value = value;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
}
