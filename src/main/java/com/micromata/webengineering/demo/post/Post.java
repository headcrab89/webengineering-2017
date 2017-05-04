package com.micromata.webengineering.demo.post;

public class Post {
    private String text;
    private String creationDate;

    Post(String text, String creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
