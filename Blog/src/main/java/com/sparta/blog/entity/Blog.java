package com.sparta.blog.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.blog.Timestamped.Timestamped;
import com.sparta.blog.dto.BlogRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Blog extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String username;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

    public Blog(BlogRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
    }

    public void update(BlogRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
    }
}
