/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.PaymentBO;
import dao.DAOFactory;
import dao.custom.PaymentDAO;
import dto.PaymentDTO;
import entity.Payment;
import java.sql.SQLException;


/**
 *
 * @author Bilal
 */
public class PaymentBOImpl implements PaymentBO{
    PaymentDAO dao = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    @Override
    public boolean addPayment(PaymentDTO ref) throws ClassNotFoundException, SQLException {
        return dao.add(new Payment(ref.getPid(), ref.getRid(), ref.getTotal()));
    }
    
}
