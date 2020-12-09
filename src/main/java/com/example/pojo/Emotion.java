package com.example.pojo;

import java.util.Date;

public class Emotion extends EmotionKey {
    private Integer status;

    private Date emotiondate;

    public Emotion(Integer articleid, String email, Integer status, Date emotiondate) {
        super(articleid, email);
        this.status = status;
        this.emotiondate = emotiondate;
    }

    public Emotion() {
        super();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getEmotiondate() {
        return emotiondate;
    }

    public void setEmotiondate(Date emotiondate) {
        this.emotiondate = emotiondate;
    }
}