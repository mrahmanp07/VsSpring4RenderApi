package com.jwt.springBoot.JWTEx.service;

import com.jwt.springBoot.JWTEx.entity.BlogPost;
import com.jwt.springBoot.JWTEx.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogPostService {

    @Autowired
    BlogPostRepository blogPostRepository;

    public BlogPost post(BlogPost blogPost) {
        if (!blogPost.equals(null)) {
            return blogPostRepository.save(blogPost);
        }
        return null;
    }

    public List<BlogPost> getAll() {
        return blogPostRepository.findAll();
    }

    public BlogPost getById(int id) {
        Optional<BlogPost> optional = blogPostRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public String delete(int id) {
        Optional<BlogPost> optional = blogPostRepository.findById(id);
        if (optional.isPresent()) {
            blogPostRepository.delete(optional.get());
            return "Success!";
        }
        return "Failed!";
    }
}
