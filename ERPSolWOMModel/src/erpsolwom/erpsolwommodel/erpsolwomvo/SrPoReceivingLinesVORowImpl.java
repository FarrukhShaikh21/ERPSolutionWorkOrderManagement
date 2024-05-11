package erpsolwom.erpsolwommodel.erpsolwomvo;

import erpsolwom.erpsolwommodel.erpsolwomeo.SrPoReceivingLinesImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat May 11 14:15:10 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SrPoReceivingLinesVORowImpl extends ViewRowImpl {


    public static final int ENTITY_SRPORECEIVINGLINES = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Receiveseq,
        Receivelinesseq,
        Sourcelinesseq,
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
        TaxAmount,
        txtItemName,
        txtNetAmount,
        txtGrossAmount,
        txtTaxAmount,
        SrPoReceivingHeaderVO,
        SrItemsView,
        AllAllDepartmentsView,
        AccPrgProjectView,
        AccSrItemsView;
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


    public static final int RECEIVESEQ = AttributesEnum.Receiveseq.index();
    public static final int RECEIVELINESSEQ = AttributesEnum.Receivelinesseq.index();
    public static final int SOURCELINESSEQ = AttributesEnum.Sourcelinesseq.index();
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
    public static final int TAXAMOUNT = AttributesEnum.TaxAmount.index();
    public static final int TXTITEMNAME = AttributesEnum.txtItemName.index();
    public static final int TXTNETAMOUNT = AttributesEnum.txtNetAmount.index();
    public static final int TXTGROSSAMOUNT = AttributesEnum.txtGrossAmount.index();
    public static final int TXTTAXAMOUNT = AttributesEnum.txtTaxAmount.index();
    public static final int SRPORECEIVINGHEADERVO = AttributesEnum.SrPoReceivingHeaderVO.index();
    public static final int SRITEMSVIEW = AttributesEnum.SrItemsView.index();
    public static final int ALLALLDEPARTMENTSVIEW = AttributesEnum.AllAllDepartmentsView.index();
    public static final int ACCPRGPROJECTVIEW = AttributesEnum.AccPrgProjectView.index();
    public static final int ACCSRITEMSVIEW = AttributesEnum.AccSrItemsView.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SrPoReceivingLinesVORowImpl() {
    }

    /**
     * Gets SrPoReceivingLines entity object.
     * @return the SrPoReceivingLines
     */
    public SrPoReceivingLinesImpl getSrPoReceivingLines() {
        return (SrPoReceivingLinesImpl) getEntity(ENTITY_SRPORECEIVINGLINES);
    }

    /**
     * Gets the attribute value for RECEIVESEQ using the alias name Receiveseq.
     * @return the RECEIVESEQ
     */
    public Integer getReceiveseq() {
        return (Integer) getAttributeInternal(RECEIVESEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for RECEIVESEQ using the alias name Receiveseq.
     * @param value value to set the RECEIVESEQ
     */
    public void setReceiveseq(Integer value) {
        setAttributeInternal(RECEIVESEQ, value);
    }

    /**
     * Gets the attribute value for RECEIVELINESSEQ using the alias name Receivelinesseq.
     * @return the RECEIVELINESSEQ
     */
    public Integer getReceivelinesseq() {
        return (Integer) getAttributeInternal(RECEIVELINESSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for RECEIVELINESSEQ using the alias name Receivelinesseq.
     * @param value value to set the RECEIVELINESSEQ
     */
    public void setReceivelinesseq(Integer value) {
        setAttributeInternal(RECEIVELINESSEQ, value);
    }

    /**
     * Gets the attribute value for SOURCELINESSEQ using the alias name Sourcelinesseq.
     * @return the SOURCELINESSEQ
     */
    public Integer getSourcelinesseq() {
        return (Integer) getAttributeInternal(SOURCELINESSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for SOURCELINESSEQ using the alias name Sourcelinesseq.
     * @param value value to set the SOURCELINESSEQ
     */
    public void setSourcelinesseq(Integer value) {
        setAttributeInternal(SOURCELINESSEQ, value);
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
     * Gets the attribute value for PO_RATE using the alias name PoRate.
     * @return the PO_RATE
     */
    public BigDecimal getPoRate() {
        return (BigDecimal) getAttributeInternal(PORATE);
    }

    /**
     * Sets <code>value</code> as attribute value for PO_RATE using the alias name PoRate.
     * @param value value to set the PO_RATE
     */
    public void setPoRate(BigDecimal value) {
        setAttributeInternal(PORATE, value);
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
     * Gets the attribute value for GROSS_AMOUNT using the alias name GrossAmount.
     * @return the GROSS_AMOUNT
     */
    public BigDecimal getGrossAmount() {
        return (BigDecimal) getAttributeInternal(GROSSAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for GROSS_AMOUNT using the alias name GrossAmount.
     * @param value value to set the GROSS_AMOUNT
     */
    public void setGrossAmount(BigDecimal value) {
        setAttributeInternal(GROSSAMOUNT, value);
    }

    /**
     * Gets the attribute value for TAX_RATE using the alias name TaxRate.
     * @return the TAX_RATE
     */
    public BigDecimal getTaxRate() {
        return (BigDecimal) getAttributeInternal(TAXRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RATE using the alias name TaxRate.
     * @param value value to set the TAX_RATE
     */
    public void setTaxRate(BigDecimal value) {
        setAttributeInternal(TAXRATE, value);
    }

    /**
     * Gets the attribute value for NET_AMOUNT using the alias name NetAmount.
     * @return the NET_AMOUNT
     */
    public BigDecimal getNetAmount() {
        return (BigDecimal) getAttributeInternal(NETAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for NET_AMOUNT using the alias name NetAmount.
     * @param value value to set the NET_AMOUNT
     */
    public void setNetAmount(BigDecimal value) {
        setAttributeInternal(NETAMOUNT, value);
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
     * Gets the attribute value for TAX_AMOUNT using the alias name TaxAmount.
     * @return the TAX_AMOUNT
     */
    public BigDecimal getTaxAmount() {
        return (BigDecimal) getAttributeInternal(TAXAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_AMOUNT using the alias name TaxAmount.
     * @param value value to set the TAX_AMOUNT
     */
    public void setTaxAmount(BigDecimal value) {
        setAttributeInternal(TAXAMOUNT, value);
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
     * Gets the attribute value for TXT_NET_AMOUNT using the alias name txtNetAmount.
     * @return the TXT_NET_AMOUNT
     */
    public BigDecimal gettxtNetAmount() {
        return (BigDecimal) getAttributeInternal(TXTNETAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_NET_AMOUNT using the alias name txtNetAmount.
     * @param value value to set the TXT_NET_AMOUNT
     */
    public void settxtNetAmount(BigDecimal value) {
        setAttributeInternal(TXTNETAMOUNT, value);
    }

    /**
     * Gets the attribute value for TXT_GROSS_AMOUNT using the alias name txtGrossAmount.
     * @return the TXT_GROSS_AMOUNT
     */
    public BigDecimal gettxtGrossAmount() {
        return (BigDecimal) getAttributeInternal(TXTGROSSAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_GROSS_AMOUNT using the alias name txtGrossAmount.
     * @param value value to set the TXT_GROSS_AMOUNT
     */
    public void settxtGrossAmount(BigDecimal value) {
        setAttributeInternal(TXTGROSSAMOUNT, value);
    }

    /**
     * Gets the attribute value for TXT_TAX_AMOUNT using the alias name txtTaxAmount.
     * @return the TXT_TAX_AMOUNT
     */
    public BigDecimal gettxtTaxAmount() {
        return (BigDecimal) getAttributeInternal(TXTTAXAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_TAX_AMOUNT using the alias name txtTaxAmount.
     * @param value value to set the TXT_TAX_AMOUNT
     */
    public void settxtTaxAmount(BigDecimal value) {
        setAttributeInternal(TXTTAXAMOUNT, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SrPoReceivingHeaderVO.
     */
    public Row getSrPoReceivingHeaderVO() {
        return (Row) getAttributeInternal(SRPORECEIVINGHEADERVO);
    }

    /**
     * Sets the master-detail link SrPoReceivingHeaderVO between this object and <code>value</code>.
     */
    public void setSrPoReceivingHeaderVO(Row value) {
        setAttributeInternal(SRPORECEIVINGHEADERVO, value);
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
     * Gets the view accessor <code>RowSet</code> AllAllDepartmentsView.
     */
    public RowSet getAllAllDepartmentsView() {
        return (RowSet) getAttributeInternal(ALLALLDEPARTMENTSVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccPrgProjectView.
     */
    public RowSet getAccPrgProjectView() {
        return (RowSet) getAttributeInternal(ACCPRGPROJECTVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSrItemsView.
     */
    public RowSet getAccSrItemsView() {
        return (RowSet) getAttributeInternal(ACCSRITEMSVIEW);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        if (getSrPoReceivingHeaderVO().getAttribute("Posted").equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

