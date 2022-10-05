package com.sparta.blog.repository;

import com.sparta.blog.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BlogRepository extends JpaRepository<Blog, Long> {
    List<Blog> findAllByOrderByModifiedAtDesc();//최근 작성 시간 게시글이 위로
}
