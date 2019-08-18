/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.CustomerBO;
import dao.DAOFactory;
import dao.custom.CustomerDAO;
import dto.CustomerDTO;
import entity.Customer;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public class CustomerBOImpl implements CustomerBO {

    CustomerDAO dao = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    @Override
    public boolean addCustomer(CustomerDTO ref) throws ClassNotFoundException, SQLException {
        return dao.add(new Customer(ref.getCid(), ref.getName(), ref.getTel()));

    }

    @Override
    public boolean updateCustomer(CustomerDTO ref) throws SQLException, ClassNotFoundException {
        return dao.update(new Customer(ref.getCid(), ref.getName(), ref.getTel()));
    }

    @Override
    public boolean deleteCustomer(String Cid) throws SQLException, ClassNotFoundException {
        return dao.delete(Cid);
    }

    @Override
    public CustomerDTO searchCustomer(String Cid) throws SQLException, ClassNotFoundException {
        Customer search = dao.search(Cid);
        return new CustomerDTO(search.getCid(), search.getName(), search.getTel());
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws ClassNotFoundException, SQLException {
        ArrayList<Customer> all = dao.getAll();
        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();
        for (Customer search : all) {
            allCustomers.add(new CustomerDTO(search.getCid(), search.getName(), search.getTel()));
        }
        return allCustomers;
    }

}
