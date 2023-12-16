package com.assignment.acInventoryRest.entity;

import com.assignment.acInventoryRest.entity.embeddableClasses.ACDetails;

import javax.persistence.*;

@Entity
public class AvailableACDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long acId;

    @Embedded
    private ACDetails acDetails;

    public AvailableACDetails() {
    }

    public AvailableACDetails(Long acId, ACDetails acDetails) {
        this.acId = acId;
        this.acDetails = acDetails;
    }

    public Long getAcId() {
        return acId;
    }

    public void setAcId(Long acId) {
        this.acId = acId;
    }

    public ACDetails getAcDetails() {
        return acDetails;
    }

    public void setAcDetails(ACDetails acDetails) {
        this.acDetails = acDetails;
    }

    @Override
    public String toString() {
        return "AvailableACDetails{" +
                "acId=" + acId +
                ", acDetails=" + acDetails +
                '}';
    }
}
