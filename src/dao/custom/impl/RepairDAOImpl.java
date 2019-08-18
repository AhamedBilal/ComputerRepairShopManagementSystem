/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.RepairDAO;
import entity.Repair;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public class RepairDAOImpl implements RepairDAO{

    @Override
    public String getLastRepair() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("select max(id) from Repair");
        String n = "";
        while (rst.next()) {
            n = rst.getString(1);
        }
        return n;
    }

    @Override
    public boolean add(Repair t) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("insert into Repair values(?,?,?,?,?,?,?)", t.getRid(),t.getCid(),t.getRepairDate(),t.getType(),t.getDescription(),t.getStatus(),t.getCompleteDate());
    }

    @Override
    public boolean update(Repair t) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("update Repair set status=? where rid=?", t.getStatus(),t.getRid());
    }

    @Override
    public boolean delete(String t) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("delete from Repair where rid=?", t);
    }

    @Override
    public Repair search(String t) throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtil.executeQuery("select * from Repair where rid=?", t);
        Repair repair = null;
        while (rst.next()) {
            repair = new Repair(rst.getString(1), rst.getString(2), rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7));
        }
        return repair;
    }

    @Override
    public ArrayList<Repair> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtil.executeQuery("select * from Repair");
        ArrayList<Repair> allRepairs = new ArrayList<>();
        while (rst.next()) {
            allRepairs.add(new Repair(rst.getString(1), rst.getString(2), rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7)));
        }
        return allRepairs;
    }

    @Override
    public ArrayList<Repair> getRepairOf(String status) throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtil.executeQuery("select * from Repair where status=?",status);
        ArrayList<Repair> allRepairs = new ArrayList<>();
        while (rst.next()) {
            allRepairs.add(new Repair(rst.getString(1), rst.getString(2), rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7)));
        }
        return allRepairs;
    }

    @Override
    public boolean updateStatus(String id, String Status) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("update Repair set status=? where rid=?", Status,id);
    }
    
}
