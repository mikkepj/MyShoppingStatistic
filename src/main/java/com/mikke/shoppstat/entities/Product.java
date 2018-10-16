package com.mikke.shoppstat.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Product implements Serializable {

    private Long id;
    private String productCode;
    private String description;
    private Long providerId;
    private String providerName;
    private String tradeMark;
    private LocalDateTime factoryDate;
    private Double price;

    public Product() {

    }

    public Product(String productCode, String description, Long providerId, String providerName, String tradeMark,
                   LocalDateTime factoryDate, Double price) {

        this.productCode = productCode;
        this.description = description;
        this.providerId = providerId;
        this.providerName = providerName;
        this.tradeMark = tradeMark;
        this.factoryDate = factoryDate;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public LocalDateTime getFactoryDate() {
        return factoryDate;
    }

    public void setFactoryDate(LocalDateTime factoryDate) {
        this.factoryDate = factoryDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
