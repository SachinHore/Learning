package com.assignment.acInventoryRest.entity.embeddableClasses;

import javax.persistence.Embeddable;

@Embeddable
public class CustomerDetails {
    private String customerName;

    private Long phoneNo;

    public CustomerDetails() {
    }

    public CustomerDetails(String customerName, Long phoneNo) {
        this.customerName = customerName;
        this.phoneNo = phoneNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "customerName='" + customerName + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
