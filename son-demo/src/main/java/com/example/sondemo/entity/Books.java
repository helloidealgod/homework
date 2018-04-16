package com.example.sondemo.entity;

public class Books {
    private Integer bId;

    private String bTitle;

    private String bAnthor;

    private String bPublisher;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle == null ? null : bTitle.trim();
    }

    public String getbAnthor() {
        return bAnthor;
    }

    public void setbAnthor(String bAnthor) {
        this.bAnthor = bAnthor == null ? null : bAnthor.trim();
    }

    public String getbPublisher() {
        return bPublisher;
    }

    public void setbPublisher(String bPublisher) {
        this.bPublisher = bPublisher == null ? null : bPublisher.trim();
    }
}