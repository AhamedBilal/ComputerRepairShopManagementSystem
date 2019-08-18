/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.PaymentDAO;
import entity.Payment;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public class PaymentDAOImpl implements PaymentDAO{

    @Override
    public boolean add(Payment t) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("insert into Payment values(?,?,?)", t.getPid(),t.getRid(),t.getTotal());
    }

    @Override
    public boolean update(Payment t) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("update Payment set rid=?,total=? where pid=?", t.getRid(),t.getTotal(),t.getPid());
    }

    @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Payment search(String t) throws ClassNotFoundException, SQLException {
        Payment p=null;
        ResultSet rs=CrudUtil.executeQuery("select * from Payment where pid=?", t);
        while (rs.next()) {            
            p=new Payment(rs.getString(1), rs.getString(2), rs.getDouble(3));
        }
        return p;
    }

    @Override
    public ArrayList<Payment> getAll() throws ClassNotFoundException, SQLException {
        ArrayList<Payment> list=new ArrayList<>();
        ResultSet rs=CrudUtil.executeQuery("select * from Payment");
        while (rs.next()) {            
            list.add(new Payment(rs.getString(1), rs.getString(2), rs.getDouble(3)));
        }
        return list;
    }
    
}
