package co.escuelaing.edu.app.ieti.repository.product.document;

import co.escuelaing.edu.app.ieti.controller.product.ProductDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

    @Id
    String id;
    String name;
    String image;
    String price;
    String description;
    String producedBy;
    String city;
    String img_presentation;
    String presentation;
    String phone;
    Integer stock;

    public Product(){

    }

    public Product(ProductDto productDto) {
        name = productDto.getName();
        image = productDto.getImage();
        price = productDto.getPrice();
        description = productDto.getDescription();
        producedBy = productDto.getProducedBy();
        city = productDto.getCity();
        img_presentation = productDto.getImg_presentation();
        presentation = productDto.getPresentation();
        phone = productDto.getPhone();
        stock = productDto.getStock();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public void setProducedBy(String producedBy) {
        this.producedBy = producedBy;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImg_presentation() {
        return img_presentation;
    }

    public void setImg_presentation(String img_presentation) {
        this.img_presentation = img_presentation;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void update(ProductDto productDto) {
        this.name = productDto.getName();
        this.image = productDto.getImage();
        this.price = productDto.getPrice();
        this.description = productDto.getDescription();
        this.producedBy = productDto.getProducedBy();
        this.city = productDto.getCity();
        this.img_presentation = productDto.getImg_presentation();
        this.presentation = productDto.getPresentation();
        this.phone = productDto.getPhone();
        this.stock = productDto.getStock();
    }


}
