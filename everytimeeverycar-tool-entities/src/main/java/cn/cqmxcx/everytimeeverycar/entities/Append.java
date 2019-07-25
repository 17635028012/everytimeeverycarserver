package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Append {
    private String appendId;
    private BigDecimal appendSection;
    private BigDecimal appendOvertime;
    private BigDecimal appendMileage;
    private String appendReserve1;
    private String appendReserve2;
    private String appendReserve3;

    @Id
    @Column(name = "append _id", nullable = false, length = 50)
    public String getAppendId() {
        return appendId;
    }

    public void setAppendId(String appendId) {
        this.appendId = appendId;
    }

    @Basic
    @Column(name = "append _section", nullable = true, precision = 2)
    public BigDecimal getAppendSection() {
        return appendSection;
    }

    public void setAppendSection(BigDecimal appendSection) {
        this.appendSection = appendSection;
    }

    @Basic
    @Column(name = "append _overtime", nullable = true, precision = 2)
    public BigDecimal getAppendOvertime() {
        return appendOvertime;
    }

    public void setAppendOvertime(BigDecimal appendOvertime) {
        this.appendOvertime = appendOvertime;
    }

    @Basic
    @Column(name = "append _mileage", nullable = true, precision = 2)
    public BigDecimal getAppendMileage() {
        return appendMileage;
    }

    public void setAppendMileage(BigDecimal appendMileage) {
        this.appendMileage = appendMileage;
    }

    @Basic
    @Column(name = "append_reserve1", nullable = true, length = 255)
    public String getAppendReserve1() {
        return appendReserve1;
    }

    public void setAppendReserve1(String appendReserve1) {
        this.appendReserve1 = appendReserve1;
    }

    @Basic
    @Column(name = "append_reserve2", nullable = true, length = 255)
    public String getAppendReserve2() {
        return appendReserve2;
    }

    public void setAppendReserve2(String appendReserve2) {
        this.appendReserve2 = appendReserve2;
    }

    @Basic
    @Column(name = "append_reserve3", nullable = true, length = 255)
    public String getAppendReserve3() {
        return appendReserve3;
    }

    public void setAppendReserve3(String appendReserve3) {
        this.appendReserve3 = appendReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Append append = (Append) o;
        return Objects.equals(appendId, append.appendId) &&
                Objects.equals(appendSection, append.appendSection) &&
                Objects.equals(appendOvertime, append.appendOvertime) &&
                Objects.equals(appendMileage, append.appendMileage) &&
                Objects.equals(appendReserve1, append.appendReserve1) &&
                Objects.equals(appendReserve2, append.appendReserve2) &&
                Objects.equals(appendReserve3, append.appendReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appendId, appendSection, appendOvertime, appendMileage, appendReserve1, appendReserve2, appendReserve3);
    }
}
