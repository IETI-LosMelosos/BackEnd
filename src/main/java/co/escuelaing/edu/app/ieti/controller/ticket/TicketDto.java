package co.escuelaing.edu.app.ieti.controller.ticket;

import co.escuelaing.edu.app.ieti.repository.document.Product;

import java.util.HashMap;

public class TicketDto {
    int userId;
    HashMap<Product, String> products;
    int total;
    String bank;

    public TicketDto(int userId,int total,String bank){
        this.userId=userId;
        this.total=total;
        this.bank=bank;
    }

    public TicketDto(){
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public HashMap<Product, String> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Product, String> products) {
        this.products = products;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
