package com.pb.partybuilding.domain;

public class TIntegral {
    private String id;

    private String learningintegral;

    private String activityintegral;

    private String partymemberId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLearningintegral() {
        return learningintegral;
    }

    public void setLearningintegral(String learningintegral) {
        this.learningintegral = learningintegral == null ? null : learningintegral.trim();
    }

    public String getActivityintegral() {
        return activityintegral;
    }

    public void setActivityintegral(String activityintegral) {
        this.activityintegral = activityintegral == null ? null : activityintegral.trim();
    }

    public String getPartymemberId() {
        return partymemberId;
    }

    public void setPartymemberId(String partymemberId) {
        this.partymemberId = partymemberId == null ? null : partymemberId.trim();
    }
}