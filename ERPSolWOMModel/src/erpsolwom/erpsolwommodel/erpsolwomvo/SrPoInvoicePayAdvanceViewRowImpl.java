package erpsolwom.erpsolwommodel.erpsolwomvo;

import erpsolwom.erpsolwommodel.erpsolwomeo.SrPoInvoicePayAdvanceImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jun 01 17:42:46 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPoInvoicePayAdvanceViewRowImpl extends ViewRowImpl {

    public static final int ENTITY_SRPOINVOICEPAYADVANCE = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Payadvanceseq,
        Invoicepayseq,
        AdvanceCode,
        AdvanceAmount,
        Remarks,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        ModifiedDate,
        SrPoInvoicePayHeaderView,
        AccSrPurchaseAdvanceVO;
        static AttributesEnum[] vals = null;
        ;
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

    public static final int PAYADVANCESEQ = AttributesEnum.Payadvanceseq.index();
    public static final int INVOICEPAYSEQ = AttributesEnum.Invoicepayseq.index();
    public static final int ADVANCECODE = AttributesEnum.AdvanceCode.index();
    public static final int ADVANCEAMOUNT = AttributesEnum.AdvanceAmount.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int SRPOINVOICEPAYHEADERVIEW = AttributesEnum.SrPoInvoicePayHeaderView.index();
    public static final int ACCSRPURCHASEADVANCEVO = AttributesEnum.AccSrPurchaseAdvanceVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPoInvoicePayAdvanceViewRowImpl() {
    }

    /**
     * Gets SrPoInvoicePayAdvance entity object.
     * @return the SrPoInvoicePayAdvance
     */
    public SrPoInvoicePayAdvanceImpl getSrPoInvoicePayAdvance() {
        return (SrPoInvoicePayAdvanceImpl) getEntity(ENTITY_SRPOINVOICEPAYADVANCE);
    }

    /**
     * Gets the attribute value for PAYADVANCESEQ using the alias name Payadvanceseq.
     * @return the PAYADVANCESEQ
     */
    public Integer getPayadvanceseq() {
        return (Integer) getAttributeInternal(PAYADVANCESEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for PAYADVANCESEQ using the alias name Payadvanceseq.
     * @param value value to set the PAYADVANCESEQ
     */
    public void setPayadvanceseq(Integer value) {
        setAttributeInternal(PAYADVANCESEQ, value);
    }

    /**
     * Gets the attribute value for INVOICEPAYSEQ using the alias name Invoicepayseq.
     * @return the INVOICEPAYSEQ
     */
    public Integer getInvoicepayseq() {
        return (Integer) getAttributeInternal(INVOICEPAYSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOICEPAYSEQ using the alias name Invoicepayseq.
     * @param value value to set the INVOICEPAYSEQ
     */
    public void setInvoicepayseq(Integer value) {
        setAttributeInternal(INVOICEPAYSEQ, value);
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
     * Gets the associated <code>Row</code> using master-detail link SrPoInvoicePayHeaderView.
     */
    public Row getSrPoInvoicePayHeaderView() {
        return (Row) getAttributeInternal(SRPOINVOICEPAYHEADERVIEW);
    }

    /**
     * Sets the master-detail link SrPoInvoicePayHeaderView between this object and <code>value</code>.
     */
    public void setSrPoInvoicePayHeaderView(Row value) {
        setAttributeInternal(SRPOINVOICEPAYHEADERVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrPurchaseAdvanceVO.
     */
    public RowSet getAccSrPurchaseAdvanceVO() {
        return (RowSet) getAttributeInternal(ACCSRPURCHASEADVANCEVO);
    }
    @Override
    public boolean isAttributeUpdateable(int i) {
        if (getSrPoInvoicePayHeaderView().getAttribute("Posted").equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

