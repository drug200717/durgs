package com.durgs.entity;

public class Hospital {
    private Integer id;

    private String hospitalName;

    private String hospitalTelephone;

    private String postalCode;

    private String region;

    private String hospitalLevel;

    private String bedNum;

    private String medicalInstitution;

    private String hospitalOfficeTelephone;

    private String hospitalOfficeFax;

    private String pharmacyDepartmentTelephone;

    private String hospitalTyep;

    private String drugsIncome;

    private String businessIncome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getHospitalTelephone() {
        return hospitalTelephone;
    }

    public void setHospitalTelephone(String hospitalTelephone) {
        this.hospitalTelephone = hospitalTelephone == null ? null : hospitalTelephone.trim();
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel == null ? null : hospitalLevel.trim();
    }

    public String getBedNum() {
        return bedNum;
    }

    public void setBedNum(String bedNum) {
        this.bedNum = bedNum == null ? null : bedNum.trim();
    }

    public String getMedicalInstitution() {
        return medicalInstitution;
    }

    public void setMedicalInstitution(String medicalInstitution) {
        this.medicalInstitution = medicalInstitution == null ? null : medicalInstitution.trim();
    }

    public String getHospitalOfficeTelephone() {
        return hospitalOfficeTelephone;
    }

    public void setHospitalOfficeTelephone(String hospitalOfficeTelephone) {
        this.hospitalOfficeTelephone = hospitalOfficeTelephone == null ? null : hospitalOfficeTelephone.trim();
    }

    public String getHospitalOfficeFax() {
        return hospitalOfficeFax;
    }

    public void setHospitalOfficeFax(String hospitalOfficeFax) {
        this.hospitalOfficeFax = hospitalOfficeFax == null ? null : hospitalOfficeFax.trim();
    }

    public String getPharmacyDepartmentTelephone() {
        return pharmacyDepartmentTelephone;
    }

    public void setPharmacyDepartmentTelephone(String pharmacyDepartmentTelephone) {
        this.pharmacyDepartmentTelephone = pharmacyDepartmentTelephone == null ? null : pharmacyDepartmentTelephone.trim();
    }

    public String getHospitalTyep() {
        return hospitalTyep;
    }

    public void setHospitalTyep(String hospitalTyep) {
        this.hospitalTyep = hospitalTyep == null ? null : hospitalTyep.trim();
    }

    public String getDrugsIncome() {
        return drugsIncome;
    }

    public void setDrugsIncome(String drugsIncome) {
        this.drugsIncome = drugsIncome == null ? null : drugsIncome.trim();
    }

    public String getBusinessIncome() {
        return businessIncome;
    }

    public void setBusinessIncome(String businessIncome) {
        this.businessIncome = businessIncome == null ? null : businessIncome.trim();
    }
}