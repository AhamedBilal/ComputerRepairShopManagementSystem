/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom;
import dao.CrudDAO;
import entity.Repair;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Bilal
 */
public interface RepairDAO extends CrudDAO<Repair, String>{
    public String getLastRepair()throws SQLException,ClassNotFoundException;
    public  ArrayList<Repair> getRepairOf(String status) throws ClassNotFoundException, SQLException;
    public boolean updateStatus(String id,String Status) throws ClassNotFoundException, SQLException;
}
