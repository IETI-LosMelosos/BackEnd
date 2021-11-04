package co.escuelaing.edu.app.ieti.service;

import co.escuelaing.edu.app.ieti.controller.ticket.TicketDto;
import co.escuelaing.edu.app.ieti.controller.user.UserDto;
import co.escuelaing.edu.app.ieti.exception.UserNotFoundException;
import co.escuelaing.edu.app.ieti.repository.TicketRepository;
import co.escuelaing.edu.app.ieti.repository.UserRepository;
import co.escuelaing.edu.app.ieti.repository.document.Ticket;
import co.escuelaing.edu.app.ieti.repository.document.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService implements ITicketService{

    private final TicketRepository ticketRepository;

    public TicketService(@Autowired TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket create(TicketDto ticketDto) {
        return ticketRepository.save(new Ticket(ticketDto));
    }

    @Override
    public Ticket findById(String id) {
        Optional<Ticket> optionalTicket = ticketRepository.findById(id);
        if (optionalTicket.isPresent()) {
            return optionalTicket.get();
        } else {
            throw new UserNotFoundException();
        }
    }

    @Override
    public boolean deleteById(String id) {
        if (ticketRepository.existsById(id)) {
            ticketRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
