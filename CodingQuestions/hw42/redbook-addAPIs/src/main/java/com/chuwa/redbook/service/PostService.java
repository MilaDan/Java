package com.chuwa.redbook.service;

import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.payload.PostDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPost();
    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);

    PostDto findPostByTitle(String title);
    List<PostDto> findPostByIdGreaterThan(long id);
}