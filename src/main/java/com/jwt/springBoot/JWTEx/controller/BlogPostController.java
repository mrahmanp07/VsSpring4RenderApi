package com.jwt.springBoot.JWTEx.controller;


import com.jwt.springBoot.JWTEx.entity.BlogPost;
import com.jwt.springBoot.JWTEx.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogpost")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class BlogPostController {
    @Autowired
    BlogPostService blogPostService;

    @PostMapping("/post")
    public BlogPost post(@RequestBody BlogPost blogPost) {
        return blogPostService.post(blogPost);
    }

    @GetMapping("/get/{id}")
    public BlogPost getById(@PathVariable int id) {
        return blogPostService.getById(id);
    }

    @GetMapping("/getall")
    public List<BlogPost> getAll() {
        return blogPostService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return blogPostService.delete(id);
    }
}
