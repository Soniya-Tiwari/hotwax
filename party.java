package com.Assignment.app.rest.Models;
import jakarta.persistence.*;

@Entity
public class party {

    @Id
    @Column(name = "PARTY_ID", nullable = false)
    private String partyId;

    @Column(name = "PARTY_TYPE_ENUM_ID")
    private String partyType;

    // Getter and setter methods...

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }
}
