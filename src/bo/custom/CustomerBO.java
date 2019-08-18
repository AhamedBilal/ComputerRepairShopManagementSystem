/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public interface CustomerBO extends SuperBO{
    public  boolean addCustomer(CustomerDTO ref) throws ClassNotFoundException, SQLException ;

    public  boolean updateCustomer(CustomerDTO ref) throws SQLException, ClassNotFoundException ;

    public  boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException ;

    public  CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;

    public  ArrayList<CustomerDTO> getAllCustomers() throws ClassNotFoundException, SQLException;
}
