package com.owlaser.paclist.entity;

public class Dependency {
    private String artifactId;
    private String version;
    private String groupId;
    private String popurlarVersion;
    private String latestStableVersion;

    public Dependency(String groupId,String artifactId, String version) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
    }

    public Dependency(){
        artifactId = null;
        version = null;
        groupId = null;
        popurlarVersion = null;
        latestStableVersion = null;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public String getVersion() {
        return version;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getPopurlarVersion() {
        return popurlarVersion;
    }

    public String getLatestStableVersion() {
        return latestStableVersion;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setPopurlarVersion(String popurlarVersion) {
        this.popurlarVersion = popurlarVersion;
    }

    public void setLatestStableVersion(String latestStableVersion) {
        this.latestStableVersion = latestStableVersion;
    }

}
