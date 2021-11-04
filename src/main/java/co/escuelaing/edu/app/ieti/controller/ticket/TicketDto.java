package co.escuelaing.edu.app.ieti.controller.ticket;

import co.escuelaing.edu.app.ieti.repository.document.Product;

import java.util.*;

public class TicketDto {
    int userId;
    List<String> products;
    int total;
    String bank;

    public TicketDto(){
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
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
