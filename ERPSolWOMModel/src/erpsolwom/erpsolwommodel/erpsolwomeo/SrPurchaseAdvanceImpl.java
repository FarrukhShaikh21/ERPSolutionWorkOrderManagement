package erpsolwom.erpsolwommodel.erpsolwomeo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun May 19 20:42:19 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseAdvanceImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Advanceseqno,
        AdvanceCode,
        AdvanceDate,
        AdvanceType,
        Supplierid,
        PoCode,
        AdvanceAmount,
        BalanceAmount,
        AppliedAmount,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        ModifiedDate,
        Posted,
        PostedDate,
        Companyid,
        Doctypeid,
        Locationid,
        txtLocationName,
        txtSupplierName,
        Remarks,
        AllLocations,
        PuSuppliers,
        SrPurchaseOrderHeader;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ADVANCESEQNO = AttributesEnum.Advanceseqno.index();
    public static final int ADVANCECODE = AttributesEnum.AdvanceCode.index();
    public static final int ADVANCEDATE = AttributesEnum.AdvanceDate.index();
    public static final int ADVANCETYPE = AttributesEnum.AdvanceType.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int POCODE = AttributesEnum.PoCode.index();
    public static final int ADVANCEAMOUNT = AttributesEnum.AdvanceAmount.index();
    public static final int BALANCEAMOUNT = AttributesEnum.BalanceAmount.index();
    public static final int APPLIEDAMOUNT = AttributesEnum.AppliedAmount.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDDATE = AttributesEnum.PostedDate.index();
    public static final int COMPANYID = AttributesEnum.Companyid.index();
    public static final int DOCTYPEID = AttributesEnum.Doctypeid.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int ALLLOCATIONS = AttributesEnum.AllLocations.index();
    public static final int PUSUPPLIERS = AttributesEnum.PuSuppliers.index();
    public static final int SRPURCHASEORDERHEADER = AttributesEnum.SrPurchaseOrderHeader.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseAdvanceImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolwom.erpsolwommodel.erpsolwomeo.SrPurchaseAdvance");
    }


    /**
     * Gets the attribute value for Advanceseqno, using the alias name Advanceseqno.
     * @return the value of Advanceseqno
     */
    public Integer getAdvanceseqno() {
        return (Integer) getAttributeInternal(ADVANCESEQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Advanceseqno.
     * @param value value to set the Advanceseqno
     */
    public void setAdvanceseqno(Integer value) {
        setAttributeInternal(ADVANCESEQNO, value);
    }

    /**
     * Gets the attribute value for AdvanceCode, using the alias name AdvanceCode.
     * @return the value of AdvanceCode
     */
    public String getAdvanceCode() {
        return (String) getAttributeInternal(ADVANCECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for AdvanceCode.
     * @param value value to set the AdvanceCode
     */
    public void setAdvanceCode(String value) {
        setAttributeInternal(ADVANCECODE, value);
    }

    /**
     * Gets the attribute value for AdvanceDate, using the alias name AdvanceDate.
     * @return the value of AdvanceDate
     */
    public Date getAdvanceDate() {
        return (Date) getAttributeInternal(ADVANCEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for AdvanceDate.
     * @param value value to set the AdvanceDate
     */
    public void setAdvanceDate(Date value) {
        setAttributeInternal(ADVANCEDATE, value);
    }

    /**
     * Gets the attribute value for AdvanceType, using the alias name AdvanceType.
     * @return the value of AdvanceType
     */
    public String getAdvanceType() {
        return (String) getAttributeInternal(ADVANCETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for AdvanceType.
     * @param value value to set the AdvanceType
     */
    public void setAdvanceType(String value) {
        setAttributeInternal(ADVANCETYPE, value);
    }

    /**
     * Gets the attribute value for Supplierid, using the alias name Supplierid.
     * @return the value of Supplierid
     */
    public String getSupplierid() {
        return (String) getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Supplierid.
     * @param value value to set the Supplierid
     */
    public void setSupplierid(String value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for PoCode, using the alias name PoCode.
     * @return the value of PoCode
     */
    public String getPoCode() {
        return (String) getAttributeInternal(POCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoCode.
     * @param value value to set the PoCode
     */
    public void setPoCode(String value) {
        setAttributeInternal(POCODE, value);
    }

    /**
     * Gets the attribute value for AdvanceAmount, using the alias name AdvanceAmount.
     * @return the value of AdvanceAmount
     */
    public BigDecimal getAdvanceAmount() {
        return (BigDecimal) getAttributeInternal(ADVANCEAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for AdvanceAmount.
     * @param value value to set the AdvanceAmount
     */
    public void setAdvanceAmount(BigDecimal value) {
        setAttributeInternal(ADVANCEAMOUNT, value);
    }

    /**
     * Gets the attribute value for BalanceAmount, using the alias name BalanceAmount.
     * @return the value of BalanceAmount
     */
    public BigDecimal getBalanceAmount() {
        return (BigDecimal) getAttributeInternal(BALANCEAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for BalanceAmount.
     * @param value value to set the BalanceAmount
     */
    public void setBalanceAmount(BigDecimal value) {
        setAttributeInternal(BALANCEAMOUNT, value);
    }

    /**
     * Gets the attribute value for AppliedAmount, using the alias name AppliedAmount.
     * @return the value of AppliedAmount
     */
    public BigDecimal getAppliedAmount() {
        return (BigDecimal) getAttributeInternal(APPLIEDAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for AppliedAmount.
     * @param value value to set the AppliedAmount
     */
    public void setAppliedAmount(BigDecimal value) {
        setAttributeInternal(APPLIEDAMOUNT, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for ModifiedBy, using the alias name ModifiedBy.
     * @return the value of ModifiedBy
     */
    public String getModifiedBy() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedBy.
     * @param value value to set the ModifiedBy
     */
    public void setModifiedBy(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for ModifiedDate, using the alias name ModifiedDate.
     * @return the value of ModifiedDate
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedDate.
     * @param value value to set the ModifiedDate
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for Posted, using the alias name Posted.
     * @return the value of Posted
     */
    public String getPosted() {
        return (String) getAttributeInternal(POSTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Posted.
     * @param value value to set the Posted
     */
    public void setPosted(String value) {
        setAttributeInternal(POSTED, value);
    }

    /**
     * Gets the attribute value for PostedDate, using the alias name PostedDate.
     * @return the value of PostedDate
     */
    public Date getPostedDate() {
        return (Date) getAttributeInternal(POSTEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PostedDate.
     * @param value value to set the PostedDate
     */
    public void setPostedDate(Date value) {
        setAttributeInternal(POSTEDDATE, value);
    }

    /**
     * Gets the attribute value for Companyid, using the alias name Companyid.
     * @return the value of Companyid
     */
    public String getCompanyid() {
        return (String) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Companyid.
     * @param value value to set the Companyid
     */
    public void setCompanyid(String value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for Doctypeid, using the alias name Doctypeid.
     * @return the value of Doctypeid
     */
    public String getDoctypeid() {
        return (String) getAttributeInternal(DOCTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Doctypeid.
     * @param value value to set the Doctypeid
     */
    public void setDoctypeid(String value) {
        setAttributeInternal(DOCTYPEID, value);
    }

    /**
     * Gets the attribute value for Locationid, using the alias name Locationid.
     * @return the value of Locationid
     */
    public String getLocationid() {
        return (String) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Locationid.
     * @param value value to set the Locationid
     */
    public void setLocationid(String value) {
        setAttributeInternal(LOCATIONID, value);
    }


    /**
     * Gets the attribute value for txtLocationName, using the alias name txtLocationName.
     * @return the value of txtLocationName
     */
    public String gettxtLocationName() {
        return (String) getAttributeInternal(TXTLOCATIONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtLocationName.
     * @param value value to set the txtLocationName
     */
    public void settxtLocationName(String value) {
        setAttributeInternal(TXTLOCATIONNAME, value);
    }

    /**
     * Gets the attribute value for txtSupplierName, using the alias name txtSupplierName.
     * @return the value of txtSupplierName
     */
    public String gettxtSupplierName() {
        return (String) getAttributeInternal(TXTSUPPLIERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtSupplierName.
     * @param value value to set the txtSupplierName
     */
    public void settxtSupplierName(String value) {
        setAttributeInternal(TXTSUPPLIERNAME, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAllLocations() {
        return (EntityImpl) getAttributeInternal(ALLLOCATIONS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAllLocations(EntityImpl value) {
        setAttributeInternal(ALLLOCATIONS, value);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getPuSuppliers() {
        return (EntityImpl) getAttributeInternal(PUSUPPLIERS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setPuSuppliers(EntityImpl value) {
        setAttributeInternal(PUSUPPLIERS, value);
    }


    /**
     * @return the associated entity SrPurchaseOrderHeaderImpl.
     */
    public SrPurchaseOrderHeaderImpl getSrPurchaseOrderHeader() {
        return (SrPurchaseOrderHeaderImpl) getAttributeInternal(SRPURCHASEORDERHEADER);
    }

    /**
     * Sets <code>value</code> as the associated entity SrPurchaseOrderHeaderImpl.
     */
    public void setSrPurchaseOrderHeader(SrPurchaseOrderHeaderImpl value) {
        setAttributeInternal(SRPURCHASEORDERHEADER, value);
    }


    /**
     * @param advanceseqno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer advanceseqno) {
        return new Key(new Object[] { advanceseqno });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setERPSolPKColumnName("Advanceseqno");
        setERPSolPKSeqName("Sr_Purchase_Advance_seq");
        setLocationid(ERPSolGlobClassModel.doGetUserLocationCode());
        setCompanyid(ERPSolGlobClassModel.doGetUserCompanyCode());
        super.create(attributeList);
        
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation==DML_INSERT) {
            String pkValue=" sr_purchase_advance_id('"+ERPSolGlobClassModel.doGetUserCompanyCode()+"','"+ERPSolGlobClassModel.doGetUserLocationCode()+"',TO_DATE('"+getAdvanceDate()+"','YYYY-MM-DD'))";
            System.out.println(pkValue + "pk value");
            String result= ERPSolGlobClassModel.doGetERPSolPrimaryKeyValueModel(getDBTransaction(), pkValue, "dual", null, null);
            populateAttributeAsChanged(ADVANCECODE, result);
        }
        else if (operation==DML_UPDATE) {
            if (getPosted().equals("Y")) {
                populateAttributeAsChanged(MODIFIEDBY, ERPSolGlobClassModel.doGetUserCode());
               populateAttributeAsChanged(POSTEDDATE, oracle.jbo.domain.Date.getCurrentDate());
               
           }
        }
        super.doDML(operation, e);
    }
}

