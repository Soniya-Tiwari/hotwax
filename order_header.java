package com.Assignment.app.rest.Models;
import jakarta.persistence.*;
@Entity
public class order_header {

    @Id
    @Column(name = "ORDER_ID", nullable = false)
    private String orderId;

    @Column(name = "ORDER_NAME")
    private String orderName;

    @Column(name = "PLACED_DATE")
    private java.sql.Timestamp placedDate;

    // Other fields...

    // Getter and setter methods...

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public java.sql.Timestamp getPlacedDate() {
        return placedDate;
    }

    public void setPlacedDate(java.sql.Timestamp placedDate) {
        this.placedDate = placedDate;
    }

    // Other getter and setter methods...
}
