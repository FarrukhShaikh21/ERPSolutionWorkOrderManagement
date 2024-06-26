package erpsolwom.erpsolwommodel.erpsolwomvo;

import erpsolwom.erpsolwommodel.erpsolwomeo.SrPurchaseRfqHeaderImpl;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.RowSetIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun May 05 11:06:33 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseRfqHeaderViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_SRPURCHASERFQHEADER = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Rfqheaderseqno,
        RfqHeaderCode,
        DemandCode,
        BillTo,
        ShipTo,
        RfqDate,
        DueDate,
        Remarks,
        Locationid,
        Posted,
        RfqFor,
        FobTermSno,
        NoteToSupplier,
        ValidFromDate,
        ValidToDate,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        Modifieddate,
        Companyid,
        txtLocationName,
        SrPurchaseRfqLinesView,
        AllLocationsVO,
        SrPurchaseDemandHeaderView,
        SrPurchaseRfqSupplierView,
        SrPurchaseDemandHeaderView1,
        SrPurchaseBidHeaderView,
        SrPurchaseBidCompareHeaderView,
        AccVuDemandForQVO,
        AccAllLocationsVO,
        AccSrPurchaseDemandHeaderView,
        AccSrPurchaseDemandLinesView;
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


    public static final int RFQHEADERSEQNO = AttributesEnum.Rfqheaderseqno.index();
    public static final int RFQHEADERCODE = AttributesEnum.RfqHeaderCode.index();
    public static final int DEMANDCODE = AttributesEnum.DemandCode.index();
    public static final int BILLTO = AttributesEnum.BillTo.index();
    public static final int SHIPTO = AttributesEnum.ShipTo.index();
    public static final int RFQDATE = AttributesEnum.RfqDate.index();
    public static final int DUEDATE = AttributesEnum.DueDate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int RFQFOR = AttributesEnum.RfqFor.index();
    public static final int FOBTERMSNO = AttributesEnum.FobTermSno.index();
    public static final int NOTETOSUPPLIER = AttributesEnum.NoteToSupplier.index();
    public static final int VALIDFROMDATE = AttributesEnum.ValidFromDate.index();
    public static final int VALIDTODATE = AttributesEnum.ValidToDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.Modifieddate.index();
    public static final int COMPANYID = AttributesEnum.Companyid.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int SRPURCHASERFQLINESVIEW = AttributesEnum.SrPurchaseRfqLinesView.index();
    public static final int ALLLOCATIONSVO = AttributesEnum.AllLocationsVO.index();
    public static final int SRPURCHASEDEMANDHEADERVIEW = AttributesEnum.SrPurchaseDemandHeaderView.index();
    public static final int SRPURCHASERFQSUPPLIERVIEW = AttributesEnum.SrPurchaseRfqSupplierView.index();
    public static final int SRPURCHASEDEMANDHEADERVIEW1 = AttributesEnum.SrPurchaseDemandHeaderView1.index();
    public static final int SRPURCHASEBIDHEADERVIEW = AttributesEnum.SrPurchaseBidHeaderView.index();
    public static final int SRPURCHASEBIDCOMPAREHEADERVIEW = AttributesEnum.SrPurchaseBidCompareHeaderView.index();
    public static final int ACCVUDEMANDFORQVO = AttributesEnum.AccVuDemandForQVO.index();
    public static final int ACCALLLOCATIONSVO = AttributesEnum.AccAllLocationsVO.index();
    public static final int ACCSRPURCHASEDEMANDHEADERVIEW = AttributesEnum.AccSrPurchaseDemandHeaderView.index();
    public static final int ACCSRPURCHASEDEMANDLINESVIEW = AttributesEnum.AccSrPurchaseDemandLinesView.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseRfqHeaderViewRowImpl() {
    }

    /**
     * Gets SrPurchaseRfqHeader entity object.
     * @return the SrPurchaseRfqHeader
     */
    public SrPurchaseRfqHeaderImpl getSrPurchaseRfqHeader() {
        return (SrPurchaseRfqHeaderImpl) getEntity(ENTITY_SRPURCHASERFQHEADER);
    }

    /**
     * Gets the attribute value for RFQHEADERSEQNO using the alias name Rfqheaderseqno.
     * @return the RFQHEADERSEQNO
     */
    public Integer getRfqheaderseqno() {
        return (Integer) getAttributeInternal(RFQHEADERSEQNO);
    }

    /**
     * Sets <code>value</code> as attribute value for RFQHEADERSEQNO using the alias name Rfqheaderseqno.
     * @param value value to set the RFQHEADERSEQNO
     */
    public void setRfqheaderseqno(Integer value) {
        setAttributeInternal(RFQHEADERSEQNO, value);
    }

    /**
     * Gets the attribute value for RFQ_HEADER_CODE using the alias name RfqHeaderCode.
     * @return the RFQ_HEADER_CODE
     */
    public String getRfqHeaderCode() {
        return (String) getAttributeInternal(RFQHEADERCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for RFQ_HEADER_CODE using the alias name RfqHeaderCode.
     * @param value value to set the RFQ_HEADER_CODE
     */
    public void setRfqHeaderCode(String value) {
        setAttributeInternal(RFQHEADERCODE, value);
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
        while(getSrPurchaseRfqLinesView().getRowCount()>0) {
            getSrPurchaseRfqLinesView().first().remove();
        }
        
        getAccSrPurchaseDemandLinesView().setNamedWhereClauseParam("P_ADF_DEMAND_CODE", value==null?"0":value);
        getAccSrPurchaseDemandLinesView().executeQuery();
        RowSetIterator rsi=getAccSrPurchaseDemandLinesView();
        while(rsi.hasNext()) {
            Row nextRow =rsi.next();
            Row newRow=getSrPurchaseRfqLinesView().createRow();
            newRow.setAttribute("Demandlinesseq", nextRow.getAttribute("Demandlinesseq"));
            newRow.setAttribute("ItemId", nextRow.getAttribute("ItemId"));
            newRow.setAttribute("RequiredBy", nextRow.getAttribute("RequiredByDate"));
            newRow.setAttribute("Quantity", nextRow.getAttribute("ApproveQuantity"));
            newRow.setAttribute("AproxPrice", nextRow.getAttribute("AproxPrice"));
            newRow.setAttribute("DepartmentId", nextRow.getAttribute("DepartmentId"));
            newRow.setAttribute("ProjectId", nextRow.getAttribute("ProjectId"));
            newRow.setAttribute("NoteToBuyer", nextRow.getAttribute("NoteToBuyer"));
            newRow.setAttribute("NoteToSupplier", nextRow.getAttribute("NoteToSupplier"));
//            newRow.setAttribute("RequesterId", nextRow.getAttribute("RequesterId"));
            getSrPurchaseRfqLinesView().insertRow(newRow);
        }
//        getSrPurchaseRfqLinesView().r
    }

    /**
     * Gets the attribute value for BILL_TO using the alias name BillTo.
     * @return the BILL_TO
     */
    public String getBillTo() {
        return (String) getAttributeInternal(BILLTO);
    }

    /**
     * Sets <code>value</code> as attribute value for BILL_TO using the alias name BillTo.
     * @param value value to set the BILL_TO
     */
    public void setBillTo(String value) {
        setAttributeInternal(BILLTO, value);
    }

    /**
     * Gets the attribute value for SHIP_TO using the alias name ShipTo.
     * @return the SHIP_TO
     */
    public String getShipTo() {
        return (String) getAttributeInternal(SHIPTO);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIP_TO using the alias name ShipTo.
     * @param value value to set the SHIP_TO
     */
    public void setShipTo(String value) {
        setAttributeInternal(SHIPTO, value);
    }

    /**
     * Gets the attribute value for RFQ_DATE using the alias name RfqDate.
     * @return the RFQ_DATE
     */
    public Date getRfqDate() {
        return (Date) getAttributeInternal(RFQDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for RFQ_DATE using the alias name RfqDate.
     * @param value value to set the RFQ_DATE
     */
    public void setRfqDate(Date value) {
        setAttributeInternal(RFQDATE, value);
    }

    /**
     * Gets the attribute value for DUE_DATE using the alias name DueDate.
     * @return the DUE_DATE
     */
    public Date getDueDate() {
        return (Date) getAttributeInternal(DUEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for DUE_DATE using the alias name DueDate.
     * @param value value to set the DUE_DATE
     */
    public void setDueDate(Date value) {
        setAttributeInternal(DUEDATE, value);
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
     * Gets the attribute value for RFQ_FOR using the alias name RfqFor.
     * @return the RFQ_FOR
     */
    public String getRfqFor() {
        return (String) getAttributeInternal(RFQFOR);
    }

    /**
     * Sets <code>value</code> as attribute value for RFQ_FOR using the alias name RfqFor.
     * @param value value to set the RFQ_FOR
     */
    public void setRfqFor(String value) {
        setAttributeInternal(RFQFOR, value);
    }

    /**
     * Gets the attribute value for FOB_TERM_SNO using the alias name FobTermSno.
     * @return the FOB_TERM_SNO
     */
    public Integer getFobTermSno() {
        return (Integer) getAttributeInternal(FOBTERMSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for FOB_TERM_SNO using the alias name FobTermSno.
     * @param value value to set the FOB_TERM_SNO
     */
    public void setFobTermSno(Integer value) {
        setAttributeInternal(FOBTERMSNO, value);
    }

    /**
     * Gets the attribute value for NOTE_TO_SUPPLIER using the alias name NoteToSupplier.
     * @return the NOTE_TO_SUPPLIER
     */
    public String getNoteToSupplier() {
        return (String) getAttributeInternal(NOTETOSUPPLIER);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTE_TO_SUPPLIER using the alias name NoteToSupplier.
     * @param value value to set the NOTE_TO_SUPPLIER
     */
    public void setNoteToSupplier(String value) {
        setAttributeInternal(NOTETOSUPPLIER, value);
    }

    /**
     * Gets the attribute value for VALID_FROM_DATE using the alias name ValidFromDate.
     * @return the VALID_FROM_DATE
     */
    public Date getValidFromDate() {
        return (Date) getAttributeInternal(VALIDFROMDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for VALID_FROM_DATE using the alias name ValidFromDate.
     * @param value value to set the VALID_FROM_DATE
     */
    public void setValidFromDate(Date value) {
        setAttributeInternal(VALIDFROMDATE, value);
    }

    /**
     * Gets the attribute value for VALID_TO_DATE using the alias name ValidToDate.
     * @return the VALID_TO_DATE
     */
    public Date getValidToDate() {
        return (Date) getAttributeInternal(VALIDTODATE);
    }

    /**
     * Sets <code>value</code> as attribute value for VALID_TO_DATE using the alias name ValidToDate.
     * @param value value to set the VALID_TO_DATE
     */
    public void setValidToDate(Date value) {
        setAttributeInternal(VALIDTODATE, value);
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
     * Gets the attribute value for MODIFIEDDATE using the alias name Modifieddate.
     * @return the MODIFIEDDATE
     */
    public Date getModifieddate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIEDDATE using the alias name Modifieddate.
     * @param value value to set the MODIFIEDDATE
     */
    public void setModifieddate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
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
     * Gets the associated <code>RowIterator</code> using master-detail link SrPurchaseRfqLinesView.
     */
    public RowIterator getSrPurchaseRfqLinesView() {
        return (RowIterator) getAttributeInternal(SRPURCHASERFQLINESVIEW);
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
     * Gets the associated <code>Row</code> using master-detail link SrPurchaseDemandHeaderView.
     */
    public Row getSrPurchaseDemandHeaderView() {
        return (Row) getAttributeInternal(SRPURCHASEDEMANDHEADERVIEW);
    }

    /**
     * Sets the master-detail link SrPurchaseDemandHeaderView between this object and <code>value</code>.
     */
    public void setSrPurchaseDemandHeaderView(Row value) {
        setAttributeInternal(SRPURCHASEDEMANDHEADERVIEW, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrPurchaseRfqSupplierView.
     */
    public RowIterator getSrPurchaseRfqSupplierView() {
        return (RowIterator) getAttributeInternal(SRPURCHASERFQSUPPLIERVIEW);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SrPurchaseDemandHeaderView1.
     */
    public Row getSrPurchaseDemandHeaderView1() {
        return (Row) getAttributeInternal(SRPURCHASEDEMANDHEADERVIEW1);
    }

    /**
     * Sets the master-detail link SrPurchaseDemandHeaderView1 between this object and <code>value</code>.
     */
    public void setSrPurchaseDemandHeaderView1(Row value) {
        setAttributeInternal(SRPURCHASEDEMANDHEADERVIEW1, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrPurchaseBidHeaderView.
     */
    public RowIterator getSrPurchaseBidHeaderView() {
        return (RowIterator) getAttributeInternal(SRPURCHASEBIDHEADERVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrPurchaseBidCompareHeaderView.
     */
    public RowIterator getSrPurchaseBidCompareHeaderView() {
        return (RowIterator) getAttributeInternal(SRPURCHASEBIDCOMPAREHEADERVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVuDemandForQVO.
     */
    public RowSet getAccVuDemandForQVO() {
        return (RowSet) getAttributeInternal(ACCVUDEMANDFORQVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAllLocationsVO.
     */
    public RowSet getAccAllLocationsVO() {
        return (RowSet) getAttributeInternal(ACCALLLOCATIONSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrPurchaseDemandHeaderView.
     */
    public RowSet getAccSrPurchaseDemandHeaderView() {
        return (RowSet) getAttributeInternal(ACCSRPURCHASEDEMANDHEADERVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrPurchaseDemandLinesView.
     */
    public RowSet getAccSrPurchaseDemandLinesView() {
        return (RowSet) getAttributeInternal(ACCSRPURCHASEDEMANDLINESVIEW);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        if (getPosted().equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    } 
}

