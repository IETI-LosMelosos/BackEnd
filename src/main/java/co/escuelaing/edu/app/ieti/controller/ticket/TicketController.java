package co.escuelaing.edu.app.ieti.controller.ticket;

import co.escuelaing.edu.app.ieti.repository.document.Ticket;
import co.escuelaing.edu.app.ieti.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping( "/v1/ticket" )
public class TicketController {

    private final TicketService ticketService;

    public TicketController(@Autowired TicketService ticketService)
    {
        this.ticketService = ticketService;

    }

    @GetMapping( "/{id}" )
    public Ticket findById(@PathVariable String id )
    {
        return ticketService.findById( id );
    }


    @PostMapping
    public ResponseEntity<Ticket> create(@RequestBody TicketDto ticketDto )
    {
        return ResponseEntity.ok( ticketService.create( ticketDto ) );
    }

    @RolesAllowed("Admin")
    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        return ResponseEntity.ok( ticketService.deleteById( id ) );
    }

}

