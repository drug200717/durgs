package com.durgs.entity;

public class drugs {
    private Integer id;

    private String serialNumber;

    private String commonName;

    private String dosageForm;

    private String specification;

    private String conversionCoefficient;

    private String manufacturingName;

    private String tradeName;

    private Float bidPrice;

    private String company;

    private String commonPinyin;

    private String photos;

    private String approvalNumber;

    private String approvalTime;

    private String imported;

    private String packingMaterial;

    private String packingCompany;

    private Float latestPrice;

    private String latestPriceSource;

    private Integer qualityId;

    private String qualityDescription;

    private String inspection;

    private String inspectionNo;

    private String inspectionValidity;

    private String productDescription;

    private String type;

    private String transactionStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName == null ? null : commonName.trim();
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm == null ? null : dosageForm.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getConversionCoefficient() {
        return conversionCoefficient;
    }

    public void setConversionCoefficient(String conversionCoefficient) {
        this.conversionCoefficient = conversionCoefficient == null ? null : conversionCoefficient.trim();
    }

    public String getManufacturingName() {
        return manufacturingName;
    }

    public void setManufacturingName(String manufacturingName) {
        this.manufacturingName = manufacturingName == null ? null : manufacturingName.trim();
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName == null ? null : tradeName.trim();
    }

    public Float getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Float bidPrice) {
        this.bidPrice = bidPrice;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getCommonPinyin() {
        return commonPinyin;
    }

    public void setCommonPinyin(String commonPinyin) {
        this.commonPinyin = commonPinyin == null ? null : commonPinyin.trim();
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos == null ? null : photos.trim();
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber == null ? null : approvalNumber.trim();
    }

    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime == null ? null : approvalTime.trim();
    }

    public String getImported() {
        return imported;
    }

    public void setImported(String imported) {
        this.imported = imported == null ? null : imported.trim();
    }

    public String getPackingMaterial() {
        return packingMaterial;
    }

    public void setPackingMaterial(String packingMaterial) {
        this.packingMaterial = packingMaterial == null ? null : packingMaterial.trim();
    }

    public String getPackingCompany() {
        return packingCompany;
    }

    public void setPackingCompany(String packingCompany) {
        this.packingCompany = packingCompany == null ? null : packingCompany.trim();
    }

    public Float getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(Float latestPrice) {
        this.latestPrice = latestPrice;
    }

    public String getLatestPriceSource() {
        return latestPriceSource;
    }

    public void setLatestPriceSource(String latestPriceSource) {
        this.latestPriceSource = latestPriceSource == null ? null : latestPriceSource.trim();
    }

    public Integer getQualityId() {
        return qualityId;
    }

    public void setQualityId(Integer qualityId) {
        this.qualityId = qualityId;
    }

    public String getQualityDescription() {
        return qualityDescription;
    }

    public void setQualityDescription(String qualityDescription) {
        this.qualityDescription = qualityDescription == null ? null : qualityDescription.trim();
    }

    public String getInspection() {
        return inspection;
    }

    public void setInspection(String inspection) {
        this.inspection = inspection == null ? null : inspection.trim();
    }

    public String getInspectionNo() {
        return inspectionNo;
    }

    public void setInspectionNo(String inspectionNo) {
        this.inspectionNo = inspectionNo == null ? null : inspectionNo.trim();
    }

    public String getInspectionValidity() {
        return inspectionValidity;
    }

    public void setInspectionValidity(String inspectionValidity) {
        this.inspectionValidity = inspectionValidity == null ? null : inspectionValidity.trim();
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus == null ? null : transactionStatus.trim();
    }
}