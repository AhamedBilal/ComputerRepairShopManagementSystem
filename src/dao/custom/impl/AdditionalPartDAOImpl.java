/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import entity.AdditionalPart;
import java.sql.*;
import java.util.ArrayList;
import dao.custom.AdditionalPartDAO;

/**
 *
 * @author Bilal
 */
public class AdditionalPartDAOImpl implements AdditionalPartDAO{

    @Override
    public boolean add(AdditionalPart ref) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("Insert into AdditionalPart values(?,?,?)", ref.getId(), ref.getName(), ref.getPrice());
    }

    @Override
    public boolean update(AdditionalPart ref) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("update AdditionalPart set name=?,price=?  where id=?", ref.getName(), ref.getPrice(), ref.getId());
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("delete from AdditionalPart where id=?", id);
    }

    @Override
    public AdditionalPart search(String id) throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("select * from AdditionalPart where id=?", id);
        AdditionalPart part = null;
        while (rst.next()) {
            part = new AdditionalPart(rst.getString(1), rst.getString(2), rst.getDouble(3));
        }
        return part;
    }

    @Override
    public ArrayList<AdditionalPart> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtil.executeQuery("select * from AdditionalPart");
        ArrayList<AdditionalPart> all = new ArrayList();
        while (rst.next()) {
            all.add(new AdditionalPart(rst.getString(1), rst.getString(2), rst.getDouble(3)));
        }
        return all;
    }

}