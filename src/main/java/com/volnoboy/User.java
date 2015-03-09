package com.volnoboy;

import java.util.List;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/2/15 8:01 PM
 */
public class User {
	private String name;
	private String email;
	private String avatarUrl;
	private List<Todo> todos;

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public List<Todo> getTodos() {
		return todos;
	}

	public void setTodos(List<Todo> todos) {
		this.todos = todos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
