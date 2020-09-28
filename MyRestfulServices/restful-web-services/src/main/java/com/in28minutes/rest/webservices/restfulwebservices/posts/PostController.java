package com.in28minutes.rest.webservices.restfulwebservices.posts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.user.UserDaoService;


@RestController
public class PostController {

	@Autowired
	private UserDaoService service;
	
	@GetMapping("/users/{id}/posts")
	public List<Post> retrieveAllUserPosts(@PathVariable int id) {
		List<Post> posts = service.findAllUserPosts(id);
		/*
		 * if(users.isEmpty()) { throw new
		 * UsersNotFoundException("No Users were found!"); }
		 */
		return posts;
	}
}
