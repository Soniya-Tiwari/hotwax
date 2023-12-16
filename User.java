package com.Assignment.app.rest.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class User {

    @OneToMany(mappedBy = "user")
    private List<order_header> orderHeaders;

    @OneToMany(mappedBy = "user")
    private List<order_part> orderParts;

    @OneToMany(mappedBy = "user")
    private List<product> products;

    // Getter and setter methods...






    public List<order_header> getOrderHeaders() {
        return orderHeaders;
    }

    public void setOrderHeaders(List<order_header> orderHeaders) {
        this.orderHeaders = orderHeaders;
    }

    public List<order_part> getOrderParts() {
        return orderParts;
    }

    public void setOrderParts(List<order_part> orderParts) {
        this.orderParts = orderParts;
    }

    public List<product> getProducts() {
        return products;
    }

    public void setProducts(List<product> products) {
        this.products = products;
    }
}
