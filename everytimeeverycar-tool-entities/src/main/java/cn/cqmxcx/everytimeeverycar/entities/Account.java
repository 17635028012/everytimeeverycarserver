package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Account {
    private String accountId;
    private String memberId;
    private Byte accountType;
    private BigDecimal accountPrincipal;
    private BigDecimal accountDepositday;
    private BigDecimal accountDeposit;
    private String accountGrowth;
    private Byte accountIsStatus;
    private Integer accountCredit;
    private String gradeLevel;
    private String gradeCreditlevel;
    private Timestamp accountCreate;
    private Timestamp accountModified;
    private String accountReserve1;
    private String accountReserve2;
    private String accountReserve3;

    @Id
    @Column(name = "account_id", nullable = false, length = 50)
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
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
    @Column(name = "account_type", nullable = true)
    public Byte getAccountType() {
        return accountType;
    }

    public void setAccountType(Byte accountType) {
        this.accountType = accountType;
    }

    @Basic
    @Column(name = "account_principal", nullable = true, precision = 2)
    public BigDecimal getAccountPrincipal() {
        return accountPrincipal;
    }

    public void setAccountPrincipal(BigDecimal accountPrincipal) {
        this.accountPrincipal = accountPrincipal;
    }

    @Basic
    @Column(name = "account_depositday", nullable = true, precision = 2)
    public BigDecimal getAccountDepositday() {
        return accountDepositday;
    }

    public void setAccountDepositday(BigDecimal accountDepositday) {
        this.accountDepositday = accountDepositday;
    }

    @Basic
    @Column(name = "account_deposit", nullable = true, precision = 2)
    public BigDecimal getAccountDeposit() {
        return accountDeposit;
    }

    public void setAccountDeposit(BigDecimal accountDeposit) {
        this.accountDeposit = accountDeposit;
    }

    @Basic
    @Column(name = "account_growth", nullable = true, length = 20)
    public String getAccountGrowth() {
        return accountGrowth;
    }

    public void setAccountGrowth(String accountGrowth) {
        this.accountGrowth = accountGrowth;
    }

    @Basic
    @Column(name = "account_is_status", nullable = true)
    public Byte getAccountIsStatus() {
        return accountIsStatus;
    }

    public void setAccountIsStatus(Byte accountIsStatus) {
        this.accountIsStatus = accountIsStatus;
    }

    @Basic
    @Column(name = "account_credit", nullable = true)
    public Integer getAccountCredit() {
        return accountCredit;
    }

    public void setAccountCredit(Integer accountCredit) {
        this.accountCredit = accountCredit;
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
    @Column(name = "grade_creditlevel", nullable = true, length = 10)
    public String getGradeCreditlevel() {
        return gradeCreditlevel;
    }

    public void setGradeCreditlevel(String gradeCreditlevel) {
        this.gradeCreditlevel = gradeCreditlevel;
    }

    @Basic
    @Column(name = "account_create", nullable = true)
    public Timestamp getAccountCreate() {
        return accountCreate;
    }

    public void setAccountCreate(Timestamp accountCreate) {
        this.accountCreate = accountCreate;
    }

    @Basic
    @Column(name = "account_modified", nullable = true)
    public Timestamp getAccountModified() {
        return accountModified;
    }

    public void setAccountModified(Timestamp accountModified) {
        this.accountModified = accountModified;
    }

    @Basic
    @Column(name = "account_reserve1", nullable = true, length = 255)
    public String getAccountReserve1() {
        return accountReserve1;
    }

    public void setAccountReserve1(String accountReserve1) {
        this.accountReserve1 = accountReserve1;
    }

    @Basic
    @Column(name = "account_reserve2", nullable = true, length = 255)
    public String getAccountReserve2() {
        return accountReserve2;
    }

    public void setAccountReserve2(String accountReserve2) {
        this.accountReserve2 = accountReserve2;
    }

    @Basic
    @Column(name = "account_reserve3", nullable = true, length = 255)
    public String getAccountReserve3() {
        return accountReserve3;
    }

    public void setAccountReserve3(String accountReserve3) {
        this.accountReserve3 = accountReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountId, account.accountId) &&
                Objects.equals(memberId, account.memberId) &&
                Objects.equals(accountType, account.accountType) &&
                Objects.equals(accountPrincipal, account.accountPrincipal) &&
                Objects.equals(accountDepositday, account.accountDepositday) &&
                Objects.equals(accountDeposit, account.accountDeposit) &&
                Objects.equals(accountGrowth, account.accountGrowth) &&
                Objects.equals(accountIsStatus, account.accountIsStatus) &&
                Objects.equals(accountCredit, account.accountCredit) &&
                Objects.equals(gradeLevel, account.gradeLevel) &&
                Objects.equals(gradeCreditlevel, account.gradeCreditlevel) &&
                Objects.equals(accountCreate, account.accountCreate) &&
                Objects.equals(accountModified, account.accountModified) &&
                Objects.equals(accountReserve1, account.accountReserve1) &&
                Objects.equals(accountReserve2, account.accountReserve2) &&
                Objects.equals(accountReserve3, account.accountReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, memberId, accountType, accountPrincipal, accountDepositday, accountDeposit, accountGrowth, accountIsStatus, accountCredit, gradeLevel, gradeCreditlevel, accountCreate, accountModified, accountReserve1, accountReserve2, accountReserve3);
    }
}
