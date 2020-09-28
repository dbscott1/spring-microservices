package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.in28minutes.rest.webservices.restfulwebservices.posts.Post;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	private static List<Post> posts = new ArrayList<>();
	

	private int userCount = 3;

	static {
		users.add(new User(1, "Derrick", new Date()));
		users.add(new User(2, "Cheryl", new Date()));
		users.add(new User(3, "Gator", new Date()));
	}
	
	static {
		posts.add(new Post(1, 1, "I love the Gators"));
		posts.add(new Post(1, 2, "I love the Falcons"));
		posts.add(new Post(1, 3,"I love the Hawks"));
		posts.add(new Post(2, 1,"work at Davita"));
		posts.add(new Post(2, 2,"Cooking queen #1"));
		posts.add(new Post(3, 1,"I love the Gators"));
		posts.add(new Post(3, 2,"big win or Ole Miss - 50 burger"));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);

		return user;
	}

	public User findOne(int id) {

		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	//Posts
	public List<Post> findAllUserPosts(int id) {
		List<Post> userPosts = new ArrayList<>();
		for(Post post : posts) {
			if(post.getId() == id) {
				userPosts.add(post);
			}
		}
		
		return userPosts;
	}

	public Post addUserPost(Post newPost) {
		int numPost = 0;
		
		for (Post post : posts) {
			
			if (post.getId() == null) {
				
				user.setId(++userCount);
			}
		}
		posts.add(post);
		
		return post;
	}
}
