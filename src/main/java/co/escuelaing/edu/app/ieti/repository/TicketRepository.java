package co.escuelaing.edu.app.ieti.repository;

import co.escuelaing.edu.app.ieti.repository.document.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {

}
