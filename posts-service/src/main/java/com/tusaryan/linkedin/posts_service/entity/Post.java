package com.tusaryan.linkedin.posts_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "posts")
public class Post {

    //it will be created itself automatically
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    //will be passing the userId
    @Column(nullable = false)
    private Long userId;

    //it will be created itself automatically
    @CreationTimestamp
    private LocalDateTime createdAt;
}
