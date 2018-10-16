package com.mikke.shoppstat.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person implements Serializable {

    private Long id;
    private String name;
    private String firstLastname;
    private String secondLastname;
    private String mail;
    private String phone;
    private LocalDate birthdate;
    private String addresses;

    public Person(){

    }

    public Person(String name, String firstLastname, String secondLastname, String mail, String phone,
                LocalDate birthdate, String addresses){
        this.name = name;
        this.firstLastname = firstLastname;
        this.secondLastname = secondLastname;
        this.mail = mail;
        this.phone = phone;
        this.birthdate = birthdate;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLastname() {
        return firstLastname;
    }

    public void setFirstLastname(String firstLastname) {
        this.firstLastname = firstLastname;
    }

    public String getSecondLastname() {
        return secondLastname;
    }

    public void setSecondLastname(String secondLastname) {
        this.secondLastname = secondLastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
