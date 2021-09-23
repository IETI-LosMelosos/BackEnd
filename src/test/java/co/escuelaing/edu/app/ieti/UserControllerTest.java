package co.escuelaing.edu.app.ieti;


import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import co.escuelaing.edu.app.ieti.controller.user.UserDto;
import co.escuelaing.edu.app.ieti.repository.UserRepository;
import co.escuelaing.edu.app.ieti.repository.document.User;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class UserControllerTest {  

    @MockBean
    private UserRepository userRepository;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testCreateUser(){
        UserDto userDto = new UserDto("usuarioPrueba","prueba","apellido","pp@mail.com","1234","121212","31231");
        ResponseEntity<User> result= this.restTemplate.postForEntity("http://localhost:"+port+"/v1/user",userDto,User.class);
        Assertions.assertEquals(200, result.getStatusCodeValue());
    }

    @Test
    void testGetUserNotExists(){
        ResponseEntity<User> resultGet = this.restTemplate.getForEntity("http://localhost:"+port+"/v1/user/123123", User.class);
        Assertions.assertEquals(500, resultGet.getStatusCodeValue());
    }
}
