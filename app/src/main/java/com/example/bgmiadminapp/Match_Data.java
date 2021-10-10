package com.example.bgmiadminapp;

public class Match_Data {
    private String uploadDate,uploadTime,referId,matchCharge,slots,matchTime,matchDate,imageUrl,matchDuration,matchCategory,roomId,roomPass,reward;

    public Match_Data() {
    }

    public Match_Data(String uploadDate, String uploadTime, String referId, String matchCharge, String slots, String matchTime, String matchDate, String imageUrl, String matchDuration, String matchCategory, String roomId, String roomPass, String reward) {
        this.uploadDate = uploadDate;
        this.uploadTime = uploadTime;
        this.referId = referId;
        this.matchCharge = matchCharge;
        this.slots = slots;
        this.matchTime = matchTime;
        this.matchDate = matchDate;
        this.imageUrl = imageUrl;
        this.matchDuration = matchDuration;
        this.matchCategory = matchCategory;
        this.roomId = roomId;
        this.roomPass = roomPass;
        this.reward = reward;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getReferId() {
        return referId;
    }

    public void setReferId(String referId) {
        this.referId = referId;
    }

    public String getMatchCharge() {
        return matchCharge;
    }

    public void setMatchCharge(String matchCharge) {
        this.matchCharge = matchCharge;
    }

    public String getSlots() {
        return slots;
    }

    public void setSlots(String slots) {
        this.slots = slots;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getMatchDuration() {
        return matchDuration;
    }

    public void setMatchDuration(String matchDuration) {
        this.matchDuration = matchDuration;
    }

    public String getMatchCategory() {
        return matchCategory;
    }

    public void setMatchCategory(String matchCategory) {
        this.matchCategory = matchCategory;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomPass() {
        return roomPass;
    }

    public void setRoomPass(String roomPass) {
        this.roomPass = roomPass;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }
}
