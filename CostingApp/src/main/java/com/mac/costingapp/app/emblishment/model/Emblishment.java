/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mac.costingapp.app.emblishment.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Nidura Prageeth
 */
@Entity
@Table(name = "embellishment_cost")
public class Emblishment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "index_no")
    private Integer indexNo;

    @Column(name = "picture")
    private String picture;

    @Column(name = "price")
    private double price;

    @Column(name = "type")
    private String type;

    @Column(name = "smv")
    private Double smv;

    @Column(name = "charge_out")
    private Double chargeOut;
    
    @Column(name = "tier")
    private String tier;
    
    @Column(name = "category")
    private String category;

    public Emblishment() {
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public Double getChargeOut() {
        return chargeOut;
    }

    public void setChargeOut(Double chargeOut) {
        this.chargeOut = chargeOut;
    }

    public Double getSmv() {
        return smv;
    }

    public void setSmv(Double smv) {
        this.smv = smv;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
}
