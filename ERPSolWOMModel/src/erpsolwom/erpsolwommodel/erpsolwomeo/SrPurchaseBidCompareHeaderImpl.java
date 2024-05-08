package erpsolwom.erpsolwommodel.erpsolwomeo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
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
// ---    Wed May 08 23:12:46 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseBidCompareHeaderImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Bidcompareheaderseq,
        BidCompareCode,
        CompareDate,
        DemandCode,
        RfqHeaderCode,
        Remarks,
        Locationid,
        Posted,
        Companyid,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        Modifieddate,
        PostedDate,
        txtLocationName,
        SrPurchaseBidCompareLines,
        AllLocations;
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
    public static final int BIDCOMPAREHEADERSEQ = AttributesEnum.Bidcompareheaderseq.index();
    public static final int BIDCOMPARECODE = AttributesEnum.BidCompareCode.index();
    public static final int COMPAREDATE = AttributesEnum.CompareDate.index();
    public static final int DEMANDCODE = AttributesEnum.DemandCode.index();
    public static final int RFQHEADERCODE = AttributesEnum.RfqHeaderCode.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int COMPANYID = AttributesEnum.Companyid.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.Modifieddate.index();
    public static final int POSTEDDATE = AttributesEnum.PostedDate.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int SRPURCHASEBIDCOMPARELINES = AttributesEnum.SrPurchaseBidCompareLines.index();
    public static final int ALLLOCATIONS = AttributesEnum.AllLocations.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseBidCompareHeaderImpl() {
    }

    /**
     * Gets the attribute value for Bidcompareheaderseq, using the alias name Bidcompareheaderseq.
     * @return the value of Bidcompareheaderseq
     */
    public Integer getBidcompareheaderseq() {
        return (Integer) getAttributeInternal(BIDCOMPAREHEADERSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Bidcompareheaderseq.
     * @param value value to set the Bidcompareheaderseq
     */
    public void setBidcompareheaderseq(Integer value) {
        setAttributeInternal(BIDCOMPAREHEADERSEQ, value);
    }

    /**
     * Gets the attribute value for BidCompareCode, using the alias name BidCompareCode.
     * @return the value of BidCompareCode
     */
    public String getBidCompareCode() {
        return (String) getAttributeInternal(BIDCOMPARECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BidCompareCode.
     * @param value value to set the BidCompareCode
     */
    public void setBidCompareCode(String value) {
        setAttributeInternal(BIDCOMPARECODE, value);
    }

    /**
     * Gets the attribute value for CompareDate, using the alias name CompareDate.
     * @return the value of CompareDate
     */
    public Date getCompareDate() {
        return (Date) getAttributeInternal(COMPAREDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompareDate.
     * @param value value to set the CompareDate
     */
    public void setCompareDate(Date value) {
        setAttributeInternal(COMPAREDATE, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSrPurchaseBidCompareLines() {
        return (RowIterator) getAttributeInternal(SRPURCHASEBIDCOMPARELINES);
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
     * @param bidcompareheaderseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer bidcompareheaderseq) {
        return new Key(new Object[] { bidcompareheaderseq });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolwom.erpsolwommodel.erpsolwomeo.SrPurchaseBidCompareHeader");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
        protected void create(AttributeList attributeList) {
            // TODO Implement this method
            setERPSolPKColumnName("Bidcompareheaderseq");
            setERPSolPKSeqName("SR_PURCHASE_BID_COMP_HEAD_seq");
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
            String pkValue=" SR_PURCHASE_BID_COMPARE_ID('"+ERPSolGlobClassModel.doGetUserCompanyCode()+"','"+ERPSolGlobClassModel.doGetUserLocationCode()+"',TO_DATE('"+getCompareDate()+"','YYYY-MM-DD'))";
            System.out.println(pkValue + "pk value");
            String result= ERPSolGlobClassModel.doGetERPSolPrimaryKeyValueModel(getDBTransaction(), pkValue, "dual", null, null);
            populateAttributeAsChanged(BIDCOMPARECODE, result);
        }
        else if (operation==DML_UPDATE) {
            if (getPosted().equals("Y")) {
                populateAttributeAsChanged(MODIFIEDBY, ERPSolGlobClassModel.doGetUserCode());
               populateAttributeAsChanged(MODIFIEDDATE, oracle.jbo.domain.Date.getCurrentDate());
               
           }
        }
        super.doDML(operation, e);
    }
}
