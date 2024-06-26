package erpsolwom.erpsolwommodel.erpsolwomvo;

import erpsolwom.erpsolwommodel.erpsolwomeo.SrPoInvoicePayHeaderImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.RowSetIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jun 01 13:14:52 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPoInvoicePayHeaderViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_SRPOINVOICEPAYHEADER = 0;

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
        txtLocationName,
        txtSupplierName,
        PoCode,
        ReferenceNo,
        PaymentAmount,
        txtAdvanceAmount,
        txtInvoiceAmount,
        txtBalance,
        SrPoInvoicePayAdvanceView,
        SrPoInvoicePayLinesView,
        PuSuppliersVO,
        AllLocationsVO,
        SrPurchaseOrderHeaderVO,
        AccAllLocationsVO,
        AccPuSuppliersVO,
        AccSrPurchaseOrderHeaderVO,
        AccSrPurchaseAdvanceVO,
        AccSrPoInvoiceHeaderVO;
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
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int POCODE = AttributesEnum.PoCode.index();
    public static final int REFERENCENO = AttributesEnum.ReferenceNo.index();
    public static final int PAYMENTAMOUNT = AttributesEnum.PaymentAmount.index();
    public static final int TXTADVANCEAMOUNT = AttributesEnum.txtAdvanceAmount.index();
    public static final int TXTINVOICEAMOUNT = AttributesEnum.txtInvoiceAmount.index();
    public static final int TXTBALANCE = AttributesEnum.txtBalance.index();
    public static final int SRPOINVOICEPAYADVANCEVIEW = AttributesEnum.SrPoInvoicePayAdvanceView.index();
    public static final int SRPOINVOICEPAYLINESVIEW = AttributesEnum.SrPoInvoicePayLinesView.index();
    public static final int PUSUPPLIERSVO = AttributesEnum.PuSuppliersVO.index();
    public static final int ALLLOCATIONSVO = AttributesEnum.AllLocationsVO.index();
    public static final int SRPURCHASEORDERHEADERVO = AttributesEnum.SrPurchaseOrderHeaderVO.index();
    public static final int ACCALLLOCATIONSVO = AttributesEnum.AccAllLocationsVO.index();
    public static final int ACCPUSUPPLIERSVO = AttributesEnum.AccPuSuppliersVO.index();
    public static final int ACCSRPURCHASEORDERHEADERVO = AttributesEnum.AccSrPurchaseOrderHeaderVO.index();
    public static final int ACCSRPURCHASEADVANCEVO = AttributesEnum.AccSrPurchaseAdvanceVO.index();
    public static final int ACCSRPOINVOICEHEADERVO = AttributesEnum.AccSrPoInvoiceHeaderVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPoInvoicePayHeaderViewRowImpl() {
    }

    /**
     * Gets SrPoInvoicePayHeader entity object.
     * @return the SrPoInvoicePayHeader
     */
    public SrPoInvoicePayHeaderImpl getSrPoInvoicePayHeader() {
        return (SrPoInvoicePayHeaderImpl) getEntity(ENTITY_SRPOINVOICEPAYHEADER);
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
     * Gets the attribute value for INVOICE_PAY_CODE using the alias name InvoicePayCode.
     * @return the INVOICE_PAY_CODE
     */
    public String getInvoicePayCode() {
        return (String) getAttributeInternal(INVOICEPAYCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOICE_PAY_CODE using the alias name InvoicePayCode.
     * @param value value to set the INVOICE_PAY_CODE
     */
    public void setInvoicePayCode(String value) {
        setAttributeInternal(INVOICEPAYCODE, value);
    }

    /**
     * Gets the attribute value for SUPPLIERID using the alias name Supplierid.
     * @return the SUPPLIERID
     */
    public String getSupplierid() {
        return (String) getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPPLIERID using the alias name Supplierid.
     * @param value value to set the SUPPLIERID
     */
    public void setSupplierid(String value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for PAY_DATE using the alias name PayDate.
     * @return the PAY_DATE
     */
    public Date getPayDate() {
        return (Date) getAttributeInternal(PAYDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for PAY_DATE using the alias name PayDate.
     * @param value value to set the PAY_DATE
     */
    public void setPayDate(Date value) {
        setAttributeInternal(PAYDATE, value);
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
     * Gets the attribute value for DOCTYPEID using the alias name Doctypeid.
     * @return the DOCTYPEID
     */
    public String getDoctypeid() {
        return (String) getAttributeInternal(DOCTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DOCTYPEID using the alias name Doctypeid.
     * @param value value to set the DOCTYPEID
     */
    public void setDoctypeid(String value) {
        setAttributeInternal(DOCTYPEID, value);
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
     * Gets the attribute value for TXT_SUPPLIER_NAME using the alias name txtSupplierName.
     * @return the TXT_SUPPLIER_NAME
     */
    public String gettxtSupplierName() {
        return (String) getAttributeInternal(TXTSUPPLIERNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_SUPPLIER_NAME using the alias name txtSupplierName.
     * @param value value to set the TXT_SUPPLIER_NAME
     */
    public void settxtSupplierName(String value) {
        setAttributeInternal(TXTSUPPLIERNAME, value);
    }

    /**
     * Gets the attribute value for PO_CODE using the alias name PoCode.
     * @return the PO_CODE
     */
    public String getPoCode() {
        return (String) getAttributeInternal(POCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for PO_CODE using the alias name PoCode.
     * @param value value to set the PO_CODE
     */
    public void setPoCode(String value) {
        setAttributeInternal(POCODE, value);
        while(getSrPoInvoicePayLinesView().getRowCount()>0) {
        getSrPoInvoicePayLinesView().first().remove();
        }
        while(getSrPoInvoicePayAdvanceView().getRowCount()>0) {
        getSrPoInvoicePayAdvanceView().first().remove();
        }
        
        getAccSrPoInvoiceHeaderVO().setNamedWhereClauseParam("P_ADF_PO_CODE", value==null?"0":value);
        getAccSrPoInvoiceHeaderVO().executeQuery();
        RowSetIterator rsi=getAccSrPoInvoiceHeaderVO();
        while(rsi.hasNext()) {
        Row nextRow =rsi.next();
        Row newRow=getSrPoInvoicePayLinesView().createRow();
        newRow.setAttribute("InvoiceCode", nextRow.getAttribute("InvoiceCode"));
        newRow.setAttribute("InvoiceAmount", nextRow.getAttribute("txtSumNetAmount"));
        //            newRow.setAttribute("RequesterId", nextRow.getAttribute("RequesterId"));
        getSrPoInvoicePayLinesView().insertRow(newRow);
        }
        
        getAccSrPurchaseAdvanceVO().setNamedWhereClauseParam("P_ADF_PO_CODE", value==null?"0":value);
        getAccSrPurchaseAdvanceVO().setNamedWhereClauseParam("P_ADF_SUPPLIERID", value==null?"0":getSupplierid());
        
        getAccSrPurchaseAdvanceVO().executeQuery();
        rsi=getAccSrPurchaseAdvanceVO();
        while(rsi.hasNext()) {
        Row nextRow =rsi.next();
        Row newRow=getSrPoInvoicePayAdvanceView().createRow();
        newRow.setAttribute("AdvanceCode", nextRow.getAttribute("AdvanceCode"));
        newRow.setAttribute("AdvanceAmount", nextRow.getAttribute("BalanceAmount"));
        //            newRow.setAttribute("RequesterId", nextRow.getAttribute("RequesterId"));
        getSrPoInvoicePayAdvanceView().insertRow(newRow);
        }
    }

    /**
     * Gets the attribute value for REFERENCE_NO using the alias name ReferenceNo.
     * @return the REFERENCE_NO
     */
    public String getReferenceNo() {
        return (String) getAttributeInternal(REFERENCENO);
    }

    /**
     * Sets <code>value</code> as attribute value for REFERENCE_NO using the alias name ReferenceNo.
     * @param value value to set the REFERENCE_NO
     */
    public void setReferenceNo(String value) {
        setAttributeInternal(REFERENCENO, value);
    }

    /**
     * Gets the attribute value for PAYMENT_AMOUNT using the alias name PaymentAmount.
     * @return the PAYMENT_AMOUNT
     */
    public BigDecimal getPaymentAmount() {
        return (BigDecimal) getAttributeInternal(PAYMENTAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for PAYMENT_AMOUNT using the alias name PaymentAmount.
     * @param value value to set the PAYMENT_AMOUNT
     */
    public void setPaymentAmount(BigDecimal value) {
        setAttributeInternal(PAYMENTAMOUNT, value);
    }

    /**
     * Gets the attribute value for TXT_ADVANCE_AMOUNT using the alias name txtAdvanceAmount.
     * @return the TXT_ADVANCE_AMOUNT
     */
    public BigDecimal gettxtAdvanceAmount() {
        return (BigDecimal) getAttributeInternal(TXTADVANCEAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_ADVANCE_AMOUNT using the alias name txtAdvanceAmount.
     * @param value value to set the TXT_ADVANCE_AMOUNT
     */
    public void settxtAdvanceAmount(BigDecimal value) {
        setAttributeInternal(TXTADVANCEAMOUNT, value);
    }

    /**
     * Gets the attribute value for TXT_INVOICE_AMOUNT using the alias name txtInvoiceAmount.
     * @return the TXT_INVOICE_AMOUNT
     */
    public BigDecimal gettxtInvoiceAmount() {
        return (BigDecimal) getAttributeInternal(TXTINVOICEAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_INVOICE_AMOUNT using the alias name txtInvoiceAmount.
     * @param value value to set the TXT_INVOICE_AMOUNT
     */
    public void settxtInvoiceAmount(BigDecimal value) {
        setAttributeInternal(TXTINVOICEAMOUNT, value);
    }

    /**
     * Gets the attribute value for TXT_BALANCE using the alias name txtBalance.
     * @return the TXT_BALANCE
     */
    public BigDecimal gettxtBalance() {
        return (BigDecimal) getAttributeInternal(TXTBALANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_BALANCE using the alias name txtBalance.
     * @param value value to set the TXT_BALANCE
     */
    public void settxtBalance(BigDecimal value) {
        setAttributeInternal(TXTBALANCE, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrPoInvoicePayAdvanceView.
     */
    public RowIterator getSrPoInvoicePayAdvanceView() {
        return (RowIterator) getAttributeInternal(SRPOINVOICEPAYADVANCEVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SrPoInvoicePayLinesView.
     */
    public RowIterator getSrPoInvoicePayLinesView() {
        return (RowIterator) getAttributeInternal(SRPOINVOICEPAYLINESVIEW);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link PuSuppliersVO.
     */
    public Row getPuSuppliersVO() {
        return (Row) getAttributeInternal(PUSUPPLIERSVO);
    }

    /**
     * Sets the master-detail link PuSuppliersVO between this object and <code>value</code>.
     */
    public void setPuSuppliersVO(Row value) {
        setAttributeInternal(PUSUPPLIERSVO, value);
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
     * Gets the associated <code>Row</code> using master-detail link SrPurchaseOrderHeaderVO.
     */
    public Row getSrPurchaseOrderHeaderVO() {
        return (Row) getAttributeInternal(SRPURCHASEORDERHEADERVO);
    }

    /**
     * Sets the master-detail link SrPurchaseOrderHeaderVO between this object and <code>value</code>.
     */
    public void setSrPurchaseOrderHeaderVO(Row value) {
        setAttributeInternal(SRPURCHASEORDERHEADERVO, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAllLocationsVO.
     */
    public RowSet getAccAllLocationsVO() {
        return (RowSet) getAttributeInternal(ACCALLLOCATIONSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccPuSuppliersVO.
     */
    public RowSet getAccPuSuppliersVO() {
        return (RowSet) getAttributeInternal(ACCPUSUPPLIERSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrPurchaseOrderHeaderVO.
     */
    public RowSet getAccSrPurchaseOrderHeaderVO() {
        return (RowSet) getAttributeInternal(ACCSRPURCHASEORDERHEADERVO);
    }


    /**
     * Gets the view accessor <code>RowSet</code> AccSrPurchaseAdvanceVO.
     */
    public RowSet getAccSrPurchaseAdvanceVO() {
        return (RowSet) getAttributeInternal(ACCSRPURCHASEADVANCEVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrPoInvoiceHeaderVO.
     */
    public RowSet getAccSrPoInvoiceHeaderVO() {
        return (RowSet) getAttributeInternal(ACCSRPOINVOICEHEADERVO);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        if (getPosted().equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

