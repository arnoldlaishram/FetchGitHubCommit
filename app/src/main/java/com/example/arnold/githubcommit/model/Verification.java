package com.example.arnold.githubcommit.model;

import com.google.gson.annotations.SerializedName;

public class Verification {

@SerializedName("verified")
private Boolean verified;
@SerializedName("reason")
private String reason;
@SerializedName("signature")
private String signature;
@SerializedName("payload")
private String payload;

/**
* 
* @return
* The verified
*/
public Boolean getVerified() {
return verified;
}

/**
* 
* @param verified
* The verified
*/
public void setVerified(Boolean verified) {
this.verified = verified;
}

/**
* 
* @return
* The reason
*/
public String getReason() {
return reason;
}

/**
* 
* @param reason
* The reason
*/
public void setReason(String reason) {
this.reason = reason;
}

/**
* 
* @return
* The signature
*/
public String getSignature() {
return signature;
}

/**
* 
* @param signature
* The signature
*/
public void setSignature(String signature) {
this.signature = signature;
}

/**
* 
* @return
* The payload
*/
public String getPayload() {
return payload;
}

/**
* 
* @param payload
* The payload
*/
public void setPayload(String payload) {
    this.payload = payload;
}
}