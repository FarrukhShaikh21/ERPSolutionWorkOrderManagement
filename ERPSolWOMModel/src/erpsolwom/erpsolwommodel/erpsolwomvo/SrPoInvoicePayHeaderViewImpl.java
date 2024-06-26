package erpsolwom.erpsolwommodel.erpsolwomvo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;

import erpsolwom.erpsolwommodel.erpsolwomvo.common.SrPoInvoicePayHeaderView;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jun 01 12:03:22 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPoInvoicePayHeaderViewImpl extends ViewObjectImpl implements SrPoInvoicePayHeaderView {
    /**
     * This is the default constructor (do not remove).
     */
    public SrPoInvoicePayHeaderViewImpl() {
    }
    
    public void doSuperviseSrPOInvPay() {
        this.getDBTransaction().commit();
                CallableStatement cs =
                    this.getDBTransaction().createCallableStatement("begin ?:=pkg_service_request.FUNC_SUBMIT_PURCHASE_INV_PAY('" +
                                                                    this.getCurrentRow().getAttribute("Invoicepayseq") + "','" +
                                                                    ERPSolGlobClassModel.doGetUserCode() + "'); END;", 1);
                try {
                    cs.registerOutParameter(1, Types.VARCHAR);
                    cs.executeUpdate();
                    this.getCurrentRow().refresh(Row.REFRESH_WITH_DB_FORGET_CHANGES);
        
                    if (!cs.getString(1).equals("ERPSOLSUCCESS")) {
                        this.getDBTransaction().commit();
                        throw new JboException("Unable to supervise due to " + cs.getString(1));
        
                    }
                    this.getCurrentRow().setAttribute("Posted", "Y");
                    this.getDBTransaction().commit();
                } catch (SQLException e) {
                    this.getDBTransaction().commit();
                    System.out.println(e.getMessage() + "this is message");
                    throw new JboException("Unable to supervise ");
                } finally {
                    try {
                        cs.close();
                    } catch (SQLException e) {
                    }
                }     
    }
    
}

