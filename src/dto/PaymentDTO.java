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
public class PaymentDTO {
    
    private String pid;
    private String rid;
    private double total;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public PaymentDTO() {
    }

    public PaymentDTO(String pid, String rid, double total) {
        this.pid = pid;
        this.rid = rid;
        this.total = total;
    }
}
