package erpsolwom.erpsolwommodel.erpsolwomvo;

import erpsolwom.erpsolwommodel.erpsolwomeo.SrPurchaseAdvanceImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 20 22:22:24 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseAdvanceVORowImpl extends ViewRowImpl {
    public static final int ENTITY_SRPURCHASEADVANCE = 0;

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
        Locationid,
        Companyid,
        Doctypeid,
        txtLocationName,
        txtSupplierName,
        Remarks,
        AllLocationsVO,
        PuSuppliersVO,
        SrPurchaseOrderHeaderVO,
        AccAllLocationsVO,
        AccPuSuppliersVO,
        AccSrPurchaseOrderHeaderVO;
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
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int COMPANYID = AttributesEnum.Companyid.index();
    public static final int DOCTYPEID = AttributesEnum.Doctypeid.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int ALLLOCATIONSVO = AttributesEnum.AllLocationsVO.index();
    public static final int PUSUPPLIERSVO = AttributesEnum.PuSuppliersVO.index();
    public static final int SRPURCHASEORDERHEADERVO = AttributesEnum.SrPurchaseOrderHeaderVO.index();
    public static final int ACCALLLOCATIONSVO = AttributesEnum.AccAllLocationsVO.index();
    public static final int ACCPUSUPPLIERSVO = AttributesEnum.AccPuSuppliersVO.index();
    public static final int ACCSRPURCHASEORDERHEADERVO = AttributesEnum.AccSrPurchaseOrderHeaderVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseAdvanceVORowImpl() {
    }

    /**
     * Gets SrPurchaseAdvance entity object.
     * @return the SrPurchaseAdvance
     */
    public SrPurchaseAdvanceImpl getSrPurchaseAdvance() {
        return (SrPurchaseAdvanceImpl) getEntity(ENTITY_SRPURCHASEADVANCE);
    }

    /**
     * Gets the attribute value for ADVANCESEQNO using the alias name Advanceseqno.
     * @return the ADVANCESEQNO
     */
    public Integer getAdvanceseqno() {
        return (Integer) getAttributeInternal(ADVANCESEQNO);
    }

    /**
     * Sets <code>value</code> as attribute value for ADVANCESEQNO using the alias name Advanceseqno.
     * @param value value to set the ADVANCESEQNO
     */
    public void setAdvanceseqno(Integer value) {
        setAttributeInternal(ADVANCESEQNO, value);
    }

    /**
     * Gets the attribute value for ADVANCE_CODE using the alias name AdvanceCode.
     * @return the ADVANCE_CODE
     */
    public String getAdvanceCode() {
        return (String) getAttributeInternal(ADVANCECODE);
    }

    /**
     * Sets <code>value</code> as attribute value for ADVANCE_CODE using the alias name AdvanceCode.
     * @param value value to set the ADVANCE_CODE
     */
    public void setAdvanceCode(String value) {
        setAttributeInternal(ADVANCECODE, value);
    }

    /**
     * Gets the attribute value for ADVANCE_DATE using the alias name AdvanceDate.
     * @return the ADVANCE_DATE
     */
    public Date getAdvanceDate() {
        return (Date) getAttributeInternal(ADVANCEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for ADVANCE_DATE using the alias name AdvanceDate.
     * @param value value to set the ADVANCE_DATE
     */
    public void setAdvanceDate(Date value) {
        setAttributeInternal(ADVANCEDATE, value);
    }

    /**
     * Gets the attribute value for ADVANCE_TYPE using the alias name AdvanceType.
     * @return the ADVANCE_TYPE
     */
    public String getAdvanceType() {
        return (String) getAttributeInternal(ADVANCETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for ADVANCE_TYPE using the alias name AdvanceType.
     * @param value value to set the ADVANCE_TYPE
     */
    public void setAdvanceType(String value) {
        setAttributeInternal(ADVANCETYPE, value);
    }

    /**
     * Gets the attribute value for SUPPLIERID using the alias name Supplierid.
     * @return the SUPPLIERID
     */
    public String getSupplierid() {
        return (String) getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPPLIERID using the alias name Supplierid.
     * @param value value to set the SUPPLIERID
     */
    public void setSupplierid(String value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for PO_CODE using the alias name PoCode.
     * @return the PO_CODE
     */
    public String getPoCode() {
        return (String) getAttributeInternal(POCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for PO_CODE using the alias name PoCode.
     * @param value value to set the PO_CODE
     */
    public void setPoCode(String value) {
        setAttributeInternal(POCODE, value);
    }

    /**
     * Gets the attribute value for ADVANCE_AMOUNT using the alias name AdvanceAmount.
     * @return the ADVANCE_AMOUNT
     */
    public BigDecimal getAdvanceAmount() {
        return (BigDecimal) getAttributeInternal(ADVANCEAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for ADVANCE_AMOUNT using the alias name AdvanceAmount.
     * @param value value to set the ADVANCE_AMOUNT
     */
    public void setAdvanceAmount(BigDecimal value) {
        setAttributeInternal(ADVANCEAMOUNT, value);
    }

    /**
     * Gets the attribute value for BALANCE_AMOUNT using the alias name BalanceAmount.
     * @return the BALANCE_AMOUNT
     */
    public BigDecimal getBalanceAmount() {
        return (BigDecimal) getAttributeInternal(BALANCEAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for BALANCE_AMOUNT using the alias name BalanceAmount.
     * @param value value to set the BALANCE_AMOUNT
     */
    public void setBalanceAmount(BigDecimal value) {
        setAttributeInternal(BALANCEAMOUNT, value);
    }

    /**
     * Gets the attribute value for APPLIED_AMOUNT using the alias name AppliedAmount.
     * @return the APPLIED_AMOUNT
     */
    public BigDecimal getAppliedAmount() {
        return (BigDecimal) getAttributeInternal(APPLIEDAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for APPLIED_AMOUNT using the alias name AppliedAmount.
     * @param value value to set the APPLIED_AMOUNT
     */
    public void setAppliedAmount(BigDecimal value) {
        setAttributeInternal(APPLIEDAMOUNT, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for MODIFIED_BY using the alias name ModifiedBy.
     * @return the MODIFIED_BY
     */
    public String getModifiedBy() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIED_BY using the alias name ModifiedBy.
     * @param value value to set the MODIFIED_BY
     */
    public void setModifiedBy(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @return the MODIFIED_DATE
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @param value value to set the MODIFIED_DATE
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for POSTED using the alias name Posted.
     * @return the POSTED
     */
    public String getPosted() {
        return (String) getAttributeInternal(POSTED);
    }

    /**
     * Sets <code>value</code> as attribute value for POSTED using the alias name Posted.
     * @param value value to set the POSTED
     */
    public void setPosted(String value) {
        setAttributeInternal(POSTED, value);
    }

    /**
     * Gets the attribute value for POSTED_DATE using the alias name PostedDate.
     * @return the POSTED_DATE
     */
    public Date getPostedDate() {
        return (Date) getAttributeInternal(POSTEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for POSTED_DATE using the alias name PostedDate.
     * @param value value to set the POSTED_DATE
     */
    public void setPostedDate(Date value) {
        setAttributeInternal(POSTEDDATE, value);
    }

    /**
     * Gets the attribute value for LOCATIONID using the alias name Locationid.
     * @return the LOCATIONID
     */
    public String getLocationid() {
        return (String) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for LOCATIONID using the alias name Locationid.
     * @param value value to set the LOCATIONID
     */
    public void setLocationid(String value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for COMPANYID using the alias name Companyid.
     * @return the COMPANYID
     */
    public String getCompanyid() {
        return (String) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPANYID using the alias name Companyid.
     * @param value value to set the COMPANYID
     */
    public void setCompanyid(String value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for DOCTYPEID using the alias name Doctypeid.
     * @return the DOCTYPEID
     */
    public String getDoctypeid() {
        return (String) getAttributeInternal(DOCTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DOCTYPEID using the alias name Doctypeid.
     * @param value value to set the DOCTYPEID
     */
    public void setDoctypeid(String value) {
        setAttributeInternal(DOCTYPEID, value);
    }

    /**
     * Gets the attribute value for TXT_LOCATION_NAME using the alias name txtLocationName.
     * @return the TXT_LOCATION_NAME
     */
    public String gettxtLocationName() {
        return (String) getAttributeInternal(TXTLOCATIONNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_LOCATION_NAME using the alias name txtLocationName.
     * @param value value to set the TXT_LOCATION_NAME
     */
    public void settxtLocationName(String value) {
        setAttributeInternal(TXTLOCATIONNAME, value);
    }

    /**
     * Gets the attribute value for TXT_SUPPLIER_NAME using the alias name txtSupplierName.
     * @return the TXT_SUPPLIER_NAME
     */
    public String gettxtSupplierName() {
        return (String) getAttributeInternal(TXTSUPPLIERNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_SUPPLIER_NAME using the alias name txtSupplierName.
     * @param value value to set the TXT_SUPPLIER_NAME
     */
    public void settxtSupplierName(String value) {
        setAttributeInternal(TXTSUPPLIERNAME, value);
    }

    /**
     * Gets the attribute value for REMARKS using the alias name Remarks.
     * @return the REMARKS
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for REMARKS using the alias name Remarks.
     * @param value value to set the REMARKS
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link AllLocationsVO.
     */
    public Row getAllLocationsVO() {
        return (Row) getAttributeInternal(ALLLOCATIONSVO);
    }

    /**
     * Sets the master-detail link AllLocationsVO between this object and <code>value</code>.
     */
    public void setAllLocationsVO(Row value) {
        setAttributeInternal(ALLLOCATIONSVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link PuSuppliersVO.
     */
    public Row getPuSuppliersVO() {
        return (Row) getAttributeInternal(PUSUPPLIERSVO);
    }

    /**
     * Sets the master-detail link PuSuppliersVO between this object and <code>value</code>.
     */
    public void setPuSuppliersVO(Row value) {
        setAttributeInternal(PUSUPPLIERSVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SrPurchaseOrderHeaderVO.
     */
    public Row getSrPurchaseOrderHeaderVO() {
        return (Row) getAttributeInternal(SRPURCHASEORDERHEADERVO);
    }

    /**
     * Sets the master-detail link SrPurchaseOrderHeaderVO between this object and <code>value</code>.
     */
    public void setSrPurchaseOrderHeaderVO(Row value) {
        setAttributeInternal(SRPURCHASEORDERHEADERVO, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAllLocationsVO.
     */
    public RowSet getAccAllLocationsVO() {
        return (RowSet) getAttributeInternal(ACCALLLOCATIONSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccPuSuppliersVO.
     */
    public RowSet getAccPuSuppliersVO() {
        return (RowSet) getAttributeInternal(ACCPUSUPPLIERSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrPurchaseOrderHeaderVO.
     */
    public RowSet getAccSrPurchaseOrderHeaderVO() {
        return (RowSet) getAttributeInternal(ACCSRPURCHASEORDERHEADERVO);
    }
    @Override
    public boolean isAttributeUpdateable(int i) {
        if (getPosted().equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

