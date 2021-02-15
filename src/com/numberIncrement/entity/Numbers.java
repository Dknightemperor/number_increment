package com.numberIncrement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/* This Bean class is created for our Numbers table*/
@Entity
@Table(name="numbers")
public class Numbers {

    private int number;
    private String urlName;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="number")
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    
    @Column(name="urlName")
    public String getUrlName() {
        return urlName;
    }
    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }
    
}
