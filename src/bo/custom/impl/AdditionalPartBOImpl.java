/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.AdditionalPartBO;
import dao.DAOFactory;
import dto.AdditionalPartDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import dao.custom.AdditionalPartDAO;
import entity.AdditionalPart;

/**
 *
 * @author Bilal
 */
public class AdditionalPartBOImpl implements AdditionalPartBO{
     AdditionalPartDAO dao = (AdditionalPartDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ADDITIONAL_PART);
    @Override
    public boolean addPart(AdditionalPartDTO ref) throws ClassNotFoundException, SQLException {
        return dao.add(new AdditionalPart(ref.getId(), ref.getName(), ref.getPrice()));
    }

    @Override
    public boolean updatePart(AdditionalPartDTO ref) throws SQLException, ClassNotFoundException {
        return dao.update(new AdditionalPart(ref.getId(), ref.getName(), ref.getPrice()));
    }

    @Override
    public boolean deletePart(String id) throws SQLException, ClassNotFoundException {
        return dao.delete(id);
    }

    @Override
    public AdditionalPartDTO searchPart(String id) throws SQLException, ClassNotFoundException {
        AdditionalPart ap=dao.search(id);
        return new AdditionalPartDTO(ap.getId(), ap.getName(), ap.getPrice());
    }

    @Override
    public ArrayList<AdditionalPartDTO> getAllParts() throws ClassNotFoundException, SQLException {
        ArrayList<AdditionalPart> aps=dao.getAll();
        ArrayList<AdditionalPartDTO> al=new ArrayList<>();
        for (AdditionalPart part : aps) {
            al.add(new AdditionalPartDTO(part.getId(), part.getName(), part.getPrice()));
        }
        return al;
    }

    
}
