package com.mikke.shoppstat.entities;

import java.io.Serializable;

public class Category implements Serializable {

    private Long id;
    private String code;
    private String description;

    public Category (){

    }

    public Category (String code, String description){
        this.code = code;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
