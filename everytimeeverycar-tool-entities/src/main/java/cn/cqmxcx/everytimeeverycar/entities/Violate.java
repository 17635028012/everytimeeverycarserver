package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Violate {
    private String violateId;
    private String carId;
    private Byte violateType;
    private String violateCase;
    private BigDecimal violateAmerce;
    private String violateDeduct;
    private Byte violateDispose;
    private Timestamp violateCreate;
    private Timestamp violateModified;
    private Byte violateIsStatus;
    private String violateReserve1;
    private String violateReserve2;
    private String violateReserve3;

    @Id
    @Column(name = "violate_id", nullable = false, length = 50)
    public String getViolateId() {
        return violateId;
    }

    public void setViolateId(String violateId) {
        this.violateId = violateId;
    }

    @Basic
    @Column(name = "car_id", nullable = true, length = 50)
    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    @Basic
    @Column(name = "violate_type", nullable = true)
    public Byte getViolateType() {
        return violateType;
    }

    public void setViolateType(Byte violateType) {
        this.violateType = violateType;
    }

    @Basic
    @Column(name = "violate_case", nullable = true, length = 255)
    public String getViolateCase() {
        return violateCase;
    }

    public void setViolateCase(String violateCase) {
        this.violateCase = violateCase;
    }

    @Basic
    @Column(name = "violate_amerce", nullable = true, precision = 2)
    public BigDecimal getViolateAmerce() {
        return violateAmerce;
    }

    public void setViolateAmerce(BigDecimal violateAmerce) {
        this.violateAmerce = violateAmerce;
    }

    @Basic
    @Column(name = "violate_deduct", nullable = true, length = 255)
    public String getViolateDeduct() {
        return violateDeduct;
    }

    public void setViolateDeduct(String violateDeduct) {
        this.violateDeduct = violateDeduct;
    }

    @Basic
    @Column(name = "violate_dispose", nullable = true)
    public Byte getViolateDispose() {
        return violateDispose;
    }

    public void setViolateDispose(Byte violateDispose) {
        this.violateDispose = violateDispose;
    }

    @Basic
    @Column(name = "violate_create", nullable = true)
    public Timestamp getViolateCreate() {
        return violateCreate;
    }

    public void setViolateCreate(Timestamp violateCreate) {
        this.violateCreate = violateCreate;
    }

    @Basic
    @Column(name = "violate_modified", nullable = true)
    public Timestamp getViolateModified() {
        return violateModified;
    }

    public void setViolateModified(Timestamp violateModified) {
        this.violateModified = violateModified;
    }

    @Basic
    @Column(name = "violate_is_status", nullable = true)
    public Byte getViolateIsStatus() {
        return violateIsStatus;
    }

    public void setViolateIsStatus(Byte violateIsStatus) {
        this.violateIsStatus = violateIsStatus;
    }

    @Basic
    @Column(name = "violate_reserve1", nullable = true, length = 255)
    public String getViolateReserve1() {
        return violateReserve1;
    }

    public void setViolateReserve1(String violateReserve1) {
        this.violateReserve1 = violateReserve1;
    }

    @Basic
    @Column(name = "violate_reserve2", nullable = true, length = 255)
    public String getViolateReserve2() {
        return violateReserve2;
    }

    public void setViolateReserve2(String violateReserve2) {
        this.violateReserve2 = violateReserve2;
    }

    @Basic
    @Column(name = "violate_reserve3", nullable = true, length = 255)
    public String getViolateReserve3() {
        return violateReserve3;
    }

    public void setViolateReserve3(String violateReserve3) {
        this.violateReserve3 = violateReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Violate violate = (Violate) o;
        return Objects.equals(violateId, violate.violateId) &&
                Objects.equals(carId, violate.carId) &&
                Objects.equals(violateType, violate.violateType) &&
                Objects.equals(violateCase, violate.violateCase) &&
                Objects.equals(violateAmerce, violate.violateAmerce) &&
                Objects.equals(violateDeduct, violate.violateDeduct) &&
                Objects.equals(violateDispose, violate.violateDispose) &&
                Objects.equals(violateCreate, violate.violateCreate) &&
                Objects.equals(violateModified, violate.violateModified) &&
                Objects.equals(violateIsStatus, violate.violateIsStatus) &&
                Objects.equals(violateReserve1, violate.violateReserve1) &&
                Objects.equals(violateReserve2, violate.violateReserve2) &&
                Objects.equals(violateReserve3, violate.violateReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(violateId, carId, violateType, violateCase, violateAmerce, violateDeduct, violateDispose, violateCreate, violateModified, violateIsStatus, violateReserve1, violateReserve2, violateReserve3);
    }
}
