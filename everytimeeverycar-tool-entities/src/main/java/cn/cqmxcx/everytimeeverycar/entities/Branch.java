package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Branch {
    private String branchId;
    private String branchUsername;
    private String branchPassword;
    private String branchNickname;
    private Byte branchLevel;
    private String branchPhone;
    private String branchEmail;
    private String branchSite;
    private Byte branchIsStatus;
    private String branchAccount;
    private Timestamp branchCreate;
    private Timestamp branchModified;
    private String branchReserve1;
    private String branchReserve2;
    private String branchReserve3;

    @Id
    @Column(name = "branch_id", nullable = false, length = 50)
    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    @Basic
    @Column(name = "branch_username", nullable = true, length = 18)
    public String getBranchUsername() {
        return branchUsername;
    }

    public void setBranchUsername(String branchUsername) {
        this.branchUsername = branchUsername;
    }

    @Basic
    @Column(name = "branch_password", nullable = true, length = 15)
    public String getBranchPassword() {
        return branchPassword;
    }

    public void setBranchPassword(String branchPassword) {
        this.branchPassword = branchPassword;
    }

    @Basic
    @Column(name = "branch_nickname", nullable = true, length = 10)
    public String getBranchNickname() {
        return branchNickname;
    }

    public void setBranchNickname(String branchNickname) {
        this.branchNickname = branchNickname;
    }

    @Basic
    @Column(name = "branch_level", nullable = true)
    public Byte getBranchLevel() {
        return branchLevel;
    }

    public void setBranchLevel(Byte branchLevel) {
        this.branchLevel = branchLevel;
    }

    @Basic
    @Column(name = "branch_phone", nullable = true, length = 11)
    public String getBranchPhone() {
        return branchPhone;
    }

    public void setBranchPhone(String branchPhone) {
        this.branchPhone = branchPhone;
    }

    @Basic
    @Column(name = "branch_email", nullable = true, length = 20)
    public String getBranchEmail() {
        return branchEmail;
    }

    public void setBranchEmail(String branchEmail) {
        this.branchEmail = branchEmail;
    }

    @Basic
    @Column(name = "branch_site", nullable = true, length = 25)
    public String getBranchSite() {
        return branchSite;
    }

    public void setBranchSite(String branchSite) {
        this.branchSite = branchSite;
    }

    @Basic
    @Column(name = "branch_is_status", nullable = true)
    public Byte getBranchIsStatus() {
        return branchIsStatus;
    }

    public void setBranchIsStatus(Byte branchIsStatus) {
        this.branchIsStatus = branchIsStatus;
    }

    @Basic
    @Column(name = "branch_account", nullable = true, length = 15)
    public String getBranchAccount() {
        return branchAccount;
    }

    public void setBranchAccount(String branchAccount) {
        this.branchAccount = branchAccount;
    }

    @Basic
    @Column(name = "branch_create", nullable = true)
    public Timestamp getBranchCreate() {
        return branchCreate;
    }

    public void setBranchCreate(Timestamp branchCreate) {
        this.branchCreate = branchCreate;
    }

    @Basic
    @Column(name = "branch_modified", nullable = true)
    public Timestamp getBranchModified() {
        return branchModified;
    }

    public void setBranchModified(Timestamp branchModified) {
        this.branchModified = branchModified;
    }

    @Basic
    @Column(name = "branch_reserve1", nullable = true, length = 255)
    public String getBranchReserve1() {
        return branchReserve1;
    }

    public void setBranchReserve1(String branchReserve1) {
        this.branchReserve1 = branchReserve1;
    }

    @Basic
    @Column(name = "branch_reserve2", nullable = true, length = 255)
    public String getBranchReserve2() {
        return branchReserve2;
    }

    public void setBranchReserve2(String branchReserve2) {
        this.branchReserve2 = branchReserve2;
    }

    @Basic
    @Column(name = "branch_reserve3", nullable = true, length = 255)
    public String getBranchReserve3() {
        return branchReserve3;
    }

    public void setBranchReserve3(String branchReserve3) {
        this.branchReserve3 = branchReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return Objects.equals(branchId, branch.branchId) &&
                Objects.equals(branchUsername, branch.branchUsername) &&
                Objects.equals(branchPassword, branch.branchPassword) &&
                Objects.equals(branchNickname, branch.branchNickname) &&
                Objects.equals(branchLevel, branch.branchLevel) &&
                Objects.equals(branchPhone, branch.branchPhone) &&
                Objects.equals(branchEmail, branch.branchEmail) &&
                Objects.equals(branchSite, branch.branchSite) &&
                Objects.equals(branchIsStatus, branch.branchIsStatus) &&
                Objects.equals(branchAccount, branch.branchAccount) &&
                Objects.equals(branchCreate, branch.branchCreate) &&
                Objects.equals(branchModified, branch.branchModified) &&
                Objects.equals(branchReserve1, branch.branchReserve1) &&
                Objects.equals(branchReserve2, branch.branchReserve2) &&
                Objects.equals(branchReserve3, branch.branchReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchId, branchUsername, branchPassword, branchNickname, branchLevel, branchPhone, branchEmail, branchSite, branchIsStatus, branchAccount, branchCreate, branchModified, branchReserve1, branchReserve2, branchReserve3);
    }
}
