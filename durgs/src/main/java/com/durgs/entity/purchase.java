package com.durgs.entity;

public class purchase {
    private Integer id;

    private Integer purchaseId;

    private Integer drugId;

    private Integer supplierId;

    private Float bidprice;

    private Float transactionprice;

    private Integer purchasevolume;

    private Float purchaseprice;

    private String purchasestatus;

    private String isDelete;

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

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Float getBidprice() {
        return bidprice;
    }

    public void setBidprice(Float bidprice) {
        this.bidprice = bidprice;
    }

    public Float getTransactionprice() {
        return transactionprice;
    }

    public void setTransactionprice(Float transactionprice) {
        this.transactionprice = transactionprice;
    }

    public Integer getPurchasevolume() {
        return purchasevolume;
    }

    public void setPurchasevolume(Integer purchasevolume) {
        this.purchasevolume = purchasevolume;
    }

    public Float getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(Float purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public String getPurchasestatus() {
        return purchasestatus;
    }

    public void setPurchasestatus(String purchasestatus) {
        this.purchasestatus = purchasestatus == null ? null : purchasestatus.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
}