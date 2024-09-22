package com.tusaryan.linkedin.posts_service.service;

import com.tusaryan.linkedin.posts_service.dto.PostCreateRequestDto;
import com.tusaryan.linkedin.posts_service.dto.PostDto;
import com.tusaryan.linkedin.posts_service.entity.Post;
import com.tusaryan.linkedin.posts_service.repository.PostsRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostsService {
    private final PostsRepository postsRepository;
    private final ModelMapper modelMapper;

    //create the post inside DB
    public PostDto createPost(PostCreateRequestDto postDTO, Long userId) {
        Post post = modelMapper.map(postDTO, Post.class);
        post.setUserId(userId);

        //save the post inside DB
        Post savedPost = postsRepository.save(post);
        //convert the post to postDto
        return modelMapper.map(savedPost, PostDto.class);
    }
}
