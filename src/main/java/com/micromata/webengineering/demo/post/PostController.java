package com.micromata.webengineering.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * HTTP endpoint for a post-related HTTP requests.
 */
@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping("/post")
    public List<Post> getPostList() {
        return postService.getPosts();
    }

    @RequestMapping(value = "/post/{postId}", method = RequestMethod.GET)
    public Post getSinglePost(@PathVariable("postId") int postId) {
        return postService.findPost(postId);
    }

    @RequestMapping(value = "/post/add", method = RequestMethod.POST)
    public void addPost(@RequestParam("title") String title) {
        postService.addPost(title);
    }

    @RequestMapping(value = "/post/delete/{postId}", method = RequestMethod.DELETE)
    public void deletePost(@PathVariable("postId") int postId) {
        postService.deletePost(postId);
    }
}
