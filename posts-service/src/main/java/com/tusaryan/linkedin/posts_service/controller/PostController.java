package com.tusaryan.linkedin.posts_service.controller;

import com.tusaryan.linkedin.posts_service.dto.PostDto;
import com.tusaryan.linkedin.posts_service.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostsService postsService;

    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDTO) {
        PostDto createdPost = postsService.createPost(postDTO);
    }
}
