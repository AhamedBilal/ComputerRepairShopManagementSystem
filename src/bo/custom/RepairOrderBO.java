/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.CustomerDTO;
import dto.RepairDTO;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public interface RepairOrderBO extends SuperBO{
    public boolean RepairOrder(RepairDTO rep) throws ClassNotFoundException, SQLException;
    public  ArrayList<RepairDTO> getRepairsOf(String status) throws ClassNotFoundException, SQLException;
    public  boolean updateStatus(RepairDTO ref) throws SQLException, ClassNotFoundException ;
    public boolean updateStatus(String id,String Status) throws ClassNotFoundException, SQLException;
}

