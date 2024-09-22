package com.tusaryan.linkedin.posts_service.controller;

import com.tusaryan.linkedin.posts_service.dto.PostCreateRequestDto;
import com.tusaryan.linkedin.posts_service.dto.PostDto;
import com.tusaryan.linkedin.posts_service.service.PostsService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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
    public ResponseEntity<PostDto> createPost(@RequestBody PostCreateRequestDto postDTO, HttpServletRequest httpServletRequest) {
        PostDto createdPost = postsService.createPost(postDTO, 1L);
        return new ResponseEntity<>(createdPost, HttpStatus.CREATED);
    }
}
