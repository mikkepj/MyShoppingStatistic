package com.mikke.shoppstat.entities;

import com.mikke.shoppstat.interfaces.IPersonProduct;

public class PersonProduct implements IPersonProduct {

    private static final long serialVersionUID = 4415321544119872856L;

    private PersonProductKey id;

    private String price;

    private Person person;
    private Product product;

    public PersonProductKey getId() {
        return id;
    }

    public void setId(PersonProductKey id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
