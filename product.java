package com.Assignment.app.rest.Models;
import jakarta.persistence.*;

@Entity
public class product {
    @Id
    @Column(name = "PRODUCT_ID", nullable = false)
    private String productId;

    @Column(name = "OWNER_PARTY_ID")
    private String ownerPartyId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CHARGE_SHIPPING")
    private char chargeShipping;

    @Column(name = "RETURNABLE")
    private char returnable;

    // Other fields...

    // Getter and setter methods...

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOwnerPartyId() {
        return ownerPartyId;
    }

    public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getChargeShipping() {
        return chargeShipping;
    }

    public void setChargeShipping(char chargeShipping) {
        this.chargeShipping = chargeShipping;
    }

    public char getReturnable() {
        return returnable;
    }

    public void setReturnable(char returnable) {
        this.returnable = returnable;
    }

}
