package com.volnoboy;

/**
 * Created by Reuven on 3/4/15.
 */
public class Tab {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	private String url;

	@Override
	public String toString() {
		return "Tab{" +
				"name:'" + name + '\'' +
				", url='" + url + '\'' +
				'}';
	}

	Tab(String name, String url) {
		this.name = name;
		this.url = url;
	}
}
