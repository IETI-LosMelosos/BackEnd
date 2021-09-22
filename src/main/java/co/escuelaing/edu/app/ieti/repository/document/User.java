package co.escuelaing.edu.app.ieti.repository.document;

import co.escuelaing.edu.app.ieti.controller.user.UserDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Document(collection="users")
public class User {

    @Id
    String id;

    String name;

    String lastName;

    @Indexed(unique = true)
    String email;

    String passwordHash;

    List<RoleEnum> roles;

    Date createdAt;

    String longitud;

    String latitud;

    String nickname;

    public User() {
    }

    public User(UserDto userDto) {
        name = userDto.getName();
        lastName = userDto.getLastName();
        email = userDto.getEmail();
        longitud = userDto.getLongitud();
        latitud = userDto.getLatitud();
        nickname = userDto.getNickname();
        createdAt = new Date();
        roles = new ArrayList<>(Collections.singleton(RoleEnum.USER));
        // TODO uncomment this line
        // passwordHash = BCrypt.hashpw( userDto.getPassword(), BCrypt.gensalt() );
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public List<RoleEnum> getRoles() {
        return roles;
    }

    public String getNickname(){
        return nickname;
    }
    public String getLongitud(){
        return longitud;
    }
    public String getLatitud(){
        return latitud;
    }

    public void update(UserDto userDto) {
        this.name = userDto.getName();
        this.lastName = userDto.getLastName();
        this.email = userDto.getEmail();
        this.nickname = userDto.getNickname();
        this.longitud = userDto.getLongitud();
        this.latitud = userDto.getLatitud();
        // TODO uncomment these lines
        /*
         * if ( userDto.getPassword() != null ) { this.passwordHash = BCrypt.hashpw(
         * userDto.getPassword(), BCrypt.gensalt() ); }
         */
    }
}
