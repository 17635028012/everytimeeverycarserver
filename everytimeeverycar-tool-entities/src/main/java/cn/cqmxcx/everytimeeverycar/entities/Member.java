package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="member")
public class Member {
    private String memberId;
    private String memberMemcode;
    private String epId;
    private String branchId;
    private String memberUsername;
    private String memberPassword;
    private String memberPhone;
    private Byte memberLevel;
    private String memberCard;
    private String memberEmail;
    private String memberLicense;
    private String memSite;
    private String memberLicensephoto0;
    private String memberLicensephoto1;
    private String memberCardphoto0;
    private String memberCardphoto1;
    private Byte memberIsStatus;
    private String memberAccount;
    private Timestamp memberCreate;
    private Byte memberAuditor;
    private String memberBirthday;
    private String memberNickname;
    private String memberBank;
    private String memberAge;
    private String memberSex;
    private String memberSpare1;
    private String memberSpare2;
    private String memberSpare3;
    private Timestamp memberModified;

    @Id
    @Column(name = "member_id", nullable = false, length = 50)
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "member_memcode", nullable = true, length = 50)
    public String getMemberMemcode() {
        return memberMemcode;
    }

    public void setMemberMemcode(String memberMemcode) {
        this.memberMemcode = memberMemcode;
    }

    @Basic
    @Column(name = "ep_id", nullable = true, length = 50)
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    @Basic
    @Column(name = "branch_id", nullable = true, length = 50)
    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    @Basic
    @Column(name = "member_username", nullable = true, length = 18)
    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    @Basic
    @Column(name = "member_password", nullable = true, length = 10)
    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    @Basic
    @Column(name = "member_phone", nullable = true)
    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    @Basic
    @Column(name = "member_level", nullable = true)
    public Byte getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Byte memberLevel) {
        this.memberLevel = memberLevel;
    }

    @Basic
    @Column(name = "member_card", nullable = true, length = 18)
    public String getMemberCard() {
        return memberCard;
    }

    public void setMemberCard(String memberCard) {
        this.memberCard = memberCard;
    }

    @Basic
    @Column(name = "member_email", nullable = true, length = 15)
    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    @Basic
    @Column(name = "member_license", nullable = true, length = 25)
    public String getMemberLicense() {
        return memberLicense;
    }

    public void setMemberLicense(String memberLicense) {
        this.memberLicense = memberLicense;
    }

    @Basic
    @Column(name = "mem_site", nullable = true, length = 25)
    public String getMemSite() {
        return memSite;
    }

    public void setMemSite(String memSite) {
        this.memSite = memSite;
    }

    @Basic
    @Column(name = "member_licensephoto0", nullable = true, length = 255)
    public String getMemberLicensephoto0() {
        return memberLicensephoto0;
    }

    public void setMemberLicensephoto0(String memberLicensephoto0) {
        this.memberLicensephoto0 = memberLicensephoto0;
    }

    @Basic
    @Column(name = "member_licensephoto1", nullable = true, length = 255)
    public String getMemberLicensephoto1() {
        return memberLicensephoto1;
    }

    public void setMemberLicensephoto1(String memberLicensephoto1) {
        this.memberLicensephoto1 = memberLicensephoto1;
    }

    @Basic
    @Column(name = "member_cardphoto0", nullable = true, length = 255)
    public String getMemberCardphoto0() {
        return memberCardphoto0;
    }

    public void setMemberCardphoto0(String memberCardphoto0) {
        this.memberCardphoto0 = memberCardphoto0;
    }

    @Basic
    @Column(name = "member_cardphoto1", nullable = true, length = 255)
    public String getMemberCardphoto1() {
        return memberCardphoto1;
    }

    public void setMemberCardphoto1(String memberCardphoto1) {
        this.memberCardphoto1 = memberCardphoto1;
    }

    @Basic
    @Column(name = "member_is_status", nullable = true)
    public Byte getMemberIsStatus() {
        return memberIsStatus;
    }

    public void setMemberIsStatus(Byte memberIsStatus) {
        this.memberIsStatus = memberIsStatus;
    }

    @Basic
    @Column(name = "member_account", nullable = true, length = 50)
    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    @Basic
    @Column(name = "member_create", nullable = true)
    public Timestamp getMemberCreate() {
        return memberCreate;
    }

    public void setMemberCreate(Timestamp memberCreate) {
        this.memberCreate = memberCreate;
    }

    @Basic
    @Column(name = "member_auditor", nullable = true)
    public Byte getMemberAuditor() {
        return memberAuditor;
    }

    public void setMemberAuditor(Byte memberAuditor) {
        this.memberAuditor = memberAuditor;
    }

    @Basic
    @Column(name = "member_birthday", nullable = true, length = 10)
    public String getMemberBirthday() {
        return memberBirthday;
    }

    public void setMemberBirthday(String memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    @Basic
    @Column(name = "member_nickname", nullable = true, length = 20)
    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    @Basic
    @Column(name = "member_bank", nullable = true, length = 20)
    public String getMemberBank() {
        return memberBank;
    }

    public void setMemberBank(String memberBank) {
        this.memberBank = memberBank;
    }

    @Basic
    @Column(name = "member_age", nullable = true, length = 5)
    public String getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(String memberAge) {
        this.memberAge = memberAge;
    }

    @Basic
    @Column(name = "member_sex", nullable = true, length = 2)
    public String getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex;
    }

    @Basic
    @Column(name = "member_spare1", nullable = true, length = 255)
    public String getMemberSpare1() {
        return memberSpare1;
    }

    public void setMemberSpare1(String memberSpare1) {
        this.memberSpare1 = memberSpare1;
    }

    @Basic
    @Column(name = "member_spare2", nullable = true, length = 255)
    public String getMemberSpare2() {
        return memberSpare2;
    }

    public void setMemberSpare2(String memberSpare2) {
        this.memberSpare2 = memberSpare2;
    }

    @Basic
    @Column(name = "member_spare3", nullable = true, length = 255)
    public String getMemberSpare3() {
        return memberSpare3;
    }

    public void setMemberSpare3(String memberSpare3) {
        this.memberSpare3 = memberSpare3;
    }

    @Basic
    @Column(name = "member_modified", nullable = true)
    public Timestamp getMemberModified() {
        return memberModified;
    }

    public void setMemberModified(Timestamp memberModified) {
        this.memberModified = memberModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(memberId, member.memberId) &&
                Objects.equals(memberMemcode, member.memberMemcode) &&
                Objects.equals(epId, member.epId) &&
                Objects.equals(branchId, member.branchId) &&
                Objects.equals(memberUsername, member.memberUsername) &&
                Objects.equals(memberPassword, member.memberPassword) &&
                Objects.equals(memberPhone, member.memberPhone) &&
                Objects.equals(memberLevel, member.memberLevel) &&
                Objects.equals(memberCard, member.memberCard) &&
                Objects.equals(memberEmail, member.memberEmail) &&
                Objects.equals(memberLicense, member.memberLicense) &&
                Objects.equals(memSite, member.memSite) &&
                Objects.equals(memberLicensephoto0, member.memberLicensephoto0) &&
                Objects.equals(memberLicensephoto1, member.memberLicensephoto1) &&
                Objects.equals(memberCardphoto0, member.memberCardphoto0) &&
                Objects.equals(memberCardphoto1, member.memberCardphoto1) &&
                Objects.equals(memberIsStatus, member.memberIsStatus) &&
                Objects.equals(memberAccount, member.memberAccount) &&
                Objects.equals(memberCreate, member.memberCreate) &&
                Objects.equals(memberAuditor, member.memberAuditor) &&
                Objects.equals(memberBirthday, member.memberBirthday) &&
                Objects.equals(memberNickname, member.memberNickname) &&
                Objects.equals(memberBank, member.memberBank) &&
                Objects.equals(memberAge, member.memberAge) &&
                Objects.equals(memberSex, member.memberSex) &&
                Objects.equals(memberSpare1, member.memberSpare1) &&
                Objects.equals(memberSpare2, member.memberSpare2) &&
                Objects.equals(memberSpare3, member.memberSpare3) &&
                Objects.equals(memberModified, member.memberModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, memberMemcode, epId, branchId, memberUsername, memberPassword, memberPhone, memberLevel, memberCard, memberEmail, memberLicense, memSite, memberLicensephoto0, memberLicensephoto1, memberCardphoto0, memberCardphoto1, memberIsStatus, memberAccount, memberCreate, memberAuditor, memberBirthday, memberNickname, memberBank, memberAge, memberSex, memberSpare1, memberSpare2, memberSpare3, memberModified);
    }
}
