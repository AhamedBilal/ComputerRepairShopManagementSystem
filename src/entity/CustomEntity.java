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
public class CustomEntity {
     private String Cid;
     private String Name;
     private String Address;
     private String SerialNum;
     private String Model;

    public CustomEntity(String Cid, String Name, String Address, String SerialNum, String Model) {
        this.Cid = Cid;
        this.Name = Name;
        this.Address = Address;
        this.SerialNum = SerialNum;
        this.Model = Model;
    }

    public String getCid() {
        return Cid;
    }

    public void setCid(String Cid) {
        this.Cid = Cid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getSerialNum() {
        return SerialNum;
    }

    public void setSerialNum(String SerialNum) {
        this.SerialNum = SerialNum;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }


}
