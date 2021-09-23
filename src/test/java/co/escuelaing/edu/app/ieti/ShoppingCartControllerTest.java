package co.escuelaing.edu.app.ieti;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import co.escuelaing.edu.app.ieti.controllers.shoppingCart.ShoppingCartController;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class ShoppingCartControllerTest {

    @MockBean
    private ShoppingCartController shoppingCartController;

    @LocalServerPort
    private int port;
    
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testCurrentCart(){
        ResponseEntity<String> result = this.restTemplate.getForEntity("http://localhost:"+port+"/v1/shoppingcart/currentcart", String.class);
        Assertions.assertEquals(200, result.getStatusCodeValue());
    }

    @Test
    void testCurrentValue(){
        ResponseEntity<String> result = this.restTemplate.getForEntity("http://localhost:"+port+"/v1/shoppingcart/currentvalue", String.class);
        Assertions.assertEquals(200, result.getStatusCodeValue());
    }
}
