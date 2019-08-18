/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.BOFactory;
import bo.custom.CompleteBO;
import dto.CompleteDTO;
import java.sql.SQLException;

/**
 *
 * @author Bilal
 */
public class CompleteController {
    static CompleteBO bo = (CompleteBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.COMPLETE);

    public static boolean addCompleteWork(CompleteDTO ref) throws ClassNotFoundException, SQLException {
        return bo.addCompleteWork(ref);
    }
}
