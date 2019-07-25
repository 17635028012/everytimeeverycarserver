package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Invoice {
    private String invoiceId;
    private String memberId;
    private String indentId;
    private Byte invoiceType;
    private Byte invoiceAudit;
    private String invoiceNumber;
    private BigDecimal invoiceMoney;
    private Byte invoiceRisetype;
    private Byte invoiceIsStatus;
    private String invoiceRisename;
    private String invoiceContent;
    private String invoiceDuty;
    private String invoiceRemark;
    private Timestamp invoiceCreat;
    private Timestamp invoiceModified;
    private String invoiceReserve1;
    private String invoiceReserve2;
    private String invoiceReserve3;

    @Id
    @Column(name = "invoice_id", nullable = false, length = 50)
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Basic
    @Column(name = "member_id", nullable = true, length = 50)
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "indent_id", nullable = true, length = 50)
    public String getIndentId() {
        return indentId;
    }

    public void setIndentId(String indentId) {
        this.indentId = indentId;
    }

    @Basic
    @Column(name = "invoice _type", nullable = true)
    public Byte getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Byte invoiceType) {
        this.invoiceType = invoiceType;
    }

    @Basic
    @Column(name = "invoice_audit", nullable = true)
    public Byte getInvoiceAudit() {
        return invoiceAudit;
    }

    public void setInvoiceAudit(Byte invoiceAudit) {
        this.invoiceAudit = invoiceAudit;
    }

    @Basic
    @Column(name = "invoice _number", nullable = true, length = 20)
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Basic
    @Column(name = "invoice _money", nullable = true, precision = 2)
    public BigDecimal getInvoiceMoney() {
        return invoiceMoney;
    }

    public void setInvoiceMoney(BigDecimal invoiceMoney) {
        this.invoiceMoney = invoiceMoney;
    }

    @Basic
    @Column(name = "invoice _risetype", nullable = true)
    public Byte getInvoiceRisetype() {
        return invoiceRisetype;
    }

    public void setInvoiceRisetype(Byte invoiceRisetype) {
        this.invoiceRisetype = invoiceRisetype;
    }

    @Basic
    @Column(name = "invoice _is_status", nullable = true)
    public Byte getInvoiceIsStatus() {
        return invoiceIsStatus;
    }

    public void setInvoiceIsStatus(Byte invoiceIsStatus) {
        this.invoiceIsStatus = invoiceIsStatus;
    }

    @Basic
    @Column(name = "invoice _risename", nullable = true, length = 20)
    public String getInvoiceRisename() {
        return invoiceRisename;
    }

    public void setInvoiceRisename(String invoiceRisename) {
        this.invoiceRisename = invoiceRisename;
    }

    @Basic
    @Column(name = "invoice _content", nullable = true, length = 255)
    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
    }

    @Basic
    @Column(name = "invoice _duty", nullable = true, length = 25)
    public String getInvoiceDuty() {
        return invoiceDuty;
    }

    public void setInvoiceDuty(String invoiceDuty) {
        this.invoiceDuty = invoiceDuty;
    }

    @Basic
    @Column(name = "invoice _remark", nullable = true, length = 255)
    public String getInvoiceRemark() {
        return invoiceRemark;
    }

    public void setInvoiceRemark(String invoiceRemark) {
        this.invoiceRemark = invoiceRemark;
    }

    @Basic
    @Column(name = "invoice_creat", nullable = true)
    public Timestamp getInvoiceCreat() {
        return invoiceCreat;
    }

    public void setInvoiceCreat(Timestamp invoiceCreat) {
        this.invoiceCreat = invoiceCreat;
    }

    @Basic
    @Column(name = "invoice_modified", nullable = true)
    public Timestamp getInvoiceModified() {
        return invoiceModified;
    }

    public void setInvoiceModified(Timestamp invoiceModified) {
        this.invoiceModified = invoiceModified;
    }

    @Basic
    @Column(name = "invoice_reserve1", nullable = true, length = 255)
    public String getInvoiceReserve1() {
        return invoiceReserve1;
    }

    public void setInvoiceReserve1(String invoiceReserve1) {
        this.invoiceReserve1 = invoiceReserve1;
    }

    @Basic
    @Column(name = "invoice_reserve2", nullable = true, length = 255)
    public String getInvoiceReserve2() {
        return invoiceReserve2;
    }

    public void setInvoiceReserve2(String invoiceReserve2) {
        this.invoiceReserve2 = invoiceReserve2;
    }

    @Basic
    @Column(name = "invoice_reserve3", nullable = true, length = 255)
    public String getInvoiceReserve3() {
        return invoiceReserve3;
    }

    public void setInvoiceReserve3(String invoiceReserve3) {
        this.invoiceReserve3 = invoiceReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Objects.equals(invoiceId, invoice.invoiceId) &&
                Objects.equals(memberId, invoice.memberId) &&
                Objects.equals(indentId, invoice.indentId) &&
                Objects.equals(invoiceType, invoice.invoiceType) &&
                Objects.equals(invoiceAudit, invoice.invoiceAudit) &&
                Objects.equals(invoiceNumber, invoice.invoiceNumber) &&
                Objects.equals(invoiceMoney, invoice.invoiceMoney) &&
                Objects.equals(invoiceRisetype, invoice.invoiceRisetype) &&
                Objects.equals(invoiceIsStatus, invoice.invoiceIsStatus) &&
                Objects.equals(invoiceRisename, invoice.invoiceRisename) &&
                Objects.equals(invoiceContent, invoice.invoiceContent) &&
                Objects.equals(invoiceDuty, invoice.invoiceDuty) &&
                Objects.equals(invoiceRemark, invoice.invoiceRemark) &&
                Objects.equals(invoiceCreat, invoice.invoiceCreat) &&
                Objects.equals(invoiceModified, invoice.invoiceModified) &&
                Objects.equals(invoiceReserve1, invoice.invoiceReserve1) &&
                Objects.equals(invoiceReserve2, invoice.invoiceReserve2) &&
                Objects.equals(invoiceReserve3, invoice.invoiceReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceId, memberId, indentId, invoiceType, invoiceAudit, invoiceNumber, invoiceMoney, invoiceRisetype, invoiceIsStatus, invoiceRisename, invoiceContent, invoiceDuty, invoiceRemark, invoiceCreat, invoiceModified, invoiceReserve1, invoiceReserve2, invoiceReserve3);
    }
}
