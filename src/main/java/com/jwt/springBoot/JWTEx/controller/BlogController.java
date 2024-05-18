package com.jwt.springBoot.JWTEx.controller;


import com.jwt.springBoot.JWTEx.entity.Blog;
import com.jwt.springBoot.JWTEx.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class BlogController {
    @Autowired
    BlogService blogService;

    @PostMapping("/post")
    public Blog post(@RequestBody Blog blog) {
        return blogService.post(blog);
    }

    @GetMapping("/get/{id}")
    public Blog getById(@PathVariable int id) {
        return blogService.getById(id);
    }

    @GetMapping("/getall")
    public List<Blog> getAll() {
        return blogService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return blogService.delete(id);
    }

}
