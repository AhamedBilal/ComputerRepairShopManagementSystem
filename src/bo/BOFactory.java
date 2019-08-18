/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bo.custom.impl.*;


/**
 *
 * @author Bilal
 */
public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;
    }

    public enum BOTypes{
        CUSTOMER, REPAIR, ADDITIONAL_PARTS, PAYMENT, COMPLETE, ADDITIONAL_PART_DETAILS,CUSTOM;
    }
    
    public SuperBO getBO(BOTypes types){
        switch (types){
             case CUSTOMER:
                 return  new CustomerBOImpl();
            case REPAIR:
                 return  new RepairOrderBOImpl();
            case ADDITIONAL_PARTS:
                 return  new AdditionalPartBOImpl();
            case COMPLETE:
                 return  new CompleteBOImpl();
            case CUSTOM:
                 return  new CustomerBOImpl();     
//            case ADDITIONAL_PART_DETAILS:
//                 return  new AdditionalPartDetailsBOImpl();
            case PAYMENT:
                 return  new PaymentBOImpl();
            default:
                return null;
        }
        }
    }
