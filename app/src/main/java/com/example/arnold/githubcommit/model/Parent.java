package com.example.arnold.githubcommit.model;

import com.google.gson.annotations.SerializedName;

public class Parent {

    @SerializedName("url")
    private String url;
    @SerializedName("sha")
    private String sha;

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The sha
     */
    public String getSha() {
        return sha;
    }

    /**
     * @param sha The sha
     */
    public void setSha(String sha) {
        this.sha = sha;
    }
}