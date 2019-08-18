/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.CustomerDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.Customer;

/*
 *
 * @author Bilal
 */
public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public boolean add(Customer ref) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("Insert into Customer values(?,?,?)", ref.getCid(), ref.getName(), ref.getTel());
    }

    @Override
    public boolean update(Customer ref) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("update Customer set name=?,tel=?  where cid=?", ref.getName(), ref.getTel(), ref.getCid());
    }

    @Override
    public boolean delete(String cid) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("delete from Customer where cid=?", cid);
    }

    @Override
    public Customer search(String cid) throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("select * from Customer where cid=?", cid);
        Customer customer = null;
        while (rst.next()) {
            customer = new Customer(rst.getString(1), rst.getString(2), rst.getString(3));
        }
        return customer;
    }

    @Override
    public ArrayList<Customer> getAll() throws ClassNotFoundException, SQLException {
        ArrayList<Customer> allCustomers = new ArrayList();
        ResultSet rst = CrudUtil.executeQuery("select * from Customer");
        while (rst.next()) {
            allCustomers.add(new Customer(rst.getString(1), rst.getString(2), rst.getString(3)));
        }
        return allCustomers;
    }

}