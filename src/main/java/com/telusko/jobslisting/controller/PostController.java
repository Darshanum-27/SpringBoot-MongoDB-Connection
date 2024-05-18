package com.telusko.jobslisting.controller;

import com.telusko.jobslisting.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.telusko.jobslisting.models.Post;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @GetMapping("/allPosts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }

}
