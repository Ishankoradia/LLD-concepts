package lld.MachineCoding.ParkingLotSystem.models;

import java.util.Date;

import lld.DesignPatterns.StructuralDesignPatterns.FacadeDesign.models.PaymentStatus;
import lld.MachineCoding.ParkingLotSystem.enums.PaymentMode;

public class Payment extends BaseModel {
    private Bill bill;
    private String referenceNo;
    private int amount;
    private PaymentMode mode;
    private PaymentStatus status;
    private Date time;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}
