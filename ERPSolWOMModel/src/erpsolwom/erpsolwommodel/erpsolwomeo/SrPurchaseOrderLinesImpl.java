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
// ---    Fri May 10 23:30:09 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseOrderLinesImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Polinesseq,
        Poheaderseq,
        Bidcomparelinesseq,
        Bidlinesseq,
        Demandlinesseq,
        Rfqlinesseqno,
        ItemId,
        PoRate,
        Quantity,
        GrossAmount,
        TaxRate,
        NetAmount,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        Modifieddate,
        DepartmentId,
        ProjectId,
        txtTaxAmount,
        txtGrossAmount,
        txtNetAmount,
        txtItemName,
        SrPurchaseOrderHeader,
        SrItems;
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

    public static final int POLINESSEQ = AttributesEnum.Polinesseq.index();
    public static final int POHEADERSEQ = AttributesEnum.Poheaderseq.index();
    public static final int BIDCOMPARELINESSEQ = AttributesEnum.Bidcomparelinesseq.index();
    public static final int BIDLINESSEQ = AttributesEnum.Bidlinesseq.index();
    public static final int DEMANDLINESSEQ = AttributesEnum.Demandlinesseq.index();
    public static final int RFQLINESSEQNO = AttributesEnum.Rfqlinesseqno.index();
    public static final int ITEMID = AttributesEnum.ItemId.index();
    public static final int PORATE = AttributesEnum.PoRate.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int GROSSAMOUNT = AttributesEnum.GrossAmount.index();
    public static final int TAXRATE = AttributesEnum.TaxRate.index();
    public static final int NETAMOUNT = AttributesEnum.NetAmount.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.Modifieddate.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int TXTTAXAMOUNT = AttributesEnum.txtTaxAmount.index();
    public static final int TXTGROSSAMOUNT = AttributesEnum.txtGrossAmount.index();
    public static final int TXTNETAMOUNT = AttributesEnum.txtNetAmount.index();
    public static final int TXTITEMNAME = AttributesEnum.txtItemName.index();
    public static final int SRPURCHASEORDERHEADER = AttributesEnum.SrPurchaseOrderHeader.index();
    public static final int SRITEMS = AttributesEnum.SrItems.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseOrderLinesImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolwom.erpsolwommodel.erpsolwomeo.SrPurchaseOrderLines");
    }

    /**
     * Gets the attribute value for Polinesseq, using the alias name Polinesseq.
     * @return the value of Polinesseq
     */
    public Integer getPolinesseq() {
        return (Integer) getAttributeInternal(POLINESSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Polinesseq.
     * @param value value to set the Polinesseq
     */
    public void setPolinesseq(Integer value) {
        setAttributeInternal(POLINESSEQ, value);
    }

    /**
     * Gets the attribute value for Poheaderseq, using the alias name Poheaderseq.
     * @return the value of Poheaderseq
     */
    public Integer getPoheaderseq() {
        return (Integer) getAttributeInternal(POHEADERSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Poheaderseq.
     * @param value value to set the Poheaderseq
     */
    public void setPoheaderseq(Integer value) {
        setAttributeInternal(POHEADERSEQ, value);
    }

    /**
     * Gets the attribute value for Bidcomparelinesseq, using the alias name Bidcomparelinesseq.
     * @return the value of Bidcomparelinesseq
     */
    public Integer getBidcomparelinesseq() {
        return (Integer) getAttributeInternal(BIDCOMPARELINESSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Bidcomparelinesseq.
     * @param value value to set the Bidcomparelinesseq
     */
    public void setBidcomparelinesseq(Integer value) {
        setAttributeInternal(BIDCOMPARELINESSEQ, value);
    }

    /**
     * Gets the attribute value for Bidlinesseq, using the alias name Bidlinesseq.
     * @return the value of Bidlinesseq
     */
    public Integer getBidlinesseq() {
        return (Integer) getAttributeInternal(BIDLINESSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Bidlinesseq.
     * @param value value to set the Bidlinesseq
     */
    public void setBidlinesseq(Integer value) {
        setAttributeInternal(BIDLINESSEQ, value);
    }

    /**
     * Gets the attribute value for Demandlinesseq, using the alias name Demandlinesseq.
     * @return the value of Demandlinesseq
     */
    public Integer getDemandlinesseq() {
        return (Integer) getAttributeInternal(DEMANDLINESSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Demandlinesseq.
     * @param value value to set the Demandlinesseq
     */
    public void setDemandlinesseq(Integer value) {
        setAttributeInternal(DEMANDLINESSEQ, value);
    }

    /**
     * Gets the attribute value for Rfqlinesseqno, using the alias name Rfqlinesseqno.
     * @return the value of Rfqlinesseqno
     */
    public Integer getRfqlinesseqno() {
        return (Integer) getAttributeInternal(RFQLINESSEQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rfqlinesseqno.
     * @param value value to set the Rfqlinesseqno
     */
    public void setRfqlinesseqno(Integer value) {
        setAttributeInternal(RFQLINESSEQNO, value);
    }

    /**
     * Gets the attribute value for ItemId, using the alias name ItemId.
     * @return the value of ItemId
     */
    public Integer getItemId() {
        return (Integer) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemId.
     * @param value value to set the ItemId
     */
    public void setItemId(Integer value) {
        setAttributeInternal(ITEMID, value);
    }

    /**
     * Gets the attribute value for PoRate, using the alias name PoRate.
     * @return the value of PoRate
     */
    public BigDecimal getPoRate() {
        return (BigDecimal) getAttributeInternal(PORATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoRate.
     * @param value value to set the PoRate
     */
    public void setPoRate(BigDecimal value) {
        setAttributeInternal(PORATE, value);
    }

    /**
     * Gets the attribute value for Quantity, using the alias name Quantity.
     * @return the value of Quantity
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quantity.
     * @param value value to set the Quantity
     */
    public void setQuantity(BigDecimal value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for GrossAmount, using the alias name GrossAmount.
     * @return the value of GrossAmount
     */
    public BigDecimal getGrossAmount() {
        return (BigDecimal) getAttributeInternal(GROSSAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrossAmount.
     * @param value value to set the GrossAmount
     */
    public void setGrossAmount(BigDecimal value) {
        setAttributeInternal(GROSSAMOUNT, value);
    }

    /**
     * Gets the attribute value for TaxRate, using the alias name TaxRate.
     * @return the value of TaxRate
     */
    public BigDecimal getTaxRate() {
        return (BigDecimal) getAttributeInternal(TAXRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxRate.
     * @param value value to set the TaxRate
     */
    public void setTaxRate(BigDecimal value) {
        setAttributeInternal(TAXRATE, value);
    }

    /**
     * Gets the attribute value for NetAmount, using the alias name NetAmount.
     * @return the value of NetAmount
     */
    public BigDecimal getNetAmount() {
        return (BigDecimal) getAttributeInternal(NETAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for NetAmount.
     * @param value value to set the NetAmount
     */
    public void setNetAmount(BigDecimal value) {
        setAttributeInternal(NETAMOUNT, value);
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
     * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
     * @return the value of DepartmentId
     */
    public String getDepartmentId() {
        return (String) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentId.
     * @param value value to set the DepartmentId
     */
    public void setDepartmentId(String value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for ProjectId, using the alias name ProjectId.
     * @return the value of ProjectId
     */
    public Integer getProjectId() {
        return (Integer) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectId.
     * @param value value to set the ProjectId
     */
    public void setProjectId(Integer value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for txtTaxAmount, using the alias name txtTaxAmount.
     * @return the value of txtTaxAmount
     */
    public BigDecimal gettxtTaxAmount() {
        return (BigDecimal) getAttributeInternal(TXTTAXAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtTaxAmount.
     * @param value value to set the txtTaxAmount
     */
    public void settxtTaxAmount(BigDecimal value) {
        setAttributeInternal(TXTTAXAMOUNT, value);
    }

    /**
     * Gets the attribute value for txtGrossAmount, using the alias name txtGrossAmount.
     * @return the value of txtGrossAmount
     */
    public BigDecimal gettxtGrossAmount() {
        return (BigDecimal) getAttributeInternal(TXTGROSSAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtGrossAmount.
     * @param value value to set the txtGrossAmount
     */
    public void settxtGrossAmount(BigDecimal value) {
        setAttributeInternal(TXTGROSSAMOUNT, value);
    }

    /**
     * Gets the attribute value for txtNetAmount, using the alias name txtNetAmount.
     * @return the value of txtNetAmount
     */
    public BigDecimal gettxtNetAmount() {
        return (BigDecimal) getAttributeInternal(TXTNETAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtNetAmount.
     * @param value value to set the txtNetAmount
     */
    public void settxtNetAmount(BigDecimal value) {
        setAttributeInternal(TXTNETAMOUNT, value);
    }

    /**
     * Gets the attribute value for txtItemName, using the alias name txtItemName.
     * @return the value of txtItemName
     */
    public String gettxtItemName() {
        return (String) getAttributeInternal(TXTITEMNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtItemName.
     * @param value value to set the txtItemName
     */
    public void settxtItemName(String value) {
        setAttributeInternal(TXTITEMNAME, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSrItems() {
        return (EntityImpl) getAttributeInternal(SRITEMS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSrItems(EntityImpl value) {
        setAttributeInternal(SRITEMS, value);
    }


    /**
     * @param polinesseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer polinesseq) {
        return new Key(new Object[] { polinesseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        // TODO Implement this method
        setERPSolPKColumnName("Polinesseq");
        setERPSolPKSeqName("SR_PURCHASE_ORDER_LINES_SEQ");
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

