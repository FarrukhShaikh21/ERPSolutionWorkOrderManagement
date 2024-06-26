package erpsolwom.erpsolwommodel.erpsolwomeo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun May 05 19:47:49 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseRfqSupplierImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Rfqsupplierseqno,
        Rfqheaderseqno,
        Supplierid,
        ContactNo,
        SupplierRemarks,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        Modifieddate,
        txtRfqHeaderCode,
        SrPurchaseRfqHeader,
        SrPurchaseBidHeader,
        PuSuppliers;
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


    public static final int RFQSUPPLIERSEQNO = AttributesEnum.Rfqsupplierseqno.index();
    public static final int RFQHEADERSEQNO = AttributesEnum.Rfqheaderseqno.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int CONTACTNO = AttributesEnum.ContactNo.index();
    public static final int SUPPLIERREMARKS = AttributesEnum.SupplierRemarks.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.Modifieddate.index();
    public static final int TXTRFQHEADERCODE = AttributesEnum.txtRfqHeaderCode.index();
    public static final int SRPURCHASERFQHEADER = AttributesEnum.SrPurchaseRfqHeader.index();
    public static final int SRPURCHASEBIDHEADER = AttributesEnum.SrPurchaseBidHeader.index();
    public static final int PUSUPPLIERS = AttributesEnum.PuSuppliers.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseRfqSupplierImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolwom.erpsolwommodel.erpsolwomeo.SrPurchaseRfqSupplier");
    }


    /**
     * Gets the attribute value for Rfqsupplierseqno, using the alias name Rfqsupplierseqno.
     * @return the value of Rfqsupplierseqno
     */
    public Integer getRfqsupplierseqno() {
        return (Integer) getAttributeInternal(RFQSUPPLIERSEQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rfqsupplierseqno.
     * @param value value to set the Rfqsupplierseqno
     */
    public void setRfqsupplierseqno(Integer value) {
        setAttributeInternal(RFQSUPPLIERSEQNO, value);
    }

    /**
     * Gets the attribute value for Rfqheaderseqno, using the alias name Rfqheaderseqno.
     * @return the value of Rfqheaderseqno
     */
    public Integer getRfqheaderseqno() {
        return (Integer) getAttributeInternal(RFQHEADERSEQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rfqheaderseqno.
     * @param value value to set the Rfqheaderseqno
     */
    public void setRfqheaderseqno(Integer value) {
        setAttributeInternal(RFQHEADERSEQNO, value);
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
     * Gets the attribute value for ContactNo, using the alias name ContactNo.
     * @return the value of ContactNo
     */
    public String getContactNo() {
        return (String) getAttributeInternal(CONTACTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactNo.
     * @param value value to set the ContactNo
     */
    public void setContactNo(String value) {
        setAttributeInternal(CONTACTNO, value);
    }

    /**
     * Gets the attribute value for SupplierRemarks, using the alias name SupplierRemarks.
     * @return the value of SupplierRemarks
     */
    public String getSupplierRemarks() {
        return (String) getAttributeInternal(SUPPLIERREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierRemarks.
     * @param value value to set the SupplierRemarks
     */
    public void setSupplierRemarks(String value) {
        setAttributeInternal(SUPPLIERREMARKS, value);
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
     * Gets the attribute value for Modifieddate, using the alias name Modifieddate.
     * @return the value of Modifieddate
     */
    public Date getModifieddate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Modifieddate.
     * @param value value to set the Modifieddate
     */
    public void setModifieddate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for txtRfqHeaderCode, using the alias name txtRfqHeaderCode.
     * @return the value of txtRfqHeaderCode
     */
    public String gettxtRfqHeaderCode() {
        return (String) getAttributeInternal(TXTRFQHEADERCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtRfqHeaderCode.
     * @param value value to set the txtRfqHeaderCode
     */
    public void settxtRfqHeaderCode(String value) {
        setAttributeInternal(TXTRFQHEADERCODE, value);
    }

    /**
     * @return the associated entity SrPurchaseRfqHeaderImpl.
     */
    public SrPurchaseRfqHeaderImpl getSrPurchaseRfqHeader() {
        return (SrPurchaseRfqHeaderImpl) getAttributeInternal(SRPURCHASERFQHEADER);
    }

    /**
     * Sets <code>value</code> as the associated entity SrPurchaseRfqHeaderImpl.
     */
    public void setSrPurchaseRfqHeader(SrPurchaseRfqHeaderImpl value) {
        setAttributeInternal(SRPURCHASERFQHEADER, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSrPurchaseBidHeader() {
        return (RowIterator) getAttributeInternal(SRPURCHASEBIDHEADER);
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
     * @param rfqsupplierseqno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer rfqsupplierseqno) {
        return new Key(new Object[] { rfqsupplierseqno });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    @Override
    protected void create(AttributeList attributeList) {
        // TODO Implement this method
        setERPSolPKColumnName("Rfqsupplierseqno");
        setERPSolPKSeqName("SR_PURCHASE_RFQ_SUPPLIER_SEQ");
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

