/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.UserDAO;
import entity.User;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public class UserDAOImpl implements UserDAO{

    @Override
    public boolean add(User t) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("insert into user values(?,?,?)", t.getUserID(),t.getUserName(),t.getPassword());
    }

    @Override
    public boolean update(User t) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("update user set userName=?,password=? where userID=+"+"Admin"+"", t.getUserName(),t.getPassword());
    }

    @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User search(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> getAll() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
