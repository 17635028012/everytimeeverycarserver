package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Consume {
    private String consumeId;
    private int consumeNumber;
    private Integer indentNumber;
    private Byte consumeType;
    private String memberId;
    private BigDecimal consumeBefmoney;
    private BigDecimal consumeAftmoney;
    private String consumePlatform;
    private BigDecimal consumeMoney;
    private BigDecimal consumeBalance;
    private Byte consumeIsPay;
    private Byte consumeIsStatus;
    private Timestamp consumeCreat;
    private Timestamp consumeModified;
    private String consumeReserve1;
    private String consumeReserve2;
    private String consumeReserve3;

    @Id
    @Column(name = "consume_id", nullable = false, length = 50)
    public String getConsumeId() {
        return consumeId;
    }

    public void setConsumeId(String consumeId) {
        this.consumeId = consumeId;
    }

    @Basic
    @Column(name = "consume_number", nullable = false)
    public int getConsumeNumber() {
        return consumeNumber;
    }

    public void setConsumeNumber(int consumeNumber) {
        this.consumeNumber = consumeNumber;
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
    @Column(name = "consume_type", nullable = true)
    public Byte getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(Byte consumeType) {
        this.consumeType = consumeType;
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
    @Column(name = "consume_befmoney", nullable = true, precision = 2)
    public BigDecimal getConsumeBefmoney() {
        return consumeBefmoney;
    }

    public void setConsumeBefmoney(BigDecimal consumeBefmoney) {
        this.consumeBefmoney = consumeBefmoney;
    }

    @Basic
    @Column(name = "consume_aftmoney", nullable = true, precision = 2)
    public BigDecimal getConsumeAftmoney() {
        return consumeAftmoney;
    }

    public void setConsumeAftmoney(BigDecimal consumeAftmoney) {
        this.consumeAftmoney = consumeAftmoney;
    }

    @Basic
    @Column(name = "consume_platform", nullable = true, length = 10)
    public String getConsumePlatform() {
        return consumePlatform;
    }

    public void setConsumePlatform(String consumePlatform) {
        this.consumePlatform = consumePlatform;
    }

    @Basic
    @Column(name = "consume_money", nullable = true, precision = 2)
    public BigDecimal getConsumeMoney() {
        return consumeMoney;
    }

    public void setConsumeMoney(BigDecimal consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    @Basic
    @Column(name = "consume_balance", nullable = true, precision = 2)
    public BigDecimal getConsumeBalance() {
        return consumeBalance;
    }

    public void setConsumeBalance(BigDecimal consumeBalance) {
        this.consumeBalance = consumeBalance;
    }

    @Basic
    @Column(name = "consume_is_pay", nullable = true)
    public Byte getConsumeIsPay() {
        return consumeIsPay;
    }

    public void setConsumeIsPay(Byte consumeIsPay) {
        this.consumeIsPay = consumeIsPay;
    }

    @Basic
    @Column(name = "consume_is_status", nullable = true)
    public Byte getConsumeIsStatus() {
        return consumeIsStatus;
    }

    public void setConsumeIsStatus(Byte consumeIsStatus) {
        this.consumeIsStatus = consumeIsStatus;
    }

    @Basic
    @Column(name = "consume_creat", nullable = true)
    public Timestamp getConsumeCreat() {
        return consumeCreat;
    }

    public void setConsumeCreat(Timestamp consumeCreat) {
        this.consumeCreat = consumeCreat;
    }

    @Basic
    @Column(name = "consume_modified", nullable = true)
    public Timestamp getConsumeModified() {
        return consumeModified;
    }

    public void setConsumeModified(Timestamp consumeModified) {
        this.consumeModified = consumeModified;
    }

    @Basic
    @Column(name = "consume_reserve1", nullable = true, length = 255)
    public String getConsumeReserve1() {
        return consumeReserve1;
    }

    public void setConsumeReserve1(String consumeReserve1) {
        this.consumeReserve1 = consumeReserve1;
    }

    @Basic
    @Column(name = "consume_reserve2", nullable = true, length = 255)
    public String getConsumeReserve2() {
        return consumeReserve2;
    }

    public void setConsumeReserve2(String consumeReserve2) {
        this.consumeReserve2 = consumeReserve2;
    }

    @Basic
    @Column(name = "consume_reserve3", nullable = true, length = 255)
    public String getConsumeReserve3() {
        return consumeReserve3;
    }

    public void setConsumeReserve3(String consumeReserve3) {
        this.consumeReserve3 = consumeReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consume consume = (Consume) o;
        return consumeNumber == consume.consumeNumber &&
                Objects.equals(consumeId, consume.consumeId) &&
                Objects.equals(indentNumber, consume.indentNumber) &&
                Objects.equals(consumeType, consume.consumeType) &&
                Objects.equals(memberId, consume.memberId) &&
                Objects.equals(consumeBefmoney, consume.consumeBefmoney) &&
                Objects.equals(consumeAftmoney, consume.consumeAftmoney) &&
                Objects.equals(consumePlatform, consume.consumePlatform) &&
                Objects.equals(consumeMoney, consume.consumeMoney) &&
                Objects.equals(consumeBalance, consume.consumeBalance) &&
                Objects.equals(consumeIsPay, consume.consumeIsPay) &&
                Objects.equals(consumeIsStatus, consume.consumeIsStatus) &&
                Objects.equals(consumeCreat, consume.consumeCreat) &&
                Objects.equals(consumeModified, consume.consumeModified) &&
                Objects.equals(consumeReserve1, consume.consumeReserve1) &&
                Objects.equals(consumeReserve2, consume.consumeReserve2) &&
                Objects.equals(consumeReserve3, consume.consumeReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumeId, consumeNumber, indentNumber, consumeType, memberId, consumeBefmoney, consumeAftmoney, consumePlatform, consumeMoney, consumeBalance, consumeIsPay, consumeIsStatus, consumeCreat, consumeModified, consumeReserve1, consumeReserve2, consumeReserve3);
    }
}
