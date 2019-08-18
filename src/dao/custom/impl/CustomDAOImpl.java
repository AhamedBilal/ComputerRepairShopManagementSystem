/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.CustomDAO;
import entity.Custom;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public class CustomDAOImpl implements CustomDAO{

    @Override
    public boolean add(Custom t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Custom t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Custom search(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    @Override
    public ArrayList<Custom> getAllPartsDetail(String rid) throws ClassNotFoundException, SQLException {
        ArrayList<Custom> al=new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("select apid,name,qty,uprice from AdditionalPart ap,AdditionalPartDetails apd where apd.apid=ap.id && rid='"+rid+"' group by rid");
        while (rst.next()) {            
            al.add(new Custom(rst.getString("apid"), rst.getString("name"), rst.getInt("qty"), rst.getDouble("uprice")));
        }
        return al;
    }

    @Override
    public ArrayList<Custom> getAll() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
