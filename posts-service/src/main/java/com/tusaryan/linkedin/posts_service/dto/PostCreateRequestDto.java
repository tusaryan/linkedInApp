package com.tusaryan.linkedin.posts_service.dto;

import lombok.Data;

//while creation user will be only passing the content and not other stuff like if, timestamp etc.
@Data
public class PostCreateRequestDto {
    private String content;
}
