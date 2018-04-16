package com.example.sondemo.entity;

public class Athors {
    private Integer aId;

    private String aName;

    private String aAddrs;

    private String aPhone;

    private String aSex;

    private Integer aAge;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getaAddrs() {
        return aAddrs;
    }

    public void setaAddrs(String aAddrs) {
        this.aAddrs = aAddrs == null ? null : aAddrs.trim();
    }

    public String getaPhone() {
        return aPhone;
    }

    public void setaPhone(String aPhone) {
        this.aPhone = aPhone == null ? null : aPhone.trim();
    }

    public String getaSex() {
        return aSex;
    }

    public void setaSex(String aSex) {
        this.aSex = aSex == null ? null : aSex.trim();
    }

    public Integer getaAge() {
        return aAge;
    }

    public void setaAge(Integer aAge) {
        this.aAge = aAge;
    }
}