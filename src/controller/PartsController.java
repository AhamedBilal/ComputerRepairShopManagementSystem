/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.custom.AdditionalPartBO;
import dto.AdditionalPartDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bilal
 */
public class PartsController {
    static AdditionalPartBO bo = (AdditionalPartBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ADDITIONAL_PARTS);
    
    public static boolean addParts(AdditionalPartDTO partDTO) throws ClassNotFoundException, SQLException{
        return bo.addPart(partDTO);
    }
    public static boolean updateParts(AdditionalPartDTO partDTO) throws ClassNotFoundException, SQLException{
        return bo.updatePart(partDTO);
    }
    public static boolean deleteParts(String id) throws ClassNotFoundException, SQLException{
        return bo.deletePart(id);
    }
    public static AdditionalPartDTO searchParts(String ID) throws ClassNotFoundException, SQLException{
        return bo.searchPart(ID);
    }
    public static ArrayList<AdditionalPartDTO> getAllParts() throws ClassNotFoundException, SQLException{
        return bo.getAllParts();
    }
}
