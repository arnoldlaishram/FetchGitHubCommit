package com.example.arnold.githubcommit.model;

import com.google.gson.annotations.SerializedName;

public class Commit {

@SerializedName("url")
private String url;
@SerializedName("author")
private Author author;
@SerializedName("committer")
private Committer committer;
@SerializedName("message")
private String message;
@SerializedName("tree")
private Tree tree;
@SerializedName("comment_count")
private Integer commentCount;
@SerializedName("verification")
private Verification verification;

/**
* 
* @return
* The url
*/
public String getUrl() {
return url;
}

/**
* 
* @param url
* The url
*/
public void setUrl(String url) {
this.url = url;
}

/**
* 
* @return
* The author
*/
public Author getAuthor() {
return author;
}

/**
* 
* @param author
* The author
*/
public void setAuthor(Author author) {
this.author = author;
}

/**
* 
* @return
* The committer
*/
public Committer getCommitter() {
return committer;
}

/**
* 
* @param committer
* The committer
*/
public void setCommitter(Committer committer) {
this.committer = committer;
}

/**
* 
* @return
* The message
*/
public String getMessage() {
return message;
}

/**
* 
* @param message
* The message
*/
public void setMessage(String message) {
this.message = message;
}

/**
* 
* @return
* The tree
*/
public Tree getTree() {
return tree;
}

/**
* 
* @param tree
* The tree
*/
public void setTree(Tree tree) {
this.tree = tree;
}

/**
* 
* @return
* The commentCount
*/
public Integer getCommentCount() {
return commentCount;
}

/**
* 
* @param commentCount
* The comment_count
*/
public void setCommentCount(Integer commentCount) {
this.commentCount = commentCount;
}

/**
* 
* @return
* The verification
*/
public Verification getVerification() {
return verification;
}

/**
* 
* @param verification
* The verification
*/
public void setVerification(Verification verification) {
this.verification = verification;
}

}