package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Grade {
    private String gradeId;
    private String gradeLevel;
    private BigDecimal gradeGrowth;
    private String gradeDiscount;
    private String gradeCreditlevel;
    private Byte gradeIsStatus;
    private String gradeCredit0;
    private String gradeCredit1;
    private String gradeIncident;
    private Timestamp gradeCreate;
    private Timestamp gradeModified;
    private String gradeReserve1;
    private String gradeReserve2;
    private String gradeReserve3;

    @Id
    @Column(name = "grade_id", nullable = false, length = 50)
    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    @Basic
    @Column(name = "grade_level", nullable = true, length = 10)
    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Basic
    @Column(name = "grade_growth", nullable = true, precision = 2)
    public BigDecimal getGradeGrowth() {
        return gradeGrowth;
    }

    public void setGradeGrowth(BigDecimal gradeGrowth) {
        this.gradeGrowth = gradeGrowth;
    }

    @Basic
    @Column(name = "grade_discount", nullable = true, length = 50)
    public String getGradeDiscount() {
        return gradeDiscount;
    }

    public void setGradeDiscount(String gradeDiscount) {
        this.gradeDiscount = gradeDiscount;
    }

    @Basic
    @Column(name = "grade_creditlevel", nullable = true, length = 10)
    public String getGradeCreditlevel() {
        return gradeCreditlevel;
    }

    public void setGradeCreditlevel(String gradeCreditlevel) {
        this.gradeCreditlevel = gradeCreditlevel;
    }

    @Basic
    @Column(name = "grade_is_status", nullable = true)
    public Byte getGradeIsStatus() {
        return gradeIsStatus;
    }

    public void setGradeIsStatus(Byte gradeIsStatus) {
        this.gradeIsStatus = gradeIsStatus;
    }

    @Basic
    @Column(name = "grade_credit0", nullable = true, length = 50)
    public String getGradeCredit0() {
        return gradeCredit0;
    }

    public void setGradeCredit0(String gradeCredit0) {
        this.gradeCredit0 = gradeCredit0;
    }

    @Basic
    @Column(name = "grade_credit1", nullable = true, length = 50)
    public String getGradeCredit1() {
        return gradeCredit1;
    }

    public void setGradeCredit1(String gradeCredit1) {
        this.gradeCredit1 = gradeCredit1;
    }

    @Basic
    @Column(name = "grade_incident", nullable = true, length = 25)
    public String getGradeIncident() {
        return gradeIncident;
    }

    public void setGradeIncident(String gradeIncident) {
        this.gradeIncident = gradeIncident;
    }

    @Basic
    @Column(name = "grade_create", nullable = true)
    public Timestamp getGradeCreate() {
        return gradeCreate;
    }

    public void setGradeCreate(Timestamp gradeCreate) {
        this.gradeCreate = gradeCreate;
    }

    @Basic
    @Column(name = "grade_modified", nullable = true)
    public Timestamp getGradeModified() {
        return gradeModified;
    }

    public void setGradeModified(Timestamp gradeModified) {
        this.gradeModified = gradeModified;
    }

    @Basic
    @Column(name = "grade_reserve1", nullable = true, length = 255)
    public String getGradeReserve1() {
        return gradeReserve1;
    }

    public void setGradeReserve1(String gradeReserve1) {
        this.gradeReserve1 = gradeReserve1;
    }

    @Basic
    @Column(name = "grade_reserve2", nullable = true, length = 255)
    public String getGradeReserve2() {
        return gradeReserve2;
    }

    public void setGradeReserve2(String gradeReserve2) {
        this.gradeReserve2 = gradeReserve2;
    }

    @Basic
    @Column(name = "grade_reserve3", nullable = true, length = 255)
    public String getGradeReserve3() {
        return gradeReserve3;
    }

    public void setGradeReserve3(String gradeReserve3) {
        this.gradeReserve3 = gradeReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return Objects.equals(gradeId, grade.gradeId) &&
                Objects.equals(gradeLevel, grade.gradeLevel) &&
                Objects.equals(gradeGrowth, grade.gradeGrowth) &&
                Objects.equals(gradeDiscount, grade.gradeDiscount) &&
                Objects.equals(gradeCreditlevel, grade.gradeCreditlevel) &&
                Objects.equals(gradeIsStatus, grade.gradeIsStatus) &&
                Objects.equals(gradeCredit0, grade.gradeCredit0) &&
                Objects.equals(gradeCredit1, grade.gradeCredit1) &&
                Objects.equals(gradeIncident, grade.gradeIncident) &&
                Objects.equals(gradeCreate, grade.gradeCreate) &&
                Objects.equals(gradeModified, grade.gradeModified) &&
                Objects.equals(gradeReserve1, grade.gradeReserve1) &&
                Objects.equals(gradeReserve2, grade.gradeReserve2) &&
                Objects.equals(gradeReserve3, grade.gradeReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradeId, gradeLevel, gradeGrowth, gradeDiscount, gradeCreditlevel, gradeIsStatus, gradeCredit0, gradeCredit1, gradeIncident, gradeCreate, gradeModified, gradeReserve1, gradeReserve2, gradeReserve3);
    }
}
