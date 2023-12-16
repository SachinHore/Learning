package com.assignment.acInventoryRest.entity;

import com.assignment.acInventoryRest.entity.embeddableClasses.CustomerDetails;

import javax.persistence.*;

@Entity
public class ACSellDetails {
    @Id
    private Long id;

    @OneToOne()
    private AvailableACDetails availableAcDetails;

    @Embedded
    private CustomerDetails customerDetails;

    public ACSellDetails() {
    }

    public ACSellDetails(Long id, AvailableACDetails availableAcDetails, CustomerDetails customerDetails) {
        this.id = id;
        this.availableAcDetails = availableAcDetails;
        this.customerDetails = customerDetails;
    }

    public AvailableACDetails getAc() {
        return availableAcDetails;
    }

    public void setAc(AvailableACDetails availableAcDetails) { this.availableAcDetails = availableAcDetails;}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    @Override
    public String toString() {
        return "ACSellDetails{" +
                "id=" + id +
                ", availableAcDetails=" + availableAcDetails +
                ", customerDetails=" + customerDetails +
                '}';
    }
}
