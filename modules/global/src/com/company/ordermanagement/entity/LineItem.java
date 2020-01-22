package com.company.ordermanagement.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NamePattern("%s|product")
@Table(name = "ORDERMANAGEMENT_LINE_ITEM")
@Entity(name = "ordermanagement_LineItem")
public class LineItem extends StandardEntity {
    private static final long serialVersionUID = -1007783573025378475L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_ID")
    protected Product product;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    protected BigDecimal price;

    @NotNull
    @Column(name = "QUANTITY", nullable = false)
    protected Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORDER_ID")
    protected Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}