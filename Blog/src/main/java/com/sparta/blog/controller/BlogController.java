package com.sparta.blog.controller;


import com.sparta.blog.dto.BlogRequestDto;
import com.sparta.blog.entity.Blog;
import com.sparta.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class BlogController {
    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService){
        this.blogService = blogService;
    }
    @PostMapping("/api/blogs")//게시글 생성
    public Blog createBlog(@RequestBody BlogRequestDto requestDto) throws SQLException{
        Blog blog = blogService.createBlog(requestDto);
        return blog;
    }
    @PutMapping("/api/blogs/{id}")//게시글 수정
    public Long updateBlog(@PathVariable Long id, @RequestBody BlogRequestDto requestDto) throws SQLException {
        Blog blog = blogService.updateBlog(id, requestDto);
        return blog.getId();
    }
    @GetMapping("/api/blogs")//게시글 조회
    public List<Blog> getBlogs() throws SQLException {
        List<Blog> blogs = blogService.getBlogs();
        return blogs;
    }
    @GetMapping("/api/blogs/{id}")//게시글 조회
    public Blog getBlogsid(@PathVariable Long id) throws SQLException {
        Blog blog = blogService.getBlogsid(id);
        return blog;
    }
    @DeleteMapping("/api/blogs/{id}")//게시글 삭제
    public Long deleteBlog(@PathVariable Long id, @RequestBody BlogRequestDto requestDto) throws SQLException {
        blogService.deleteBlog(id, requestDto);
        return id;
    }
    @PostMapping("/api/blogs/{id}")//비밀번호 확인
    public boolean password(@PathVariable Long id, @RequestBody BlogRequestDto requestDto) throws SQLException {
        return blogService.password(id, requestDto);
    }
}


