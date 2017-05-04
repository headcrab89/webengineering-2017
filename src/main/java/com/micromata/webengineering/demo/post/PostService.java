package com.micromata.webengineering.demo.post;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

/**
 * Handle all CRUD operations for posts.
 */
@Service
public class PostService {
    private List<Post> posts = new LinkedList<>();

    /**
     * Retrieve the list of all posts.
     *
     * @return post list
     */
    public List<Post> getPosts() {
        return posts;
    }
    public int postId = 0;


    /**
     * Add a new post.
     *
     * @param title add a new post with this title.
     */
    public void addPost(String title) {
        Post post = new Post(postId++, title, LocalDateTime.now().toString());
        posts.add(post);
    }

    public Post findPost(int id) {
        return posts.stream()
                .filter(post -> post.getId() == id)
                .findFirst().orElse(null);
    }

    public void deletePost(int id) {
        posts.remove(findPost(id));
    }
}
