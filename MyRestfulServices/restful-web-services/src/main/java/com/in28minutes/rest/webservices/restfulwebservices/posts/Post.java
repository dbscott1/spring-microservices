package com.in28minutes.rest.webservices.restfulwebservices.posts;

public class Post {
	
	private Integer id;
	
	private Integer postId;
	
	private String message;
	
	

	public Post(Integer id, int postId, String message) {
		super();
		this.id = id;
		this.postId = postId;
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Posts [id=" + id + ", message=" + message + "]";
	}
	
	

}
