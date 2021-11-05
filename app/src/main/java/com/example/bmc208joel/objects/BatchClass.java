package com.example.bmc208joel.objects;

import java.io.Serializable;

public class BatchClass implements Serializable {
    private String batchNo;
    private String centreName; //Foreign Key to Health Centre
    private String expiryDate;
    private Integer quantityAvailable;
    private Integer quantityAdministered;
    private Integer quantityPending;
    private String vaccineID; //Foreign Key to Vaccine (which type of vaccine)

    public String getCentreName() {
        return centreName;
    }

    public void setCentreName(String centreName) {
        this.centreName = centreName;
    }

    public String getVaccineID() {
        return vaccineID;
    }

    public void setVaccineID(String vaccineID) {
        this.vaccineID = vaccineID;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Integer quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Integer getQuantityAdministered() {
        return quantityAdministered;
    }

    public void setQuantityAdministered(Integer quantityAdministered) {
        this.quantityAdministered = quantityAdministered;
    }

    public Integer getQuantityPending() {
        return quantityPending;
    }

    public void setQuantityPending(Integer quantityPending) {
        this.quantityPending = quantityPending;
    }

    public String toString() {
        return batchNo;
    }
}
