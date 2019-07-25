package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Equipment {
    private String emId;
    private Timestamp emCreate;
    private Timestamp emModified;
    private String carId;
    private String emNumber;
    private String emLongitude;
    private String emLatitude;
    private String emSpeed;
    private String emOilmass;
    private String emEndurance;
    private String emDistance;
    private Byte emAcc;
    private Byte emIsStatus;
    private Byte emDoor;
    private Byte emWindow;
    private Byte emControl;
    private Byte emLight;
    private Byte emRepairtype;
    private String emPosition;
    private Byte emElectricity;
    private String emMalfunction;
    private String emCause;
    private Timestamp emMaltime;
    private String emReserve1;
    private String emReserve2;
    private String emReserve3;

    @Id
    @Column(name = "em_id", nullable = false, length = 50)
    public String getEmId() {
        return emId;
    }

    public void setEmId(String emId) {
        this.emId = emId;
    }

    @Basic
    @Column(name = "em_create", nullable = true)
    public Timestamp getEmCreate() {
        return emCreate;
    }

    public void setEmCreate(Timestamp emCreate) {
        this.emCreate = emCreate;
    }

    @Basic
    @Column(name = "em_modified", nullable = true)
    public Timestamp getEmModified() {
        return emModified;
    }

    public void setEmModified(Timestamp emModified) {
        this.emModified = emModified;
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
    @Column(name = "em_number", nullable = true, length = 25)
    public String getEmNumber() {
        return emNumber;
    }

    public void setEmNumber(String emNumber) {
        this.emNumber = emNumber;
    }

    @Basic
    @Column(name = "em_longitude", nullable = true, length = 5)
    public String getEmLongitude() {
        return emLongitude;
    }

    public void setEmLongitude(String emLongitude) {
        this.emLongitude = emLongitude;
    }

    @Basic
    @Column(name = "em_latitude", nullable = true, length = 5)
    public String getEmLatitude() {
        return emLatitude;
    }

    public void setEmLatitude(String emLatitude) {
        this.emLatitude = emLatitude;
    }

    @Basic
    @Column(name = "em_speed", nullable = true, length = 5)
    public String getEmSpeed() {
        return emSpeed;
    }

    public void setEmSpeed(String emSpeed) {
        this.emSpeed = emSpeed;
    }

    @Basic
    @Column(name = "em_oilmass", nullable = true, length = 5)
    public String getEmOilmass() {
        return emOilmass;
    }

    public void setEmOilmass(String emOilmass) {
        this.emOilmass = emOilmass;
    }

    @Basic
    @Column(name = "em_endurance", nullable = true, length = 5)
    public String getEmEndurance() {
        return emEndurance;
    }

    public void setEmEndurance(String emEndurance) {
        this.emEndurance = emEndurance;
    }

    @Basic
    @Column(name = "em_distance", nullable = true, length = 5)
    public String getEmDistance() {
        return emDistance;
    }

    public void setEmDistance(String emDistance) {
        this.emDistance = emDistance;
    }

    @Basic
    @Column(name = "em_acc", nullable = true)
    public Byte getEmAcc() {
        return emAcc;
    }

    public void setEmAcc(Byte emAcc) {
        this.emAcc = emAcc;
    }

    @Basic
    @Column(name = "em_is_status", nullable = true)
    public Byte getEmIsStatus() {
        return emIsStatus;
    }

    public void setEmIsStatus(Byte emIsStatus) {
        this.emIsStatus = emIsStatus;
    }

    @Basic
    @Column(name = "em_door", nullable = true)
    public Byte getEmDoor() {
        return emDoor;
    }

    public void setEmDoor(Byte emDoor) {
        this.emDoor = emDoor;
    }

    @Basic
    @Column(name = "em_window", nullable = true)
    public Byte getEmWindow() {
        return emWindow;
    }

    public void setEmWindow(Byte emWindow) {
        this.emWindow = emWindow;
    }

    @Basic
    @Column(name = "em_control", nullable = true)
    public Byte getEmControl() {
        return emControl;
    }

    public void setEmControl(Byte emControl) {
        this.emControl = emControl;
    }

    @Basic
    @Column(name = "em_light", nullable = true)
    public Byte getEmLight() {
        return emLight;
    }

    public void setEmLight(Byte emLight) {
        this.emLight = emLight;
    }

    @Basic
    @Column(name = "em_repairtype", nullable = true)
    public Byte getEmRepairtype() {
        return emRepairtype;
    }

    public void setEmRepairtype(Byte emRepairtype) {
        this.emRepairtype = emRepairtype;
    }

    @Basic
    @Column(name = "em_position", nullable = true, length = 50)
    public String getEmPosition() {
        return emPosition;
    }

    public void setEmPosition(String emPosition) {
        this.emPosition = emPosition;
    }

    @Basic
    @Column(name = "em_electricity", nullable = true)
    public Byte getEmElectricity() {
        return emElectricity;
    }

    public void setEmElectricity(Byte emElectricity) {
        this.emElectricity = emElectricity;
    }

    @Basic
    @Column(name = "em_malfunction", nullable = true, length = 255)
    public String getEmMalfunction() {
        return emMalfunction;
    }

    public void setEmMalfunction(String emMalfunction) {
        this.emMalfunction = emMalfunction;
    }

    @Basic
    @Column(name = "em_cause", nullable = true, length = 255)
    public String getEmCause() {
        return emCause;
    }

    public void setEmCause(String emCause) {
        this.emCause = emCause;
    }

    @Basic
    @Column(name = "em_maltime", nullable = true)
    public Timestamp getEmMaltime() {
        return emMaltime;
    }

    public void setEmMaltime(Timestamp emMaltime) {
        this.emMaltime = emMaltime;
    }

    @Basic
    @Column(name = "em_reserve1", nullable = true, length = 255)
    public String getEmReserve1() {
        return emReserve1;
    }

    public void setEmReserve1(String emReserve1) {
        this.emReserve1 = emReserve1;
    }

    @Basic
    @Column(name = "em_reserve2", nullable = true, length = 255)
    public String getEmReserve2() {
        return emReserve2;
    }

    public void setEmReserve2(String emReserve2) {
        this.emReserve2 = emReserve2;
    }

    @Basic
    @Column(name = "em_reserve3", nullable = true, length = 255)
    public String getEmReserve3() {
        return emReserve3;
    }

    public void setEmReserve3(String emReserve3) {
        this.emReserve3 = emReserve3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(emId, equipment.emId) &&
                Objects.equals(emCreate, equipment.emCreate) &&
                Objects.equals(emModified, equipment.emModified) &&
                Objects.equals(carId, equipment.carId) &&
                Objects.equals(emNumber, equipment.emNumber) &&
                Objects.equals(emLongitude, equipment.emLongitude) &&
                Objects.equals(emLatitude, equipment.emLatitude) &&
                Objects.equals(emSpeed, equipment.emSpeed) &&
                Objects.equals(emOilmass, equipment.emOilmass) &&
                Objects.equals(emEndurance, equipment.emEndurance) &&
                Objects.equals(emDistance, equipment.emDistance) &&
                Objects.equals(emAcc, equipment.emAcc) &&
                Objects.equals(emIsStatus, equipment.emIsStatus) &&
                Objects.equals(emDoor, equipment.emDoor) &&
                Objects.equals(emWindow, equipment.emWindow) &&
                Objects.equals(emControl, equipment.emControl) &&
                Objects.equals(emLight, equipment.emLight) &&
                Objects.equals(emRepairtype, equipment.emRepairtype) &&
                Objects.equals(emPosition, equipment.emPosition) &&
                Objects.equals(emElectricity, equipment.emElectricity) &&
                Objects.equals(emMalfunction, equipment.emMalfunction) &&
                Objects.equals(emCause, equipment.emCause) &&
                Objects.equals(emMaltime, equipment.emMaltime) &&
                Objects.equals(emReserve1, equipment.emReserve1) &&
                Objects.equals(emReserve2, equipment.emReserve2) &&
                Objects.equals(emReserve3, equipment.emReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emId, emCreate, emModified, carId, emNumber, emLongitude, emLatitude, emSpeed, emOilmass, emEndurance, emDistance, emAcc, emIsStatus, emDoor, emWindow, emControl, emLight, emRepairtype, emPosition, emElectricity, emMalfunction, emCause, emMaltime, emReserve1, emReserve2, emReserve3);
    }
}
