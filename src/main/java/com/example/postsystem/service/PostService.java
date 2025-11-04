package com.example.postsystem.service;

import com.example.postsystem.exception.PostNotFoundException;
import com.example.postsystem.model.Post;
import com.example.postsystem.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    
    @Autowired
    private PostRepository postRepository;
    
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    
    public Post getPostById(Long id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new PostNotFoundException(id));
    }
    
    public Post createPost(Post post) {
        if (post.getTitle() == null || post.getTitle().trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        if (post.getContent() == null || post.getContent().trim().isEmpty()) {
            throw new IllegalArgumentException("Content cannot be empty");
        }
        if (post.getAuthor() == null || post.getAuthor().trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be empty");
        }
        return postRepository.save(post);
    }
    
    public Post updatePost(Long id, Post postDetails) {
        Post post = getPostById(id);
        
        if (postDetails.getTitle() != null && !postDetails.getTitle().trim().isEmpty()) {
            post.setTitle(postDetails.getTitle());
        }
        if (postDetails.getContent() != null && !postDetails.getContent().trim().isEmpty()) {
            post.setContent(postDetails.getContent());
        }
        
        return postRepository.save(post);
    }
    
    public void deletePost(Long id) {
        Post post = getPostById(id);
        postRepository.delete(post);
    }
    
    public List<Post> searchPosts(String keyword) {
        return postRepository.findByTitleContainingIgnoreCase(keyword);
    }
}
