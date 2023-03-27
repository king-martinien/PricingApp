/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kingmartinien.pricing.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author kingmartinien
 */
@SessionScoped
@Named(value = "pricing")
public class PricingBean implements Serializable {

    private Integer todaysPriceChange;
    private String selectedItem;
    private Double oldPrice;
    private Double newPrice;

    public Integer getTodaysPriceChange() {
        return todaysPriceChange;
    }

    public void setTodaysPriceChange(Integer todaysPriceChange) {
        this.todaysPriceChange = todaysPriceChange;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Double newPrice) {
        this.newPrice = newPrice;
    }

    public void lookupPriceChange() {
        todaysPriceChange = new Random().nextInt(1, 11);
    }

    public void applyPriceChange() {
        oldPrice = 10d;
        newPrice = 20d;
    }
}
