/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.AdditionalPartDetailsDAO;
import entity.AdditionalPartDetails;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public class AdditionalPartDetailsDAOImpl implements AdditionalPartDetailsDAO{

    @Override
    public boolean add(AdditionalPartDetails ref) throws ClassNotFoundException, SQLException {
       return CrudUtil.executeUpdate("Insert into AdditionalPartDetails values(?,?,?,?)", ref.getRid(), ref.getId(),ref.getQty(),ref.getPrice());
    }

    @Override
    public boolean update(AdditionalPartDetails t) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("update AdditionalPartDetails set id=?,qty=?,price=? where rid=?", t.getId(),t.getQty(),t.getPrice(),t.getRid());
    }

    @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("delete AdditionalPartDetails where rid=?", t);
    }

    @Override
    public AdditionalPartDetails search(String t) throws ClassNotFoundException, SQLException {
        AdditionalPartDetails additionalPartDetails=null;
        ResultSet resultSet=CrudUtil.executeQuery("select * from AdditionalPartDetails where rid=?", t);
        while (resultSet.next()) {            
            additionalPartDetails=new AdditionalPartDetails(resultSet.getString(1), resultSet.getString(2),resultSet.getInt(3),resultSet.getDouble(4));
        }
        return additionalPartDetails;
    }

    @Override
    public ArrayList<AdditionalPartDetails> getAll() throws ClassNotFoundException, SQLException {
        ArrayList<AdditionalPartDetails> additionalPartDetailses=new ArrayList();
        ResultSet resultSet=CrudUtil.executeQuery("select * from AdditionalPartDetails");
        while (resultSet.next()) {            
            additionalPartDetailses.add(new AdditionalPartDetails(resultSet.getString(1), resultSet.getString(2),resultSet.getInt(3),resultSet.getDouble(4)));
        }
        return additionalPartDetailses;
    }

}
