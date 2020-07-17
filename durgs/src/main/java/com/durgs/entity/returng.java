package com.durgs.entity;

public class returng {
    private Integer id;

    private String returngNo;

    private String returngName;

    private Integer hospitalId;

    private String link;

    private String linkPhone;

    private String userName;

    private String createTime;

    private String submissionTime;

    private String remarks;

    private String returngStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReturngNo() {
        return returngNo;
    }

    public void setReturngNo(String returngNo) {
        this.returngNo = returngNo == null ? null : returngNo.trim();
    }

    public String getReturngName() {
        return returngName;
    }

    public void setReturngName(String returngName) {
        this.returngName = returngName == null ? null : returngName.trim();
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime == null ? null : submissionTime.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getReturngStatus() {
        return returngStatus;
    }

    public void setReturngStatus(String returngStatus) {
        this.returngStatus = returngStatus == null ? null : returngStatus.trim();
    }
}