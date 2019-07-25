package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Recharge {
    private String rechargeId;
    private Integer rechargeNumber;
    private Byte rechargeType;
    private String memberId;
    private BigDecimal rechargeMoney;
    private BigDecimal rechargeBalance;
    private Timestamp rechargeAccounting;
    private Byte rechargeIsPay;
    private BigDecimal rechargeBeforemoney;
    private BigDecimal rechargeAftermoney;
    private String rechargePlatform;
    private String indentNumber;
    private Timestamp rechargeCreat;
    private Timestamp rechargeModified;
    private String rechargeReserve1;
    private String rechargeReserve2;
    private String rechargeReserve3;

    @Id
    @Column(name = "recharge_id", nullable = false, length = 50)
    public String getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId;
    }

    @Basic
    @Column(name = "recharge_number", nullable = true)
    public Integer getRechargeNumber() {
        return rechargeNumber;
    }

    public void setRechargeNumber(Integer rechargeNumber) {
        this.rechargeNumber = rechargeNumber;
    }

    @Basic
    @Column(name = "recharge_type", nullable = true)
    public Byte getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(Byte rechargeType) {
        this.rechargeType = rechargeType;
    }

    @Basic
    @Column(name = " member_id", nullable = true, length = 50)
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "recharge_money", nullable = true, precision = 2)
    public BigDecimal getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(BigDecimal rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    @Basic
    @Column(name = "recharge_balance", nullable = true, precision = 2)
    public BigDecimal getRechargeBalance() {
        return rechargeBalance;
    }

    public void setRechargeBalance(BigDecimal rechargeBalance) {
        this.rechargeBalance = rechargeBalance;
    }

    @Basic
    @Column(name = "recharge_accounting", nullable = true)
    public Timestamp getRechargeAccounting() {
        return rechargeAccounting;
    }

    public void setRechargeAccounting(Timestamp rechargeAccounting) {
        this.rechargeAccounting = rechargeAccounting;
    }

    @Basic
    @Column(name = "recharge_is_pay", nullable = true)
    public Byte getRechargeIsPay() {
        return rechargeIsPay;
    }

    public void setRechargeIsPay(Byte rechargeIsPay) {
        this.rechargeIsPay = rechargeIsPay;
    }

    @Basic
    @Column(name = "recharge_beforemoney", nullable = true, precision = 2)
    public BigDecimal getRechargeBeforemoney() {
        return rechargeBeforemoney;
    }

    public void setRechargeBeforemoney(BigDecimal rechargeBeforemoney) {
        this.rechargeBeforemoney = rechargeBeforemoney;
    }

    @Basic
    @Column(name = "recharge_aftermoney", nullable = true, precision = 2)
    public BigDecimal getRechargeAftermoney() {
        return rechargeAftermoney;
    }

    public void setRechargeAftermoney(BigDecimal rechargeAftermoney) {
        this.rechargeAftermoney = rechargeAftermoney;
    }

    @Basic
    @Column(name = "recharge_platform", nullable = true, length = 10)
    public String getRechargePlatform() {
        return rechargePlatform;
    }

    public void setRechargePlatform(String rechargePlatform) {
        this.rechargePlatform = rechargePlatform;
    }

    @Basic
    @Column(name = "indent_number", nullable = true, length = 50)
    public String getIndentNumber() {
        return indentNumber;
    }

    public void setIndentNumber(String indentNumber) {
        this.indentNumber = indentNumber;
    }

    @Basic
    @Column(name = "recharge_creat", nullable = true)
    public Timestamp getRechargeCreat() {
        return rechargeCreat;
    }

    public void setRechargeCreat(Timestamp rechargeCreat) {
        this.rechargeCreat = rechargeCreat;
    }

    @Basic
    @Column(name = "recharge_modified", nullable = true)
    public Timestamp getRechargeModified() {
        return rechargeModified;
    }

    public void setRechargeModified(Timestamp rechargeModified) {
        this.rechargeModified = rechargeModified;
    }

    @Basic
    @Column(name = "recharge_reserve1", nullable = true, length = 255)
    public String getRechargeReserve1() {
        return rechargeReserve1;
    }

    public void setRechargeReserve1(String rechargeReserve1) {
        this.rechargeReserve1 = rechargeReserve1;
    }

    @Basic
    @Column(name = "recharge_reserve2", nullable = true, length = 255)
    public String getRechargeReserve2() {
        return rechargeReserve2;
    }

    public void setRechargeReserve2(String rechargeReserve2) {
        this.rechargeReserve2 = rechargeReserve2;
    }

    @Basic
    @Column(name = "recharge_reserve3", nullable = true, length = 255)
    public String getRechargeReserve3() {
        return rechargeReserve3;
    }

    public void setRechargeReserve3(String rechargeReserve3) {
        this.rechargeReserve3 = rechargeReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recharge recharge = (Recharge) o;
        return Objects.equals(rechargeId, recharge.rechargeId) &&
                Objects.equals(rechargeNumber, recharge.rechargeNumber) &&
                Objects.equals(rechargeType, recharge.rechargeType) &&
                Objects.equals(memberId, recharge.memberId) &&
                Objects.equals(rechargeMoney, recharge.rechargeMoney) &&
                Objects.equals(rechargeBalance, recharge.rechargeBalance) &&
                Objects.equals(rechargeAccounting, recharge.rechargeAccounting) &&
                Objects.equals(rechargeIsPay, recharge.rechargeIsPay) &&
                Objects.equals(rechargeBeforemoney, recharge.rechargeBeforemoney) &&
                Objects.equals(rechargeAftermoney, recharge.rechargeAftermoney) &&
                Objects.equals(rechargePlatform, recharge.rechargePlatform) &&
                Objects.equals(indentNumber, recharge.indentNumber) &&
                Objects.equals(rechargeCreat, recharge.rechargeCreat) &&
                Objects.equals(rechargeModified, recharge.rechargeModified) &&
                Objects.equals(rechargeReserve1, recharge.rechargeReserve1) &&
                Objects.equals(rechargeReserve2, recharge.rechargeReserve2) &&
                Objects.equals(rechargeReserve3, recharge.rechargeReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rechargeId, rechargeNumber, rechargeType, memberId, rechargeMoney, rechargeBalance, rechargeAccounting, rechargeIsPay, rechargeBeforemoney, rechargeAftermoney, rechargePlatform, indentNumber, rechargeCreat, rechargeModified, rechargeReserve1, rechargeReserve2, rechargeReserve3);
    }
}
