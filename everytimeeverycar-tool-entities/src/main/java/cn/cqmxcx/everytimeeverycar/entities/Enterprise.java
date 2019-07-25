package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Enterprise {
    private String epId;
    private String leaseId;
    private String epStaffcode;
    private String epUsername;
    private String epPassword;
    private String epNickname;
    private Byte epLevel;
    private String epPhone;
    private String epEmail;
    private String epSite;
    private String epAccount;
    private Timestamp epCreate;
    private Timestamp epModified;
    private Byte epIsStatus;
    private Byte epAudit;
    private String epCode;
    private String epBank;
    private String epReserve1;
    private String epReserve2;
    private String epReserve3;

    @Id
    @Column(name = "ep_id", nullable = false, length = 50)
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    @Basic
    @Column(name = "lease _id", nullable = true, length = 50)
    public String getLeaseId() {
        return leaseId;
    }

    public void setLeaseId(String leaseId) {
        this.leaseId = leaseId;
    }

    @Basic
    @Column(name = "ep_staffcode", nullable = true, length = 50)
    public String getEpStaffcode() {
        return epStaffcode;
    }

    public void setEpStaffcode(String epStaffcode) {
        this.epStaffcode = epStaffcode;
    }

    @Basic
    @Column(name = "ep_username", nullable = true, length = 18)
    public String getEpUsername() {
        return epUsername;
    }

    public void setEpUsername(String epUsername) {
        this.epUsername = epUsername;
    }

    @Basic
    @Column(name = "ep_password", nullable = true, length = 10)
    public String getEpPassword() {
        return epPassword;
    }

    public void setEpPassword(String epPassword) {
        this.epPassword = epPassword;
    }

    @Basic
    @Column(name = "ep_nickname", nullable = true, length = 10)
    public String getEpNickname() {
        return epNickname;
    }

    public void setEpNickname(String epNickname) {
        this.epNickname = epNickname;
    }

    @Basic
    @Column(name = "ep_level", nullable = true)
    public Byte getEpLevel() {
        return epLevel;
    }

    public void setEpLevel(Byte epLevel) {
        this.epLevel = epLevel;
    }

    @Basic
    @Column(name = "ep _phone", nullable = true, length = 11)
    public String getEpPhone() {
        return epPhone;
    }

    public void setEpPhone(String epPhone) {
        this.epPhone = epPhone;
    }

    @Basic
    @Column(name = "ep_email", nullable = true, length = 15)
    public String getEpEmail() {
        return epEmail;
    }

    public void setEpEmail(String epEmail) {
        this.epEmail = epEmail;
    }

    @Basic
    @Column(name = "ep _site", nullable = true, length = 25)
    public String getEpSite() {
        return epSite;
    }

    public void setEpSite(String epSite) {
        this.epSite = epSite;
    }

    @Basic
    @Column(name = "ep_account", nullable = true, length = 50)
    public String getEpAccount() {
        return epAccount;
    }

    public void setEpAccount(String epAccount) {
        this.epAccount = epAccount;
    }

    @Basic
    @Column(name = "ep_create", nullable = true)
    public Timestamp getEpCreate() {
        return epCreate;
    }

    public void setEpCreate(Timestamp epCreate) {
        this.epCreate = epCreate;
    }

    @Basic
    @Column(name = "ep_modified", nullable = true)
    public Timestamp getEpModified() {
        return epModified;
    }

    public void setEpModified(Timestamp epModified) {
        this.epModified = epModified;
    }

    @Basic
    @Column(name = "ep_is_status", nullable = true)
    public Byte getEpIsStatus() {
        return epIsStatus;
    }

    public void setEpIsStatus(Byte epIsStatus) {
        this.epIsStatus = epIsStatus;
    }

    @Basic
    @Column(name = "ep_audit", nullable = true)
    public Byte getEpAudit() {
        return epAudit;
    }

    public void setEpAudit(Byte epAudit) {
        this.epAudit = epAudit;
    }

    @Basic
    @Column(name = "ep_code", nullable = true, length = 25)
    public String getEpCode() {
        return epCode;
    }

    public void setEpCode(String epCode) {
        this.epCode = epCode;
    }

    @Basic
    @Column(name = "ep_bank", nullable = true, length = 10)
    public String getEpBank() {
        return epBank;
    }

    public void setEpBank(String epBank) {
        this.epBank = epBank;
    }

    @Basic
    @Column(name = "ep_reserve1", nullable = true, length = 255)
    public String getEpReserve1() {
        return epReserve1;
    }

    public void setEpReserve1(String epReserve1) {
        this.epReserve1 = epReserve1;
    }

    @Basic
    @Column(name = "ep_reserve2", nullable = true, length = 255)
    public String getEpReserve2() {
        return epReserve2;
    }

    public void setEpReserve2(String epReserve2) {
        this.epReserve2 = epReserve2;
    }

    @Basic
    @Column(name = "ep_reserve3", nullable = true, length = 255)
    public String getEpReserve3() {
        return epReserve3;
    }

    public void setEpReserve3(String epReserve3) {
        this.epReserve3 = epReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enterprise that = (Enterprise) o;
        return Objects.equals(epId, that.epId) &&
                Objects.equals(leaseId, that.leaseId) &&
                Objects.equals(epStaffcode, that.epStaffcode) &&
                Objects.equals(epUsername, that.epUsername) &&
                Objects.equals(epPassword, that.epPassword) &&
                Objects.equals(epNickname, that.epNickname) &&
                Objects.equals(epLevel, that.epLevel) &&
                Objects.equals(epPhone, that.epPhone) &&
                Objects.equals(epEmail, that.epEmail) &&
                Objects.equals(epSite, that.epSite) &&
                Objects.equals(epAccount, that.epAccount) &&
                Objects.equals(epCreate, that.epCreate) &&
                Objects.equals(epModified, that.epModified) &&
                Objects.equals(epIsStatus, that.epIsStatus) &&
                Objects.equals(epAudit, that.epAudit) &&
                Objects.equals(epCode, that.epCode) &&
                Objects.equals(epBank, that.epBank) &&
                Objects.equals(epReserve1, that.epReserve1) &&
                Objects.equals(epReserve2, that.epReserve2) &&
                Objects.equals(epReserve3, that.epReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epId, leaseId, epStaffcode, epUsername, epPassword, epNickname, epLevel, epPhone, epEmail, epSite, epAccount, epCreate, epModified, epIsStatus, epAudit, epCode, epBank, epReserve1, epReserve2, epReserve3);
    }
}
