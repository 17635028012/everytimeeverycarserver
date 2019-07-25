package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Service {
    private String serviceId;
    private String serviceUsername;
    private String servicePassword;
    private String servicePhone;
    private String serviceCard;
    private String serviceEmail;
    private String serviceSite;
    private Byte serviceIsStatus;
    private Byte serviceIsAudit;
    private Integer serviceAge;
    private String serviceSex;
    private String servicePlane;
    private Timestamp serviceCreate;
    private Timestamp serviceModified;
    private String serviceReserve1;
    private String serviceReserve2;
    private String serviceReserve3;

    @Id
    @Column(name = "service_id", nullable = false, length = 50)
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Basic
    @Column(name = "service_username", nullable = true, length = 15)
    public String getServiceUsername() {
        return serviceUsername;
    }

    public void setServiceUsername(String serviceUsername) {
        this.serviceUsername = serviceUsername;
    }

    @Basic
    @Column(name = "service_password", nullable = true, length = 15)
    public String getServicePassword() {
        return servicePassword;
    }

    public void setServicePassword(String servicePassword) {
        this.servicePassword = servicePassword;
    }

    @Basic
    @Column(name = "service_phone", nullable = true)
    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    @Basic
    @Column(name = "service_card", nullable = true, length = 18)
    public String getServiceCard() {
        return serviceCard;
    }

    public void setServiceCard(String serviceCard) {
        this.serviceCard = serviceCard;
    }

    @Basic
    @Column(name = "service_email", nullable = true, length = 20)
    public String getServiceEmail() {
        return serviceEmail;
    }

    public void setServiceEmail(String serviceEmail) {
        this.serviceEmail = serviceEmail;
    }

    @Basic
    @Column(name = "service_site", nullable = true, length = 50)
    public String getServiceSite() {
        return serviceSite;
    }

    public void setServiceSite(String serviceSite) {
        this.serviceSite = serviceSite;
    }

    @Basic
    @Column(name = "service_is_status", nullable = true)
    public Byte getServiceIsStatus() {
        return serviceIsStatus;
    }

    public void setServiceIsStatus(Byte serviceIsStatus) {
        this.serviceIsStatus = serviceIsStatus;
    }

    @Basic
    @Column(name = "service_is_audit", nullable = true)
    public Byte getServiceIsAudit() {
        return serviceIsAudit;
    }

    public void setServiceIsAudit(Byte serviceIsAudit) {
        this.serviceIsAudit = serviceIsAudit;
    }

    @Basic
    @Column(name = "service_age", nullable = true)
    public Integer getServiceAge() {
        return serviceAge;
    }

    public void setServiceAge(Integer serviceAge) {
        this.serviceAge = serviceAge;
    }

    @Basic
    @Column(name = "service_sex", nullable = true, length = 2)
    public String getServiceSex() {
        return serviceSex;
    }

    public void setServiceSex(String serviceSex) {
        this.serviceSex = serviceSex;
    }

    @Basic
    @Column(name = "service_plane", nullable = true)
    public String getServicePlane() {
        return servicePlane;
    }

    public void setServicePlane(String servicePlane) {
        this.servicePlane = servicePlane;
    }

    @Basic
    @Column(name = "service_create", nullable = true)
    public Timestamp getServiceCreate() {
        return serviceCreate;
    }

    public void setServiceCreate(Timestamp serviceCreate) {
        this.serviceCreate = serviceCreate;
    }

    @Basic
    @Column(name = "service_modified", nullable = true)
    public Timestamp getServiceModified() {
        return serviceModified;
    }

    public void setServiceModified(Timestamp serviceModified) {
        this.serviceModified = serviceModified;
    }

    @Basic
    @Column(name = "service_reserve1", nullable = true, length = 255)
    public String getServiceReserve1() {
        return serviceReserve1;
    }

    public void setServiceReserve1(String serviceReserve1) {
        this.serviceReserve1 = serviceReserve1;
    }

    @Basic
    @Column(name = "service_reserve2", nullable = true, length = 255)
    public String getServiceReserve2() {
        return serviceReserve2;
    }

    public void setServiceReserve2(String serviceReserve2) {
        this.serviceReserve2 = serviceReserve2;
    }

    @Basic
    @Column(name = "service_reserve3", nullable = true, length = 255)
    public String getServiceReserve3() {
        return serviceReserve3;
    }

    public void setServiceReserve3(String serviceReserve3) {
        this.serviceReserve3 = serviceReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(serviceId, service.serviceId) &&
                Objects.equals(serviceUsername, service.serviceUsername) &&
                Objects.equals(servicePassword, service.servicePassword) &&
                Objects.equals(servicePhone, service.servicePhone) &&
                Objects.equals(serviceCard, service.serviceCard) &&
                Objects.equals(serviceEmail, service.serviceEmail) &&
                Objects.equals(serviceSite, service.serviceSite) &&
                Objects.equals(serviceIsStatus, service.serviceIsStatus) &&
                Objects.equals(serviceIsAudit, service.serviceIsAudit) &&
                Objects.equals(serviceAge, service.serviceAge) &&
                Objects.equals(serviceSex, service.serviceSex) &&
                Objects.equals(servicePlane, service.servicePlane) &&
                Objects.equals(serviceCreate, service.serviceCreate) &&
                Objects.equals(serviceModified, service.serviceModified) &&
                Objects.equals(serviceReserve1, service.serviceReserve1) &&
                Objects.equals(serviceReserve2, service.serviceReserve2) &&
                Objects.equals(serviceReserve3, service.serviceReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, serviceUsername, servicePassword, servicePhone, serviceCard, serviceEmail, serviceSite, serviceIsStatus, serviceIsAudit, serviceAge, serviceSex, servicePlane, serviceCreate, serviceModified, serviceReserve1, serviceReserve2, serviceReserve3);
    }
}
