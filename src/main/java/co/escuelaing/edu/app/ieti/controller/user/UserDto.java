package co.escuelaing.edu.app.ieti.controller.user;

import java.util.*; 

public class UserDto {

    String nickname;
    
    String name;

    String lastName;

    String email;
 
    String password;

    String Latitud;

    String Longitud;


    public UserDto(String nickname,String name,String lastName,String email,String password,String latitud,String longitud){
        this.nickname=nickname;
        this.name=name;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
        this.Latitud=latitud;
        this.Longitud=longitud;
    }

    public UserDto() {
    }

    public String getLongitud() {
        return Longitud;
    }

    public String getLatitud() {
        return Latitud;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }
}