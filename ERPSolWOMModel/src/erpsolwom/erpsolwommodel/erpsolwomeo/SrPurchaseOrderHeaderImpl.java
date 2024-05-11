package erpsolwom.erpsolwommodel.erpsolwomeo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri May 10 22:44:09 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseOrderHeaderImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Poheaderseq,
        PoCode,
        RfqHeaderCode,
        Supplierid,
        ReferenceNo,
        BillTo,
        ShipTo,
        DemandCode,
        CompareCode,
        PoDate,
        Remarks,
        PoFor,
        PoType,
        Companyid,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        ModifiedDate,
        Locationid,
        txtLocationName,
        txtSupplierName,
        Posted,
        PostedDate,
        SrPurchaseOrderLines,
        AllLocations,
        PuSuppliers,
        SrPoReceivingHeader;
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


    public static final int POHEADERSEQ = AttributesEnum.Poheaderseq.index();
    public static final int POCODE = AttributesEnum.PoCode.index();
    public static final int RFQHEADERCODE = AttributesEnum.RfqHeaderCode.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int REFERENCENO = AttributesEnum.ReferenceNo.index();
    public static final int BILLTO = AttributesEnum.BillTo.index();
    public static final int SHIPTO = AttributesEnum.ShipTo.index();
    public static final int DEMANDCODE = AttributesEnum.DemandCode.index();
    public static final int COMPARECODE = AttributesEnum.CompareCode.index();
    public static final int PODATE = AttributesEnum.PoDate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int POFOR = AttributesEnum.PoFor.index();
    public static final int POTYPE = AttributesEnum.PoType.index();
    public static final int COMPANYID = AttributesEnum.Companyid.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDDATE = AttributesEnum.PostedDate.index();
    public static final int SRPURCHASEORDERLINES = AttributesEnum.SrPurchaseOrderLines.index();
    public static final int ALLLOCATIONS = AttributesEnum.AllLocations.index();
    public static final int PUSUPPLIERS = AttributesEnum.PuSuppliers.index();
    public static final int SRPORECEIVINGHEADER = AttributesEnum.SrPoReceivingHeader.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseOrderHeaderImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolwom.erpsolwommodel.erpsolwomeo.SrPurchaseOrderHeader");
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
     * Gets the attribute value for RfqHeaderCode, using the alias name RfqHeaderCode.
     * @return the value of RfqHeaderCode
     */
    public String getRfqHeaderCode() {
        return (String) getAttributeInternal(RFQHEADERCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RfqHeaderCode.
     * @param value value to set the RfqHeaderCode
     */
    public void setRfqHeaderCode(String value) {
        setAttributeInternal(RFQHEADERCODE, value);
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
     * Gets the attribute value for ReferenceNo, using the alias name ReferenceNo.
     * @return the value of ReferenceNo
     */
    public String getReferenceNo() {
        return (String) getAttributeInternal(REFERENCENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReferenceNo.
     * @param value value to set the ReferenceNo
     */
    public void setReferenceNo(String value) {
        setAttributeInternal(REFERENCENO, value);
    }

    /**
     * Gets the attribute value for BillTo, using the alias name BillTo.
     * @return the value of BillTo
     */
    public String getBillTo() {
        return (String) getAttributeInternal(BILLTO);
    }

    /**
     * Sets <code>value</code> as the attribute value for BillTo.
     * @param value value to set the BillTo
     */
    public void setBillTo(String value) {
        setAttributeInternal(BILLTO, value);
    }

    /**
     * Gets the attribute value for ShipTo, using the alias name ShipTo.
     * @return the value of ShipTo
     */
    public String getShipTo() {
        return (String) getAttributeInternal(SHIPTO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipTo.
     * @param value value to set the ShipTo
     */
    public void setShipTo(String value) {
        setAttributeInternal(SHIPTO, value);
    }

    /**
     * Gets the attribute value for DemandCode, using the alias name DemandCode.
     * @return the value of DemandCode
     */
    public String getDemandCode() {
        return (String) getAttributeInternal(DEMANDCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DemandCode.
     * @param value value to set the DemandCode
     */
    public void setDemandCode(String value) {
        setAttributeInternal(DEMANDCODE, value);
    }

    /**
     * Gets the attribute value for CompareCode, using the alias name CompareCode.
     * @return the value of CompareCode
     */
    public String getCompareCode() {
        return (String) getAttributeInternal(COMPARECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompareCode.
     * @param value value to set the CompareCode
     */
    public void setCompareCode(String value) {
        setAttributeInternal(COMPARECODE, value);
    }

    /**
     * Gets the attribute value for PoDate, using the alias name PoDate.
     * @return the value of PoDate
     */
    public Date getPoDate() {
        return (Date) getAttributeInternal(PODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoDate.
     * @param value value to set the PoDate
     */
    public void setPoDate(Date value) {
        setAttributeInternal(PODATE, value);
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
     * Gets the attribute value for PoFor, using the alias name PoFor.
     * @return the value of PoFor
     */
    public String getPoFor() {
        return (String) getAttributeInternal(POFOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoFor.
     * @param value value to set the PoFor
     */
    public void setPoFor(String value) {
        setAttributeInternal(POFOR, value);
    }

    /**
     * Gets the attribute value for PoType, using the alias name PoType.
     * @return the value of PoType
     */
    public String getPoType() {
        return (String) getAttributeInternal(POTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoType.
     * @param value value to set the PoType
     */
    public void setPoType(String value) {
        setAttributeInternal(POTYPE, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSrPurchaseOrderLines() {
        return (RowIterator) getAttributeInternal(SRPURCHASEORDERLINES);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSrPoReceivingHeader() {
        return (RowIterator) getAttributeInternal(SRPORECEIVINGHEADER);
    }


    /**
     * @param poheaderseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer poheaderseq) {
        return new Key(new Object[] { poheaderseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    @Override
    protected void create(AttributeList attributeList) {
        // TODO Implement this method
        setERPSolPKColumnName("Poheaderseq");
        setERPSolPKSeqName("SR_PURCHASE_ORDER_HEADER_Seq");
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
            String pkValue=" sr_purchase_order_id('"+ERPSolGlobClassModel.doGetUserCompanyCode()+"','"+ERPSolGlobClassModel.doGetUserLocationCode()+"',TO_DATE('"+getPoDate()+"','YYYY-MM-DD'))";
            System.out.println(pkValue + "pk value");
            String result= ERPSolGlobClassModel.doGetERPSolPrimaryKeyValueModel(getDBTransaction(), pkValue, "dual", null, null);
            populateAttributeAsChanged(POCODE, result);
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

