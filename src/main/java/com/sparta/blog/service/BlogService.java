package com.sparta.blog.service;

import com.sparta.blog.dto.BlogRequestDto;
import com.sparta.blog.entity.Blog;
import com.sparta.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.SQLException;
import java.util.List;


@Service
public class BlogService {
    private final BlogRepository blogRepository;

    @Autowired
    public BlogService(BlogRepository blogRepository){
        this.blogRepository = blogRepository;
    }
    public Blog createBlog(BlogRequestDto requestDto)throws SQLException {
        Blog blog = new Blog(requestDto);
        blogRepository.save(blog);
        return blog;
    }
    public Blog updateBlog(Long id, BlogRequestDto requestDto) throws SQLException{
        Blog blog = blogRepository.findById(id).orElseThrow(() ->
                        new NullPointerException("해당 아이디가 존재하지 않습니다."));
        blog.update(requestDto);
        blogRepository.save(blog);
        return blog;
    }
    public List<Blog> getBlogs() throws SQLException{
        List<Blog> blogs = blogRepository.findAllByOrderByModifiedAtDesc();
        return blogs;
    }
    public Blog getBlogsid(Long id) throws SQLException{
        Blog blog = blogRepository.findById(id).orElse(null);
        return blog;
    }
    public Blog deleteBlog(Long id,BlogRequestDto requestDto) throws SQLException {
        Blog blog = new Blog(requestDto);
        blogRepository.deleteById(id);
        return blog;
    }
    public boolean password(Long id,BlogRequestDto requestDto) throws SQLException{
        Blog blog = blogRepository.findById(id).orElseThrow(() ->
                new NullPointerException("해당 아이디가 존재하지 않습니다."));
        if(blog.getPassword().equals(requestDto.getPassword())){
            return true;
        }else {
            return false;
        }
    }

}
