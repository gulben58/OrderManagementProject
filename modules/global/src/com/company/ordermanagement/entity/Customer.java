package com.company.ordermanagement.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@NamePattern("%s %s|firstname,lastname")
@Table(name = "ORDERMANAGEMENT_CUSTOMER")
@Entity(name = "ordermanagement_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -315756667668459855L;

    @NotNull
    @Column(name = "FIRSTNAME", nullable = false)
    protected String firstname;

    @NotNull
    @Column(name = "LASTNAME", nullable = false)
    protected String lastname;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTHDATE")
    protected Date birthdate;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "customer")
    protected List<Address> addresses;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}