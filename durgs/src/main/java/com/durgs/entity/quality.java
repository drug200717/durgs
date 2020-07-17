package com.durgs.entity;

public class quality {
    private Integer id;

    private String qualityTyep;

    private String qualityDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQualityTyep() {
        return qualityTyep;
    }

    public void setQualityTyep(String qualityTyep) {
        this.qualityTyep = qualityTyep == null ? null : qualityTyep.trim();
    }

    public String getQualityDescription() {
        return qualityDescription;
    }

    public void setQualityDescription(String qualityDescription) {
        this.qualityDescription = qualityDescription == null ? null : qualityDescription.trim();
    }
}