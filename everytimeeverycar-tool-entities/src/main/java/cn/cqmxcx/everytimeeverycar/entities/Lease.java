package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Lease {
    private String leaseId;
    private String leaseUsername;
    private String leasePassword;
    private String leaseComcode;
    private Byte leaseLevel;
    private String leasePhone;
    private String leaseEmail;
    private String leaseSite;
    private Byte leaseIsStatus;
    private String leaseAccount;
    private Byte leaseAudit;
    private String leaseNickname;
    private String leaseCode;
    private String leaseBank;
    private Timestamp leaseCreate;
    private Timestamp leaseModified;
    private String leaseReserve1;
    private String leaseReserve2;
    private String leaseReserve3;

    @Id
    @Column(name = "lease _id", nullable = false, length = 50)
    public String getLeaseId() {
        return leaseId;
    }

    public void setLeaseId(String leaseId) {
        this.leaseId = leaseId;
    }

    @Basic
    @Column(name = "lease _username", nullable = true, length = 18)
    public String getLeaseUsername() {
        return leaseUsername;
    }

    public void setLeaseUsername(String leaseUsername) {
        this.leaseUsername = leaseUsername;
    }

    @Basic
    @Column(name = "lease_password", nullable = true, length = 10)
    public String getLeasePassword() {
        return leasePassword;
    }

    public void setLeasePassword(String leasePassword) {
        this.leasePassword = leasePassword;
    }

    @Basic
    @Column(name = "lease _comcode", nullable = true, length = 50)
    public String getLeaseComcode() {
        return leaseComcode;
    }

    public void setLeaseComcode(String leaseComcode) {
        this.leaseComcode = leaseComcode;
    }

    @Basic
    @Column(name = "lease _level", nullable = true)
    public Byte getLeaseLevel() {
        return leaseLevel;
    }

    public void setLeaseLevel(Byte leaseLevel) {
        this.leaseLevel = leaseLevel;
    }

    @Basic
    @Column(name = "lease _phone", nullable = true, length = 11)
    public String getLeasePhone() {
        return leasePhone;
    }

    public void setLeasePhone(String leasePhone) {
        this.leasePhone = leasePhone;
    }

    @Basic
    @Column(name = "lease _email", nullable = true, length = 15)
    public String getLeaseEmail() {
        return leaseEmail;
    }

    public void setLeaseEmail(String leaseEmail) {
        this.leaseEmail = leaseEmail;
    }

    @Basic
    @Column(name = "lease _site", nullable = true, length = 25)
    public String getLeaseSite() {
        return leaseSite;
    }

    public void setLeaseSite(String leaseSite) {
        this.leaseSite = leaseSite;
    }

    @Basic
    @Column(name = "lease_is_status", nullable = true)
    public Byte getLeaseIsStatus() {
        return leaseIsStatus;
    }

    public void setLeaseIsStatus(Byte leaseIsStatus) {
        this.leaseIsStatus = leaseIsStatus;
    }

    @Basic
    @Column(name = "lease_account", nullable = true, length = 20)
    public String getLeaseAccount() {
        return leaseAccount;
    }

    public void setLeaseAccount(String leaseAccount) {
        this.leaseAccount = leaseAccount;
    }

    @Basic
    @Column(name = "lease_audit", nullable = true)
    public Byte getLeaseAudit() {
        return leaseAudit;
    }

    public void setLeaseAudit(Byte leaseAudit) {
        this.leaseAudit = leaseAudit;
    }

    @Basic
    @Column(name = "lease_nickname", nullable = true, length = 50)
    public String getLeaseNickname() {
        return leaseNickname;
    }

    public void setLeaseNickname(String leaseNickname) {
        this.leaseNickname = leaseNickname;
    }

    @Basic
    @Column(name = "lease_code", nullable = true, length = 25)
    public String getLeaseCode() {
        return leaseCode;
    }

    public void setLeaseCode(String leaseCode) {
        this.leaseCode = leaseCode;
    }

    @Basic
    @Column(name = "lease_bank", nullable = true, length = 10)
    public String getLeaseBank() {
        return leaseBank;
    }

    public void setLeaseBank(String leaseBank) {
        this.leaseBank = leaseBank;
    }

    @Basic
    @Column(name = "lease_create", nullable = true)
    public Timestamp getLeaseCreate() {
        return leaseCreate;
    }

    public void setLeaseCreate(Timestamp leaseCreate) {
        this.leaseCreate = leaseCreate;
    }

    @Basic
    @Column(name = "lease_modified", nullable = true)
    public Timestamp getLeaseModified() {
        return leaseModified;
    }

    public void setLeaseModified(Timestamp leaseModified) {
        this.leaseModified = leaseModified;
    }

    @Basic
    @Column(name = "lease_reserve1", nullable = true, length = 255)
    public String getLeaseReserve1() {
        return leaseReserve1;
    }

    public void setLeaseReserve1(String leaseReserve1) {
        this.leaseReserve1 = leaseReserve1;
    }

    @Basic
    @Column(name = "lease_reserve2", nullable = true, length = 255)
    public String getLeaseReserve2() {
        return leaseReserve2;
    }

    public void setLeaseReserve2(String leaseReserve2) {
        this.leaseReserve2 = leaseReserve2;
    }

    @Basic
    @Column(name = "lease_reserve3", nullable = true, length = 255)
    public String getLeaseReserve3() {
        return leaseReserve3;
    }

    public void setLeaseReserve3(String leaseReserve3) {
        this.leaseReserve3 = leaseReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lease lease = (Lease) o;
        return Objects.equals(leaseId, lease.leaseId) &&
                Objects.equals(leaseUsername, lease.leaseUsername) &&
                Objects.equals(leasePassword, lease.leasePassword) &&
                Objects.equals(leaseComcode, lease.leaseComcode) &&
                Objects.equals(leaseLevel, lease.leaseLevel) &&
                Objects.equals(leasePhone, lease.leasePhone) &&
                Objects.equals(leaseEmail, lease.leaseEmail) &&
                Objects.equals(leaseSite, lease.leaseSite) &&
                Objects.equals(leaseIsStatus, lease.leaseIsStatus) &&
                Objects.equals(leaseAccount, lease.leaseAccount) &&
                Objects.equals(leaseAudit, lease.leaseAudit) &&
                Objects.equals(leaseNickname, lease.leaseNickname) &&
                Objects.equals(leaseCode, lease.leaseCode) &&
                Objects.equals(leaseBank, lease.leaseBank) &&
                Objects.equals(leaseCreate, lease.leaseCreate) &&
                Objects.equals(leaseModified, lease.leaseModified) &&
                Objects.equals(leaseReserve1, lease.leaseReserve1) &&
                Objects.equals(leaseReserve2, lease.leaseReserve2) &&
                Objects.equals(leaseReserve3, lease.leaseReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leaseId, leaseUsername, leasePassword, leaseComcode, leaseLevel, leasePhone, leaseEmail, leaseSite, leaseIsStatus, leaseAccount, leaseAudit, leaseNickname, leaseCode, leaseBank, leaseCreate, leaseModified, leaseReserve1, leaseReserve2, leaseReserve3);
    }
}
