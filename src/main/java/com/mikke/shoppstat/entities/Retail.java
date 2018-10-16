package com.mikke.shoppstat.entities;

import java.io.Serializable;

public class Retail implements Serializable {

    private Long id;
    private String retailName;
    private String retailCode;
    private String description;

    public Retail (){

    }

    public Retail (String retailName, String retailCode, String description){
        this.retailName = retailName;
        this.retailCode = retailCode;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRetailName() {
        return retailName;
    }

    public void setRetailName(String retailName) {
        this.retailName = retailName;
    }

    public String getRetailCode() {
        return retailCode;
    }

    public void setRetailCode(String retailCode) {
        this.retailCode = retailCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
