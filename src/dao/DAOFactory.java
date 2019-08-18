package dao;

import dao.custom.impl.*;

/**
 *
 * @author Bilal
 */
public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public enum DAOTypes {
        CUSTOMER, REPAIR,ADDITIONAL_PART,ADDITIONAL_PART_DETAILS,PAYMENT,PAYMENTDETAILS,COMPLETE,CUSTOM;
    }

    public  SuperDAO getDAO(DAOTypes types) {
        switch (types) {
            case CUSTOMER: 
                return new CustomerDAOImpl();
            case REPAIR: 
                return new RepairDAOImpl();
            case ADDITIONAL_PART: 
                return new AdditionalPartDAOImpl();
            case ADDITIONAL_PART_DETAILS: 
                return new AdditionalPartDetailsDAOImpl();
            case COMPLETE: 
                return new CompleteDAOImpl();
            case CUSTOM: 
                return new CustomDAOImpl();    
            case PAYMENT:
                return new PaymentDAOImpl();
            default:
                return null;
        }
    }
}