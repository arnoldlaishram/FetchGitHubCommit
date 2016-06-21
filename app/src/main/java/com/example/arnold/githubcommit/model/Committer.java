package com.example.arnold.githubcommit.model;

import com.google.gson.annotations.SerializedName;

public class Committer {

@SerializedName("name")
private String name;
@SerializedName("email")
private String email;
@SerializedName("date")
private String date;

/**
* 
* @return
* The name
*/
public String getName() {
return name;
}

/**
* 
* @param name
* The name
*/
public void setName(String name) {
this.name = name;
}

/**
* 
* @return
* The email
*/
public String getEmail() {
return email;
}

/**
* 
* @param email
* The email
*/
public void setEmail(String email) {
this.email = email;
}

/**
* 
* @return
* The date
*/
public String getDate() {
return date;
}

/**
* 
* @param date
* The date
*/
public void setDate(String date) {
this.date = date;
}

}