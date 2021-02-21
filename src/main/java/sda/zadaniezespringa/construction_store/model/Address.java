package sda.zadaniezespringa.construction_store.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String city;

    private String streetName;

    private String streetNumber;
}
