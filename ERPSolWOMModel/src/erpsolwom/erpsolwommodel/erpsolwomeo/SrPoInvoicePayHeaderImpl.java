package erpsolwom.erpsolwommodel.erpsolwomeo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 27 23:09:41 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPoInvoicePayHeaderImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Invoicepayseq,
        InvoicePayCode,
        Supplierid,
        PayDate,
        Locationid,
        Remarks,
        Companyid,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        ModifiedDate,
        Posted,
        PostedDate,
        Doctypeid,
        SrPoInvoicePayAdvance,
        SrPoInvoicePayLines;
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


    public static final int INVOICEPAYSEQ = AttributesEnum.Invoicepayseq.index();
    public static final int INVOICEPAYCODE = AttributesEnum.InvoicePayCode.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int PAYDATE = AttributesEnum.PayDate.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int COMPANYID = AttributesEnum.Companyid.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDDATE = AttributesEnum.PostedDate.index();
    public static final int DOCTYPEID = AttributesEnum.Doctypeid.index();
    public static final int SRPOINVOICEPAYADVANCE = AttributesEnum.SrPoInvoicePayAdvance.index();
    public static final int SRPOINVOICEPAYLINES = AttributesEnum.SrPoInvoicePayLines.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPoInvoicePayHeaderImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolwom.erpsolwommodel.erpsolwomeo.SrPoInvoicePayHeader");
    }


    /**
     * Gets the attribute value for Invoicepayseq, using the alias name Invoicepayseq.
     * @return the value of Invoicepayseq
     */
    public Integer getInvoicepayseq() {
        return (Integer) getAttributeInternal(INVOICEPAYSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Invoicepayseq.
     * @param value value to set the Invoicepayseq
     */
    public void setInvoicepayseq(Integer value) {
        setAttributeInternal(INVOICEPAYSEQ, value);
    }

    /**
     * Gets the attribute value for InvoicePayCode, using the alias name InvoicePayCode.
     * @return the value of InvoicePayCode
     */
    public String getInvoicePayCode() {
        return (String) getAttributeInternal(INVOICEPAYCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvoicePayCode.
     * @param value value to set the InvoicePayCode
     */
    public void setInvoicePayCode(String value) {
        setAttributeInternal(INVOICEPAYCODE, value);
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
     * Gets the attribute value for PayDate, using the alias name PayDate.
     * @return the value of PayDate
     */
    public Date getPayDate() {
        return (Date) getAttributeInternal(PAYDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PayDate.
     * @param value value to set the PayDate
     */
    public void setPayDate(Date value) {
        setAttributeInternal(PAYDATE, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSrPoInvoicePayAdvance() {
        return (RowIterator) getAttributeInternal(SRPOINVOICEPAYADVANCE);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSrPoInvoicePayLines() {
        return (RowIterator) getAttributeInternal(SRPOINVOICEPAYLINES);
    }


    /**
     * @param invoicepayseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer invoicepayseq) {
        return new Key(new Object[] { invoicepayseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        // TODO Implement this method
        setERPSolPKColumnName("Invoicepayseq");
        setERPSolPKSeqName("SR_PO_INVOICE_PAY_HEADER_SEQ");
        setLocationid(ERPSolGlobClassModel.doGetUserLocationCode());
        setCompanyid(ERPSolGlobClassModel.doGetUserCompanyCode());
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
        if (operation==DML_INSERT) {
            String pkValue=" sr_po_invoice_pay_id('"+ERPSolGlobClassModel.doGetUserCompanyCode()+"','"+ERPSolGlobClassModel.doGetUserLocationCode()+"',TO_DATE('"+getPayDate()+"','YYYY-MM-DD'))";
            System.out.println(pkValue + "pk value");
            String result= ERPSolGlobClassModel.doGetERPSolPrimaryKeyValueModel(getDBTransaction(), pkValue, "dual", null, null);
            populateAttributeAsChanged(INVOICEPAYCODE, result);
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

