/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.CustomBO;
import dao.DAOFactory;
import dao.custom.CustomDAO;
import dto.CustomDTO;
import entity.Custom;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public class CustomBOImpl implements CustomBO{
    
    CustomDAO dao=(CustomDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOM);
    @Override
    public ArrayList<CustomDTO> getAllPartsDetail(String id) throws ClassNotFoundException, SQLException {
        ArrayList<CustomDTO> al=new ArrayList<>();
        ArrayList<Custom> all=dao.getAllPartsDetail(id);
        for (Custom c : all) {
            al.add(new CustomDTO(c.getId(), c.getName(), c.getQty(), c.getPrice()));
        }
        return al;
    }
    
}
