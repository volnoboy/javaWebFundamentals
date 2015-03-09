package com.volnoboy;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/9/15 6:50 PM
 */
public class Todo {
	private String description;
	private int priority;

	public Todo(String description, int priority) {
		this.description = description;
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
}
