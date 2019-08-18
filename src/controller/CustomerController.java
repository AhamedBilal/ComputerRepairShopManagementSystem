/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.custom.CustomerBO;
import dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.Customer;

/**
 *
 * @author Bilal
 */
public class CustomerController {

    static CustomerBO bo = (CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);

    public static boolean addCustomer(CustomerDTO ref) throws ClassNotFoundException, SQLException {
        return bo.addCustomer(ref);
    }

    public static boolean updateCustomer(CustomerDTO ref) throws SQLException, ClassNotFoundException {
        return bo.updateCustomer(ref);
    }

    public static boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        return bo.deleteCustomer(id);
    }

    public static CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException {
        return bo.searchCustomer(id);
    }

    public static ArrayList<CustomerDTO> getAllCustomers() throws ClassNotFoundException, SQLException {
        return bo.getAllCustomers();
    }

}
