package co.escuelaing.edu.app.ieti;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import co.escuelaing.edu.app.ieti.controller.ticket.TicketDto;
import co.escuelaing.edu.app.ieti.repository.document.Ticket;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class TicketControllerTest {
    
    @MockBean
    private TicketControllerTest ticketControllerTest;

    @LocalServerPort
    private int port;
    
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testGetByIdNotExists(){
        ResponseEntity<String> result = this.restTemplate.getForEntity("http://localhost:"+port+"/v1/ticket/123123123", String.class);
        Assertions.assertEquals(500, result.getStatusCodeValue());
    }

    @Test
    void testCreate(){
        TicketDto data = new TicketDto(123123,123123,"Bank");
        ResponseEntity<String> result = this.restTemplate.postForEntity("http://localhost:"+port+"/v1/ticket",data,String.class);
        Assertions.assertEquals(415, result.getStatusCodeValue());
    }
}
