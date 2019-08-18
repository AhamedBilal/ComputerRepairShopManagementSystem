/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.CompleteBO;
import dao.DAOFactory;
import dao.custom.CompleteDAO;
import dto.CompleteDTO;
import entity.Complete;
import java.sql.SQLException;

/**
 *
 * @author Bilal
 */
public class CompleteBOImpl implements CompleteBO{
    CompleteDAO dao = (CompleteDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COMPLETE);

    @Override
    public boolean addCompleteWork(CompleteDTO c) throws ClassNotFoundException, SQLException {
        return dao.add(new Complete(c.getCid(), c.getRid(), c.getDecription(), c.getRepairAmount()));
    }
    
}
