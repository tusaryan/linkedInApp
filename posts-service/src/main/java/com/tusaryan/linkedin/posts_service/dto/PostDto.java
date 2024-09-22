package com.tusaryan.linkedin.posts_service.dto;

import lombok.Data;

import java.time.LocalDateTime;

//for post response/to return whole post
@Data
public class PostDto {
    private Long id;
    private String content;
    private Long userId;
    private LocalDateTime createdAt;
}
