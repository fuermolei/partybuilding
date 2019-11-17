package com.pb.partybuilding.domain;

public class TSignup {
    private String id;

    private String partymemberId;

    private String activityId;

    private String isSignin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPartymemberId() {
        return partymemberId;
    }

    public void setPartymemberId(String partymemberId) {
        this.partymemberId = partymemberId == null ? null : partymemberId.trim();
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    public String getIsSignin() {
        return isSignin;
    }

    public void setIsSignin(String isSignin) {
        this.isSignin = isSignin == null ? null : isSignin.trim();
    }
}