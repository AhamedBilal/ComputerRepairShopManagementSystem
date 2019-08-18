/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.CompleteDTO;
import java.sql.SQLException;
/**
 *
 * @author Bilal
 */
public interface CompleteBO extends SuperBO{
    public  boolean addCompleteWork(CompleteDTO c) throws ClassNotFoundException, SQLException ;
}
