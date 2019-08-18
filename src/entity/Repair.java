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
public class Repair {
    private String rid;
    private String cid;
    private String repairDate;
    private String type;
    private String Description;
    private String Status;
    private String completeDate;
    
    public Repair() {
    }

    public Repair(String rid, String cid, String repairDate, String type, String Description, String Status, String completeDate) {
        this.rid = rid;
        this.cid = cid;
        this.repairDate = repairDate;
        this.type = type;
        this.Description = Description;
        this.Status = Status;
        this.completeDate = completeDate;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(String repairDate) {
        this.repairDate = repairDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(String completeDate) {
        this.completeDate = completeDate;
    }
    
        
}
