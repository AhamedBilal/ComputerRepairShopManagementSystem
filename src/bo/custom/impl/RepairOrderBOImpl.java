/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import dto.RepairDTO;
import java.sql.SQLException;
import bo.custom.RepairOrderBO;
import dao.DAOFactory;
import dao.custom.AdditionalPartDetailsDAO;
import dao.custom.CustomerDAO;
import dao.custom.RepairDAO;
import db.DBConnection;
import dto.AdditionalPartDetailsDTO;
import dto.CustomerDTO;
import entity.AdditionalPartDetails;
import entity.Customer;
import entity.Repair;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public class RepairOrderBOImpl implements RepairOrderBO {

    RepairDAO repair = (RepairDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REPAIR);
    //CustomerDAO customer = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    AdditionalPartDetailsDAO additionalPartDetails = (AdditionalPartDetailsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ADDITIONAL_PART_DETAILS);

    @Override
    public boolean RepairOrder(RepairDTO r) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        boolean add = repair.add(new Repair(r.getRid(), r.getCid(), r.getRepairDate(), r.getType(), r.getDescription(), r.getStatus(), r.getCompleteDate()));
        if (add) {
            for (AdditionalPartDetailsDTO a : r.getAllAdditionalPartDetails()) {
                boolean partsDetailsAded = additionalPartDetails.add(new AdditionalPartDetails(a.getRid(), a.getId(), a.getQty(), a.getPrice()));
                if (!partsDetailsAded) {
                    connection.rollback();
                    connection.setAutoCommit(true);
                    return false;
                }
            }
            connection.commit();
            connection.setAutoCommit(true);
            return true;
        } else {
            connection.rollback();
            connection.setAutoCommit(true);
            return false;
        }

    }

    @Override
    public ArrayList<RepairDTO> getRepairsOf(String status) throws ClassNotFoundException, SQLException {
        ArrayList<Repair> all = repair.getRepairOf(status);
        ArrayList<RepairDTO> allRepairs = new ArrayList<>();
        for (Repair r : all) {
            allRepairs.add(new RepairDTO(r.getRid(), r.getCid(), r.getRepairDate(), r.getType(), r.getDescription(), r.getStatus(), r.getCompleteDate()));
        } 
        return allRepairs;
    }

    @Override
    public boolean updateStatus(RepairDTO ref) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateStatus(String id, String Status) throws ClassNotFoundException, SQLException {
        return repair.updateStatus(id, Status);
    }

    

}
