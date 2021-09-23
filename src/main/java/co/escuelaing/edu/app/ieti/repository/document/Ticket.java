package co.escuelaing.edu.app.ieti.repository.document;

import co.escuelaing.edu.app.ieti.controller.ticket.TicketDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document(collection="tickets")
public class Ticket{

    @Id
    String id;

    int userId;

    List<String>  products;

    int total;

    String bank;

    public Ticket (){

    }

    public Ticket(TicketDto ticketDto) {
        this.userId = ticketDto.getUserId();
        this.products = ticketDto.getProducts();
        this.total = ticketDto.getTotal();
        this.bank = ticketDto.getBank();
    }

    public String getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<String>  getProducts() {
        return products;
    }

    public void setProducts(List<String>  products) {
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
