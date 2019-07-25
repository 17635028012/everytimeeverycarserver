package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Earnings {
    private String earningsId;
    private Integer earningsNumber;
    private Integer indentNumber;
    private Byte earningsType;
    private String memberId;
    private BigDecimal earningsBalance;
    private Byte earningsIsPay;
    private BigDecimal earningsBefmoney;
    private BigDecimal earningsAftmoney;
    private Byte earningsIsTatus;
    private Timestamp earningsCreat;
    private Timestamp earningsModified;
    private String earningsReserve1;
    private String earningsReserve2;
    private String earningsReserve3;

    @Id
    @Column(name = "earnings_id", nullable = false, length = 50)
    public String getEarningsId() {
        return earningsId;
    }

    public void setEarningsId(String earningsId) {
        this.earningsId = earningsId;
    }

    @Basic
    @Column(name = "earnings_number", nullable = true)
    public Integer getEarningsNumber() {
        return earningsNumber;
    }

    public void setEarningsNumber(Integer earningsNumber) {
        this.earningsNumber = earningsNumber;
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
    @Column(name = "earnings_type", nullable = true)
    public Byte getEarningsType() {
        return earningsType;
    }

    public void setEarningsType(Byte earningsType) {
        this.earningsType = earningsType;
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
    @Column(name = "earnings_balance", nullable = true, precision = 2)
    public BigDecimal getEarningsBalance() {
        return earningsBalance;
    }

    public void setEarningsBalance(BigDecimal earningsBalance) {
        this.earningsBalance = earningsBalance;
    }

    @Basic
    @Column(name = "earnings_is_pay", nullable = true)
    public Byte getEarningsIsPay() {
        return earningsIsPay;
    }

    public void setEarningsIsPay(Byte earningsIsPay) {
        this.earningsIsPay = earningsIsPay;
    }

    @Basic
    @Column(name = "earnings_befmoney", nullable = true, precision = 2)
    public BigDecimal getEarningsBefmoney() {
        return earningsBefmoney;
    }

    public void setEarningsBefmoney(BigDecimal earningsBefmoney) {
        this.earningsBefmoney = earningsBefmoney;
    }

    @Basic
    @Column(name = "earnings_aftmoney", nullable = true, precision = 2)
    public BigDecimal getEarningsAftmoney() {
        return earningsAftmoney;
    }

    public void setEarningsAftmoney(BigDecimal earningsAftmoney) {
        this.earningsAftmoney = earningsAftmoney;
    }

    @Basic
    @Column(name = "earnings_is_tatus", nullable = true)
    public Byte getEarningsIsTatus() {
        return earningsIsTatus;
    }

    public void setEarningsIsTatus(Byte earningsIsTatus) {
        this.earningsIsTatus = earningsIsTatus;
    }

    @Basic
    @Column(name = "earnings_creat", nullable = true)
    public Timestamp getEarningsCreat() {
        return earningsCreat;
    }

    public void setEarningsCreat(Timestamp earningsCreat) {
        this.earningsCreat = earningsCreat;
    }

    @Basic
    @Column(name = "earnings_modified", nullable = true)
    public Timestamp getEarningsModified() {
        return earningsModified;
    }

    public void setEarningsModified(Timestamp earningsModified) {
        this.earningsModified = earningsModified;
    }

    @Basic
    @Column(name = "earnings_reserve1", nullable = true, length = 255)
    public String getEarningsReserve1() {
        return earningsReserve1;
    }

    public void setEarningsReserve1(String earningsReserve1) {
        this.earningsReserve1 = earningsReserve1;
    }

    @Basic
    @Column(name = "earnings_reserve2", nullable = true, length = 255)
    public String getEarningsReserve2() {
        return earningsReserve2;
    }

    public void setEarningsReserve2(String earningsReserve2) {
        this.earningsReserve2 = earningsReserve2;
    }

    @Basic
    @Column(name = "earnings_reserve3", nullable = true, length = 255)
    public String getEarningsReserve3() {
        return earningsReserve3;
    }

    public void setEarningsReserve3(String earningsReserve3) {
        this.earningsReserve3 = earningsReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Earnings earnings = (Earnings) o;
        return Objects.equals(earningsId, earnings.earningsId) &&
                Objects.equals(earningsNumber, earnings.earningsNumber) &&
                Objects.equals(indentNumber, earnings.indentNumber) &&
                Objects.equals(earningsType, earnings.earningsType) &&
                Objects.equals(memberId, earnings.memberId) &&
                Objects.equals(earningsBalance, earnings.earningsBalance) &&
                Objects.equals(earningsIsPay, earnings.earningsIsPay) &&
                Objects.equals(earningsBefmoney, earnings.earningsBefmoney) &&
                Objects.equals(earningsAftmoney, earnings.earningsAftmoney) &&
                Objects.equals(earningsIsTatus, earnings.earningsIsTatus) &&
                Objects.equals(earningsCreat, earnings.earningsCreat) &&
                Objects.equals(earningsModified, earnings.earningsModified) &&
                Objects.equals(earningsReserve1, earnings.earningsReserve1) &&
                Objects.equals(earningsReserve2, earnings.earningsReserve2) &&
                Objects.equals(earningsReserve3, earnings.earningsReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(earningsId, earningsNumber, indentNumber, earningsType, memberId, earningsBalance, earningsIsPay, earningsBefmoney, earningsAftmoney, earningsIsTatus, earningsCreat, earningsModified, earningsReserve1, earningsReserve2, earningsReserve3);
    }
}
