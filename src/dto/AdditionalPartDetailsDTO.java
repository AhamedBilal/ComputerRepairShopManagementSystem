/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;


/**
 *
 * @author Bilal
 */
public class AdditionalPartDetailsDTO {
    private String rid;
    private String id;
    private int qty;
    double price;

    public AdditionalPartDetailsDTO() {
    }

    public AdditionalPartDetailsDTO(String rid, String id, int qty, double price) {
        this.rid = rid;
        this.id = id;
        this.qty = qty;
        this.price = price;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

      
}
