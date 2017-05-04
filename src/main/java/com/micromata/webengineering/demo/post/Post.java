package com.micromata.webengineering.demo.post;

public class Post {
    private String text;
    private String creationDate;
    private int id;

    Post(int id, String text, String creationDate) {
        this.text = text;
        this.creationDate = creationDate;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
