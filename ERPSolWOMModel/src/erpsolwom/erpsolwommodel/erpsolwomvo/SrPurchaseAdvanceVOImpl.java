package erpsolwom.erpsolwommodel.erpsolwomvo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;

import erpsolwom.erpsolwommodel.erpsolwomvo.common.SrPurchaseAdvanceVO;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 20 01:14:28 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseAdvanceVOImpl extends ViewObjectImpl implements SrPurchaseAdvanceVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseAdvanceVOImpl() {
    }
    
    public void doSuperviseSrPOAdvance() {
        this.getDBTransaction().commit();
                CallableStatement cs =
                    this.getDBTransaction().createCallableStatement("begin ?:=pkg_service_request.FUNC_SUBMIT_PURCHASE_ADVANCE('" +
                                                                    this.getCurrentRow().getAttribute("Advanceseqno") + "','" +
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

    /**
     * Returns the variable value for P_ADF_PO_CODE.
     * @return variable value for P_ADF_PO_CODE
     */
    public String getP_ADF_PO_CODE() {
        return (String) ensureVariableManager().getVariableValue("P_ADF_PO_CODE");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_PO_CODE.
     * @param value value to bind as P_ADF_PO_CODE
     */
    public void setP_ADF_PO_CODE(String value) {
        ensureVariableManager().setVariableValue("P_ADF_PO_CODE", value);
    }
}

