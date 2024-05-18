package com.jwt.springBoot.JWTEx.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "blog")
@Data
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int blog_id;

    private String blogCategory;

    private String blogName;

    private String blogPublisherName;

    private String blogPublisherUsername;

    private String blogPublishDate;

    private String blogPhoto;

    private String blogIntroduction;

    private String blogDescription;

    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public String getBlogCategory() {
        return blogCategory;
    }

    public void setBlogCategory(String blogCategory) {
        this.blogCategory = blogCategory;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogPublisherName() {
        return blogPublisherName;
    }

    public void setBlogPublisherName(String blogPublisherName) {
        this.blogPublisherName = blogPublisherName;
    }

    public String getBlogPublisherUsername() {
        return blogPublisherUsername;
    }

    public void setBlogPublisherUsername(String blogPublisherUsername) {
        this.blogPublisherUsername = blogPublisherUsername;
    }

    public String getBlogPublishDate() {
        return blogPublishDate;
    }

    public void setBlogPublishDate(String blogPublishDate) {
        this.blogPublishDate = blogPublishDate;
    }

    public String getBlogPhoto() {
        return blogPhoto;
    }

    public void setBlogPhoto(String blogPhoto) {
        this.blogPhoto = blogPhoto;
    }

    public String getBlogIntroduction() {
        return blogIntroduction;
    }

    public void setBlogIntroduction(String blogIntroduction) {
        this.blogIntroduction = blogIntroduction;
    }

    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription;
    }
}
