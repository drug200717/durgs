package com.durgs.entity;

public class supplier {
    private Integer id;

    private String companyName;

    private String licence;

    private String companyStatus;

    private String licenceReturntime;

    private String companyLink;

    private String companyPhone;

    private String scope;

    private String registeredAddress;

    private String linkAddress;

    private String postalcode;

    private String totalassets;

    private String enterprisefax;

    private String legarname;

    private String legaridentitycode;

    private Integer registerenterprise;

    private Float saleprise;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence == null ? null : licence.trim();
    }

    public String getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(String companyStatus) {
        this.companyStatus = companyStatus == null ? null : companyStatus.trim();
    }

    public String getLicenceReturntime() {
        return licenceReturntime;
    }

    public void setLicenceReturntime(String licenceReturntime) {
        this.licenceReturntime = licenceReturntime == null ? null : licenceReturntime.trim();
    }

    public String getCompanyLink() {
        return companyLink;
    }

    public void setCompanyLink(String companyLink) {
        this.companyLink = companyLink == null ? null : companyLink.trim();
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress == null ? null : registeredAddress.trim();
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress == null ? null : linkAddress.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getTotalassets() {
        return totalassets;
    }

    public void setTotalassets(String totalassets) {
        this.totalassets = totalassets == null ? null : totalassets.trim();
    }

    public String getEnterprisefax() {
        return enterprisefax;
    }

    public void setEnterprisefax(String enterprisefax) {
        this.enterprisefax = enterprisefax == null ? null : enterprisefax.trim();
    }

    public String getLegarname() {
        return legarname;
    }

    public void setLegarname(String legarname) {
        this.legarname = legarname == null ? null : legarname.trim();
    }

    public String getLegaridentitycode() {
        return legaridentitycode;
    }

    public void setLegaridentitycode(String legaridentitycode) {
        this.legaridentitycode = legaridentitycode == null ? null : legaridentitycode.trim();
    }

    public Integer getRegisterenterprise() {
        return registerenterprise;
    }

    public void setRegisterenterprise(Integer registerenterprise) {
        this.registerenterprise = registerenterprise;
    }

    public Float getSaleprise() {
        return saleprise;
    }

    public void setSaleprise(Float saleprise) {
        this.saleprise = saleprise;
    }
}