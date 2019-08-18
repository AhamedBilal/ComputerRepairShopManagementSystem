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
public class Complete {
    private String cid;
    private String rid;
    private String decription;
    private double repairAmount;

    public Complete() {
    }

    public Complete(String cid, String rid, String decription, double repairAmount) {
        this.cid = cid;
        this.rid = rid;
        this.decription = decription;
        this.repairAmount = repairAmount;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public double getRepairAmount() {
        return repairAmount;
    }

    public void setRepairAmount(double repairAmount) {
        this.repairAmount = repairAmount;
    }

   
}
