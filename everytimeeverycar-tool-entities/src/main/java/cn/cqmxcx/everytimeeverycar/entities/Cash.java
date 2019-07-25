package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Cash {
    private String cashId;
    private Integer cashNumber;
    private Integer indentNumber;
    private byte cashType;
    private String memberId;
    private BigDecimal cashMoney;
    private BigDecimal cashBalance;
    private Byte cashIsPay;
    private String cashPlatform;
    private Byte cashIsStatus;
    private Timestamp cashCreat;
    private Timestamp cashModified;
    private String cashReserve1;
    private String cashReserve2;
    private String cashReserve3;

    @Id
    @Column(name = "cash_id", nullable = false, length = 50)
    public String getCashId() {
        return cashId;
    }

    public void setCashId(String cashId) {
        this.cashId = cashId;
    }

    @Basic
    @Column(name = "cash__number", nullable = true)
    public Integer getCashNumber() {
        return cashNumber;
    }

    public void setCashNumber(Integer cashNumber) {
        this.cashNumber = cashNumber;
    }

    @Basic
    @Column(name = "indent_number", nullable = true)
    public Integer getIndentNumber() {
        return indentNumber;
    }

    public void setIndentNumber(Integer indentNumber) {
        this.indentNumber = indentNumber;
    }

    @Basic
    @Column(name = "cash__type", nullable = false)
    public byte getCashType() {
        return cashType;
    }

    public void setCashType(byte cashType) {
        this.cashType = cashType;
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
    @Column(name = "cash__money", nullable = true, precision = 2)
    public BigDecimal getCashMoney() {
        return cashMoney;
    }

    public void setCashMoney(BigDecimal cashMoney) {
        this.cashMoney = cashMoney;
    }

    @Basic
    @Column(name = "cash__balance", nullable = true, precision = 2)
    public BigDecimal getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(BigDecimal cashBalance) {
        this.cashBalance = cashBalance;
    }

    @Basic
    @Column(name = "cash_is_pay", nullable = true)
    public Byte getCashIsPay() {
        return cashIsPay;
    }

    public void setCashIsPay(Byte cashIsPay) {
        this.cashIsPay = cashIsPay;
    }

    @Basic
    @Column(name = "cash__platform", nullable = true, length = 10)
    public String getCashPlatform() {
        return cashPlatform;
    }

    public void setCashPlatform(String cashPlatform) {
        this.cashPlatform = cashPlatform;
    }

    @Basic
    @Column(name = "cash_is_status", nullable = true)
    public Byte getCashIsStatus() {
        return cashIsStatus;
    }

    public void setCashIsStatus(Byte cashIsStatus) {
        this.cashIsStatus = cashIsStatus;
    }

    @Basic
    @Column(name = "cash_creat", nullable = true)
    public Timestamp getCashCreat() {
        return cashCreat;
    }

    public void setCashCreat(Timestamp cashCreat) {
        this.cashCreat = cashCreat;
    }

    @Basic
    @Column(name = "cash_modified", nullable = true)
    public Timestamp getCashModified() {
        return cashModified;
    }

    public void setCashModified(Timestamp cashModified) {
        this.cashModified = cashModified;
    }

    @Basic
    @Column(name = "cash_reserve1", nullable = true, length = 255)
    public String getCashReserve1() {
        return cashReserve1;
    }

    public void setCashReserve1(String cashReserve1) {
        this.cashReserve1 = cashReserve1;
    }

    @Basic
    @Column(name = "cash_reserve2", nullable = true, length = 255)
    public String getCashReserve2() {
        return cashReserve2;
    }

    public void setCashReserve2(String cashReserve2) {
        this.cashReserve2 = cashReserve2;
    }

    @Basic
    @Column(name = "cash_reserve3", nullable = true, length = 255)
    public String getCashReserve3() {
        return cashReserve3;
    }

    public void setCashReserve3(String cashReserve3) {
        this.cashReserve3 = cashReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cash cash = (Cash) o;
        return cashType == cash.cashType &&
                Objects.equals(cashId, cash.cashId) &&
                Objects.equals(cashNumber, cash.cashNumber) &&
                Objects.equals(indentNumber, cash.indentNumber) &&
                Objects.equals(memberId, cash.memberId) &&
                Objects.equals(cashMoney, cash.cashMoney) &&
                Objects.equals(cashBalance, cash.cashBalance) &&
                Objects.equals(cashIsPay, cash.cashIsPay) &&
                Objects.equals(cashPlatform, cash.cashPlatform) &&
                Objects.equals(cashIsStatus, cash.cashIsStatus) &&
                Objects.equals(cashCreat, cash.cashCreat) &&
                Objects.equals(cashModified, cash.cashModified) &&
                Objects.equals(cashReserve1, cash.cashReserve1) &&
                Objects.equals(cashReserve2, cash.cashReserve2) &&
                Objects.equals(cashReserve3, cash.cashReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cashId, cashNumber, indentNumber, cashType, memberId, cashMoney, cashBalance, cashIsPay, cashPlatform, cashIsStatus, cashCreat, cashModified, cashReserve1, cashReserve2, cashReserve3);
    }
}
