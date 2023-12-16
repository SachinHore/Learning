package com.assignment.acInventaryRest.entity;

import javax.persistence.*;

@Entity
public class AvailableAC {
    @Id
    private Long id;

    @OneToOne()
    private AC ac;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AC getAc() {
        return ac;
    }

    public void setAc(AC ac) {
        this.ac = ac;
    }
}
