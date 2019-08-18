/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Bilal
 */
public class AdditionalPart {
    private String id;
    private String name;
    private double Price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public AdditionalPart() {
    }

    public AdditionalPart(String id, String name, double Price) {
        this.id = id;
        this.name = name;
        this.Price = Price;
    }

          
}
