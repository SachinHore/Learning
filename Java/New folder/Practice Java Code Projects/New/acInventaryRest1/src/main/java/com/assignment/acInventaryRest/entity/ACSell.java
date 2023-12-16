package com.assignment.acInventaryRest.entity;

import javax.persistence.*;

@Entity
public class ACSell{
    @Id
    private Long id;

    @OneToOne()
    private AC ac;

    private String custName;

    private Long phone;

    public ACSell() {
    }

    public ACSell(Long id, AC ac, String custName, Long phone) {
        this.id = id;
        this.ac = ac;
        this.custName = custName;
        this.phone = phone;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public AC getAc() {
        return ac;
    }

    public void setAc(AC ac) { this.ac = ac;}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
