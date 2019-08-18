/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.custom.CustomBO;
import bo.custom.PaymentBO;
import db.DBConnection;
import dto.CustomDTO;
import dto.PaymentDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bilal
 */
public class InvoiceController {
    static CustomBO bo = (CustomBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOM);
    static PaymentBO bo2 = (PaymentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.PAYMENT);
    
    public static ArrayList<CustomDTO> getAllPartsDetail(String id) throws ClassNotFoundException, SQLException {
        return bo.getAllPartsDetail(id);
    }
    
    public static boolean addPayment(PaymentDTO p) throws ClassNotFoundException, SQLException {
        return bo2.addPayment(p);
    }
    
}
