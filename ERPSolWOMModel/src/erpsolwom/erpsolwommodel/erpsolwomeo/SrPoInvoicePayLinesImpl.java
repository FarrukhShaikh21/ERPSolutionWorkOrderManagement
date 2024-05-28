package erpsolwom.erpsolwommodel.erpsolwomeo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 27 23:10:34 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPoInvoicePayLinesImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Paylinesseq,
        Invoicepayseq,
        InvoiceCode,
        InvoiceAmount,
        Remarks,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        ModifiedDate,
        Posted,
        PostedDate,
        SrPoInvoicePayHeader,
        SrPoInvoiceHeader;
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


    public static final int PAYLINESSEQ = AttributesEnum.Paylinesseq.index();
    public static final int INVOICEPAYSEQ = AttributesEnum.Invoicepayseq.index();
    public static final int INVOICECODE = AttributesEnum.InvoiceCode.index();
    public static final int INVOICEAMOUNT = AttributesEnum.InvoiceAmount.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDDATE = AttributesEnum.PostedDate.index();
    public static final int SRPOINVOICEPAYHEADER = AttributesEnum.SrPoInvoicePayHeader.index();
    public static final int SRPOINVOICEHEADER = AttributesEnum.SrPoInvoiceHeader.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPoInvoicePayLinesImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolwom.erpsolwommodel.erpsolwomeo.SrPoInvoicePayLines");
    }


    /**
     * Gets the attribute value for Paylinesseq, using the alias name Paylinesseq.
     * @return the value of Paylinesseq
     */
    public BigDecimal getPaylinesseq() {
        return (BigDecimal) getAttributeInternal(PAYLINESSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Paylinesseq.
     * @param value value to set the Paylinesseq
     */
    public void setPaylinesseq(BigDecimal value) {
        setAttributeInternal(PAYLINESSEQ, value);
    }

    /**
     * Gets the attribute value for Invoicepayseq, using the alias name Invoicepayseq.
     * @return the value of Invoicepayseq
     */
    public BigDecimal getInvoicepayseq() {
        return (BigDecimal) getAttributeInternal(INVOICEPAYSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Invoicepayseq.
     * @param value value to set the Invoicepayseq
     */
    public void setInvoicepayseq(BigDecimal value) {
        setAttributeInternal(INVOICEPAYSEQ, value);
    }

    /**
     * Gets the attribute value for InvoiceCode, using the alias name InvoiceCode.
     * @return the value of InvoiceCode
     */
    public String getInvoiceCode() {
        return (String) getAttributeInternal(INVOICECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvoiceCode.
     * @param value value to set the InvoiceCode
     */
    public void setInvoiceCode(String value) {
        setAttributeInternal(INVOICECODE, value);
    }

    /**
     * Gets the attribute value for InvoiceAmount, using the alias name InvoiceAmount.
     * @return the value of InvoiceAmount
     */
    public BigDecimal getInvoiceAmount() {
        return (BigDecimal) getAttributeInternal(INVOICEAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvoiceAmount.
     * @param value value to set the InvoiceAmount
     */
    public void setInvoiceAmount(BigDecimal value) {
        setAttributeInternal(INVOICEAMOUNT, value);
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
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Timestamp value) {
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
    public Timestamp getModifiedDate() {
        return (Timestamp) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedDate.
     * @param value value to set the ModifiedDate
     */
    public void setModifiedDate(Timestamp value) {
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
    public Timestamp getPostedDate() {
        return (Timestamp) getAttributeInternal(POSTEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PostedDate.
     * @param value value to set the PostedDate
     */
    public void setPostedDate(Timestamp value) {
        setAttributeInternal(POSTEDDATE, value);
    }

    /**
     * @return the associated entity SrPoInvoicePayHeaderImpl.
     */
    public SrPoInvoicePayHeaderImpl getSrPoInvoicePayHeader() {
        return (SrPoInvoicePayHeaderImpl) getAttributeInternal(SRPOINVOICEPAYHEADER);
    }

    /**
     * Sets <code>value</code> as the associated entity SrPoInvoicePayHeaderImpl.
     */
    public void setSrPoInvoicePayHeader(SrPoInvoicePayHeaderImpl value) {
        setAttributeInternal(SRPOINVOICEPAYHEADER, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSrPoInvoiceHeader() {
        return (EntityImpl) getAttributeInternal(SRPOINVOICEHEADER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSrPoInvoiceHeader(EntityImpl value) {
        setAttributeInternal(SRPOINVOICEHEADER, value);
    }


    /**
     * @param paylinesseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal paylinesseq) {
        return new Key(new Object[] { paylinesseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        // TODO Implement this method
        setERPSolPKColumnName("Paylinesseq");
        setERPSolPKSeqName("SR_PO_INVOICE_PAY_LINES_SEQ");
        //        setERPISGenertePK("NO");
        //        SequenceImpl seq = new SequenceImpl("SO_SALES_ORDER_SEQ", getDBTransaction());
        //        setSalesorderseq(seq.getSequenceNumber());
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
        super.doDML(operation, e);
    }
}

