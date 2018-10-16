package com.mikke.shoppstat.entities;

import java.io.Serializable;

public class Provider implements Serializable {
    private Long id;
    private String providerName;
    private String providerCode; //RUT
    private String description;
    private String phone;

    public Provider (){

    }

    public Provider (String providerName, String providerCode, String description, String phone){
        this.providerName = providerName;
        this.providerCode = providerCode;
        this.description = description;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
