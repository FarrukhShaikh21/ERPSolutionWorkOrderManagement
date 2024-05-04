package erpsolwom.erpsolwommodel.erpsolwomvo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;

import erpsolwom.erpsolwommodel.erpsolwomeo.SrPurchaseDemandHeaderImpl;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat May 04 10:55:18 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseDemandHeaderViewRowImpl extends ViewRowImpl {

    public static final int ENTITY_SRPURCHASEDEMANDHEADER = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Demandheaderseq,
        DemandCode,
        DemandFor,
        DemandDate,
        Remarks,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        ModifiedDate,
        Posted,
        PostedDate,
        Locationid,
        Companyid,
        txtLocationName,
        SrPurchaseDemandLinesView,
        AllLocationsVO,
        AccAllLocationsVO,
        AccVuDemandForQVO;
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

    public static final int DEMANDHEADERSEQ = AttributesEnum.Demandheaderseq.index();
    public static final int DEMANDCODE = AttributesEnum.DemandCode.index();
    public static final int DEMANDFOR = AttributesEnum.DemandFor.index();
    public static final int DEMANDDATE = AttributesEnum.DemandDate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDDATE = AttributesEnum.PostedDate.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int COMPANYID = AttributesEnum.Companyid.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int SRPURCHASEDEMANDLINESVIEW = AttributesEnum.SrPurchaseDemandLinesView.index();
    public static final int ALLLOCATIONSVO = AttributesEnum.AllLocationsVO.index();
    public static final int ACCALLLOCATIONSVO = AttributesEnum.AccAllLocationsVO.index();
    public static final int ACCVUDEMANDFORQVO = AttributesEnum.AccVuDemandForQVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseDemandHeaderViewRowImpl() {
    }

    /**
     * Gets SrPurchaseDemandHeader entity object.
     * @return the SrPurchaseDemandHeader
     */
    public SrPurchaseDemandHeaderImpl getSrPurchaseDemandHeader() {
        return (SrPurchaseDemandHeaderImpl) getEntity(ENTITY_SRPURCHASEDEMANDHEADER);
    }

    /**
     * Gets the attribute value for DEMANDHEADERSEQ using the alias name Demandheaderseq.
     * @return the DEMANDHEADERSEQ
     */
    public Integer getDemandheaderseq() {
        return (Integer) getAttributeInternal(DEMANDHEADERSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMANDHEADERSEQ using the alias name Demandheaderseq.
     * @param value value to set the DEMANDHEADERSEQ
     */
    public void setDemandheaderseq(Integer value) {
        setAttributeInternal(DEMANDHEADERSEQ, value);
    }

    /**
     * Gets the attribute value for DEMAND_CODE using the alias name DemandCode.
     * @return the DEMAND_CODE
     */
    public String getDemandCode() {
        return (String) getAttributeInternal(DEMANDCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMAND_CODE using the alias name DemandCode.
     * @param value value to set the DEMAND_CODE
     */
    public void setDemandCode(String value) {
        setAttributeInternal(DEMANDCODE, value);
    }

    /**
     * Gets the attribute value for DEMAND_FOR using the alias name DemandFor.
     * @return the DEMAND_FOR
     */
    public String getDemandFor() {
        return (String) getAttributeInternal(DEMANDFOR);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMAND_FOR using the alias name DemandFor.
     * @param value value to set the DEMAND_FOR
     */
    public void setDemandFor(String value) {
        setAttributeInternal(DEMANDFOR, value);
    }

    /**
     * Gets the attribute value for DEMAND_DATE using the alias name DemandDate.
     * @return the DEMAND_DATE
     */
    public Date getDemandDate() {
        return (Date) getAttributeInternal(DEMANDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMAND_DATE using the alias name DemandDate.
     * @param value value to set the DEMAND_DATE
     */
    public void setDemandDate(Date value) {
        setAttributeInternal(DEMANDDATE, value);
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
     * Gets the associated <code>RowIterator</code> using master-detail link SrPurchaseDemandLinesView.
     */
    public RowIterator getSrPurchaseDemandLinesView() {
        return (RowIterator) getAttributeInternal(SRPURCHASEDEMANDLINESVIEW);
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
     * Gets the view accessor <code>RowSet</code> AccAllLocationsVO.
     */
    public RowSet getAccAllLocationsVO() {
        return (RowSet) getAttributeInternal(ACCALLLOCATIONSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVuDemandForQVO.
     */
    public RowSet getAccVuDemandForQVO() {
        return (RowSet) getAttributeInternal(ACCVUDEMANDFORQVO);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        if (getPosted().equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }    
   
}

