/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.AdditionalPartDTO;
import java.util.ArrayList;
        import java.sql.*;

/**
 *
 * @author Bilal
 */
public interface AdditionalPartBO extends SuperBO{
    public  boolean addPart(AdditionalPartDTO ref) throws ClassNotFoundException, SQLException ;

    public  boolean updatePart(AdditionalPartDTO ref) throws SQLException, ClassNotFoundException ;

    public  boolean deletePart(String id) throws SQLException, ClassNotFoundException ;

    public  AdditionalPartDTO searchPart(String id) throws SQLException, ClassNotFoundException;

    public  ArrayList<AdditionalPartDTO> getAllParts() throws ClassNotFoundException, SQLException;
}

