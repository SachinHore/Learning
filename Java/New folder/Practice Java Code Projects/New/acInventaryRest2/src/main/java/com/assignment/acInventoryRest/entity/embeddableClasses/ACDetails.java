package com.assignment.acInventoryRest.entity.embeddableClasses;

import javax.persistence.Embeddable;

@Embeddable
public class ACDetails {
    private Long acSerialNo;

    private String acCompanyName;

    private String acColour;

    public ACDetails() {
    }

    public ACDetails(Long acSerialNo, String acCompanyName, String acColour) {
        this.acSerialNo = acSerialNo;
        this.acCompanyName = acCompanyName;
        this.acColour = acColour;
    }

    public Long getAcSerialNo() {
        return acSerialNo;
    }

    public void setAcSerialNo(Long acSerialNo) {
        this.acSerialNo = acSerialNo;
    }

    public String getAcCompanyName() {
        return acCompanyName;
    }

    public void setAcCompanyName(String acCompanyName) {
        this.acCompanyName = acCompanyName;
    }

    public String getAcColour() {
        return acColour;
    }

    public void setAcColour(String acColour) {
        this.acColour = acColour;
    }

    @Override
    public String toString() {
        return "ACDetails{" +
                "acSerialNo=" + acSerialNo +
                ", acCompanyName='" + acCompanyName + '\'' +
                ", acColour='" + acColour + '\'' +
                '}';
    }
}
