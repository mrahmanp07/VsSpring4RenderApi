package com.jwt.springBoot.JWTEx.service;

import com.jwt.springBoot.JWTEx.entity.Blog;
import com.jwt.springBoot.JWTEx.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    @Autowired
    BlogRepository blogRepository;

    public Blog post(Blog blog) {
        if (!blog.equals(null)) {
            return blogRepository.save(blog);
        }
        return null;
    }

    public List<Blog> getAll() {
        return blogRepository.findAll();
    }

    public Blog getById(int id) {
        Optional<Blog> optional = blogRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public String delete(int id) {
        Optional<Blog> optional = blogRepository.findById(id);
        if (optional.isPresent()) {
            blogRepository.delete(optional.get());
            return "Success!";
        }
        return "Failed!";
    }
}
