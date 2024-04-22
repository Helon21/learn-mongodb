package com.workshopspringmongodbspringcourse.springcourse.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Post implements Serializable {

    private String id;
    private Date date;
    private User author;
    private String title;
    private String body;

    public Post() {

    }

    public Post(String id, Date date, User author, String title, String body) {
        this.id = id;
        this.date = date;
        this.author = author;
        this.title = title;
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
