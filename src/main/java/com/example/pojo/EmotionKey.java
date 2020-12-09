package com.example.pojo;

public class EmotionKey {
    private Integer articleid;

    private String email;

    public EmotionKey(Integer articleid, String email) {
        this.articleid = articleid;
        this.email = email;
    }

    public EmotionKey() {
        super();
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}