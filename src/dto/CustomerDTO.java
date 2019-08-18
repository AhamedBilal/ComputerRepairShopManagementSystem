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
public class CustomerDTO {
     private String cid;
     private String name;
     private String tel;

    public CustomerDTO(String cid, String name, String tel) {
        this.cid = cid;
        this.name = name;
        this.tel = tel;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

   
     
}
