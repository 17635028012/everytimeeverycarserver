package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Indent {
    private String integralId;
    private Integer integralNumber;
    private Integer indentNumber;
    private Byte integralType;
    private String memberId;
    private Integer integralAdd;
    private Integer integralSub;
    private String integralPlatform;
    private Byte indentIsStatus;
    private Timestamp indentCreat;
    private Timestamp indentModified;
    private String indentReserve1;
    private String indentReserve2;
    private String indentReserve3;

    @Id
    @Column(name = "integral _id", nullable = false, length = 50)
    public String getIntegralId() {
        return integralId;
    }

    public void setIntegralId(String integralId) {
        this.integralId = integralId;
    }

    @Basic
    @Column(name = "integral _number", nullable = true)
    public Integer getIntegralNumber() {
        return integralNumber;
    }

    public void setIntegralNumber(Integer integralNumber) {
        this.integralNumber = integralNumber;
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
    @Column(name = "integral _type", nullable = true)
    public Byte getIntegralType() {
        return integralType;
    }

    public void setIntegralType(Byte integralType) {
        this.integralType = integralType;
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
    @Column(name = "integral_add", nullable = true)
    public Integer getIntegralAdd() {
        return integralAdd;
    }

    public void setIntegralAdd(Integer integralAdd) {
        this.integralAdd = integralAdd;
    }

    @Basic
    @Column(name = "integral_sub", nullable = true)
    public Integer getIntegralSub() {
        return integralSub;
    }

    public void setIntegralSub(Integer integralSub) {
        this.integralSub = integralSub;
    }

    @Basic
    @Column(name = "integral _platform", nullable = true, length = 10)
    public String getIntegralPlatform() {
        return integralPlatform;
    }

    public void setIntegralPlatform(String integralPlatform) {
        this.integralPlatform = integralPlatform;
    }

    @Basic
    @Column(name = "indent_is_status", nullable = true)
    public Byte getIndentIsStatus() {
        return indentIsStatus;
    }

    public void setIndentIsStatus(Byte indentIsStatus) {
        this.indentIsStatus = indentIsStatus;
    }

    @Basic
    @Column(name = "indent_creat", nullable = true)
    public Timestamp getIndentCreat() {
        return indentCreat;
    }

    public void setIndentCreat(Timestamp indentCreat) {
        this.indentCreat = indentCreat;
    }

    @Basic
    @Column(name = "indent_modified", nullable = true)
    public Timestamp getIndentModified() {
        return indentModified;
    }

    public void setIndentModified(Timestamp indentModified) {
        this.indentModified = indentModified;
    }

    @Basic
    @Column(name = "indent_reserve1", nullable = true, length = 255)
    public String getIndentReserve1() {
        return indentReserve1;
    }

    public void setIndentReserve1(String indentReserve1) {
        this.indentReserve1 = indentReserve1;
    }

    @Basic
    @Column(name = "indent_reserve2", nullable = true, length = 255)
    public String getIndentReserve2() {
        return indentReserve2;
    }

    public void setIndentReserve2(String indentReserve2) {
        this.indentReserve2 = indentReserve2;
    }

    @Basic
    @Column(name = "indent_reserve3", nullable = true, length = 255)
    public String getIndentReserve3() {
        return indentReserve3;
    }

    public void setIndentReserve3(String indentReserve3) {
        this.indentReserve3 = indentReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Indent indent = (Indent) o;
        return Objects.equals(integralId, indent.integralId) &&
                Objects.equals(integralNumber, indent.integralNumber) &&
                Objects.equals(indentNumber, indent.indentNumber) &&
                Objects.equals(integralType, indent.integralType) &&
                Objects.equals(memberId, indent.memberId) &&
                Objects.equals(integralAdd, indent.integralAdd) &&
                Objects.equals(integralSub, indent.integralSub) &&
                Objects.equals(integralPlatform, indent.integralPlatform) &&
                Objects.equals(indentIsStatus, indent.indentIsStatus) &&
                Objects.equals(indentCreat, indent.indentCreat) &&
                Objects.equals(indentModified, indent.indentModified) &&
                Objects.equals(indentReserve1, indent.indentReserve1) &&
                Objects.equals(indentReserve2, indent.indentReserve2) &&
                Objects.equals(indentReserve3, indent.indentReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integralId, integralNumber, indentNumber, integralType, memberId, integralAdd, integralSub, integralPlatform, indentIsStatus, indentCreat, indentModified, indentReserve1, indentReserve2, indentReserve3);
    }
}
