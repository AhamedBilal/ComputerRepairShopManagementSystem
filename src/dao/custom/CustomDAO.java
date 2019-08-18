/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom;

import dao.CrudDAO;
import entity.Custom;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Bilal
 */
public interface CustomDAO extends CrudDAO<Custom, String>{
    public ArrayList<Custom> getAllPartsDetail(String id) throws ClassNotFoundException, SQLException;
}
