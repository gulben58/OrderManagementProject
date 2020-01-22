package com.company.ordermanagement.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.PublishEntityChangedEvents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@PublishEntityChangedEvents
@NamePattern("%s|productName")
@Table(name = "ORDERMANAGEMENT_PRODUCT")
@Entity(name = "ordermanagement_Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = 1868975671695868969L;

    @Column(name = "PRODUCT_CODE", unique = true, length = 20)
    protected String productCode;

    @NotNull
    @Column(name = "PRODUCT_NAME", nullable = false)
    protected String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}