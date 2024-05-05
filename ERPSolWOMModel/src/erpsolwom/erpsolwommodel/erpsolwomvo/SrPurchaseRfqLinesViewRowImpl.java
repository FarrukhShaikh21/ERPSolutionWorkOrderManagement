package erpsolwom.erpsolwommodel.erpsolwomvo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun May 05 11:06:58 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPurchaseRfqLinesViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_SRPURCHASERFQLINES = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Rfqlinesseqno,
        Rfqheaderseqno,
        RequiredBy,
        NoteToBuyer,
        NoteToSupplier,
        SupplierItemName,
        RequesterId,
        ItemId,
        Quantity,
        AproxPrice,
        Remarks,
        ProjectId,
        DepartmentId,
        CreatedBy,
        CreatedDate,
        ModifiedBy,
        Modifieddate,
        txtItemName,
        Demandlinesseq,
        SrPurchaseRfqHeaderView,
        SrItemsView,
        SrPurchaseDemandLinesView,
        AccSrItemsView,
        AccPrgProjectView,
        AccAllDepartmentsView;
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


    public static final int RFQLINESSEQNO = AttributesEnum.Rfqlinesseqno.index();
    public static final int RFQHEADERSEQNO = AttributesEnum.Rfqheaderseqno.index();
    public static final int REQUIREDBY = AttributesEnum.RequiredBy.index();
    public static final int NOTETOBUYER = AttributesEnum.NoteToBuyer.index();
    public static final int NOTETOSUPPLIER = AttributesEnum.NoteToSupplier.index();
    public static final int SUPPLIERITEMNAME = AttributesEnum.SupplierItemName.index();
    public static final int REQUESTERID = AttributesEnum.RequesterId.index();
    public static final int ITEMID = AttributesEnum.ItemId.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int APROXPRICE = AttributesEnum.AproxPrice.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.ModifiedBy.index();
    public static final int MODIFIEDDATE = AttributesEnum.Modifieddate.index();
    public static final int TXTITEMNAME = AttributesEnum.txtItemName.index();
    public static final int DEMANDLINESSEQ = AttributesEnum.Demandlinesseq.index();
    public static final int SRPURCHASERFQHEADERVIEW = AttributesEnum.SrPurchaseRfqHeaderView.index();
    public static final int SRITEMSVIEW = AttributesEnum.SrItemsView.index();
    public static final int SRPURCHASEDEMANDLINESVIEW = AttributesEnum.SrPurchaseDemandLinesView.index();
    public static final int ACCSRITEMSVIEW = AttributesEnum.AccSrItemsView.index();
    public static final int ACCPRGPROJECTVIEW = AttributesEnum.AccPrgProjectView.index();
    public static final int ACCALLDEPARTMENTSVIEW = AttributesEnum.AccAllDepartmentsView.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPurchaseRfqLinesViewRowImpl() {
    }

    /**
     * Gets SrPurchaseRfqLines entity object.
     * @return the SrPurchaseRfqLines
     */
    public EntityImpl getSrPurchaseRfqLines() {
        return (EntityImpl) getEntity(ENTITY_SRPURCHASERFQLINES);
    }

    /**
     * Gets the attribute value for RFQLINESSEQNO using the alias name Rfqlinesseqno.
     * @return the RFQLINESSEQNO
     */
    public Integer getRfqlinesseqno() {
        return (Integer) getAttributeInternal(RFQLINESSEQNO);
    }

    /**
     * Sets <code>value</code> as attribute value for RFQLINESSEQNO using the alias name Rfqlinesseqno.
     * @param value value to set the RFQLINESSEQNO
     */
    public void setRfqlinesseqno(Integer value) {
        setAttributeInternal(RFQLINESSEQNO, value);
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
     * Gets the attribute value for REQUIRED_BY using the alias name RequiredBy.
     * @return the REQUIRED_BY
     */
    public Date getRequiredBy() {
        return (Date) getAttributeInternal(REQUIREDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUIRED_BY using the alias name RequiredBy.
     * @param value value to set the REQUIRED_BY
     */
    public void setRequiredBy(Date value) {
        setAttributeInternal(REQUIREDBY, value);
    }

    /**
     * Gets the attribute value for NOTE_TO_BUYER using the alias name NoteToBuyer.
     * @return the NOTE_TO_BUYER
     */
    public String getNoteToBuyer() {
        return (String) getAttributeInternal(NOTETOBUYER);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTE_TO_BUYER using the alias name NoteToBuyer.
     * @param value value to set the NOTE_TO_BUYER
     */
    public void setNoteToBuyer(String value) {
        setAttributeInternal(NOTETOBUYER, value);
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
     * Gets the attribute value for SUPPLIER_ITEM_NAME using the alias name SupplierItemName.
     * @return the SUPPLIER_ITEM_NAME
     */
    public String getSupplierItemName() {
        return (String) getAttributeInternal(SUPPLIERITEMNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPPLIER_ITEM_NAME using the alias name SupplierItemName.
     * @param value value to set the SUPPLIER_ITEM_NAME
     */
    public void setSupplierItemName(String value) {
        setAttributeInternal(SUPPLIERITEMNAME, value);
    }

    /**
     * Gets the attribute value for REQUESTER_ID using the alias name RequesterId.
     * @return the REQUESTER_ID
     */
    public Integer getRequesterId() {
        return (Integer) getAttributeInternal(REQUESTERID);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUESTER_ID using the alias name RequesterId.
     * @param value value to set the REQUESTER_ID
     */
    public void setRequesterId(Integer value) {
        setAttributeInternal(REQUESTERID, value);
    }

    /**
     * Gets the attribute value for ITEM_ID using the alias name ItemId.
     * @return the ITEM_ID
     */
    public Integer getItemId() {
        return (Integer) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEM_ID using the alias name ItemId.
     * @param value value to set the ITEM_ID
     */
    public void setItemId(Integer value) {
        setAttributeInternal(ITEMID, value);
    }

    /**
     * Gets the attribute value for QUANTITY using the alias name Quantity.
     * @return the QUANTITY
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for QUANTITY using the alias name Quantity.
     * @param value value to set the QUANTITY
     */
    public void setQuantity(BigDecimal value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for APROX_PRICE using the alias name AproxPrice.
     * @return the APROX_PRICE
     */
    public BigDecimal getAproxPrice() {
        return (BigDecimal) getAttributeInternal(APROXPRICE);
    }

    /**
     * Sets <code>value</code> as attribute value for APROX_PRICE using the alias name AproxPrice.
     * @param value value to set the APROX_PRICE
     */
    public void setAproxPrice(BigDecimal value) {
        setAttributeInternal(APROXPRICE, value);
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
     * Gets the attribute value for PROJECT_ID using the alias name ProjectId.
     * @return the PROJECT_ID
     */
    public Integer getProjectId() {
        return (Integer) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJECT_ID using the alias name ProjectId.
     * @param value value to set the PROJECT_ID
     */
    public void setProjectId(Integer value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for DEPARTMENT_ID using the alias name DepartmentId.
     * @return the DEPARTMENT_ID
     */
    public String getDepartmentId() {
        return (String) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPARTMENT_ID using the alias name DepartmentId.
     * @param value value to set the DEPARTMENT_ID
     */
    public void setDepartmentId(String value) {
        setAttributeInternal(DEPARTMENTID, value);
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
     * Gets the attribute value for TXT_ITEM_NAME using the alias name txtItemName.
     * @return the TXT_ITEM_NAME
     */
    public String gettxtItemName() {
        return (String) getAttributeInternal(TXTITEMNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_ITEM_NAME using the alias name txtItemName.
     * @param value value to set the TXT_ITEM_NAME
     */
    public void settxtItemName(String value) {
        setAttributeInternal(TXTITEMNAME, value);
    }

    /**
     * Gets the attribute value for DEMANDLINESSEQ using the alias name Demandlinesseq.
     * @return the DEMANDLINESSEQ
     */
    public Integer getDemandlinesseq() {
        return (Integer) getAttributeInternal(DEMANDLINESSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMANDLINESSEQ using the alias name Demandlinesseq.
     * @param value value to set the DEMANDLINESSEQ
     */
    public void setDemandlinesseq(Integer value) {
        setAttributeInternal(DEMANDLINESSEQ, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SrPurchaseRfqHeaderView.
     */
    public Row getSrPurchaseRfqHeaderView() {
        return (Row) getAttributeInternal(SRPURCHASERFQHEADERVIEW);
    }

    /**
     * Sets the master-detail link SrPurchaseRfqHeaderView between this object and <code>value</code>.
     */
    public void setSrPurchaseRfqHeaderView(Row value) {
        setAttributeInternal(SRPURCHASERFQHEADERVIEW, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SrItemsView.
     */
    public Row getSrItemsView() {
        return (Row) getAttributeInternal(SRITEMSVIEW);
    }

    /**
     * Sets the master-detail link SrItemsView between this object and <code>value</code>.
     */
    public void setSrItemsView(Row value) {
        setAttributeInternal(SRITEMSVIEW, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SrPurchaseDemandLinesView.
     */
    public Row getSrPurchaseDemandLinesView() {
        return (Row) getAttributeInternal(SRPURCHASEDEMANDLINESVIEW);
    }

    /**
     * Sets the master-detail link SrPurchaseDemandLinesView between this object and <code>value</code>.
     */
    public void setSrPurchaseDemandLinesView(Row value) {
        setAttributeInternal(SRPURCHASEDEMANDLINESVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrItemsView.
     */
    public RowSet getAccSrItemsView() {
        return (RowSet) getAttributeInternal(ACCSRITEMSVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccPrgProjectView.
     */
    public RowSet getAccPrgProjectView() {
        return (RowSet) getAttributeInternal(ACCPRGPROJECTVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAllDepartmentsView.
     */
    public RowSet getAccAllDepartmentsView() {
        return (RowSet) getAttributeInternal(ACCALLDEPARTMENTSVIEW);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        if (getSrPurchaseRfqHeaderView().getAttribute("Posted").equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

