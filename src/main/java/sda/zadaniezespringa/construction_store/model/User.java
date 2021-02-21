package sda.zadaniezespringa.construction_store.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class User {

    @Id
    @GeneratedValue
    private Long clientId;

    private String email;

    private String firstName;

    private String surname;

    private String password;

    private String paymentMethod;
}
