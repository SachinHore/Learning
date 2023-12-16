package com.assignment.acInventaryRest.entity;

import javax.persistence.*;

@Entity
public class AC {
    @Id
    private Long acId;

    private Long acSerialNo;

    private String acCompanyName;

    private String acColour;

    public AC() {
    }

    public AC(Long acId, Long acSerialNo, String acCompanyName, String acColour) {
        this.acId = acId;
        this.acSerialNo = acSerialNo;
        this.acCompanyName = acCompanyName;
        this.acColour = acColour;
    }

    public Long getAcId() {
        return acId;
    }

    public void setAcId(Long acId) {
        this.acId = acId;
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
}
