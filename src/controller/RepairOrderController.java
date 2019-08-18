/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.BOFactory.BOTypes;
import bo.custom.RepairOrderBO;
import dto.RepairDTO;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public class RepairOrderController {
    static RepairOrderBO bo=(RepairOrderBO) BOFactory.getInstance().getBO(BOTypes.REPAIR);
    public static boolean RepairOrder(RepairDTO r) throws ClassNotFoundException, SQLException {
        return bo.RepairOrder(r);
    }
    public static ArrayList<RepairDTO> getRepairOf(String status) throws ClassNotFoundException, SQLException {
        return bo.getRepairsOf(status);
    }
    public static boolean updateStatus(String id,String Status) throws ClassNotFoundException, SQLException {
        return bo.updateStatus(id, Status);
    }
    
}
