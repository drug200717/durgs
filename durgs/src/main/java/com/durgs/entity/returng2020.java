package com.durgs.entity;

public class returng2020 {
    private Integer id;

    private Integer purchaseId;

    private Integer drugId;

    private Integer returngId;

    private Integer returngNo;

    private Float returngPrice;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getReturngId() {
        return returngId;
    }

    public void setReturngId(Integer returngId) {
        this.returngId = returngId;
    }

    public Integer getReturngNo() {
        return returngNo;
    }

    public void setReturngNo(Integer returngNo) {
        this.returngNo = returngNo;
    }

    public Float getReturngPrice() {
        return returngPrice;
    }

    public void setReturngPrice(Float returngPrice) {
        this.returngPrice = returngPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}