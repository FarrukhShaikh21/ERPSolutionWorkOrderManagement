package erpsolwom.erpsolwommodel.erpsolwomeo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 07 23:01:16 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseBidHeaderImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Bidheaderseq,
        BidCode,
        BidDate,
        DemandCode,
        SupplierQuoteNo,
        RfqHeaderCode,
        Supplierid,
        Remarks,
        Locationid,
        ResponseDate,
        Posted,
        EffectiveFrom,
        EffectiveTo,
        Companyid,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        Modifieddate,
        txtLocationName,
        Rfqsupplierseqno,
        txtSupplierName,
        SrPurchaseBidLines,
        AllLocations,
        SrPurchaseRfqSupplier,
        PuSuppliers,
        SrPurchaseDemandHeader,
        SrPurchaseRfqHeader;
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


    public static final int BIDHEADERSEQ = AttributesEnum.Bidheaderseq.index();
    public static final int BIDCODE = AttributesEnum.BidCode.index();
    public static final int BIDDATE = AttributesEnum.BidDate.index();
    public static final int DEMANDCODE = AttributesEnum.DemandCode.index();
    public static final int SUPPLIERQUOTENO = AttributesEnum.SupplierQuoteNo.index();
    public static final int RFQHEADERCODE = AttributesEnum.RfqHeaderCode.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int RESPONSEDATE = AttributesEnum.ResponseDate.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int EFFECTIVEFROM = AttributesEnum.EffectiveFrom.index();
    public static final int EFFECTIVETO = AttributesEnum.EffectiveTo.index();
    public static final int COMPANYID = AttributesEnum.Companyid.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.Modifieddate.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int RFQSUPPLIERSEQNO = AttributesEnum.Rfqsupplierseqno.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int SRPURCHASEBIDLINES = AttributesEnum.SrPurchaseBidLines.index();
    public static final int ALLLOCATIONS = AttributesEnum.AllLocations.index();
    public static final int SRPURCHASERFQSUPPLIER = AttributesEnum.SrPurchaseRfqSupplier.index();
    public static final int PUSUPPLIERS = AttributesEnum.PuSuppliers.index();
    public static final int SRPURCHASEDEMANDHEADER = AttributesEnum.SrPurchaseDemandHeader.index();
    public static final int SRPURCHASERFQHEADER = AttributesEnum.SrPurchaseRfqHeader.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseBidHeaderImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolwom.erpsolwommodel.erpsolwomeo.SrPurchaseBidHeader");
    }


    /**
     * Gets the attribute value for Bidheaderseq, using the alias name Bidheaderseq.
     * @return the value of Bidheaderseq
     */
    public Integer getBidheaderseq() {
        return (Integer) getAttributeInternal(BIDHEADERSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Bidheaderseq.
     * @param value value to set the Bidheaderseq
     */
    public void setBidheaderseq(Integer value) {
        setAttributeInternal(BIDHEADERSEQ, value);
    }

    /**
     * Gets the attribute value for BidCode, using the alias name BidCode.
     * @return the value of BidCode
     */
    public String getBidCode() {
        return (String) getAttributeInternal(BIDCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BidCode.
     * @param value value to set the BidCode
     */
    public void setBidCode(String value) {
        setAttributeInternal(BIDCODE, value);
    }

    /**
     * Gets the attribute value for BidDate, using the alias name BidDate.
     * @return the value of BidDate
     */
    public Date getBidDate() {
        return (Date) getAttributeInternal(BIDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BidDate.
     * @param value value to set the BidDate
     */
    public void setBidDate(Date value) {
        setAttributeInternal(BIDDATE, value);
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
     * Gets the attribute value for SupplierQuoteNo, using the alias name SupplierQuoteNo.
     * @return the value of SupplierQuoteNo
     */
    public String getSupplierQuoteNo() {
        return (String) getAttributeInternal(SUPPLIERQUOTENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierQuoteNo.
     * @param value value to set the SupplierQuoteNo
     */
    public void setSupplierQuoteNo(String value) {
        setAttributeInternal(SUPPLIERQUOTENO, value);
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
     * Gets the attribute value for ResponseDate, using the alias name ResponseDate.
     * @return the value of ResponseDate
     */
    public Date getResponseDate() {
        return (Date) getAttributeInternal(RESPONSEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ResponseDate.
     * @param value value to set the ResponseDate
     */
    public void setResponseDate(Date value) {
        setAttributeInternal(RESPONSEDATE, value);
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
     * Gets the attribute value for EffectiveFrom, using the alias name EffectiveFrom.
     * @return the value of EffectiveFrom
     */
    public Date getEffectiveFrom() {
        return (Date) getAttributeInternal(EFFECTIVEFROM);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveFrom.
     * @param value value to set the EffectiveFrom
     */
    public void setEffectiveFrom(Date value) {
        setAttributeInternal(EFFECTIVEFROM, value);
    }

    /**
     * Gets the attribute value for EffectiveTo, using the alias name EffectiveTo.
     * @return the value of EffectiveTo
     */
    public Date getEffectiveTo() {
        return (Date) getAttributeInternal(EFFECTIVETO);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveTo.
     * @param value value to set the EffectiveTo
     */
    public void setEffectiveTo(Date value) {
        setAttributeInternal(EFFECTIVETO, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSrPurchaseBidLines() {
        return (RowIterator) getAttributeInternal(SRPURCHASEBIDLINES);
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
     * @return the associated entity SrPurchaseRfqSupplierImpl.
     */
    public SrPurchaseRfqSupplierImpl getSrPurchaseRfqSupplier() {
        return (SrPurchaseRfqSupplierImpl) getAttributeInternal(SRPURCHASERFQSUPPLIER);
    }

    /**
     * Sets <code>value</code> as the associated entity SrPurchaseRfqSupplierImpl.
     */
    public void setSrPurchaseRfqSupplier(SrPurchaseRfqSupplierImpl value) {
        setAttributeInternal(SRPURCHASERFQSUPPLIER, value);
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
     * @return the associated entity SrPurchaseDemandHeaderImpl.
     */
    public SrPurchaseDemandHeaderImpl getSrPurchaseDemandHeader() {
        return (SrPurchaseDemandHeaderImpl) getAttributeInternal(SRPURCHASEDEMANDHEADER);
    }

    /**
     * Sets <code>value</code> as the associated entity SrPurchaseDemandHeaderImpl.
     */
    public void setSrPurchaseDemandHeader(SrPurchaseDemandHeaderImpl value) {
        setAttributeInternal(SRPURCHASEDEMANDHEADER, value);
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
     * @param bidheaderseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer bidheaderseq) {
        return new Key(new Object[] { bidheaderseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    @Override
    protected void create(AttributeList attributeList) {
        // TODO Implement this method
        setERPSolPKColumnName("Bidheaderseq");
        setERPSolPKSeqName("SR_PURCHASE_BID_HEADER_SEQ");
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
            String pkValue=" sr_purchase_bid_id('"+ERPSolGlobClassModel.doGetUserCompanyCode()+"','"+ERPSolGlobClassModel.doGetUserLocationCode()+"',TO_DATE('"+getBidDate()+"','YYYY-MM-DD'))";
            System.out.println(pkValue + "pk value");
            String result= ERPSolGlobClassModel.doGetERPSolPrimaryKeyValueModel(getDBTransaction(), pkValue, "dual", null, null);
            populateAttributeAsChanged(BIDCODE, result);
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
