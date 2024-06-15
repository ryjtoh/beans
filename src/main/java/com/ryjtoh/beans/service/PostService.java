package com.ryjtoh.beans.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// With this annotation, the PostService class is now in the IoC container
@Service
public class PostService {

    public String findAll() {
        return "All Posts";
    }
}
