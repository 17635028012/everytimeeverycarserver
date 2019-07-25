package cn.cqmxcx.everytimeeverycar.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Car {
    private String carId;
    private String memberId;
    private String driverId;
    private String carName;
    private Byte carGstype0;
    private Byte carGstype1;
    private Byte carGstype2;
    private Byte carGstype3;
    private Byte carGstype4;
    private String carColor;
    private String carTravelphoto0;
    private String carTravelphoto1;
    private String carSecondphoto;
    private Byte carIsStatus;
    private String carCarphoto;
    private String carCjnumber;
    private String carFdjnumber;
    private BigDecimal carMoney;
    private BigDecimal carEarnings;
    private String carPpnumber;
    private Timestamp carCreate;
    private Timestamp carModified;
    private String carMachine;
    private String carPlace;
    private String carPlacephoto;
    private Byte carMoto;
    private Byte carIsmachine;
    private String branchReserve1;
    private String branchReserve2;
    private String branchReserve3;

    @Id
    @Column(name = "car_id", nullable = false, length = 50)
    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
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
    @Column(name = "driver _id", nullable = true, length = 50)
    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    @Basic
    @Column(name = "car_name", nullable = true, length = 10)
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Basic
    @Column(name = "car_gstype0", nullable = true)
    public Byte getCarGstype0() {
        return carGstype0;
    }

    public void setCarGstype0(Byte carGstype0) {
        this.carGstype0 = carGstype0;
    }

    @Basic
    @Column(name = "car_gstype1", nullable = true)
    public Byte getCarGstype1() {
        return carGstype1;
    }

    public void setCarGstype1(Byte carGstype1) {
        this.carGstype1 = carGstype1;
    }

    @Basic
    @Column(name = "car_gstype2", nullable = true)
    public Byte getCarGstype2() {
        return carGstype2;
    }

    public void setCarGstype2(Byte carGstype2) {
        this.carGstype2 = carGstype2;
    }

    @Basic
    @Column(name = "car_gstype3", nullable = true)
    public Byte getCarGstype3() {
        return carGstype3;
    }

    public void setCarGstype3(Byte carGstype3) {
        this.carGstype3 = carGstype3;
    }

    @Basic
    @Column(name = "car_gstype4", nullable = true)
    public Byte getCarGstype4() {
        return carGstype4;
    }

    public void setCarGstype4(Byte carGstype4) {
        this.carGstype4 = carGstype4;
    }

    @Basic
    @Column(name = "car_color", nullable = true, length = 5)
    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Basic
    @Column(name = "car_travelphoto0", nullable = true, length = 50)
    public String getCarTravelphoto0() {
        return carTravelphoto0;
    }

    public void setCarTravelphoto0(String carTravelphoto0) {
        this.carTravelphoto0 = carTravelphoto0;
    }

    @Basic
    @Column(name = "car_travelphoto1", nullable = true, length = 50)
    public String getCarTravelphoto1() {
        return carTravelphoto1;
    }

    public void setCarTravelphoto1(String carTravelphoto1) {
        this.carTravelphoto1 = carTravelphoto1;
    }

    @Basic
    @Column(name = "car_secondphoto", nullable = true, length = 50)
    public String getCarSecondphoto() {
        return carSecondphoto;
    }

    public void setCarSecondphoto(String carSecondphoto) {
        this.carSecondphoto = carSecondphoto;
    }

    @Basic
    @Column(name = "car_is_status", nullable = true)
    public Byte getCarIsStatus() {
        return carIsStatus;
    }

    public void setCarIsStatus(Byte carIsStatus) {
        this.carIsStatus = carIsStatus;
    }

    @Basic
    @Column(name = "car_carphoto", nullable = true, length = 50)
    public String getCarCarphoto() {
        return carCarphoto;
    }

    public void setCarCarphoto(String carCarphoto) {
        this.carCarphoto = carCarphoto;
    }

    @Basic
    @Column(name = "car_cjnumber", nullable = true, length = 20)
    public String getCarCjnumber() {
        return carCjnumber;
    }

    public void setCarCjnumber(String carCjnumber) {
        this.carCjnumber = carCjnumber;
    }

    @Basic
    @Column(name = "car_fdjnumber", nullable = true, length = 20)
    public String getCarFdjnumber() {
        return carFdjnumber;
    }

    public void setCarFdjnumber(String carFdjnumber) {
        this.carFdjnumber = carFdjnumber;
    }

    @Basic
    @Column(name = "car_money", nullable = true, precision = 2)
    public BigDecimal getCarMoney() {
        return carMoney;
    }

    public void setCarMoney(BigDecimal carMoney) {
        this.carMoney = carMoney;
    }

    @Basic
    @Column(name = "car_earnings", nullable = true, precision = 2)
    public BigDecimal getCarEarnings() {
        return carEarnings;
    }

    public void setCarEarnings(BigDecimal carEarnings) {
        this.carEarnings = carEarnings;
    }

    @Basic
    @Column(name = "car_ppnumber", nullable = true, length = 10)
    public String getCarPpnumber() {
        return carPpnumber;
    }

    public void setCarPpnumber(String carPpnumber) {
        this.carPpnumber = carPpnumber;
    }

    @Basic
    @Column(name = "car_create", nullable = true)
    public Timestamp getCarCreate() {
        return carCreate;
    }

    public void setCarCreate(Timestamp carCreate) {
        this.carCreate = carCreate;
    }

    @Basic
    @Column(name = "car_modified", nullable = true)
    public Timestamp getCarModified() {
        return carModified;
    }

    public void setCarModified(Timestamp carModified) {
        this.carModified = carModified;
    }

    @Basic
    @Column(name = "car_machine", nullable = true, length = 20)
    public String getCarMachine() {
        return carMachine;
    }

    public void setCarMachine(String carMachine) {
        this.carMachine = carMachine;
    }

    @Basic
    @Column(name = "car_place", nullable = true, length = 50)
    public String getCarPlace() {
        return carPlace;
    }

    public void setCarPlace(String carPlace) {
        this.carPlace = carPlace;
    }

    @Basic
    @Column(name = "car_placephoto", nullable = true, length = 50)
    public String getCarPlacephoto() {
        return carPlacephoto;
    }

    public void setCarPlacephoto(String carPlacephoto) {
        this.carPlacephoto = carPlacephoto;
    }

    @Basic
    @Column(name = "car_moto", nullable = true)
    public Byte getCarMoto() {
        return carMoto;
    }

    public void setCarMoto(Byte carMoto) {
        this.carMoto = carMoto;
    }

    @Basic
    @Column(name = "car_ismachine", nullable = true)
    public Byte getCarIsmachine() {
        return carIsmachine;
    }

    public void setCarIsmachine(Byte carIsmachine) {
        this.carIsmachine = carIsmachine;
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
        Car car = (Car) o;
        return Objects.equals(carId, car.carId) &&
                Objects.equals(memberId, car.memberId) &&
                Objects.equals(driverId, car.driverId) &&
                Objects.equals(carName, car.carName) &&
                Objects.equals(carGstype0, car.carGstype0) &&
                Objects.equals(carGstype1, car.carGstype1) &&
                Objects.equals(carGstype2, car.carGstype2) &&
                Objects.equals(carGstype3, car.carGstype3) &&
                Objects.equals(carGstype4, car.carGstype4) &&
                Objects.equals(carColor, car.carColor) &&
                Objects.equals(carTravelphoto0, car.carTravelphoto0) &&
                Objects.equals(carTravelphoto1, car.carTravelphoto1) &&
                Objects.equals(carSecondphoto, car.carSecondphoto) &&
                Objects.equals(carIsStatus, car.carIsStatus) &&
                Objects.equals(carCarphoto, car.carCarphoto) &&
                Objects.equals(carCjnumber, car.carCjnumber) &&
                Objects.equals(carFdjnumber, car.carFdjnumber) &&
                Objects.equals(carMoney, car.carMoney) &&
                Objects.equals(carEarnings, car.carEarnings) &&
                Objects.equals(carPpnumber, car.carPpnumber) &&
                Objects.equals(carCreate, car.carCreate) &&
                Objects.equals(carModified, car.carModified) &&
                Objects.equals(carMachine, car.carMachine) &&
                Objects.equals(carPlace, car.carPlace) &&
                Objects.equals(carPlacephoto, car.carPlacephoto) &&
                Objects.equals(carMoto, car.carMoto) &&
                Objects.equals(carIsmachine, car.carIsmachine) &&
                Objects.equals(branchReserve1, car.branchReserve1) &&
                Objects.equals(branchReserve2, car.branchReserve2) &&
                Objects.equals(branchReserve3, car.branchReserve3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, memberId, driverId, carName, carGstype0, carGstype1, carGstype2, carGstype3, carGstype4, carColor, carTravelphoto0, carTravelphoto1, carSecondphoto, carIsStatus, carCarphoto, carCjnumber, carFdjnumber, carMoney, carEarnings, carPpnumber, carCreate, carModified, carMachine, carPlace, carPlacephoto, carMoto, carIsmachine, branchReserve1, branchReserve2, branchReserve3);
    }
}
