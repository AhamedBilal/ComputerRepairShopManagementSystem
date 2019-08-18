/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.CustomDTO;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Bilal
 */
public interface CustomBO extends SuperBO{
    public ArrayList<CustomDTO> getAllPartsDetail(String id) throws ClassNotFoundException, SQLException;
}
