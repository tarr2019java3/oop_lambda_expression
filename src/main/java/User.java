package main.java;

import java.time.LocalDateTime;

//klasa modelu-> determinuje strukturę danych w projekcie
public class User {
    //prywatne pola klasowe
    private String name;
    private String lastName;
    private String email;
    private String password;

    private LocalDateTime registrationData = LocalDateTime.now();

    private boolean status;
    private Role role = Role.ROLE_USER;


}
