package com.jwt.springBoot.JWTEx.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "blog_post")
@Data
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int blog_post_id;

    private String blogPostCategory;

    private String blogPostName;

    private String blogPostPublisherName;

    private String blogPostPublisherUsername;

    private String blogPostPublishDate;

    private String blogPostPhoto;

    private String blogPostIntroduction;

    private String blogPostDescription;

    public int getBlog_post_id() {
        return blog_post_id;
    }

    public void setBlog_post_id(int blog_post_id) {
        this.blog_post_id = blog_post_id;
    }

    public String getBlogPostCategory() {
        return blogPostCategory;
    }

    public void setBlogPostCategory(String blogPostCategory) {
        this.blogPostCategory = blogPostCategory;
    }

    public String getBlogPostName() {
        return blogPostName;
    }

    public void setBlogPostName(String blogPostName) {
        this.blogPostName = blogPostName;
    }

    public String getBlogPostPublisherName() {
        return blogPostPublisherName;
    }

    public void setBlogPostPublisherName(String blogPostPublisherName) {
        this.blogPostPublisherName = blogPostPublisherName;
    }

    public String getBlogPostPublisherUsername() {
        return blogPostPublisherUsername;
    }

    public void setBlogPostPublisherUsername(String blogPostPublisherUsername) {
        this.blogPostPublisherUsername = blogPostPublisherUsername;
    }

    public String getBlogPostPublishDate() {
        return blogPostPublishDate;
    }

    public void setBlogPostPublishDate(String blogPostPublishDate) {
        this.blogPostPublishDate = blogPostPublishDate;
    }

    public String getBlogPostPhoto() {
        return blogPostPhoto;
    }

    public void setBlogPostPhoto(String blogPostPhoto) {
        this.blogPostPhoto = blogPostPhoto;
    }

    public String getBlogPostIntroduction() {
        return blogPostIntroduction;
    }

    public void setBlogPostIntroduction(String blogPostIntroduction) {
        this.blogPostIntroduction = blogPostIntroduction;
    }

    public String getBlogPostDescription() {
        return blogPostDescription;
    }

    public void setBlogPostDescription(String blogPostDescription) {
        this.blogPostDescription = blogPostDescription;
    }
}
