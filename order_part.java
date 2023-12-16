package com.Assignment.app.rest.Models;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class order_part implements Serializable {

    private String orderId;
    private String orderPartSeqId;

    // Constructors, equals, hashCode methods...

    public order_part() {
        // Default constructor
    }

    public order_part(String orderId, String orderPartSeqId) {
        this.orderId = orderId;
        this.orderPartSeqId = orderPartSeqId;
    }

    // Getter and setter methods...

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderPartSeqId() {
        return orderPartSeqId;
    }

    public void setOrderPartSeqId(String orderPartSeqId) {
        this.orderPartSeqId = orderPartSeqId;
    }

    // Equals and hashCode methods...

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        order_part that = (order_part) o;
        return Objects.equals(orderId, that.orderId) && Objects.equals(orderPartSeqId, that.orderPartSeqId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderPartSeqId);
    }
}