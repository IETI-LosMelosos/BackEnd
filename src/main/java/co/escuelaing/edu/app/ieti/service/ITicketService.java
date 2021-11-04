package co.escuelaing.edu.app.ieti.service;

import co.escuelaing.edu.app.ieti.controller.ticket.TicketDto;
import co.escuelaing.edu.app.ieti.repository.document.Product;
import co.escuelaing.edu.app.ieti.repository.document.Ticket;

import java.util.HashMap;

public interface ITicketService {

    public Ticket create (TicketDto ticketDto);

    public boolean deleteById (String id);

    public Ticket findById(String id);

}
