package com.company.ordermanagement.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s - %s|street,city")
@Table(name = "ORDERMANAGEMENT_ADDRESS")
@Entity(name = "ordermanagement_Address")
public class Address extends StandardEntity {
    private static final long serialVersionUID = -7109552397352189160L;

    @NotNull
    @Column(name = "STREET", nullable = false)
    protected String street;

    @Column(name = "POST_CODE")
    protected String postCode;

    @NotNull
    @Column(name = "CITY", nullable = false)
    protected String city;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}